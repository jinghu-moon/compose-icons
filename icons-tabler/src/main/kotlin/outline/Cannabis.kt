package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = tablerOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 20.000 C 7.000 20.000 7.000 18.000 8.000 16.500 C 6.500 16.500 6.000 16.000 4.000 15.000 C 4.000 15.000 5.839 13.620 9.000 14.000 C 7.211 13.030 5.721 11.970 4.000 8.000 C 4.000 8.000 7.980 7.700 10.500 11.500 C 8.216 6.600 12.000 2.000 12.000 2.000 C 14.734 7.470 14.389 9.500 13.500 11.500 C 16.031 7.730 20.000 8.000 20.000 8.000 C 18.279 11.970 16.789 13.030 15.000 14.000 C 18.161 13.620 20.000 15.000 20.000 15.000 C 18.000 16.000 17.500 16.500 16.000 16.500 C 17.000 18.000 17.000 20.000 17.000 20.000 C 15.000 20.000 12.562 17.780 12.000 17.000 C 11.437 17.780 9.000 20.000 7.000 20.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 L 12.000 17.000"),
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
