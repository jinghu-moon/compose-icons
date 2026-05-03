package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorFillIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 224.000 L 208.000 224.000 L 208.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 28.418 224.000 24.000 C 224.000 19.582 220.418 16.000 216.000 16.000 L 40.000 16.000 C 35.582 16.000 32.000 19.582 32.000 24.000 C 32.000 28.418 35.582 32.000 40.000 32.000 L 48.000 32.000 L 48.000 224.000 L 24.000 224.000 C 19.582 224.000 16.000 227.582 16.000 232.000 C 16.000 236.418 19.582 240.000 24.000 240.000 L 232.000 240.000 C 236.418 240.000 240.000 236.418 240.000 232.000 C 240.000 227.582 236.418 224.000 232.000 224.000 ZM 88.000 56.000 L 112.000 56.000 C 116.418 56.000 120.000 59.582 120.000 64.000 C 120.000 68.418 116.418 72.000 112.000 72.000 L 88.000 72.000 C 83.582 72.000 80.000 68.418 80.000 64.000 C 80.000 59.582 83.582 56.000 88.000 56.000 ZM 88.000 96.000 L 112.000 96.000 C 116.418 96.000 120.000 99.582 120.000 104.000 C 120.000 108.418 116.418 112.000 112.000 112.000 L 88.000 112.000 C 83.582 112.000 80.000 108.418 80.000 104.000 C 80.000 99.582 83.582 96.000 88.000 96.000 ZM 80.000 144.000 C 80.000 139.582 83.582 136.000 88.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 139.582 120.000 144.000 C 120.000 148.418 116.418 152.000 112.000 152.000 L 88.000 152.000 C 83.582 152.000 80.000 148.418 80.000 144.000 ZM 152.000 224.000 L 104.000 224.000 L 104.000 184.000 L 152.000 184.000 ZM 168.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 148.418 136.000 144.000 C 136.000 139.582 139.582 136.000 144.000 136.000 L 168.000 136.000 C 172.418 136.000 176.000 139.582 176.000 144.000 C 176.000 148.418 172.418 152.000 168.000 152.000 ZM 168.000 112.000 L 144.000 112.000 C 139.582 112.000 136.000 108.418 136.000 104.000 C 136.000 99.582 139.582 96.000 144.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 ZM 168.000 72.000 L 144.000 72.000 C 139.582 72.000 136.000 68.418 136.000 64.000 C 136.000 59.582 139.582 56.000 144.000 56.000 L 168.000 56.000 C 172.418 56.000 176.000 59.582 176.000 64.000 C 176.000 68.418 172.418 72.000 168.000 72.000 Z"),
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
        return _building!!
    }

private var _building: ImageVector? = null
