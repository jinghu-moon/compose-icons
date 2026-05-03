package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorThinIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 88.000 L 220.000 88.000 C 220.022 70.183 214.851 52.745 205.120 37.820 C 204.383 36.686 203.123 36.001 201.770 36.000 L 54.230 36.000 C 52.877 36.001 51.617 36.686 50.880 37.820 C 41.149 52.745 35.978 70.183 36.000 88.000 L 36.000 88.000 C 36.058 137.231 74.818 177.713 124.000 179.910 L 124.000 220.000 L 88.000 220.000 C 85.791 220.000 84.000 221.791 84.000 224.000 C 84.000 226.209 85.791 228.000 88.000 228.000 L 168.000 228.000 C 170.209 228.000 172.000 226.209 172.000 224.000 C 172.000 221.791 170.209 220.000 168.000 220.000 L 132.000 220.000 L 132.000 179.910 C 181.182 177.713 219.942 137.231 220.000 88.000 ZM 56.430 44.000 L 199.570 44.000 C 207.006 56.071 211.246 69.837 211.890 84.000 L 44.110 84.000 C 44.754 69.837 48.994 56.071 56.430 44.000 ZM 128.000 172.000 C 83.185 171.947 46.285 136.761 44.100 92.000 L 211.900 92.000 C 209.715 136.761 172.815 171.947 128.000 172.000 Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
