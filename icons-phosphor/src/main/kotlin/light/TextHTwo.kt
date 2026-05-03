package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorLightIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 150.000 56.000 L 150.000 176.000 C 150.000 179.314 147.314 182.000 144.000 182.000 C 140.686 182.000 138.000 179.314 138.000 176.000 L 138.000 122.000 L 46.000 122.000 L 46.000 176.000 C 46.000 179.314 43.314 182.000 40.000 182.000 C 36.686 182.000 34.000 179.314 34.000 176.000 L 34.000 56.000 C 34.000 52.686 36.686 50.000 40.000 50.000 C 43.314 50.000 46.000 52.686 46.000 56.000 L 46.000 110.000 L 138.000 110.000 L 138.000 56.000 C 138.000 52.686 140.686 50.000 144.000 50.000 C 147.314 50.000 150.000 52.686 150.000 56.000 ZM 240.000 202.000 L 204.000 202.000 L 240.000 154.050 C 247.049 144.602 247.912 131.903 242.206 121.588 C 236.501 111.274 225.283 105.257 213.534 106.208 C 201.785 107.159 191.682 114.902 187.710 126.000 C 186.838 128.054 187.178 130.421 188.591 132.147 C 190.005 133.873 192.260 134.672 194.445 134.221 C 196.630 133.770 198.385 132.145 199.000 130.000 C 201.241 123.669 206.819 119.112 213.470 118.180 C 220.679 117.171 227.785 120.603 231.478 126.875 C 235.170 133.148 234.721 141.027 230.340 146.840 L 187.200 204.400 C 185.836 206.218 185.617 208.651 186.633 210.683 C 187.650 212.716 189.727 214.000 192.000 214.000 L 240.000 214.000 C 243.314 214.000 246.000 211.314 246.000 208.000 C 246.000 204.686 243.314 202.000 240.000 202.000 Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
