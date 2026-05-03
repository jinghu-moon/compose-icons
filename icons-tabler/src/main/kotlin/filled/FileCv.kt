package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCv: ImageVector
    get() {
        if (_fileCv != null) return _fileCv!!
        _fileCv = tablerFilledIcon(
            name = "FileCv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 9.500 10.000 C 8.119 10.000 7.000 11.119 7.000 12.500 L 7.000 15.500 C 7.000 16.881 8.119 18.000 9.500 18.000 C 10.881 18.000 12.000 16.881 12.000 15.500 C 12.000 14.948 11.552 14.500 11.000 14.500 C 10.448 14.500 10.000 14.948 10.000 15.500 C 10.000 15.776 9.776 16.000 9.500 16.000 C 9.224 16.000 9.000 15.776 9.000 15.500 L 9.000 12.500 C 9.000 12.224 9.224 12.000 9.500 12.000 C 9.776 12.000 10.000 12.224 10.000 12.500 C 10.000 13.052 10.448 13.500 11.000 13.500 C 11.552 13.500 12.000 13.052 12.000 12.500 C 12.000 11.119 10.881 10.000 9.500 10.000M 16.243 10.030 C 15.707 9.896 15.164 10.221 15.030 10.757 L 14.500 12.876 L 13.970 10.757 C 13.885 10.408 13.620 10.132 13.275 10.032 C 12.930 9.933 12.558 10.026 12.301 10.276 C 12.044 10.526 11.940 10.895 12.030 11.243 L 13.530 17.243 C 13.782 18.253 15.218 18.253 15.470 17.243 L 16.970 11.243 C 17.104 10.707 16.779 10.164 16.243 10.030M 14.999 2.999 L 19.000 7.000 L 15.000 7.000 Z"),
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
        return _fileCv!!
    }

private var _fileCv: ImageVector? = null
