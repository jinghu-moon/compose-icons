package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerOutlineIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 C 20.000 15.523 15.523 20.000 10.000 20.000 C 7.390 20.004 4.882 18.983 3.016 17.158 L 7.359 13.005 C 8.917 14.379 11.268 14.331 12.769 12.895 C 14.270 11.459 14.422 9.113 13.119 7.495 L 17.461 3.342 C 19.099 5.172 20.003 7.544 20.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _melon!!
    }

private var _melon: ImageVector? = null
