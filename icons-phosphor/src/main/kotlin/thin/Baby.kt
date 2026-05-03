package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorThinIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 136.000 C 87.582 136.000 84.000 132.418 84.000 128.000 C 84.000 123.582 87.582 120.000 92.000 120.000 C 96.418 120.000 100.000 123.582 100.000 128.000 C 100.000 132.418 96.418 136.000 92.000 136.000 ZM 164.000 120.000 C 159.582 120.000 156.000 123.582 156.000 128.000 C 156.000 132.418 159.582 136.000 164.000 136.000 C 168.418 136.000 172.000 132.418 172.000 128.000 C 172.000 123.582 168.418 120.000 164.000 120.000 ZM 153.870 164.620 C 138.029 174.468 117.971 174.468 102.130 164.620 C 100.272 163.573 97.919 164.168 96.782 165.972 C 95.645 167.777 96.124 170.156 97.870 171.380 C 116.315 182.866 139.685 182.866 158.130 171.380 C 159.416 170.655 160.198 169.282 160.165 167.806 C 160.133 166.330 159.290 164.993 157.973 164.326 C 156.656 163.660 155.079 163.773 153.870 164.620 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 219.953 77.962 179.966 37.114 129.940 36.000 C 116.260 54.070 116.000 71.830 116.000 72.000 C 116.000 78.627 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 78.627 140.000 72.000 C 140.000 69.791 141.791 68.000 144.000 68.000 C 146.209 68.000 148.000 69.791 148.000 72.000 C 148.000 83.046 139.046 92.000 128.000 92.000 C 116.954 92.000 108.000 83.046 108.000 72.000 C 108.000 71.220 108.160 54.690 120.000 36.360 C 70.416 40.688 33.266 83.664 36.155 133.352 C 39.045 183.041 80.926 221.421 130.677 219.973 C 180.428 218.524 220.006 177.772 220.000 128.000 Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
