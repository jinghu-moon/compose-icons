package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorThinIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.810 166.860 L 251.810 166.860 L 229.520 92.560 C 228.026 87.473 223.351 83.985 218.050 84.000 L 208.000 84.000 C 205.791 84.000 204.000 85.791 204.000 88.000 C 204.000 90.209 205.791 92.000 208.000 92.000 L 218.050 92.000 C 219.816 92.000 221.372 93.159 221.880 94.850 L 242.620 164.000 L 203.000 164.000 L 181.540 92.550 C 180.040 87.460 175.356 83.975 170.050 84.000 L 160.000 84.000 C 157.791 84.000 156.000 85.791 156.000 88.000 C 156.000 90.209 157.791 92.000 160.000 92.000 L 170.050 92.000 C 171.816 92.000 173.372 93.159 173.880 94.850 L 194.620 164.000 L 155.000 164.000 L 133.540 92.550 C 132.040 87.460 127.356 83.975 122.050 84.000 L 38.000 84.000 C 32.694 83.975 28.010 87.460 26.510 92.550 L 4.170 166.850 C 4.170 166.910 4.170 166.970 4.170 167.020 C 3.870 168.208 4.130 169.468 4.877 170.439 C 5.624 171.410 6.775 171.985 8.000 172.000 L 248.000 172.000 C 250.209 172.000 252.000 170.209 252.000 168.000 C 251.994 167.613 251.930 167.228 251.810 166.860 ZM 34.120 94.860 C 34.629 93.147 36.213 91.980 38.000 92.000 L 122.100 92.000 C 123.866 92.000 125.422 93.159 125.930 94.850 L 146.620 164.000 L 13.380 164.000 Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
