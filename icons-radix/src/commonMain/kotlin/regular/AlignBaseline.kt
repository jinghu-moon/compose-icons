package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignBaseline: ImageVector
    get() {
        if (_alignBaseline != null) return _alignBaseline!!
        _alignBaseline = radixIcon(
            name = "AlignBaseline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.581 13.108 C 14.763 13.146 14.900 13.307 14.900 13.500 C 14.900 13.693 14.763 13.854 14.581 13.892 L 14.500 13.900 L 0.500 13.900 C 0.279 13.900 0.099 13.721 0.099 13.500 C 0.100 13.279 0.279 13.100 0.500 13.100 L 14.500 13.100 L 14.581 13.108 ZM 7.971 10.739 C 7.877 10.999 7.590 11.134 7.330 11.040 C 7.071 10.946 6.936 10.660 7.029 10.400 L 7.971 10.739 ZM 10.500 1.750 C 10.710 1.750 10.899 1.882 10.971 2.080 L 13.971 10.400 C 14.064 10.660 13.929 10.946 13.670 11.040 C 13.410 11.134 13.123 10.999 13.029 10.739 L 12.047 8.016 L 8.953 8.016 L 7.971 10.739 L 7.500 10.569 L 7.029 10.400 L 10.029 2.080 L 10.061 2.009 C 10.148 1.851 10.316 1.750 10.500 1.750 ZM 2.500 2.100 C 2.721 2.100 2.900 2.279 2.900 2.500 L 2.900 9.533 L 4.217 8.217 C 4.373 8.061 4.627 8.061 4.783 8.217 C 4.939 8.373 4.939 8.627 4.783 8.783 L 2.783 10.783 C 2.708 10.858 2.606 10.900 2.500 10.900 C 2.394 10.900 2.292 10.858 2.217 10.783 L 0.217 8.783 L 0.166 8.720 C 0.064 8.565 0.080 8.353 0.217 8.217 C 0.353 8.080 0.564 8.064 0.720 8.166 L 0.783 8.217 L 2.099 9.533 L 2.099 2.500 C 2.099 2.279 2.279 2.100 2.500 2.100 ZM 9.259 7.166 L 11.741 7.166 L 10.500 3.725 L 9.259 7.166 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _alignBaseline!!
    }

private var _alignBaseline: ImageVector? = null
