package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Template: ImageVector
    get() {
        if (_template != null) return _template!!
        _template = tablerFilledIcon(
            name = "Template",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 7.000 C 21.000 8.105 20.105 9.000 19.000 9.000 L 5.000 9.000 C 3.895 9.000 3.000 8.105 3.000 7.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 9.000 11.000 C 10.105 11.000 11.000 11.895 11.000 13.000 L 11.000 19.000 C 11.000 20.105 10.105 21.000 9.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 13.000 C 3.000 11.895 3.895 11.000 5.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 C 21.000 12.552 20.552 13.000 20.000 13.000 L 14.000 13.000 C 13.448 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 13.448 11.000 14.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 15.000 C 20.552 15.000 21.000 15.448 21.000 16.000 C 21.000 16.552 20.552 17.000 20.000 17.000 L 14.000 17.000 C 13.448 17.000 13.000 16.552 13.000 16.000 C 13.000 15.448 13.448 15.000 14.000 15.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 19.000 C 20.552 19.000 21.000 19.448 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 C 13.000 19.448 13.448 19.000 14.000 19.000 Z"),
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
        return _template!!
    }

private var _template: ImageVector? = null
