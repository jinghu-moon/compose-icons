package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorBoldIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 180.000 C 252.002 196.253 242.169 210.892 227.122 217.036 C 212.074 223.180 194.805 219.609 183.430 208.000 C 180.311 204.962 179.082 200.472 180.220 196.269 C 181.357 192.066 184.682 188.809 188.908 187.759 C 193.134 186.708 197.597 188.029 200.570 191.210 C 205.655 196.389 213.589 197.496 219.898 193.907 C 226.207 190.318 229.309 182.932 227.456 175.915 C 225.603 168.897 219.258 164.006 212.000 164.000 C 207.526 163.999 203.424 161.510 201.358 157.542 C 199.292 153.574 199.605 148.786 202.170 145.120 L 217.000 124.000 L 192.000 124.000 C 185.373 124.000 180.000 118.627 180.000 112.000 C 180.000 105.373 185.373 100.000 192.000 100.000 L 240.000 100.000 C 244.474 100.001 248.576 102.490 250.642 106.458 C 252.708 110.426 252.395 115.214 249.830 118.880 L 231.490 145.080 C 244.149 152.143 251.996 165.503 252.000 180.000 ZM 144.000 44.000 C 137.373 44.000 132.000 49.373 132.000 56.000 L 132.000 104.000 L 52.000 104.000 L 52.000 56.000 C 52.000 49.373 46.627 44.000 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 C 46.627 188.000 52.000 182.627 52.000 176.000 L 52.000 128.000 L 132.000 128.000 L 132.000 176.000 C 132.000 182.627 137.373 188.000 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 56.000 C 156.000 49.373 150.627 44.000 144.000 44.000 Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
