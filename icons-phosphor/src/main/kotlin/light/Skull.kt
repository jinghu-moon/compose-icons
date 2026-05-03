package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorLightIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 106.000 C 77.641 106.000 66.000 117.641 66.000 132.000 C 66.000 146.359 77.641 158.000 92.000 158.000 C 106.359 158.000 118.000 146.359 118.000 132.000 C 118.000 117.641 106.359 106.000 92.000 106.000 ZM 92.000 146.000 C 84.268 146.000 78.000 139.732 78.000 132.000 C 78.000 124.268 84.268 118.000 92.000 118.000 C 99.732 118.000 106.000 124.268 106.000 132.000 C 106.000 139.732 99.732 146.000 92.000 146.000 ZM 164.000 106.000 C 149.641 106.000 138.000 117.641 138.000 132.000 C 138.000 146.359 149.641 158.000 164.000 158.000 C 178.359 158.000 190.000 146.359 190.000 132.000 C 190.000 117.641 178.359 106.000 164.000 106.000 ZM 164.000 146.000 C 156.268 146.000 150.000 139.732 150.000 132.000 C 150.000 124.268 156.268 118.000 164.000 118.000 C 171.732 118.000 178.000 124.268 178.000 132.000 C 178.000 139.732 171.732 146.000 164.000 146.000 ZM 128.000 18.000 C 71.760 18.000 26.000 62.000 26.000 116.000 C 26.000 149.770 44.300 181.310 74.000 199.150 L 74.000 216.000 C 74.000 223.732 80.268 230.000 88.000 230.000 L 168.000 230.000 C 175.732 230.000 182.000 223.732 182.000 216.000 L 182.000 199.150 C 211.700 181.310 230.000 149.770 230.000 116.000 C 230.000 62.000 184.240 18.000 128.000 18.000 ZM 173.090 190.440 C 171.182 191.498 169.999 193.508 170.000 195.690 L 170.000 216.000 C 170.000 217.105 169.105 218.000 168.000 218.000 L 150.000 218.000 L 150.000 192.000 C 150.000 188.686 147.314 186.000 144.000 186.000 C 140.686 186.000 138.000 188.686 138.000 192.000 L 138.000 218.000 L 118.000 218.000 L 118.000 192.000 C 118.000 188.686 115.314 186.000 112.000 186.000 C 108.686 186.000 106.000 188.686 106.000 192.000 L 106.000 218.000 L 88.000 218.000 C 86.895 218.000 86.000 217.105 86.000 216.000 L 86.000 195.690 C 86.001 193.508 84.818 191.498 82.910 190.440 C 55.210 175.090 38.000 146.560 38.000 116.000 C 38.000 68.580 78.370 30.000 128.000 30.000 C 177.630 30.000 218.000 68.580 218.000 116.000 C 218.000 146.560 200.790 175.090 173.090 190.440 Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
