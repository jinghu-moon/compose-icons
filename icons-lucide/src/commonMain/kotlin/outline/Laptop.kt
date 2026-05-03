package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = lucideOutlineIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.CurveTo(19.10457f, 5.0f, 20.0f, 5.895431f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 15.526f),
                    PathNode.CurveTo(19.999865f, 15.837428f, 20.07246f, 16.144583f, 20.212f, 16.423f),
                    PathNode.LineTo(21.28f, 18.55f),
                    PathNode.CurveTo(21.43678f, 18.861109f, 21.420347f, 19.23139f, 21.236624f, 19.527388f),
                    PathNode.CurveTo(21.0529f, 19.823385f, 20.728373f, 20.002434f, 20.38f, 20.0f),
                    PathNode.LineTo(3.62f, 20.0f),
                    PathNode.CurveTo(3.271628f, 20.002434f, 2.947099f, 19.823385f, 2.763376f, 19.527388f),
                    PathNode.CurveTo(2.579653f, 19.23139f, 2.56322f, 18.861109f, 2.72f, 18.55f),
                    PathNode.LineTo(3.788f, 16.423f),
                    PathNode.CurveTo(3.927541f, 16.144583f, 4.000135f, 15.837428f, 4.0f, 15.526f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 5.895431f, 4.895431f, 5.0f, 6.0f, 5.0f),
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
                    PathNode.MoveTo(20.054f, 15.987f),
                    PathNode.LineTo(3.946f, 15.987f)
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
