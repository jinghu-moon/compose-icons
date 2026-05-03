package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bus: ImageVector
    get() {
        if (_bus != null) return _bus!!
        _bus = phosphorThinIcon(
            name = "Bus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 36.000 L 72.000 36.000 C 56.536 36.000 44.000 48.536 44.000 64.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 L 92.000 188.000 L 164.000 188.000 L 164.000 208.000 C 164.000 214.627 169.373 220.000 176.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 L 212.000 64.000 C 212.000 48.536 199.464 36.000 184.000 36.000 ZM 52.000 180.000 L 52.000 116.000 L 204.000 116.000 L 204.000 180.000 ZM 204.000 108.000 L 52.000 108.000 L 52.000 76.000 L 204.000 76.000 ZM 84.000 208.000 C 84.000 210.209 82.209 212.000 80.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 188.000 L 84.000 188.000 ZM 200.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 210.209 172.000 208.000 L 172.000 188.000 L 204.000 188.000 L 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 ZM 204.000 68.000 L 52.000 68.000 L 52.000 64.000 C 52.000 52.954 60.954 44.000 72.000 44.000 L 184.000 44.000 C 195.046 44.000 204.000 52.954 204.000 64.000 ZM 100.000 148.000 C 100.000 152.418 96.418 156.000 92.000 156.000 C 87.582 156.000 84.000 152.418 84.000 148.000 C 84.000 143.582 87.582 140.000 92.000 140.000 C 96.418 140.000 100.000 143.582 100.000 148.000 ZM 172.000 148.000 C 172.000 152.418 168.418 156.000 164.000 156.000 C 159.582 156.000 156.000 152.418 156.000 148.000 C 156.000 143.582 159.582 140.000 164.000 140.000 C 168.418 140.000 172.000 143.582 172.000 148.000 ZM 244.000 80.000 L 244.000 104.000 C 244.000 106.209 242.209 108.000 240.000 108.000 C 237.791 108.000 236.000 106.209 236.000 104.000 L 236.000 80.000 C 236.000 77.791 237.791 76.000 240.000 76.000 C 242.209 76.000 244.000 77.791 244.000 80.000 ZM 20.000 80.000 L 20.000 104.000 C 20.000 106.209 18.209 108.000 16.000 108.000 C 13.791 108.000 12.000 106.209 12.000 104.000 L 12.000 80.000 C 12.000 77.791 13.791 76.000 16.000 76.000 C 18.209 76.000 20.000 77.791 20.000 80.000 Z"),
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
        return _bus!!
    }

private var _bus: ImageVector? = null
