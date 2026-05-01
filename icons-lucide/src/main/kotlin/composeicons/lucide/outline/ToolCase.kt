package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToolCase: ImageVector
    get() {
        if (_toolCase != null) return _toolCase!!
        _toolCase = lucideOutlineIcon(
            name = "ToolCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f)
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
                    PathNode.MoveTo(14.817f, 10.995f),
                    PathNode.LineTo(13.846f, 9.545f),
                    PathNode.LineTo(14.88f, 8.313f),
                    PathNode.CurveTo(15.450666f, 7.649067f, 15.523185f, 6.691146f, 15.058975f, 5.948869f),
                    PathNode.CurveTo(14.594765f, 5.206591f, 13.701737f, 4.852509f, 12.855f, 5.075f),
                    PathNode.LineTo(11.035f, 5.439f),
                    PathNode.LineTo(9.91f, 3.885f),
                    PathNode.CurveTo(9.456808f, 3.211571f, 8.641534f, 2.878848f, 7.846562f, 3.042886f),
                    PathNode.CurveTo(7.051589f, 3.206925f, 6.434609f, 3.835186f, 6.285f, 4.633f),
                    PathNode.LineTo(6.141f, 6.55f),
                    PathNode.LineTo(4.416f, 6.976f),
                    PathNode.CurveTo(3.61098f, 7.222409f, 3.04646f, 7.946563f, 3.003926f, 8.787374f),
                    PathNode.CurveTo(2.961393f, 9.628187f, 3.449955f, 10.405612f, 4.226f, 10.732f),
                    PathNode.LineTo(4.883f, 11.002f)
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
                    PathNode.MoveTo(18.822f, 10.995f),
                    PathNode.LineTo(21.082f, 5.615f),
                    PathNode.CurveTo(21.186234f, 5.366665f, 21.185892f, 5.086784f, 21.08105f, 4.838705f),
                    PathNode.CurveTo(20.97621f, 4.590625f, 20.775734f, 4.395323f, 20.525f, 4.297f),
                    PathNode.LineTo(16.954f, 2.9f),
                    PathNode.CurveTo(16.453146f, 2.704374f, 15.887259f, 2.939829f, 15.673f, 3.433f),
                    PathNode.LineTo(14.749f, 5.555f)
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
                    PathNode.MoveTo(4.0f, 12.006f),
                    PathNode.CurveTo(3.998404f, 11.740782f, 4.102233f, 11.485793f, 4.288646f, 11.297131f),
                    PathNode.CurveTo(4.475058f, 11.108468f, 4.728782f, 11.001587f, 4.994f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.552284f, 11.0f, 20.0f, 11.447715f, 20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.Close
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
        return _toolCase!!
    }

private var _toolCase: ImageVector? = null
