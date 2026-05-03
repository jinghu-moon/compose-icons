package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorFillIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 187.430 153.070 C 190.568 154.880 192.098 158.572 191.161 162.070 C 190.223 165.569 187.052 168.001 183.430 168.000 C 182.025 168.004 180.645 167.635 179.430 166.930 L 136.000 141.860 L 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 141.860 L 76.570 166.930 C 72.745 169.133 67.858 167.822 65.650 164.000 C 63.438 160.175 64.746 155.282 68.570 153.070 L 112.000 128.000 L 68.570 102.930 C 64.743 100.721 63.431 95.827 65.640 92.000 C 67.849 88.173 72.743 86.861 76.570 89.070 L 120.000 114.140 L 120.000 64.000 C 120.000 59.582 123.582 56.000 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 L 136.000 114.140 L 179.430 89.070 C 183.257 86.861 188.151 88.173 190.360 92.000 C 192.569 95.827 191.257 100.721 187.430 102.930 L 144.000 128.000 Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
