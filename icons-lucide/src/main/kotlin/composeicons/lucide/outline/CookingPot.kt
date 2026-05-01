package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = lucideOutlineIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(22.0f, 12.0f)
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
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.895431f, 22.0f, 4.0f, 21.10457f, 4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 12.0f)
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
                    PathNode.MoveTo(4.0f, 8.0f),
                    PathNode.LineTo(20.0f, 4.0f)
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
                    PathNode.MoveTo(8.86f, 6.78f),
                    PathNode.LineTo(8.41f, 4.97f),
                    PathNode.CurveTo(8.279787f, 4.455467f, 8.359435f, 3.910277f, 8.631401f, 3.454499f),
                    PathNode.CurveTo(8.903368f, 2.998721f, 9.345347f, 2.669737f, 9.86f, 2.54f),
                    PathNode.LineTo(11.8f, 2.06f),
                    PathNode.CurveTo(12.315912f, 1.930103f, 12.862319f, 2.011111f, 13.318352f, 2.285106f),
                    PathNode.CurveTo(13.774384f, 2.559101f, 14.102458f, 3.0035f, 14.23f, 3.52f),
                    PathNode.LineTo(14.68f, 5.32f)
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
