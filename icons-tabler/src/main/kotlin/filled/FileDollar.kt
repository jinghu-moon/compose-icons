package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDollar: ImageVector
    get() {
        if (_fileDollar != null) return _fileDollar!!
        _fileDollar = tablerFilledIcon(
            name = "FileDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 L 11.000 11.050 C 9.741 11.306 8.881 12.473 9.010 13.751 C 9.139 15.029 10.216 16.001 11.500 16.000 L 12.500 16.000 C 12.776 16.000 13.000 16.224 13.000 16.500 C 13.000 16.776 12.776 17.000 12.500 17.000 L 10.000 17.000 C 9.448 17.000 9.000 17.448 9.000 18.000 C 9.000 18.552 9.448 19.000 10.000 19.000 L 11.000 19.000 C 11.000 19.552 11.448 20.000 12.000 20.000 C 12.552 20.000 13.000 19.552 13.000 19.000 L 13.000 18.950 C 14.259 18.694 15.119 17.527 14.990 16.249 C 14.861 14.971 13.784 13.999 12.500 14.000 L 11.500 14.000 C 11.224 14.000 11.000 13.776 11.000 13.500 C 11.000 13.224 11.224 13.000 11.500 13.000 L 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 L 13.000 11.000 C 13.000 10.448 12.552 10.000 12.000 10.000"),
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
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileDollar!!
    }

private var _fileDollar: ImageVector? = null
