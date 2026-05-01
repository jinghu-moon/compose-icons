package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VideoOff: ImageVector
    get() {
        if (_videoOff != null) return _videoOff!!
        _videoOff = lucideOutlineIcon(
            name = "VideoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.66f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(15.104569f, 6.0f, 16.0f, 6.895431f, 16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 10.5f),
                    PathNode.LineTo(21.248f, 7.438f),
                    PathNode.CurveTo(21.402666f, 7.347748f, 21.593788f, 7.347099f, 21.749062f, 7.436299f),
                    PathNode.CurveTo(21.904337f, 7.5255f, 22.000053f, 7.690928f, 22.0f, 7.87f),
                    PathNode.LineTo(22.0f, 16.066f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.10457f, 15.104569f, 18.0f, 14.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
