package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorRegularIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 176.000 112.000 L 176.000 208.000 L 136.000 208.000 L 136.000 112.000 ZM 120.000 208.000 L 80.000 208.000 L 80.000 112.000 L 120.000 112.000 ZM 208.000 208.000 L 192.000 208.000 L 192.000 104.000 C 192.000 99.582 188.418 96.000 184.000 96.000 L 72.000 96.000 C 67.582 96.000 64.000 99.582 64.000 104.000 L 64.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 152.000 72.000 C 152.000 76.418 148.418 80.000 144.000 80.000 L 112.000 80.000 C 107.582 80.000 104.000 76.418 104.000 72.000 C 104.000 67.582 107.582 64.000 112.000 64.000 L 144.000 64.000 C 148.418 64.000 152.000 67.582 152.000 72.000 Z"),
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
