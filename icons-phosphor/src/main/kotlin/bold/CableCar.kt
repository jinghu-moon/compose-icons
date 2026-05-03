package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorBoldIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.810 29.890 C 250.643 23.368 244.412 19.026 237.890 20.190 L 13.890 60.190 C 7.778 61.291 3.516 66.873 4.064 73.059 C 4.612 79.245 9.790 83.991 16.000 84.000 C 16.711 84.001 17.421 83.937 18.120 83.810 L 116.000 66.330 L 116.000 92.000 L 64.000 92.000 C 44.118 92.000 28.000 108.118 28.000 128.000 L 28.000 192.000 C 28.000 211.882 44.118 228.000 64.000 228.000 L 192.000 228.000 C 211.882 228.000 228.000 211.882 228.000 192.000 L 228.000 128.000 C 228.000 108.118 211.882 92.000 192.000 92.000 L 140.000 92.000 L 140.000 62.050 L 242.110 43.810 C 248.632 42.643 252.974 36.412 251.810 29.890 ZM 108.000 156.000 L 108.000 116.000 L 148.000 116.000 L 148.000 156.000 ZM 64.000 116.000 L 84.000 116.000 L 84.000 156.000 L 52.000 156.000 L 52.000 128.000 C 52.000 121.373 57.373 116.000 64.000 116.000 ZM 192.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 180.000 L 204.000 180.000 L 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 ZM 204.000 128.000 L 204.000 156.000 L 172.000 156.000 L 172.000 116.000 L 192.000 116.000 C 198.627 116.000 204.000 121.373 204.000 128.000 Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
