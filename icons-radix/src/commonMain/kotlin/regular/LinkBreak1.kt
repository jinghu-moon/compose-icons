package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LinkBreak1: ImageVector
    get() {
        if (_linkBreak1 != null) return _linkBreak1!!
        _linkBreak1 = radixIcon(
            name = "LinkBreak1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.646 1.646 C 12.841 1.451 13.158 1.451 13.353 1.646 C 13.549 1.842 13.549 2.158 13.353 2.353 L 2.353 13.353 C 2.158 13.549 1.841 13.549 1.646 13.353 C 1.451 13.158 1.451 12.842 1.646 12.646 L 12.646 1.646 ZM 12.420 4.347 C 13.190 4.747 13.761 5.463 13.941 6.330 L 13.976 6.562 C 14.001 6.808 14.000 7.100 14.000 7.500 C 14.000 7.899 14.001 8.192 13.976 8.437 L 13.941 8.670 C 13.716 9.757 12.876 10.608 11.800 10.895 L 11.581 10.945 C 11.281 11.002 10.932 11.000 10.375 11.000 L 9.500 11.000 C 9.224 11.000 9.000 10.776 9.000 10.500 C 9.000 10.224 9.224 10.000 9.500 10.000 L 10.375 10.000 C 10.978 10.000 11.210 9.998 11.393 9.963 L 11.542 9.929 C 12.271 9.734 12.817 9.164 12.962 8.467 L 12.983 8.326 C 12.999 8.167 13.000 7.937 13.000 7.500 C 13.000 7.063 12.999 6.833 12.983 6.674 L 12.962 6.533 C 12.825 5.874 12.330 5.328 11.660 5.106 L 12.420 4.347 ZM 5.500 4.000 C 5.776 4.000 6.000 4.224 6.000 4.500 C 6.000 4.776 5.776 5.000 5.500 5.000 L 4.625 5.000 C 4.172 5.000 3.928 5.001 3.758 5.016 L 3.606 5.037 C 2.853 5.181 2.269 5.716 2.072 6.395 L 2.038 6.533 C 2.003 6.702 2.000 6.917 2.000 7.500 C 2.000 8.082 2.003 8.298 2.038 8.467 L 2.072 8.604 C 2.245 9.201 2.716 9.686 3.338 9.893 L 2.579 10.652 C 1.873 10.285 1.334 9.654 1.111 8.884 L 1.058 8.670 C 0.997 8.375 1.000 8.033 1.000 7.500 C 1.000 6.967 0.997 6.625 1.058 6.330 L 1.111 6.116 C 1.417 5.062 2.312 4.266 3.419 4.055 L 3.655 4.022 C 3.906 3.999 4.207 4.000 4.625 4.000 L 5.500 4.000 Z"),
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
        return _linkBreak1!!
    }

private var _linkBreak1: ImageVector? = null
