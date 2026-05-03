package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorThinIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 88.718 28.034 53.094 51.063 36.936 86.869 C 20.779 122.675 27.082 164.624 53.048 194.100 C 79.014 223.577 119.832 235.121 157.390 223.610 C 158.018 223.420 158.589 223.076 159.050 222.610 L 222.620 159.000 C 223.083 158.540 223.426 157.973 223.620 157.350 C 232.900 127.021 227.253 94.089 208.399 68.584 C 189.545 43.079 159.717 28.022 128.000 28.000 ZM 216.250 154.100 L 154.100 216.250 C 113.804 228.129 70.583 211.164 49.127 175.046 C 27.671 138.927 33.445 92.857 63.151 63.151 C 92.857 33.445 138.927 27.671 175.046 49.127 C 211.164 70.583 228.129 113.804 216.250 154.100 ZM 84.000 108.000 C 84.000 103.582 87.582 100.000 92.000 100.000 C 96.418 100.000 100.000 103.582 100.000 108.000 C 100.000 112.418 96.418 116.000 92.000 116.000 C 87.582 116.000 84.000 112.418 84.000 108.000 ZM 172.000 108.000 C 172.000 112.418 168.418 116.000 164.000 116.000 C 159.582 116.000 156.000 112.418 156.000 108.000 C 156.000 103.582 159.582 100.000 164.000 100.000 C 168.418 100.000 172.000 103.582 172.000 108.000 ZM 171.460 154.000 C 161.910 170.520 146.070 180.000 128.000 180.000 C 109.930 180.000 94.090 170.520 84.540 154.000 C 83.546 152.101 84.227 149.756 86.083 148.683 C 87.938 147.610 90.310 148.191 91.460 150.000 C 99.670 164.190 112.650 172.000 128.000 172.000 C 143.350 172.000 156.330 164.190 164.540 150.000 C 165.221 148.698 166.561 147.874 168.030 147.854 C 169.499 147.835 170.861 148.622 171.577 149.905 C 172.293 151.188 172.248 152.760 171.460 154.000 Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
