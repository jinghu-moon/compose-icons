package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorThinIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.150 52.170 L 146.810 31.070 L 185.810 11.580 C 187.787 10.591 188.589 8.187 187.600 6.210 C 186.611 4.233 184.207 3.431 182.230 4.420 L 135.000 28.000 C 93.433 28.585 60.034 62.429 60.000 104.000 L 60.000 208.000 C 60.000 210.209 61.791 212.000 64.000 212.000 C 66.209 212.000 68.000 210.209 68.000 208.000 L 68.000 172.000 L 92.000 172.000 L 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 L 168.000 244.000 C 174.627 244.000 180.000 238.627 180.000 232.000 L 180.000 104.000 C 179.968 81.263 162.640 62.285 140.000 60.190 L 140.000 37.380 L 214.850 59.830 C 215.222 59.945 215.610 60.002 216.000 60.000 C 217.983 59.998 219.666 58.543 219.954 56.581 C 220.242 54.619 219.049 52.742 217.150 52.170 ZM 68.000 164.000 L 68.000 104.000 C 68.046 68.019 96.083 38.286 132.000 36.130 L 132.000 60.190 C 109.360 62.285 92.032 81.263 92.000 104.000 L 92.000 164.000 ZM 168.000 236.000 L 104.000 236.000 C 101.791 236.000 100.000 234.209 100.000 232.000 L 100.000 172.000 L 172.000 172.000 L 172.000 232.000 C 172.000 234.209 170.209 236.000 168.000 236.000 ZM 172.000 104.000 L 172.000 164.000 L 100.000 164.000 L 100.000 104.000 C 100.000 84.118 116.118 68.000 136.000 68.000 C 155.882 68.000 172.000 84.118 172.000 104.000 Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
