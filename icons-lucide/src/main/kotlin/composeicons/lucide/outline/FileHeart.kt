package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileHeart: ImageVector
    get() {
        if (_fileHeart != null) return _fileHeart!!
        _fileHeart = lucideOutlineIcon(
            name = "FileHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.00157f, 7.359942f, 19.747406f, 6.745774f, 19.294f, 6.294f),
                    PathNode.LineTo(15.706f, 2.706f),
                    PathNode.CurveTo(15.254227f, 2.252594f, 14.640058f, 1.99843f, 14.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(4.895431f, 2.0f, 4.0f, 2.895431f, 4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 11.0f)
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
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(3.62f, 18.8f),
                    PathNode.CurveTo(3.046981f, 18.202572f, 2.848298f, 17.338743f, 3.102723f, 16.550999f),
                    PathNode.CurveTo(3.357148f, 15.763255f, 4.023584f, 15.178843f, 4.837806f, 15.029465f),
                    PathNode.CurveTo(5.652029f, 14.880086f, 6.482515f, 15.189872f, 7.0f, 15.836f),
                    PathNode.CurveTo(7.519877f, 15.196738f, 8.347599f, 14.892777f, 9.157637f, 15.043662f),
                    PathNode.CurveTo(9.967675f, 15.194547f, 10.630447f, 15.776139f, 10.885295f, 16.559708f),
                    PathNode.CurveTo(11.140143f, 17.343275f, 10.9463f, 18.203474f, 10.38f, 18.802f),
                    PathNode.LineTo(7.754f, 21.658f),
                    PathNode.CurveTo(7.564095f, 21.87565f, 7.289353f, 22.000551f, 7.0005f, 22.000551f),
                    PathNode.CurveTo(6.711648f, 22.000551f, 6.436906f, 21.87565f, 6.247f, 21.658f),
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
        return _fileHeart!!
    }

private var _fileHeart: ImageVector? = null
