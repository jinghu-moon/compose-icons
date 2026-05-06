package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = lucideOutlineIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 2h2")
            addPathData("M14.28 14 9.72 22")
            addPathData("M21 22 19.442 18h-14.884")
            addPathData("M3 10v2")
            addPathData("M6.245 15.04C6.596 14.399 7.269 14 8 14h12c.358-0 .69 .191 .868 .502 .178 .311 .177 .693-.004 1.003l-3.11 5.457C17.403 21.602 16.73 22 16 22h-12c-.359 0-.69-.192-.868-.503-.178-.311-.176-.694 .005-1.003Z")
            addPathData("M7 2C7 4.209 5.209 6 3 6")
            addPathData("M8.66 7.66l1.41 1.41")
        }
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
