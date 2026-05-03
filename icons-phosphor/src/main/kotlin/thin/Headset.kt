package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorThinIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 199.050 57.480 C 170.482 28.734 127.396 20.057 89.928 35.504 C 52.460 50.951 28.008 87.472 28.000 128.000 L 28.000 184.000 C 28.000 195.046 36.954 204.000 48.000 204.000 L 64.000 204.000 C 75.046 204.000 84.000 195.046 84.000 184.000 L 84.000 144.000 C 84.000 132.954 75.046 124.000 64.000 124.000 L 36.080 124.000 C 38.222 74.789 78.743 35.996 128.000 36.000 L 128.700 36.000 C 177.738 36.242 217.916 75.003 219.920 124.000 L 192.000 124.000 C 180.954 124.000 172.000 132.954 172.000 144.000 L 172.000 184.000 C 172.000 195.046 180.954 204.000 192.000 204.000 L 220.000 204.000 L 220.000 208.000 C 220.000 223.464 207.464 236.000 192.000 236.000 L 136.000 236.000 C 133.791 236.000 132.000 237.791 132.000 240.000 C 132.000 242.209 133.791 244.000 136.000 244.000 L 192.000 244.000 C 211.882 244.000 228.000 227.882 228.000 208.000 L 228.000 128.000 C 228.101 101.581 217.685 76.208 199.050 57.480 ZM 64.000 132.000 C 70.627 132.000 76.000 137.373 76.000 144.000 L 76.000 184.000 C 76.000 190.627 70.627 196.000 64.000 196.000 L 48.000 196.000 C 41.373 196.000 36.000 190.627 36.000 184.000 L 36.000 132.000 ZM 180.000 184.000 L 180.000 144.000 C 180.000 137.373 185.373 132.000 192.000 132.000 L 220.000 132.000 L 220.000 196.000 L 192.000 196.000 C 185.373 196.000 180.000 190.627 180.000 184.000 Z"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
