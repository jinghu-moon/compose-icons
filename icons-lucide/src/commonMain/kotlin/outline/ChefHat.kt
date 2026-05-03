package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = lucideOutlineIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.CurveTo(17.552284f, 21.0f, 18.0f, 20.552284f, 18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 14.65f),
                    PathNode.CurveTo(18.0f, 14.193f, 18.316f, 13.806f, 18.727f, 13.609f),
                    PathNode.CurveTo(20.483856f, 12.770908f, 21.382341f, 10.789804f, 20.855421f, 8.915958f),
                    PathNode.CurveTo(20.328505f, 7.042113f, 18.529179f, 5.819623f, 16.593f, 6.02f),
                    PathNode.CurveTo(15.803559f, 4.184976f, 13.997631f, 2.995943f, 12.0f, 2.995943f),
                    PathNode.CurveTo(10.002369f, 2.995943f, 8.196441f, 4.184976f, 7.407f, 6.02f),
                    PathNode.CurveTo(5.471748f, 5.821032f, 3.673981f, 7.043301f, 3.147286f, 8.916101f),
                    PathNode.CurveTo(2.620592f, 10.788903f, 3.517727f, 12.769069f, 5.273f, 13.608f),
                    PathNode.CurveTo(5.684f, 13.806f, 6.0f, 14.193f, 6.0f, 14.649f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 20.552284f, 6.447716f, 21.0f, 7.0f, 21.0f),
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
