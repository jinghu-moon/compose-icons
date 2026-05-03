package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number6: ImageVector
    get() {
        if (_number6 != null) return _number6!!
        _number6 = tablerOutlineIcon(
            name = "Number6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 18.209139f, 9.790861f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(14.209139f, 20.0f, 16.0f, 18.209139f, 16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 12.790861f, 14.209139f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(9.790861f, 11.0f, 8.0f, 12.790861f, 8.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 5.790861f, 14.209139f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(9.790861f, 4.0f, 8.0f, 5.790861f, 8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _number6!!
    }

private var _number6: ImageVector? = null
