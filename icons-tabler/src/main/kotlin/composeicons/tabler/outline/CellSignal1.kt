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
                pathData = parseSvgPathData("M20 20h-15.269c-.296 0-.563-.178-.677-.451-.113-.274-.05-.589 .16-.798L18.751 4.214c.209-.21 .524-.273 .798-.16 .274 .113 .452 .38 .451 .677v15.269"),
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
