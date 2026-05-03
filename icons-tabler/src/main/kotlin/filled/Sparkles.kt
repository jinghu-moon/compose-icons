package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerFilledIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 C 15.448 19.000 15.000 18.552 15.000 18.000 C 15.000 17.448 15.448 17.000 16.000 17.000 C 16.552 17.000 17.000 16.552 17.000 16.000 C 17.000 14.667 19.000 14.667 19.000 16.000 C 19.000 16.552 19.448 17.000 20.000 17.000 C 21.333 17.000 21.333 19.000 20.000 19.000 C 19.448 19.000 19.000 19.448 19.000 20.000 C 19.000 21.333 17.000 21.333 17.000 20.000 C 17.000 19.448 16.552 19.000 16.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 11.000 C 5.761 11.000 8.000 8.761 8.000 6.000 C 8.000 4.667 10.000 4.667 10.000 6.000 C 10.000 8.761 12.239 11.000 15.000 11.000 C 16.333 11.000 16.333 13.000 15.000 13.000 C 12.239 13.000 10.000 15.239 10.000 18.000 C 10.000 18.552 9.552 19.000 9.000 19.000 C 8.448 19.000 8.000 18.552 8.000 18.000 C 8.000 15.239 5.761 13.000 3.000 13.000 C 1.667 13.000 1.667 11.000 3.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 7.000 C 15.448 7.000 15.000 6.552 15.000 6.000 C 15.000 5.448 15.448 5.000 16.000 5.000 C 16.552 5.000 17.000 4.552 17.000 4.000 C 17.000 2.667 19.000 2.667 19.000 4.000 C 19.000 4.552 19.448 5.000 20.000 5.000 C 21.333 5.000 21.333 7.000 20.000 7.000 C 19.448 7.000 19.000 7.448 19.000 8.000 C 19.000 9.333 17.000 9.333 17.000 8.000 C 17.000 7.448 16.552 7.000 16.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
