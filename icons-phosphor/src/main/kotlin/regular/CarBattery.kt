package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorRegularIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 136.000 C 192.000 140.418 188.418 144.000 184.000 144.000 L 176.000 144.000 L 176.000 152.000 C 176.000 156.418 172.418 160.000 168.000 160.000 C 163.582 160.000 160.000 156.418 160.000 152.000 L 160.000 144.000 L 152.000 144.000 C 147.582 144.000 144.000 140.418 144.000 136.000 C 144.000 131.582 147.582 128.000 152.000 128.000 L 160.000 128.000 L 160.000 120.000 C 160.000 115.582 163.582 112.000 168.000 112.000 C 172.418 112.000 176.000 115.582 176.000 120.000 L 176.000 128.000 L 184.000 128.000 C 188.418 128.000 192.000 131.582 192.000 136.000 ZM 104.000 128.000 L 72.000 128.000 C 67.582 128.000 64.000 131.582 64.000 136.000 C 64.000 140.418 67.582 144.000 72.000 144.000 L 104.000 144.000 C 108.418 144.000 112.000 140.418 112.000 136.000 C 112.000 131.582 108.418 128.000 104.000 128.000 ZM 240.000 88.000 L 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 L 32.000 200.000 C 23.163 200.000 16.000 192.837 16.000 184.000 L 16.000 88.000 C 16.000 79.163 23.163 72.000 32.000 72.000 L 48.000 72.000 L 48.000 56.000 C 48.000 47.163 55.163 40.000 64.000 40.000 L 96.000 40.000 C 104.837 40.000 112.000 47.163 112.000 56.000 L 112.000 72.000 L 144.000 72.000 L 144.000 56.000 C 144.000 47.163 151.163 40.000 160.000 40.000 L 192.000 40.000 C 200.837 40.000 208.000 47.163 208.000 56.000 L 208.000 72.000 L 224.000 72.000 C 232.837 72.000 240.000 79.163 240.000 88.000 ZM 160.000 72.000 L 192.000 72.000 L 192.000 56.000 L 160.000 56.000 ZM 64.000 72.000 L 96.000 72.000 L 96.000 56.000 L 64.000 56.000 ZM 224.000 184.000 L 224.000 88.000 L 32.000 88.000 L 32.000 184.000 L 224.000 184.000 Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
