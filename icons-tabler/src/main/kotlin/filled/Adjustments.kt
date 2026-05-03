package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Adjustments: ImageVector
    get() {
        if (_adjustments != null) return _adjustments!!
        _adjustments = tablerFilledIcon(
            name = "Adjustments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 C 6.507 3.000 6.934 3.380 6.993 3.883 L 7.000 4.000 L 7.000 7.171 C 8.198 7.595 9.000 8.729 9.000 10.000 C 9.000 11.271 8.198 12.405 7.000 12.829 L 7.000 20.000 C 6.999 20.529 6.587 20.966 6.059 20.997 C 5.530 21.028 5.069 20.642 5.007 20.117 L 5.000 20.000 L 5.000 12.830 C 3.862 12.427 3.076 11.381 3.005 10.176 L 3.000 10.000 L 3.005 9.824 C 3.076 8.619 3.862 7.573 5.000 7.170 L 5.000 4.000 C 5.000 3.448 5.448 3.000 6.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 3.000 C 12.507 3.000 12.934 3.380 12.993 3.883 L 13.000 4.000 L 13.000 13.171 C 14.198 13.595 15.000 14.729 15.000 16.000 C 15.000 17.271 14.198 18.405 13.000 18.829 L 13.000 20.000 C 12.999 20.529 12.587 20.966 12.059 20.997 C 11.530 21.028 11.069 20.642 11.007 20.117 L 11.000 20.000 L 11.000 18.830 C 9.862 18.427 9.076 17.381 9.005 16.176 L 9.000 16.000 L 9.005 15.824 C 9.076 14.619 9.862 13.573 11.000 13.170 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 18.000 3.000 C 18.507 3.000 18.934 3.380 18.993 3.883 L 19.000 4.000 L 19.000 4.171 C 20.198 4.595 21.000 5.729 21.000 7.000 C 21.000 8.271 20.198 9.405 19.000 9.829 L 19.000 20.000 C 18.999 20.529 18.587 20.966 18.059 20.997 C 17.530 21.028 17.069 20.642 17.007 20.117 L 17.000 20.000 L 17.000 9.830 C 15.862 9.427 15.076 8.381 15.005 7.176 L 15.000 7.000 L 15.005 6.824 C 15.076 5.619 15.862 4.573 17.000 4.170 L 17.000 4.000 C 17.000 3.448 17.448 3.000 18.000 3.000 Z"),
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
        return _adjustments!!
    }

private var _adjustments: ImageVector? = null
