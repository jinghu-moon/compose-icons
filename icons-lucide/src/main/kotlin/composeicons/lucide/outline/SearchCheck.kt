package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SearchCheck: ImageVector
    get() {
        if (_searchCheck != null) return _searchCheck!!
        _searchCheck = lucideOutlineIcon(
            name = "SearchCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 9.0f)
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
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.0f, 15.418278f, 15.418278f, 19.0f, 11.0f, 19.0f),
                    PathNode.CurveTo(6.581722f, 19.0f, 3.0f, 15.418278f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 6.581722f, 6.581722f, 3.0f, 11.0f, 3.0f),
                    PathNode.CurveTo(15.418278f, 3.0f, 19.0f, 6.581722f, 19.0f, 11.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(16.7f, 16.7f)
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
        return _searchCheck!!
    }

private var _searchCheck: ImageVector? = null
