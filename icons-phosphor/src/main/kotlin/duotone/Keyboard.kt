package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorDuotoneIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 64.000 L 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 L 24.000 64.000 C 24.000 59.582 27.582 56.000 32.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 59.582 232.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 224.000 192.000 L 32.000 192.000 L 32.000 64.000 L 224.000 64.000 L 224.000 192.000 ZM 208.000 128.000 C 208.000 132.418 204.418 136.000 200.000 136.000 L 56.000 136.000 C 51.582 136.000 48.000 132.418 48.000 128.000 C 48.000 123.582 51.582 120.000 56.000 120.000 L 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 ZM 208.000 96.000 C 208.000 100.418 204.418 104.000 200.000 104.000 L 56.000 104.000 C 51.582 104.000 48.000 100.418 48.000 96.000 C 48.000 91.582 51.582 88.000 56.000 88.000 L 200.000 88.000 C 204.418 88.000 208.000 91.582 208.000 96.000 ZM 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 L 56.000 168.000 C 51.582 168.000 48.000 164.418 48.000 160.000 C 48.000 155.582 51.582 152.000 56.000 152.000 L 64.000 152.000 C 68.418 152.000 72.000 155.582 72.000 160.000 ZM 168.000 160.000 C 168.000 164.418 164.418 168.000 160.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 C 88.000 155.582 91.582 152.000 96.000 152.000 L 160.000 152.000 C 164.418 152.000 168.000 155.582 168.000 160.000 ZM 208.000 160.000 C 208.000 164.418 204.418 168.000 200.000 168.000 L 192.000 168.000 C 187.582 168.000 184.000 164.418 184.000 160.000 C 184.000 155.582 187.582 152.000 192.000 152.000 L 200.000 152.000 C 204.418 152.000 208.000 155.582 208.000 160.000 Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
