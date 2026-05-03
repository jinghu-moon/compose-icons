package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sausage: ImageVector
    get() {
        if (_sausage != null) return _sausage!!
        _sausage = tablerOutlineIcon(
            name = "Sausage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.500 5.500 C 4.119 5.500 3.000 6.619 3.000 8.000 C 3.000 15.180 8.820 21.000 16.000 21.000 C 17.381 21.000 18.500 19.881 18.500 18.500 C 18.500 17.119 17.381 16.000 16.000 16.000 C 11.582 16.000 8.000 12.418 8.000 8.000 C 8.000 6.619 6.881 5.500 5.500 5.500"),
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
        pathData = parseSvgPathData("M 5.195 5.519 L 3.952 3.530 C 3.759 3.222 3.749 2.833 3.925 2.515 C 4.102 2.197 4.436 2.000 4.800 2.000 L 6.192 2.000 C 6.556 2.000 6.890 2.197 7.067 2.515 C 7.243 2.833 7.233 3.222 7.040 3.530 L 5.795 5.520"),
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
        pathData = parseSvgPathData("M 18.482 18.225 L 20.471 16.982 C 20.779 16.789 21.168 16.779 21.486 16.955 C 21.804 17.132 22.001 17.466 22.001 17.830 L 22.001 19.222 C 22.001 19.586 21.804 19.920 21.486 20.097 C 21.168 20.273 20.779 20.263 20.471 20.070 L 18.480 18.825"),
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
        return _sausage!!
    }

private var _sausage: ImageVector? = null
