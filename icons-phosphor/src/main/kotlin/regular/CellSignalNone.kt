package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorRegularIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.000 192.000 L 48.000 200.000 C 48.000 204.418 44.418 208.000 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 192.000 C 32.000 187.582 35.582 184.000 40.000 184.000 C 44.418 184.000 48.000 187.582 48.000 192.000 Z"),
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
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
