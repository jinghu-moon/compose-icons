package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunElectricity: ImageVector
    get() {
        if (_sunElectricity != null) return _sunElectricity!!
        _sunElectricity = tablerOutlineIcon(
            name = "SunElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 2.209 1.791 4 4 4M12 8C9.791 8 8 9.791 8 12")
            addPathData("M3 12h1")
            addPathData("M12 3v1")
            addPathData("M12 20v1")
            addPathData("M5.6 5.6l.7 .7")
            addPathData("M6.3 17.7l-.7 .7")
            addPathData("M20 7l-3 5h4l-3 5")
        }
        return _sunElectricity!!
    }

private var _sunElectricity: ImageVector? = null
