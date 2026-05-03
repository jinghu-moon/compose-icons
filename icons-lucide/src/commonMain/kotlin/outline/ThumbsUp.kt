package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = lucideOutlineIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 5.88f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(19.83f, 10.0f),
                    PathNode.CurveTo(20.459515f, 10.0f, 21.052292f, 10.296389f, 21.43f, 10.8f),
                    PathNode.CurveTo(21.807709f, 11.303612f, 21.926264f, 11.955666f, 21.75f, 12.56f),
                    PathNode.LineTo(19.42f, 20.56f),
                    PathNode.CurveTo(19.171112f, 21.413334f, 18.38889f, 22.0f, 17.5f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(2.895431f, 22.0f, 2.0f, 21.10457f, 2.0f, 20.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 10.895431f, 2.895431f, 10.0f, 4.0f, 10.0f),
                    PathNode.LineTo(6.76f, 10.0f),
                    PathNode.CurveTo(7.518944f, 9.999598f, 8.21227f, 9.569657f, 8.55f, 8.89f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.955355f, 2.01183f, 13.852988f, 2.459359f, 14.437405f, 3.215203f),
                    PathNode.CurveTo(15.02182f, 3.971047f, 15.22901f, 4.952424f, 15.0f, 5.88f),
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 22.0f)
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
