package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CellSignal1: ImageVector
    get() {
        if (_cellSignal1 != null) return _cellSignal1!!
        _cellSignal1 = tablerOutlineIcon(
            name = "CellSignal1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 20.000 L 4.731 20.000 C 4.435 20.000 4.168 19.822 4.054 19.549 C 3.941 19.275 4.004 18.960 4.214 18.751 L 18.751 4.214 C 18.960 4.004 19.275 3.941 19.549 4.054 C 19.822 4.168 20.000 4.435 20.000 4.731 L 20.000 20.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _cellSignal1!!
    }

private var _cellSignal1: ImageVector? = null
