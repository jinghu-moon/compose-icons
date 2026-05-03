package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorLightIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 180.000 C 246.000 193.816 237.639 206.258 224.848 211.479 C 212.056 216.699 197.377 213.660 187.710 203.790 C 185.393 201.421 185.436 197.622 187.805 195.305 C 190.174 192.988 193.973 193.031 196.290 195.400 C 203.279 202.531 214.194 204.060 222.874 199.125 C 231.554 194.191 235.823 184.029 233.270 174.376 C 230.718 164.723 221.985 157.999 212.000 158.000 C 209.762 158.002 207.709 156.758 206.675 154.773 C 205.641 152.789 205.797 150.393 207.080 148.560 L 228.480 118.000 L 192.000 118.000 C 188.686 118.000 186.000 115.314 186.000 112.000 C 186.000 108.686 188.686 106.000 192.000 106.000 L 240.000 106.000 C 242.236 106.002 244.285 107.248 245.317 109.231 C 246.349 111.215 246.192 113.608 244.910 115.440 L 222.390 147.620 C 236.449 152.152 245.984 165.229 246.000 180.000 ZM 144.000 50.000 C 140.686 50.000 138.000 52.686 138.000 56.000 L 138.000 110.000 L 46.000 110.000 L 46.000 56.000 C 46.000 52.686 43.314 50.000 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 L 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 C 43.314 182.000 46.000 179.314 46.000 176.000 L 46.000 122.000 L 138.000 122.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 56.000 C 150.000 52.686 147.314 50.000 144.000 50.000 Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
