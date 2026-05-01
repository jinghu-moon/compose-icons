package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundSearch: ImageVector
    get() {
        if (_userRoundSearch != null) return _userRoundSearch!!
        _userRoundSearch = lucideOutlineIcon(
            name = "UserRoundSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 10.761424f, 12.761424f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(7.238577f, 13.0f, 5.0f, 10.761424f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 5.238577f, 7.238577f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.761424f, 3.0f, 15.0f, 5.238577f, 15.0f, 8.0f),
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.CurveTo(2.000236f, 18.446352f, 3.219574f, 16.04625f, 5.281824f, 14.540179f),
                    PathNode.CurveTo(7.344073f, 13.034109f, 10.001414f, 12.603052f, 12.434f, 13.38f)
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
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.656855f, 19.656855f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(16.343145f, 21.0f, 15.0f, 19.656855f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 16.343145f, 16.343145f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(19.656855f, 15.0f, 21.0f, 16.343145f, 21.0f, 18.0f),
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
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.LineTo(20.1f, 20.1f)
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
        return _userRoundSearch!!
    }

private var _userRoundSearch: ImageVector? = null
