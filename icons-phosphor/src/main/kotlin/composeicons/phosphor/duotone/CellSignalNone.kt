package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorDuotoneIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.12 25.23c-5.977-2.473-12.856-1.104-17.43 3.47L20.69 188.7c-4.566 4.577-5.929 11.451-3.454 17.424 2.474 5.972 8.3 9.869 14.764 9.876h160c8.837 0 16-7.163 16-16v-160c-.005-6.468-3.904-12.296-9.88-14.77ZM192 200h-160L192 40Z"),
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
