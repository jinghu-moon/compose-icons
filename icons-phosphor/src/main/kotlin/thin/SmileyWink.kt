package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorThinIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 84.000 108.000 C 84.000 103.582 87.582 100.000 92.000 100.000 C 96.418 100.000 100.000 103.582 100.000 108.000 C 100.000 112.418 96.418 116.000 92.000 116.000 C 87.582 116.000 84.000 112.418 84.000 108.000 ZM 180.000 108.000 C 180.000 110.209 178.209 112.000 176.000 112.000 L 152.000 112.000 C 149.791 112.000 148.000 110.209 148.000 108.000 C 148.000 105.791 149.791 104.000 152.000 104.000 L 176.000 104.000 C 178.209 104.000 180.000 105.791 180.000 108.000 ZM 171.460 154.000 C 161.910 170.520 146.070 180.000 128.000 180.000 C 109.930 180.000 94.090 170.520 84.540 154.000 C 83.546 152.101 84.227 149.756 86.083 148.683 C 87.938 147.610 90.310 148.191 91.460 150.000 C 99.670 164.190 112.650 172.000 128.000 172.000 C 143.350 172.000 156.330 164.190 164.540 150.000 C 165.221 148.698 166.561 147.874 168.030 147.854 C 169.499 147.835 170.861 148.622 171.577 149.905 C 172.293 151.188 172.248 152.760 171.460 154.000 Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
