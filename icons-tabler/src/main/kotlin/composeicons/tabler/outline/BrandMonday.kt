package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMonday: ImageVector
    get() {
        if (_brandMonday != null) return _brandMonday!!
        _brandMonday = tablerOutlineIcon(
            name = "BrandMonday",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15.5c0 .828 .672 1.5 1.5 1.5C20.328 17 21 16.328 21 15.5 21 14.672 20.328 14 19.5 14 18.672 14 18 14.672 18 15.5")
            addPathData("M9.5 7c.521-0 1.005 .27 1.278 .714 .273 .444 .296 .998 .061 1.463L6.805 16.251C6.541 16.698 6.055 17 5.5 17c-.546 0-1.048-.296-1.313-.774-.264-.478-.248-1.061 .042-1.523L8.135 7.876C8.379 7.342 8.913 7 9.5 7")
            addPathData("M16.5 7c.521-0 1.005 .27 1.278 .714 .273 .444 .296 .998 .061 1.463l-4.034 7.074c-.264 .447-.75 .749-1.305 .749-.546 0-1.048-.296-1.313-.774-.264-.478-.248-1.061 .042-1.523L15.135 7.876c.244-.534 .778-.876 1.365-.876")
        }
        return _brandMonday!!
    }

private var _brandMonday: ImageVector? = null
