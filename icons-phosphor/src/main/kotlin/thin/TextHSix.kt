package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorThinIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 148.000 C 208.691 148.001 205.402 148.514 202.250 149.520 L 223.430 114.050 C 224.443 112.166 223.795 109.819 221.959 108.721 C 220.123 107.624 217.749 108.165 216.570 109.950 L 184.320 163.950 C 184.287 164.004 184.261 164.061 184.240 164.120 C 177.058 176.685 179.203 192.506 189.472 202.705 C 199.740 212.903 215.576 214.940 228.091 207.673 C 240.606 200.405 246.686 185.642 242.918 171.669 C 239.150 157.695 226.473 147.990 212.000 148.000 ZM 212.000 204.000 C 198.745 204.000 188.000 193.255 188.000 180.000 C 188.000 166.745 198.745 156.000 212.000 156.000 C 225.255 156.000 236.000 166.745 236.000 180.000 C 236.000 193.255 225.255 204.000 212.000 204.000 ZM 148.000 56.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 C 141.791 180.000 140.000 178.209 140.000 176.000 L 140.000 120.000 L 44.000 120.000 L 44.000 176.000 C 44.000 178.209 42.209 180.000 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 C 42.209 52.000 44.000 53.791 44.000 56.000 L 44.000 112.000 L 140.000 112.000 L 140.000 56.000 C 140.000 53.791 141.791 52.000 144.000 52.000 C 146.209 52.000 148.000 53.791 148.000 56.000 Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
