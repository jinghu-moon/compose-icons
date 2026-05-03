package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorRegularIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 L 72.000 56.000 L 72.000 40.000 C 72.000 35.582 68.418 32.000 64.000 32.000 L 48.000 32.000 C 30.327 32.000 16.000 46.327 16.000 64.000 L 16.000 176.000 C 16.000 193.673 30.327 208.000 48.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 L 240.000 64.000 C 240.000 59.582 236.418 56.000 232.000 56.000 ZM 32.000 64.000 C 32.000 55.163 39.163 48.000 48.000 48.000 L 56.000 48.000 L 56.000 144.000 L 48.000 144.000 C 42.381 143.992 36.861 145.472 32.000 148.290 ZM 224.000 192.000 L 48.000 192.000 C 39.163 192.000 32.000 184.837 32.000 176.000 C 32.000 167.163 39.163 160.000 48.000 160.000 L 64.000 160.000 C 68.418 160.000 72.000 156.418 72.000 152.000 L 72.000 72.000 L 224.000 72.000 ZM 104.000 136.000 C 99.582 136.000 96.000 139.582 96.000 144.000 C 96.000 148.418 99.582 152.000 104.000 152.000 L 120.000 152.000 L 120.000 160.000 C 120.000 164.418 123.582 168.000 128.000 168.000 C 132.418 168.000 136.000 164.418 136.000 160.000 L 136.000 152.000 L 160.000 152.000 L 160.000 160.000 C 160.000 164.418 163.582 168.000 168.000 168.000 C 172.418 168.000 176.000 164.418 176.000 160.000 L 176.000 152.000 L 192.000 152.000 C 196.418 152.000 200.000 148.418 200.000 144.000 C 200.000 139.582 196.418 136.000 192.000 136.000 L 176.000 136.000 L 176.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 116.418 200.000 112.000 C 200.000 107.582 196.418 104.000 192.000 104.000 L 176.000 104.000 L 176.000 96.000 C 176.000 91.582 172.418 88.000 168.000 88.000 C 163.582 88.000 160.000 91.582 160.000 96.000 L 160.000 104.000 L 136.000 104.000 L 136.000 96.000 C 136.000 91.582 132.418 88.000 128.000 88.000 C 123.582 88.000 120.000 91.582 120.000 96.000 L 120.000 104.000 L 104.000 104.000 C 99.582 104.000 96.000 107.582 96.000 112.000 C 96.000 116.418 99.582 120.000 104.000 120.000 L 120.000 120.000 L 120.000 136.000 ZM 136.000 120.000 L 160.000 120.000 L 160.000 136.000 L 136.000 136.000 Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
