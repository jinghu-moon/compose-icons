package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Route: ImageVector
    get() {
        if (_route != null) return _route!!
        _route = lucideOutlineIcon(
            name = "Route",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 20.656855f, 7.656854f, 22.0f, 6.0f, 22.0f),
                    PathNode.CurveTo(4.343146f, 22.0f, 3.0f, 20.656855f, 3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 17.343145f, 4.343146f, 16.0f, 6.0f, 16.0f),
                    PathNode.CurveTo(7.656854f, 16.0f, 9.0f, 17.343145f, 9.0f, 19.0f),
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
                    PathNode.MoveTo(9.0f, 19.0f),
                    PathNode.LineTo(17.5f, 19.0f),
                    PathNode.CurveTo(19.432997f, 19.0f, 21.0f, 17.432997f, 21.0f, 15.5f),
                    PathNode.CurveTo(21.0f, 13.567003f, 19.432997f, 12.0f, 17.5f, 12.0f),
                    PathNode.LineTo(6.5f, 12.0f),
                    PathNode.CurveTo(4.567004f, 12.0f, 3.0f, 10.432997f, 3.0f, 8.5f),
                    PathNode.CurveTo(3.0f, 6.567004f, 4.567004f, 5.0f, 6.5f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f)
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
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.656854f, 19.656855f, 8.0f, 18.0f, 8.0f),
                    PathNode.CurveTo(16.343145f, 8.0f, 15.0f, 6.656854f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.343146f, 16.343145f, 2.0f, 18.0f, 2.0f),
                    PathNode.CurveTo(19.656855f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
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
        }
        return _route!!
    }

private var _route: ImageVector? = null
