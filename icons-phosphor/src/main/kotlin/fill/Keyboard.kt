package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorFillIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 64.000 168.000 L 48.000 168.000 C 43.582 168.000 40.000 164.418 40.000 160.000 C 40.000 155.582 43.582 152.000 48.000 152.000 L 64.000 152.000 C 68.418 152.000 72.000 155.582 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 ZM 160.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 C 88.000 155.582 91.582 152.000 96.000 152.000 L 160.000 152.000 C 164.418 152.000 168.000 155.582 168.000 160.000 C 168.000 164.418 164.418 168.000 160.000 168.000 ZM 208.000 168.000 L 192.000 168.000 C 187.582 168.000 184.000 164.418 184.000 160.000 C 184.000 155.582 187.582 152.000 192.000 152.000 L 208.000 152.000 C 212.418 152.000 216.000 155.582 216.000 160.000 C 216.000 164.418 212.418 168.000 208.000 168.000 ZM 208.000 136.000 L 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 C 40.000 123.582 43.582 120.000 48.000 120.000 L 208.000 120.000 C 212.418 120.000 216.000 123.582 216.000 128.000 C 216.000 132.418 212.418 136.000 208.000 136.000 ZM 208.000 104.000 L 48.000 104.000 C 43.582 104.000 40.000 100.418 40.000 96.000 C 40.000 91.582 43.582 88.000 48.000 88.000 L 208.000 88.000 C 212.418 88.000 216.000 91.582 216.000 96.000 C 216.000 100.418 212.418 104.000 208.000 104.000 Z"),
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
