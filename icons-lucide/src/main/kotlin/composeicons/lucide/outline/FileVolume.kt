package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileVolume: ImageVector
    get() {
        if (_fileVolume != null) return _fileVolume!!
        _fileVolume = lucideOutlineIcon(
            name = "FileVolume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11.55v-7.55C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2h-1.95")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M12 15c1.333 1.778 1.333 4.222 0 6")
            addPathData("M8 14.502c.001-.196-.113-.374-.291-.456-.178-.082-.387-.053-.535 .075L5.281 15.752c-.181 .156-.412 .242-.651 .243h-1.13c-.133 0-.26 .053-.354 .147-.094 .094-.146 .221-.146 .354v3.006c-0 .133 .052 .26 .146 .354 .094 .094 .221 .147 .354 .147h1.129c.239 0 .471 .087 .652 .243l1.893 1.633c.148 .128 .357 .157 .535 .075 .178-.082 .291-.26 .291-.455Z")
        }
        return _fileVolume!!
    }

private var _fileVolume: ImageVector? = null
