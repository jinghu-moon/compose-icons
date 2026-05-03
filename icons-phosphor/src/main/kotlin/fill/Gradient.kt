package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorFillIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 192.000 C 80.000 196.418 76.418 200.000 72.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 C 24.000 187.582 27.582 184.000 32.000 184.000 L 72.000 184.000 C 76.418 184.000 80.000 187.582 80.000 192.000 ZM 224.000 184.000 L 184.000 184.000 C 179.582 184.000 176.000 187.582 176.000 192.000 C 176.000 196.418 179.582 200.000 184.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 196.418 232.000 192.000 C 232.000 187.582 228.418 184.000 224.000 184.000 ZM 152.000 184.000 L 104.000 184.000 C 99.582 184.000 96.000 187.582 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 L 152.000 200.000 C 156.418 200.000 160.000 196.418 160.000 192.000 C 160.000 187.582 156.418 184.000 152.000 184.000 ZM 32.000 168.000 L 112.000 168.000 C 116.418 168.000 120.000 164.418 120.000 160.000 C 120.000 155.582 116.418 152.000 112.000 152.000 L 32.000 152.000 C 27.582 152.000 24.000 155.582 24.000 160.000 C 24.000 164.418 27.582 168.000 32.000 168.000 ZM 224.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 155.582 136.000 160.000 C 136.000 164.418 139.582 168.000 144.000 168.000 L 224.000 168.000 C 228.418 168.000 232.000 164.418 232.000 160.000 C 232.000 155.582 228.418 152.000 224.000 152.000 ZM 224.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 59.582 24.000 64.000 L 24.000 88.000 C 24.000 92.418 27.582 96.000 32.000 96.000 L 224.000 96.000 C 228.418 96.000 232.000 92.418 232.000 88.000 L 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 ZM 224.000 112.000 L 32.000 112.000 C 27.582 112.000 24.000 115.582 24.000 120.000 L 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 L 232.000 120.000 C 232.000 115.582 228.418 112.000 224.000 112.000 Z"),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
