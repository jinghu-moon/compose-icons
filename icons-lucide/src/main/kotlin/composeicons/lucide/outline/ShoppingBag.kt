package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) return _shoppingBag!!
        _shoppingBag = lucideOutlineIcon(
            name = "ShoppingBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 12.209139f, 14.209139f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(9.790861f, 14.0f, 8.0f, 12.209139f, 8.0f, 10.0f)
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
                    PathNode.MoveTo(3.103f, 6.034f),
                    PathNode.LineTo(20.897f, 6.034f)
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
                    PathNode.MoveTo(3.4f, 5.467f),
                    PathNode.CurveTo(3.140356f, 5.813193f, 3.0f, 6.23426f, 3.0f, 6.667f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 21.10457f, 3.895431f, 22.0f, 5.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.CurveTo(20.10457f, 22.0f, 21.0f, 21.10457f, 21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 6.667f),
                    PathNode.CurveTo(21.0f, 6.23426f, 20.859644f, 5.813193f, 20.6f, 5.467f),
                    PathNode.LineTo(18.6f, 2.8f),
                    PathNode.CurveTo(18.222292f, 2.296389f, 17.629515f, 2.0f, 17.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(6.370486f, 2.0f, 5.777709f, 2.296389f, 5.4f, 2.8f),
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
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
