package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UmbrellaOff: ImageVector
    get() {
        if (_umbrellaOff != null) return _umbrellaOff!!
        _umbrellaOff = lucideOutlineIcon(
            name = "UmbrellaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.0f, 21.10457f, 12.895431f, 22.0f, 14.0f, 22.0f),
                    PathNode.CurveTo(15.104569f, 22.0f, 16.0f, 21.10457f, 16.0f, 20.0f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 4.0f)
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
                    PathNode.MoveTo(18.656f, 13.0f),
                    PathNode.LineTo(20.992f, 13.0f),
                    PathNode.CurveTo(21.307112f, 13.002609f, 21.605019f, 12.856535f, 21.795912f, 12.605814f),
                    PathNode.CurveTo(21.986807f, 12.355093f, 22.048355f, 12.029058f, 21.962f, 11.726f),
                    PathNode.CurveTo(20.594963f, 6.39727f, 15.276411f, 3.088047f, 9.892f, 4.216f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(5.961f, 5.957f),
                    PathNode.CurveTo(4.021218f, 7.364089f, 2.633963f, 9.404649f, 2.039f, 11.726f),
                    PathNode.CurveTo(1.953093f, 12.027532f, 2.013578f, 12.351899f, 2.202387f, 12.602203f),
                    PathNode.CurveTo(2.391196f, 12.852509f, 2.68647f, 12.999771f, 3.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
        return _umbrellaOff!!
    }

private var _umbrellaOff: ImageVector? = null
