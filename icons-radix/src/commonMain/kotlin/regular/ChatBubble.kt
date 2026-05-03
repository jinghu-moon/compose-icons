package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChatBubble: ImageVector
    get() {
        if (_chatBubble != null) return _chatBubble!!
        _chatBubble = radixIcon(
            name = "ChatBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.756 2.013 C 14.016 2.141 15.000 3.206 15.000 4.500 L 15.000 9.500 C 15.000 10.794 14.016 11.859 12.756 11.987 L 12.500 12.000 L 11.000 12.000 L 11.000 14.500 C 11.000 14.702 10.878 14.884 10.691 14.962 C 10.505 15.039 10.290 14.997 10.146 14.854 L 7.293 12.000 L 2.500 12.000 C 1.119 12.000 0.000 10.881 0.000 9.500 L 0.000 4.500 C 0.000 3.119 1.119 2.000 2.500 2.000 L 12.500 2.000 L 12.756 2.013 ZM 2.500 3.000 C 1.672 3.000 1.000 3.672 1.000 4.500 L 1.000 9.500 C 1.000 10.328 1.672 11.000 2.500 11.000 L 7.500 11.000 L 7.598 11.010 C 7.694 11.029 7.783 11.076 7.854 11.146 L 10.000 13.293 L 10.000 11.500 C 10.000 11.224 10.224 11.000 10.500 11.000 L 12.500 11.000 L 12.653 10.992 C 13.410 10.915 14.000 10.277 14.000 9.500 L 14.000 4.500 L 13.992 4.347 C 13.920 3.641 13.359 3.079 12.653 3.008 L 12.500 3.000 L 2.500 3.000 Z"),
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
        return _chatBubble!!
    }

private var _chatBubble: ImageVector? = null
