package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorRegularIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 72.000 C 216.000 76.418 212.418 80.000 208.000 80.000 L 176.000 80.000 C 171.582 80.000 168.000 76.418 168.000 72.000 C 168.000 67.582 171.582 64.000 176.000 64.000 L 208.000 64.000 C 212.418 64.000 216.000 67.582 216.000 72.000 ZM 208.000 96.000 L 176.000 96.000 C 171.582 96.000 168.000 99.582 168.000 104.000 C 168.000 108.418 171.582 112.000 176.000 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 ZM 248.000 48.000 L 248.000 208.000 C 248.000 216.837 240.837 224.000 232.000 224.000 L 152.000 224.000 C 143.163 224.000 136.000 216.837 136.000 208.000 L 136.000 192.000 L 96.000 192.000 L 96.000 208.000 L 112.000 208.000 C 116.418 208.000 120.000 211.582 120.000 216.000 C 120.000 220.418 116.418 224.000 112.000 224.000 L 64.000 224.000 C 59.582 224.000 56.000 220.418 56.000 216.000 C 56.000 211.582 59.582 208.000 64.000 208.000 L 80.000 208.000 L 80.000 192.000 L 32.000 192.000 C 18.745 192.000 8.000 181.255 8.000 168.000 L 8.000 96.000 C 8.000 82.745 18.745 72.000 32.000 72.000 L 136.000 72.000 L 136.000 48.000 C 136.000 39.163 143.163 32.000 152.000 32.000 L 232.000 32.000 C 240.837 32.000 248.000 39.163 248.000 48.000 ZM 136.000 176.000 L 136.000 88.000 L 32.000 88.000 C 27.582 88.000 24.000 91.582 24.000 96.000 L 24.000 168.000 C 24.000 172.418 27.582 176.000 32.000 176.000 ZM 232.000 208.000 L 232.000 48.000 L 152.000 48.000 L 152.000 208.000 L 232.000 208.000 ZM 192.000 168.000 C 185.373 168.000 180.000 173.373 180.000 180.000 C 180.000 186.627 185.373 192.000 192.000 192.000 C 198.627 192.000 204.000 186.627 204.000 180.000 C 204.000 173.373 198.627 168.000 192.000 168.000 Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
