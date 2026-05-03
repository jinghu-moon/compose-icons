package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashPress: ImageVector
    get() {
        if (_washPress != null) return _washPress!!
        _washPress = tablerOutlineIcon(
            name = "WashPress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.486 7.965 C 3.654 7.985 3.826 7.998 4.000 8.000 C 4.790 8.009 5.539 7.822 6.000 7.500 C 6.461 7.180 7.210 6.993 8.000 7.000 C 8.790 6.993 9.539 7.180 10.000 7.500 C 10.461 7.822 11.210 8.009 12.000 8.000 C 12.790 8.009 13.539 7.822 14.000 7.500 C 14.461 7.180 15.210 6.993 16.000 7.000 C 16.790 6.993 17.539 7.180 18.000 7.500 C 18.461 7.822 19.210 8.009 20.000 8.000 C 20.170 8.000 20.339 7.986 20.503 7.966"),
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
        pathData = parseSvgPathData("M 3.000 5.000 L 4.721 15.329 C 4.882 16.293 5.716 17.000 6.694 17.000 L 17.306 17.000 C 18.284 17.000 19.118 16.293 19.279 15.329 L 21.000 5.000"),
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
        pathData = parseSvgPathData("M 5.000 20.000 L 19.000 20.000"),
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
        return _washPress!!
    }

private var _washPress: ImageVector? = null
