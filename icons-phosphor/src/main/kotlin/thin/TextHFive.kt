package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorThinIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 180.000 C 244.000 197.673 229.673 212.000 212.000 212.000 C 203.449 212.151 195.202 208.832 189.140 202.800 C 187.594 201.220 187.620 198.686 189.200 197.140 C 190.780 195.594 193.314 195.620 194.860 197.200 C 199.419 201.690 205.602 204.143 212.000 204.000 C 225.255 204.000 236.000 193.255 236.000 180.000 C 236.000 166.745 225.255 156.000 212.000 156.000 C 205.602 155.857 199.419 158.310 194.860 162.800 C 193.639 164.055 191.743 164.370 190.182 163.576 C 188.620 162.783 187.757 161.066 188.050 159.340 L 196.050 111.340 C 196.373 109.411 198.044 107.998 200.000 108.000 L 240.000 108.000 C 242.209 108.000 244.000 109.791 244.000 112.000 C 244.000 114.209 242.209 116.000 240.000 116.000 L 203.390 116.000 L 197.520 151.210 C 202.044 149.064 206.993 147.966 212.000 148.000 C 229.673 148.000 244.000 162.327 244.000 180.000 ZM 144.000 52.000 C 141.791 52.000 140.000 53.791 140.000 56.000 L 140.000 112.000 L 44.000 112.000 L 44.000 56.000 C 44.000 53.791 42.209 52.000 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 C 42.209 180.000 44.000 178.209 44.000 176.000 L 44.000 120.000 L 140.000 120.000 L 140.000 176.000 C 140.000 178.209 141.791 180.000 144.000 180.000 C 146.209 180.000 148.000 178.209 148.000 176.000 L 148.000 56.000 C 148.000 53.791 146.209 52.000 144.000 52.000 Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
