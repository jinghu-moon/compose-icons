package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = tablerFilledIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 19.657 2.000 21.000 3.343 21.000 5.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 18.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 ZM 8.000 17.000 C 7.448 17.000 7.000 17.448 7.000 18.000 L 7.007 18.127 C 7.069 18.652 7.530 19.038 8.059 19.007 C 8.587 18.976 8.999 18.539 9.000 18.010 L 8.993 17.883 C 8.934 17.380 8.507 17.000 8.000 17.000 ZM 12.000 17.000 C 11.448 17.000 11.000 17.448 11.000 18.000 L 11.007 18.127 C 11.069 18.652 11.530 19.038 12.059 19.007 C 12.587 18.976 12.999 18.539 13.000 18.010 L 12.993 17.883 C 12.934 17.380 12.507 17.000 12.000 17.000 ZM 16.000 17.000 C 15.448 17.000 15.000 17.448 15.000 18.000 L 15.007 18.127 C 15.069 18.652 15.530 19.038 16.059 19.007 C 16.587 18.976 16.999 18.539 17.000 18.010 L 16.993 17.883 C 16.934 17.380 16.507 17.000 16.000 17.000 ZM 8.000 13.000 C 7.448 13.000 7.000 13.448 7.000 14.000 L 7.007 14.127 C 7.069 14.652 7.530 15.038 8.059 15.007 C 8.587 14.976 8.999 14.539 9.000 14.010 L 8.993 13.883 C 8.934 13.380 8.507 13.000 8.000 13.000 ZM 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000 L 11.007 14.127 C 11.069 14.652 11.530 15.038 12.059 15.007 C 12.587 14.976 12.999 14.539 13.000 14.010 L 12.993 13.883 C 12.934 13.380 12.507 13.000 12.000 13.000 ZM 16.000 13.000 C 15.448 13.000 15.000 13.448 15.000 14.000 L 15.007 14.127 C 15.069 14.652 15.530 15.038 16.059 15.007 C 16.587 14.976 16.999 14.539 17.000 14.010 L 16.993 13.883 C 16.934 13.380 16.507 13.000 16.000 13.000 ZM 15.000 6.000 L 9.000 6.000 C 7.895 6.000 7.000 6.895 7.000 8.000 L 7.000 9.000 C 7.000 10.105 7.895 11.000 9.000 11.000 L 15.000 11.000 C 16.105 11.000 17.000 10.105 17.000 9.000 L 17.000 8.000 C 17.000 6.895 16.105 6.000 15.000 6.000 Z"),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
