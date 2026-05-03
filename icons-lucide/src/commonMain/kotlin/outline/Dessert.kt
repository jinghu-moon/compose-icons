package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dessert: ImageVector
    get() {
        if (_dessert != null) return _dessert!!
        _dessert = lucideOutlineIcon(
            name = "Dessert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.162f, 3.167f),
                    PathNode.CurveTo(5.428744f, 4.05205f, 1.998381f, 8.18471f, 2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 14.104569f, 2.895431f, 15.0f, 4.0f, 15.0f),
                    PathNode.CurveTo(5.10457f, 15.0f, 6.0f, 14.104569f, 6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 10.895431f, 6.895431f, 10.0f, 8.0f, 10.0f),
                    PathNode.CurveTo(9.104569f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 17.10457f, 10.895431f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(13.104569f, 18.0f, 14.0f, 17.10457f, 14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 14.895431f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(17.10457f, 10.0f, 18.0f, 10.895431f, 18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.001657f, 14.104569f, 18.89843f, 14.998657f, 20.003f, 14.997f),
                    PathNode.CurveTo(21.107569f, 14.995343f, 22.001657f, 14.09857f, 22.0f, 12.994f),
                    PathNode.CurveTo(21.99834f, 8.18166f, 18.569265f, 4.052989f, 13.839f, 3.168f)
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
                    PathNode.MoveTo(20.804f, 14.869f),
                    PathNode.CurveTo(19.921738f, 19.027067f, 16.250635f, 22.000957f, 12.0f, 22.000957f),
                    PathNode.CurveTo(7.749365f, 22.000957f, 4.078263f, 19.027067f, 3.196f, 14.869f)
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
                    PathNode.CurveTo(14.0f, 5.10457f, 13.104569f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(10.895431f, 6.0f, 10.0f, 5.10457f, 10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 2.895431f, 10.895431f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(13.104569f, 2.0f, 14.0f, 2.895431f, 14.0f, 4.0f),
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
        }
        return _dessert!!
    }

private var _dessert: ImageVector? = null
