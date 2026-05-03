package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorRegularIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 56.000 C 110.327 56.000 96.000 70.327 96.000 88.000 C 96.000 105.673 110.327 120.000 128.000 120.000 C 145.673 120.000 160.000 105.673 160.000 88.000 C 160.000 70.327 145.673 56.000 128.000 56.000 ZM 128.000 104.000 C 119.163 104.000 112.000 96.837 112.000 88.000 C 112.000 79.163 119.163 72.000 128.000 72.000 C 136.837 72.000 144.000 79.163 144.000 88.000 C 144.000 96.837 136.837 104.000 128.000 104.000 ZM 128.000 136.000 C 110.327 136.000 96.000 150.327 96.000 168.000 C 96.000 185.673 110.327 200.000 128.000 200.000 C 145.673 200.000 160.000 185.673 160.000 168.000 C 160.000 150.327 145.673 136.000 128.000 136.000 ZM 128.000 184.000 C 119.163 184.000 112.000 176.837 112.000 168.000 C 112.000 159.163 119.163 152.000 128.000 152.000 C 136.837 152.000 144.000 159.163 144.000 168.000 C 144.000 176.837 136.837 184.000 128.000 184.000 ZM 216.000 144.000 L 200.000 144.000 L 200.000 80.000 L 216.000 80.000 C 220.418 80.000 224.000 76.418 224.000 72.000 C 224.000 67.582 220.418 64.000 216.000 64.000 L 200.000 64.000 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 64.000 L 40.000 64.000 C 35.582 64.000 32.000 67.582 32.000 72.000 C 32.000 76.418 35.582 80.000 40.000 80.000 L 56.000 80.000 L 56.000 144.000 L 40.000 144.000 C 35.582 144.000 32.000 147.582 32.000 152.000 C 32.000 156.418 35.582 160.000 40.000 160.000 L 56.000 160.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 160.000 L 216.000 160.000 C 220.418 160.000 224.000 156.418 224.000 152.000 C 224.000 147.582 220.418 144.000 216.000 144.000 ZM 184.000 216.000 L 72.000 216.000 L 72.000 40.000 L 184.000 40.000 L 184.000 216.000 Z"),
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
