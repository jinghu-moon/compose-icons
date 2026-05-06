package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FingerprintOff: ImageVector
    get() {
        if (_fingerprintOff != null) return _fingerprintOff!!
        _fingerprintOff = tablerOutlineIcon(
            name = "FingerprintOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.9 7c.904 1.501 1.291 3.258 1.1 5v1c-.001 1.053 .275 2.088 .8 3")
            addPathData("M8 11c0-.848 .264-1.634 .713-2.28M11.113 7.099c1.187-.27 2.431 .015 3.382 .774C15.446 8.632 16 9.783 16 11v1")
            addPathData("M12 12v1c-.003 2.859 .869 5.651 2.5 8")
            addPathData("M8 15c.245 2.09 .854 4.121 1.8 6")
            addPathData("M4.9 19C4.225 16.73 3.921 14.367 4 12v-1C3.995 9.121 4.651 7.3 5.854 5.857M8.03 4.032C10.501 2.62 13.536 2.627 16 4.05")
            addPathData("M3 3 21 21")
        }
        return _fingerprintOff!!
    }

private var _fingerprintOff: ImageVector? = null
