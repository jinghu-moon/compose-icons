package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = lucideOutlineIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.LineTo(11.5f, 20.5f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(5.516f, 16.07f),
                    PathNode.CurveTo(2.787676f, 14.503385f, 1.439701f, 11.309033f, 2.220892f, 8.261447f),
                    PathNode.CurveTo(3.002082f, 5.213862f, 5.720495f, 3.061852f, 8.866018f, 3.000885f),
                    PathNode.CurveTo(12.011542f, 2.939918f, 14.811303f, 4.984974f, 15.71f, 8.0f),
                    PathNode.LineTo(17.5f, 8.0f),
                    PathNode.CurveTo(19.233473f, 8.000059f, 20.812788f, 8.99581f, 21.560144f, 10.559901f),
                    PathNode.CurveTo(22.307503f, 12.123993f, 22.090006f, 13.9783f, 21.001f, 15.327f)
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
