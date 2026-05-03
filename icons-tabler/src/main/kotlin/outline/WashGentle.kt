package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashGentle: ImageVector
    get() {
        if (_washGentle != null) return _washGentle!!
        _washGentle = tablerOutlineIcon(
            name = "WashGentle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.486 5.965 C 3.654 5.985 3.826 5.998 4.000 6.000 C 4.790 6.009 5.539 5.822 6.000 5.500 C 6.461 5.180 7.210 4.993 8.000 5.000 C 8.790 4.993 9.539 5.180 10.000 5.500 C 10.461 5.822 11.210 6.009 12.000 6.000 C 12.790 6.009 13.539 5.822 14.000 5.500 C 14.461 5.180 15.210 4.993 16.000 5.000 C 16.790 4.993 17.539 5.180 18.000 5.500 C 18.461 5.822 19.210 6.009 20.000 6.000 C 20.170 6.000 20.339 5.986 20.503 5.966"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 4.721 13.329 C 4.882 14.293 5.716 15.000 6.694 15.000 L 17.306 15.000 C 18.284 15.000 19.118 14.293 19.279 13.329 L 21.000 3.000"),
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
        pathData = parseSvgPathData("M 5.000 18.000 L 19.000 18.000"),
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
        pathData = parseSvgPathData("M 5.000 21.000 L 19.000 21.000"),
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
        return _washGentle!!
    }

private var _washGentle: ImageVector? = null
