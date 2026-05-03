package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorBoldIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 60.000 C 103.699 60.000 84.000 79.699 84.000 104.000 C 84.000 128.301 103.699 148.000 128.000 148.000 C 152.301 148.000 172.000 128.301 172.000 104.000 C 171.972 79.711 152.289 60.028 128.000 60.000 ZM 128.000 124.000 C 116.954 124.000 108.000 115.046 108.000 104.000 C 108.000 92.954 116.954 84.000 128.000 84.000 C 139.046 84.000 148.000 92.954 148.000 104.000 C 148.000 115.046 139.046 124.000 128.000 124.000 ZM 128.000 12.000 C 77.213 12.055 36.055 53.213 36.000 104.000 C 36.000 181.360 117.640 239.400 121.120 241.830 C 125.251 244.721 130.749 244.721 134.880 241.830 C 150.343 230.434 164.490 217.354 177.060 202.830 C 205.150 170.570 220.000 136.370 220.000 104.000 C 219.945 53.213 178.787 12.055 128.000 12.000 ZM 159.300 186.710 C 149.765 197.662 139.292 207.761 128.000 216.890 C 116.708 207.761 106.235 197.662 96.700 186.710 C 80.000 167.370 60.000 137.310 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 196.000 137.310 176.000 167.370 159.300 186.710 Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
