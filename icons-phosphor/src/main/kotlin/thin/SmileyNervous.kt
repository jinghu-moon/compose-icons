package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorThinIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 84.000 108.000 C 84.000 103.582 87.582 100.000 92.000 100.000 C 96.418 100.000 100.000 103.582 100.000 108.000 C 100.000 112.418 96.418 116.000 92.000 116.000 C 87.582 116.000 84.000 112.418 84.000 108.000 ZM 156.000 108.000 C 156.000 103.582 159.582 100.000 164.000 100.000 C 168.418 100.000 172.000 103.582 172.000 108.000 C 172.000 112.418 168.418 116.000 164.000 116.000 C 159.582 116.000 156.000 112.418 156.000 108.000 ZM 180.000 168.000 C 180.000 170.209 178.209 172.000 176.000 172.000 C 168.000 172.000 164.000 166.680 160.800 162.400 C 157.730 158.310 155.800 156.000 152.000 156.000 C 148.200 156.000 146.270 158.310 143.200 162.400 C 140.000 166.680 136.000 172.000 128.000 172.000 C 120.000 172.000 116.000 166.680 112.800 162.400 C 109.730 158.310 107.800 156.000 104.000 156.000 C 100.200 156.000 98.270 158.310 95.200 162.400 C 92.000 166.680 88.000 172.000 80.000 172.000 C 77.791 172.000 76.000 170.209 76.000 168.000 C 76.000 165.791 77.791 164.000 80.000 164.000 C 83.810 164.000 85.730 161.690 88.800 157.600 C 92.000 153.320 96.000 148.000 104.000 148.000 C 112.000 148.000 116.000 153.320 119.200 157.600 C 122.270 161.690 124.200 164.000 128.000 164.000 C 131.800 164.000 133.730 161.690 136.800 157.600 C 140.000 153.320 144.000 148.000 152.000 148.000 C 160.000 148.000 164.000 153.320 167.200 157.600 C 170.270 161.690 172.200 164.000 176.000 164.000 C 178.209 164.000 180.000 165.791 180.000 168.000 Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
