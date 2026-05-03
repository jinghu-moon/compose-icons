package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorBoldIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 220.000 L 160.730 220.000 C 165.910 215.000 171.480 209.290 177.060 202.870 C 205.150 170.570 220.000 136.370 220.000 104.000 C 220.000 53.190 178.810 12.000 128.000 12.000 C 77.190 12.000 36.000 53.190 36.000 104.000 C 36.000 154.000 70.120 195.940 95.180 220.000 L 56.000 220.000 C 49.373 220.000 44.000 225.373 44.000 232.000 C 44.000 238.627 49.373 244.000 56.000 244.000 L 200.000 244.000 C 206.627 244.000 212.000 238.627 212.000 232.000 C 212.000 225.373 206.627 220.000 200.000 220.000 ZM 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 196.000 137.310 176.000 167.370 159.300 186.710 C 149.765 197.662 139.292 207.761 128.000 216.890 C 116.708 207.761 106.235 197.662 96.700 186.710 C 80.000 167.370 60.000 137.310 60.000 104.000 ZM 128.000 148.000 C 152.301 148.000 172.000 128.301 172.000 104.000 C 172.000 79.699 152.301 60.000 128.000 60.000 C 103.699 60.000 84.000 79.699 84.000 104.000 C 84.028 128.289 103.711 147.972 128.000 148.000 ZM 128.000 84.000 C 139.046 84.000 148.000 92.954 148.000 104.000 C 148.000 115.046 139.046 124.000 128.000 124.000 C 116.954 124.000 108.000 115.046 108.000 104.000 C 108.000 92.954 116.954 84.000 128.000 84.000 Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
