package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Smiley: ImageVector
    get() {
        if (_smiley != null) return _smiley!!
        _smiley = phosphorThinIcon(
            name = "Smiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 171.460 154.000 C 161.910 170.520 146.070 180.000 128.000 180.000 C 109.930 180.000 94.090 170.520 84.540 154.000 C 83.546 152.101 84.227 149.756 86.083 148.683 C 87.938 147.610 90.310 148.191 91.460 150.000 C 99.670 164.190 112.650 172.000 128.000 172.000 C 143.350 172.000 156.330 164.190 164.540 150.000 C 165.221 148.698 166.561 147.874 168.030 147.854 C 169.499 147.835 170.861 148.622 171.577 149.905 C 172.293 151.188 172.248 152.760 171.460 154.000 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 ZM 92.000 116.000 C 96.418 116.000 100.000 112.418 100.000 108.000 C 100.000 103.582 96.418 100.000 92.000 100.000 C 87.582 100.000 84.000 103.582 84.000 108.000 C 84.000 112.418 87.582 116.000 92.000 116.000 ZM 164.000 100.000 C 159.582 100.000 156.000 103.582 156.000 108.000 C 156.000 112.418 159.582 116.000 164.000 116.000 C 168.418 116.000 172.000 112.418 172.000 108.000 C 172.000 103.582 168.418 100.000 164.000 100.000 Z"),
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
        return _smiley!!
    }

private var _smiley: ImageVector? = null
