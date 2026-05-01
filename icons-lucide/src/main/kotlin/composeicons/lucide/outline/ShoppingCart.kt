package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = lucideOutlineIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.CurveTo(9.0f, 21.552284f, 8.552285f, 22.0f, 8.0f, 22.0f),
                    PathNode.CurveTo(7.447716f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 20.447716f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.CurveTo(8.552285f, 20.0f, 9.0f, 20.447716f, 9.0f, 21.0f),
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
                    PathNode.MoveTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.CurveTo(18.447716f, 22.0f, 18.0f, 21.552284f, 18.0f, 21.0f),
                    PathNode.CurveTo(18.0f, 20.447716f, 18.447716f, 20.0f, 19.0f, 20.0f),
                    PathNode.CurveTo(19.552284f, 20.0f, 20.0f, 20.447716f, 20.0f, 21.0f),
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
                    PathNode.MoveTo(2.05f, 2.05f),
                    PathNode.LineTo(4.05f, 2.05f),
                    PathNode.LineTo(6.71f, 14.47f),
                    PathNode.CurveTo(6.911284f, 15.408276f, 7.750614f, 16.071348f, 8.71f, 16.05f),
                    PathNode.LineTo(18.49f, 16.05f),
                    PathNode.CurveTo(19.42767f, 16.048487f, 20.238401f, 15.395742f, 20.44f, 14.48f),
                    PathNode.LineTo(22.09f, 7.05f),
                    PathNode.LineTo(5.12f, 7.05f)
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
