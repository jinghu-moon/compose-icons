package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Podcast: ImageVector
    get() {
        if (_podcast != null) return _podcast!!
        _podcast = lucideOutlineIcon(
            name = "Podcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 16.447716f, 12.552285f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(11.447715f, 16.0f, 11.0f, 16.447716f, 11.0f, 17.0f),
                    PathNode.LineTo(11.5f, 21.5f),
                    PathNode.CurveTo(11.5f, 21.776142f, 11.723858f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(12.276142f, 22.0f, 12.5f, 21.776142f, 12.5f, 21.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(16.85f, 18.58f),
                    PathNode.CurveTo(20.21736f, 16.425817f, 21.76029f, 12.308699f, 20.638071f, 8.472002f),
                    PathNode.CurveTo(19.51585f, 4.635307f, 15.997451f, 1.998608f, 12.0f, 1.998608f),
                    PathNode.CurveTo(8.002549f, 1.998608f, 4.48415f, 4.635307f, 3.36193f, 8.472002f),
                    PathNode.CurveTo(2.239709f, 12.308699f, 3.78264f, 16.425817f, 7.15f, 18.58f)
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
                    PathNode.MoveTo(8.0f, 14.0f),
                    PathNode.CurveTo(6.45292f, 11.937226f, 6.728167f, 9.036263f, 8.635585f, 7.301255f),
                    PathNode.CurveTo(10.543004f, 5.566249f, 13.456996f, 5.566249f, 15.364415f, 7.301255f),
                    PathNode.CurveTo(17.271833f, 9.036263f, 17.54708f, 11.937226f, 16.0f, 14.0f)
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
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 11.552285f, 12.552285f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(11.447715f, 12.0f, 11.0f, 11.552285f, 11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 10.447715f, 11.447715f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(12.552285f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _podcast!!
    }

private var _podcast: ImageVector? = null
