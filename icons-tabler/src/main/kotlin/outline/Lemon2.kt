package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerOutlineIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 4.000 C 18.864 4.000 19.631 4.555 19.900 5.376 C 20.170 6.198 19.881 7.099 19.185 7.611 C 20.735 10.551 20.058 14.528 17.293 17.293 C 14.528 20.058 10.550 20.735 7.611 19.185 C 7.145 19.819 6.350 20.121 5.580 19.956 C 4.810 19.791 4.209 19.190 4.044 18.420 C 3.879 17.650 4.181 16.855 4.815 16.389 C 3.265 13.449 3.942 9.472 6.707 6.707 C 9.472 3.942 13.450 3.265 16.389 4.815 C 16.766 4.303 17.364 4.000 18.000 4.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
