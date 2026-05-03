package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashOff: ImageVector
    get() {
        if (_washOff != null) return _washOff!!
        _washOff = tablerOutlineIcon(
            name = "WashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 6.000 L 4.721 16.329 C 4.882 17.293 5.716 18.000 6.694 18.000 L 17.306 18.000 C 17.514 18.000 17.716 17.968 17.906 17.908M 19.427 15.436 L 21.000 6.000"),
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
        pathData = parseSvgPathData("M 3.486 8.965 C 3.654 8.985 3.826 8.998 4.000 9.000 C 4.790 9.009 5.539 8.822 6.000 8.500 C 6.461 8.180 7.210 7.993 8.000 8.000M 12.920 8.919 C 13.348 8.836 13.725 8.692 14.000 8.501 C 14.461 8.179 15.210 7.993 16.000 8.001 C 16.790 7.993 17.539 8.179 18.000 8.501 C 18.461 8.821 19.210 9.009 20.000 9.001 C 20.170 9.001 20.339 8.986 20.503 8.966"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _washOff!!
    }

private var _washOff: ImageVector? = null
