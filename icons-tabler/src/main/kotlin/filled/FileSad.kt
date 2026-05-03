package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSad: ImageVector
    get() {
        if (_fileSad != null) return _fileSad!!
        _fileSad = tablerFilledIcon(
            name = "FileSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 14.571 17.180 C 13.026 16.104 10.974 16.104 9.429 17.180 C 9.120 17.377 8.944 17.728 8.970 18.094 C 8.996 18.460 9.221 18.782 9.555 18.933 C 9.889 19.085 10.279 19.041 10.571 18.820 C 11.430 18.222 12.570 18.222 13.429 18.820 C 13.881 19.109 14.481 18.990 14.788 18.549 C 15.095 18.108 14.999 17.504 14.571 17.180M 10.006 12.000 L 9.995 12.000 C 9.443 12.000 8.995 12.448 8.995 13.000 C 8.995 13.552 9.443 14.000 9.995 14.000 L 10.005 14.000 C 10.557 14.000 11.005 13.552 11.005 13.000 C 11.005 12.448 10.557 12.000 10.005 12.000M 14.005 12.000 L 13.994 12.000 C 13.442 12.000 12.994 12.448 12.994 13.000 C 12.994 13.552 13.442 14.000 13.994 14.000 L 14.004 14.000 C 14.556 14.000 15.004 13.552 15.004 13.000 C 15.004 12.448 14.556 12.000 14.004 12.000"),
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
        return _fileSad!!
    }

private var _fileSad: ImageVector? = null
