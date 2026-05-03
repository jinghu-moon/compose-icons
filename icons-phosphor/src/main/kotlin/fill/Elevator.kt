package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorFillIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 112.000 56.000 L 144.000 56.000 C 148.418 56.000 152.000 59.582 152.000 64.000 C 152.000 68.418 148.418 72.000 144.000 72.000 L 112.000 72.000 C 107.582 72.000 104.000 68.418 104.000 64.000 C 104.000 59.582 107.582 56.000 112.000 56.000 ZM 120.000 208.000 L 64.000 208.000 L 64.000 96.000 L 120.000 96.000 ZM 192.000 208.000 L 136.000 208.000 L 136.000 96.000 L 192.000 96.000 Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
