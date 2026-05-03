package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorBoldIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 104.000 C 172.000 110.627 166.627 116.000 160.000 116.000 L 140.000 116.000 L 140.000 136.000 C 140.000 142.627 134.627 148.000 128.000 148.000 C 121.373 148.000 116.000 142.627 116.000 136.000 L 116.000 116.000 L 96.000 116.000 C 89.373 116.000 84.000 110.627 84.000 104.000 C 84.000 97.373 89.373 92.000 96.000 92.000 L 116.000 92.000 L 116.000 72.000 C 116.000 65.373 121.373 60.000 128.000 60.000 C 134.627 60.000 140.000 65.373 140.000 72.000 L 140.000 92.000 L 160.000 92.000 C 166.627 92.000 172.000 97.373 172.000 104.000 ZM 220.000 104.000 C 220.000 136.380 205.150 170.570 177.060 202.870 C 164.490 217.394 150.343 230.474 134.880 241.870 C 130.749 244.761 125.251 244.761 121.120 241.870 C 117.640 239.400 36.000 181.360 36.000 104.000 C 36.000 53.190 77.190 12.000 128.000 12.000 C 178.810 12.000 220.000 53.190 220.000 104.000 ZM 196.000 104.000 C 196.000 66.445 165.555 36.000 128.000 36.000 C 90.445 36.000 60.000 66.445 60.000 104.000 C 60.000 137.310 80.000 167.370 96.700 186.710 C 106.235 197.662 116.708 207.761 128.000 216.890 C 139.292 207.761 149.765 197.662 159.300 186.710 C 176.000 167.370 196.000 137.310 196.000 104.000 Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
