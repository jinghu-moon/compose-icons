package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColumnInsertRight: ImageVector
    get() {
        if (_columnInsertRight != null) return _columnInsertRight!!
        _columnInsertRight = tablerOutlineIcon(
            name = "ColumnInsertRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.552285f, 4.0f, 11.0f, 4.447716f, 11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 19.552284f, 10.552285f, 20.0f, 10.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(5.447716f, 20.0f, 5.0f, 19.552284f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 4.447716f, 5.447716f, 4.0f, 6.0f, 4.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
        return _columnInsertRight!!
    }

private var _columnInsertRight: ImageVector? = null
