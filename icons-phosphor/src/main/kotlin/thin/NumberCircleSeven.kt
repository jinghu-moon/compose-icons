package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorThinIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 155.280 85.710 C 156.027 86.779 156.206 88.145 155.760 89.370 L 123.760 177.370 C 123.184 178.950 121.682 180.001 120.000 180.000 C 119.533 179.998 119.070 179.917 118.630 179.760 C 117.632 179.397 116.820 178.652 116.372 177.690 C 115.924 176.728 115.876 175.627 116.240 174.630 L 146.290 92.000 L 104.000 92.000 C 101.791 92.000 100.000 90.209 100.000 88.000 C 100.000 85.791 101.791 84.000 104.000 84.000 L 152.000 84.000 C 153.307 84.000 154.532 84.638 155.280 85.710 Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
