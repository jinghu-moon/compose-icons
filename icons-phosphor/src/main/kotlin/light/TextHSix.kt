package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorLightIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 146.000 C 210.124 146.004 208.251 146.161 206.400 146.470 L 225.150 115.080 C 226.851 112.236 225.924 108.551 223.080 106.850 C 220.236 105.149 216.551 106.076 214.850 108.920 L 182.600 162.920 L 182.380 163.330 C 174.852 176.712 177.227 193.480 188.176 204.244 C 199.125 215.009 215.930 217.100 229.183 209.346 C 242.436 201.592 248.847 185.918 244.827 171.099 C 240.807 156.280 227.355 145.994 212.000 146.000 ZM 212.000 202.000 C 199.850 202.000 190.000 192.150 190.000 180.000 C 190.000 167.850 199.850 158.000 212.000 158.000 C 224.150 158.000 234.000 167.850 234.000 180.000 C 234.000 192.150 224.150 202.000 212.000 202.000 ZM 150.000 56.000 L 150.000 176.000 C 150.000 179.314 147.314 182.000 144.000 182.000 C 140.686 182.000 138.000 179.314 138.000 176.000 L 138.000 122.000 L 46.000 122.000 L 46.000 176.000 C 46.000 179.314 43.314 182.000 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 L 34.000 56.000 C 34.000 52.686 36.686 50.000 40.000 50.000 C 43.314 50.000 46.000 52.686 46.000 56.000 L 46.000 110.000 L 138.000 110.000 L 138.000 56.000 C 138.000 52.686 140.686 50.000 144.000 50.000 C 147.314 50.000 150.000 52.686 150.000 56.000 Z"),
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
