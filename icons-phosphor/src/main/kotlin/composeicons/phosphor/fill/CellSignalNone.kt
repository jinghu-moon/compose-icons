package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorFillIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.12 25.23c-5.978-2.48-12.862-1.114-17.44 3.46L20.68 188.69c-4.574 4.577-5.941 11.459-3.463 17.437 2.478 5.978 8.312 9.874 14.783 9.873h160c8.837 0 16-7.163 16-16v-160c.011-6.473-3.893-12.309-9.88-14.77ZM192 200h-160L192 40Z"),
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
