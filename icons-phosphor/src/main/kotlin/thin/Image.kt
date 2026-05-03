package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorThinIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 168.400 L 187.110 135.510 C 184.858 133.251 181.800 131.981 178.610 131.981 C 175.420 131.981 172.362 133.251 170.110 135.510 L 147.280 158.340 L 100.460 111.510 C 98.208 109.251 95.150 107.981 91.960 107.981 C 88.770 107.981 85.712 109.251 83.460 111.510 L 36.000 159.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 ZM 36.000 200.000 L 36.000 170.340 L 89.170 117.170 C 89.920 116.419 90.938 115.997 92.000 115.997 C 93.062 115.997 94.080 116.419 94.830 117.170 L 181.660 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 ZM 216.000 204.000 L 193.000 204.000 L 153.000 164.000 L 175.830 141.170 C 176.580 140.419 177.598 139.997 178.660 139.997 C 179.722 139.997 180.740 140.419 181.490 141.170 L 220.000 179.710 L 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 ZM 148.000 100.000 C 148.000 95.582 151.582 92.000 156.000 92.000 C 160.418 92.000 164.000 95.582 164.000 100.000 C 164.000 104.418 160.418 108.000 156.000 108.000 C 151.582 108.000 148.000 104.418 148.000 100.000 Z"),
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
        return _image!!
    }

private var _image: ImageVector? = null
