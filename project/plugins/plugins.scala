/*
 * Copyright 2009-2011 Weigle Wilczek GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {

  // ===================================================================================================================
  // Repositories
  // ===================================================================================================================

  object Repositories {
    lazy val aquteRepo = "aQute Maven Repository" at "http://www.aqute.biz/repo"
  }

  // ===================================================================================================================
  // ModuleConfigurations
  // ===================================================================================================================
  import Repositories._

  lazy val aquteModuleConfig = ModuleConfiguration("biz.aQute", aquteRepo)

  // ===================================================================================================================
  // Dependencies
  // ===================================================================================================================

  lazy val bnd4sbt = "com.weiglewilczek.bnd4sbt" % "bnd4sbt" % "1.0.0"
}
