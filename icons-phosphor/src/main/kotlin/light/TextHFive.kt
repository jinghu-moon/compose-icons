package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorLightIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 180.000 C 246.000 198.778 230.778 214.000 212.000 214.000 C 202.911 214.154 194.148 210.618 187.710 204.200 C 185.390 201.831 185.431 198.030 187.800 195.710 C 190.169 193.390 193.970 193.431 196.290 195.800 C 200.471 199.908 206.140 202.145 212.000 202.000 C 224.150 202.000 234.000 192.150 234.000 180.000 C 234.000 167.850 224.150 158.000 212.000 158.000 C 206.140 157.855 200.471 160.092 196.290 164.200 C 194.456 166.081 191.612 166.550 189.271 165.358 C 186.930 164.166 185.637 161.589 186.080 159.000 L 194.080 111.000 C 194.568 108.112 197.071 105.998 200.000 106.000 L 240.000 106.000 C 243.314 106.000 246.000 108.686 246.000 112.000 C 246.000 115.314 243.314 118.000 240.000 118.000 L 205.080 118.000 L 200.080 148.000 C 203.912 146.666 207.942 145.990 212.000 146.000 C 230.778 146.000 246.000 161.222 246.000 180.000 ZM 144.000 50.000 C 140.686 50.000 138.000 52.686 138.000 56.000 L 138.000 110.000 L 46.000 110.000 L 46.000 56.000 C 46.000 52.686 43.314 50.000 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 L 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 C 43.314 182.000 46.000 179.314 46.000 176.000 L 46.000 122.000 L 138.000 122.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 56.000 C 150.000 52.686 147.314 50.000 144.000 50.000 Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
