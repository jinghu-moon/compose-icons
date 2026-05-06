package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WavesElectricity: ImageVector
    get() {
        if (_wavesElectricity != null) return _wavesElectricity!!
        _wavesElectricity = tablerOutlineIcon(
            name = "WavesElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c.576-.643 1.512-1.017 2.5-1 .988-.017 1.924 .357 2.5 1 .576 .643 1.512 1.017 2.5 1 .988 .017 1.924-.357 2.5-1")
            addPathData("M3 16c.576-.643 1.512-1.017 2.5-1 .988-.017 1.924 .357 2.5 1 .576 .643 1.512 1.017 2.5 1 .988 .017 1.924-.357 2.5-1")
            addPathData("M3 8C3.576 7.357 4.512 6.983 5.5 7 6.488 6.983 7.424 7.357 8 8c.576 .643 1.512 1.017 2.5 1 .988 .017 1.924-.357 2.5-1")
            addPathData("M20 7l-3 5h4l-3 5")
        }
        return _wavesElectricity!!
    }

private var _wavesElectricity: ImageVector? = null
