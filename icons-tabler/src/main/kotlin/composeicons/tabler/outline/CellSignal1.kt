package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CellSignal1: ImageVector
    get() {
        if (_cellSignal1 != null) return _cellSignal1!!
        _cellSignal1 = tablerOutlineIcon(
            name = "CellSignal1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 20.0f),
                    PathNode.LineTo(4.731f, 20.0f),
                    PathNode.CurveTo(4.434833f, 20.000492f, 4.167636f, 19.822231f, 4.054363f, 19.54858f),
                    PathNode.CurveTo(3.941091f, 19.27493f, 4.00413f, 18.959972f, 4.214f, 18.751f),
                    PathNode.LineTo(18.751f, 4.214f),
                    PathNode.CurveTo(18.959972f, 4.00413f, 19.27493f, 3.941091f, 19.54858f, 4.054363f),
                    PathNode.CurveTo(19.822231f, 4.167636f, 20.000492f, 4.434833f, 20.0f, 4.731f),
                    PathNode.LineTo(20.0f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellSignal1!!
    }

private var _cellSignal1: ImageVector? = null
