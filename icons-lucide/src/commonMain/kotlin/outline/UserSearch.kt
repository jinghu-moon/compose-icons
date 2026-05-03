package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserSearch: ImageVector
    get() {
        if (_userSearch != null) return _userSearch!!
        _userSearch = lucideOutlineIcon(
            name = "UserSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 9.209139f, 12.209139f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(7.790861f, 11.0f, 6.0f, 9.209139f, 6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 4.790861f, 7.790861f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.209139f, 3.0f, 14.0f, 4.790861f, 14.0f, 7.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(10.3f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(4.790861f, 15.0f, 3.0f, 16.790861f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 18.656855f, 18.656855f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(15.343145f, 20.0f, 14.0f, 18.656855f, 14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 15.343145f, 15.343145f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(18.656855f, 14.0f, 20.0f, 15.343145f, 20.0f, 17.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(19.1f, 19.1f)
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
        return _userSearch!!
    }

private var _userSearch: ImageVector? = null
