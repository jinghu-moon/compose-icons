package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = lucideOutlineIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.LineTo(21.223f, 16.482f),
                    PathNode.CurveTo(21.376413f, 16.58409f, 21.573544f, 16.59352f, 21.736f, 16.50654f),
                    PathNode.CurveTo(21.898458f, 16.419561f, 21.999905f, 16.250277f, 22.0f, 16.066f),
                    PathNode.LineTo(22.0f, 7.87f),
                    PathNode.CurveTo(22.000053f, 7.690928f, 21.904337f, 7.5255f, 21.749062f, 7.436299f),
                    PathNode.CurveTo(21.593788f, 7.347099f, 21.402666f, 7.347748f, 21.248f, 7.438f),
                    PathNode.LineTo(16.0f, 10.5f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(15.104569f, 6.0f, 16.0f, 6.895431f, 16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.10457f, 15.104569f, 18.0f, 14.0f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(2.895431f, 18.0f, 2.0f, 17.10457f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
