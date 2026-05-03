package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorBoldIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 140.000 C 200.000 146.627 194.627 152.000 188.000 152.000 L 184.000 152.000 L 184.000 156.000 C 184.000 162.627 178.627 168.000 172.000 168.000 C 165.373 168.000 160.000 162.627 160.000 156.000 L 160.000 152.000 L 156.000 152.000 C 149.373 152.000 144.000 146.627 144.000 140.000 C 144.000 133.373 149.373 128.000 156.000 128.000 L 160.000 128.000 L 160.000 124.000 C 160.000 117.373 165.373 112.000 172.000 112.000 C 178.627 112.000 184.000 117.373 184.000 124.000 L 184.000 128.000 L 188.000 128.000 C 194.627 128.000 200.000 133.373 200.000 140.000 ZM 100.000 128.000 L 68.000 128.000 C 61.373 128.000 56.000 133.373 56.000 140.000 C 56.000 146.627 61.373 152.000 68.000 152.000 L 100.000 152.000 C 106.627 152.000 112.000 146.627 112.000 140.000 C 112.000 133.373 106.627 128.000 100.000 128.000 ZM 244.000 92.000 L 244.000 184.000 C 244.000 195.046 235.046 204.000 224.000 204.000 L 32.000 204.000 C 20.954 204.000 12.000 195.046 12.000 184.000 L 12.000 92.000 C 12.000 80.954 20.954 72.000 32.000 72.000 L 44.000 72.000 L 44.000 56.000 C 44.000 44.954 52.954 36.000 64.000 36.000 L 96.000 36.000 C 107.046 36.000 116.000 44.954 116.000 56.000 L 116.000 72.000 L 140.000 72.000 L 140.000 56.000 C 140.000 44.954 148.954 36.000 160.000 36.000 L 192.000 36.000 C 203.046 36.000 212.000 44.954 212.000 56.000 L 212.000 72.000 L 224.000 72.000 C 235.046 72.000 244.000 80.954 244.000 92.000 ZM 164.000 72.000 L 188.000 72.000 L 188.000 60.000 L 164.000 60.000 ZM 68.000 72.000 L 92.000 72.000 L 92.000 60.000 L 68.000 60.000 ZM 220.000 96.000 L 36.000 96.000 L 36.000 180.000 L 220.000 180.000 Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
