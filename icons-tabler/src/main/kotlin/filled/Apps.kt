package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Apps: ImageVector
    get() {
        if (_apps != null) return _apps!!
        _apps = tablerFilledIcon(
            name = "Apps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 9.000 C 3.000 10.105 3.895 11.000 5.000 11.000 L 9.000 11.000 C 10.105 11.000 11.000 10.105 11.000 9.000 L 11.000 5.000 C 11.000 3.895 10.105 3.000 9.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 9.000 13.000 L 5.000 13.000 C 3.895 13.000 3.000 13.895 3.000 15.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 9.000 21.000 C 10.105 21.000 11.000 20.105 11.000 19.000 L 11.000 15.000 C 11.000 13.895 10.105 13.000 9.000 13.000 Z"),
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
        pathData = parseSvgPathData("M 19.000 13.000 L 15.000 13.000 C 13.895 13.000 13.000 13.895 13.000 15.000 L 13.000 19.000 C 13.000 20.105 13.895 21.000 15.000 21.000 L 19.000 21.000 C 20.105 21.000 21.000 20.105 21.000 19.000 L 21.000 15.000 C 21.000 13.895 20.105 13.000 19.000 13.000 Z"),
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
        pathData = parseSvgPathData("M 17.000 3.000 C 17.507 3.000 17.934 3.380 17.993 3.883 L 18.000 4.000 L 18.000 6.000 L 20.000 6.000 C 20.529 6.001 20.966 6.413 20.997 6.941 C 21.028 7.470 20.642 7.931 20.117 7.993 L 20.000 8.000 L 18.000 8.000 L 18.000 10.000 C 17.999 10.529 17.587 10.966 17.059 10.997 C 16.530 11.028 16.069 10.642 16.007 10.117 L 16.000 10.000 L 16.000 8.000 L 14.000 8.000 C 13.471 7.999 13.034 7.587 13.003 7.059 C 12.972 6.530 13.358 6.069 13.883 6.007 L 14.000 6.000 L 16.000 6.000 L 16.000 4.000 C 16.000 3.448 16.448 3.000 17.000 3.000 Z"),
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
        return _apps!!
    }

private var _apps: ImageVector? = null
