package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Seedling: ImageVector
    get() {
        if (_seedling != null) return _seedling!!
        _seedling = tablerOutlineIcon(
            name = "Seedling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 6.686292f, 9.313708f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 9.313708f, 5.686292f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.CurveTo(12.0f, 10.686292f, 14.686292f, 8.0f, 18.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.0f, 12.313708f, 18.31371f, 15.0f, 15.0f, 15.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 10.0f)
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
        return _seedling!!
    }

private var _seedling: ImageVector? = null
