package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorFillIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 144.000 L 200.000 144.000 L 200.000 80.000 L 216.000 80.000 C 220.418 80.000 224.000 76.418 224.000 72.000 C 224.000 67.582 220.418 64.000 216.000 64.000 L 200.000 64.000 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 64.000 L 40.000 64.000 C 35.582 64.000 32.000 67.582 32.000 72.000 C 32.000 76.418 35.582 80.000 40.000 80.000 L 56.000 80.000 L 56.000 144.000 L 40.000 144.000 C 35.582 144.000 32.000 147.582 32.000 152.000 C 32.000 156.418 35.582 160.000 40.000 160.000 L 56.000 160.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 160.000 L 216.000 160.000 C 220.418 160.000 224.000 156.418 224.000 152.000 C 224.000 147.582 220.418 144.000 216.000 144.000 ZM 128.000 116.000 C 112.536 116.000 100.000 103.464 100.000 88.000 C 100.000 72.536 112.536 60.000 128.000 60.000 C 143.464 60.000 156.000 72.536 156.000 88.000 C 156.000 103.464 143.464 116.000 128.000 116.000 ZM 128.000 140.000 C 143.464 140.000 156.000 152.536 156.000 168.000 C 156.000 183.464 143.464 196.000 128.000 196.000 C 112.536 196.000 100.000 183.464 100.000 168.000 C 100.000 152.536 112.536 140.000 128.000 140.000 Z"),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
