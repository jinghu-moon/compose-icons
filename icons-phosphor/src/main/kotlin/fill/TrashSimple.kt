package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorFillIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 56.000 C 224.000 60.418 220.418 64.000 216.000 64.000 L 208.000 64.000 L 208.000 208.000 C 208.000 216.837 200.837 224.000 192.000 224.000 L 64.000 224.000 C 55.163 224.000 48.000 216.837 48.000 208.000 L 48.000 64.000 L 40.000 64.000 C 35.582 64.000 32.000 60.418 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 ZM 88.000 32.000 L 168.000 32.000 C 172.418 32.000 176.000 28.418 176.000 24.000 C 176.000 19.582 172.418 16.000 168.000 16.000 L 88.000 16.000 C 83.582 16.000 80.000 19.582 80.000 24.000 C 80.000 28.418 83.582 32.000 88.000 32.000 Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
