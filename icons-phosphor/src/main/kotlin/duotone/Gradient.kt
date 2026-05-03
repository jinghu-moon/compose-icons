package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorDuotoneIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 64.000 L 224.000 184.000 L 32.000 184.000 L 32.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 24.000 104.000 C 24.000 99.582 27.582 96.000 32.000 96.000 L 112.000 96.000 C 116.418 96.000 120.000 99.582 120.000 104.000 C 120.000 108.418 116.418 112.000 112.000 112.000 L 32.000 112.000 C 27.582 112.000 24.000 108.418 24.000 104.000 ZM 224.000 96.000 L 144.000 96.000 C 139.582 96.000 136.000 99.582 136.000 104.000 C 136.000 108.418 139.582 112.000 144.000 112.000 L 224.000 112.000 C 228.418 112.000 232.000 108.418 232.000 104.000 C 232.000 99.582 228.418 96.000 224.000 96.000 ZM 72.000 136.000 L 32.000 136.000 C 27.582 136.000 24.000 139.582 24.000 144.000 C 24.000 148.418 27.582 152.000 32.000 152.000 L 72.000 152.000 C 76.418 152.000 80.000 148.418 80.000 144.000 C 80.000 139.582 76.418 136.000 72.000 136.000 ZM 224.000 136.000 L 184.000 136.000 C 179.582 136.000 176.000 139.582 176.000 144.000 C 176.000 148.418 179.582 152.000 184.000 152.000 L 224.000 152.000 C 228.418 152.000 232.000 148.418 232.000 144.000 C 232.000 139.582 228.418 136.000 224.000 136.000 ZM 96.000 144.000 C 96.000 148.418 99.582 152.000 104.000 152.000 L 152.000 152.000 C 156.418 152.000 160.000 148.418 160.000 144.000 C 160.000 139.582 156.418 136.000 152.000 136.000 L 104.000 136.000 C 99.582 136.000 96.000 139.582 96.000 144.000 ZM 56.000 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 56.000 192.000 C 60.418 192.000 64.000 188.418 64.000 184.000 C 64.000 179.582 60.418 176.000 56.000 176.000 ZM 112.000 176.000 L 88.000 176.000 C 83.582 176.000 80.000 179.582 80.000 184.000 C 80.000 188.418 83.582 192.000 88.000 192.000 L 112.000 192.000 C 116.418 192.000 120.000 188.418 120.000 184.000 C 120.000 179.582 116.418 176.000 112.000 176.000 ZM 168.000 176.000 L 144.000 176.000 C 139.582 176.000 136.000 179.582 136.000 184.000 C 136.000 188.418 139.582 192.000 144.000 192.000 L 168.000 192.000 C 172.418 192.000 176.000 188.418 176.000 184.000 C 176.000 179.582 172.418 176.000 168.000 176.000 ZM 224.000 176.000 L 200.000 176.000 C 195.582 176.000 192.000 179.582 192.000 184.000 C 192.000 188.418 195.582 192.000 200.000 192.000 L 224.000 192.000 C 228.418 192.000 232.000 188.418 232.000 184.000 C 232.000 179.582 228.418 176.000 224.000 176.000 ZM 32.000 72.000 L 224.000 72.000 C 228.418 72.000 232.000 68.418 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 59.582 24.000 64.000 C 24.000 68.418 27.582 72.000 32.000 72.000 Z"),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
