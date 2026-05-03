package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Category: ImageVector
    get() {
        if (_category != null) return _category!!
        _category = tablerOutlineIcon(
            name = "Category",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 4.0f)
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
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 4.0f)
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
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 18.656855f, 15.343145f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(18.656855f, 20.0f, 20.0f, 18.656855f, 20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 15.343145f, 18.656855f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(15.343145f, 14.0f, 14.0f, 15.343145f, 14.0f, 17.0f)
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
        return _category!!
    }

private var _category: ImageVector? = null
