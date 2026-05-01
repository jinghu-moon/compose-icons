package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = lucideOutlineIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 2.0f),
                    PathNode.LineTo(16.0f, 2.0f)
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
                    PathNode.MoveTo(9.0f, 2.0f),
                    PathNode.LineTo(9.0f, 4.789f),
                    PathNode.CurveTo(8.99998f, 5.578789f, 8.766155f, 6.350896f, 8.328f, 7.008f),
                    PathNode.LineTo(7.672f, 7.992f),
                    PathNode.CurveTo(7.233656f, 8.649387f, 6.999823f, 9.421871f, 7.0f, 10.212f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 21.10457f, 7.895431f, 22.0f, 9.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.CurveTo(16.10457f, 22.0f, 17.0f, 21.10457f, 17.0f, 20.0f),
                    PathNode.LineTo(17.0f, 10.211f),
                    PathNode.CurveTo(16.99998f, 9.421211f, 16.766155f, 8.649104f, 16.328f, 7.992f),
                    PathNode.LineTo(15.672f, 7.008f),
                    PathNode.CurveTo(15.233656f, 6.350613f, 14.999823f, 5.57813f, 15.0f, 4.788f),
                    PathNode.LineTo(15.0f, 2.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.CurveTo(8.599373f, 14.330207f, 10.400627f, 14.330207f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.599328f, 15.670017f, 15.400672f, 15.670017f, 17.0f, 15.0f)
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
        return _milk!!
    }

private var _milk: ImageVector? = null
