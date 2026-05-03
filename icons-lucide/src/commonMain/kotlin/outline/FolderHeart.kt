package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) return _folderHeart!!
        _folderHeart = lucideOutlineIcon(
            name = "FolderHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.638f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(7.9f, 3.0f),
                    PathNode.CurveTo(8.579667f, 2.993337f, 9.216198f, 3.332317f, 9.59f, 3.9f),
                    PathNode.LineTo(10.4f, 5.1f),
                    PathNode.CurveTo(10.769922f, 5.661721f, 11.397413f, 5.99989f, 12.07f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(21.10457f, 6.0f, 22.0f, 6.895431f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 11.417f)
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
                    PathNode.MoveTo(14.62f, 18.8f),
                    PathNode.CurveTo(14.046981f, 18.202572f, 13.848298f, 17.338743f, 14.102723f, 16.550999f),
                    PathNode.CurveTo(14.357148f, 15.763255f, 15.023583f, 15.178843f, 15.837807f, 15.029465f),
                    PathNode.CurveTo(16.652029f, 14.880086f, 17.482515f, 15.189872f, 18.0f, 15.836f),
                    PathNode.CurveTo(18.519876f, 15.196738f, 19.3476f, 14.892777f, 20.157637f, 15.043662f),
                    PathNode.CurveTo(20.967676f, 15.194547f, 21.630447f, 15.776139f, 21.885296f, 16.559708f),
                    PathNode.CurveTo(22.140144f, 17.343275f, 21.9463f, 18.203474f, 21.38f, 18.802f),
                    PathNode.LineTo(18.754f, 21.658f),
                    PathNode.CurveTo(18.56445f, 21.876257f, 18.289576f, 22.001598f, 18.0005f, 22.001598f),
                    PathNode.CurveTo(17.711424f, 22.001598f, 17.43655f, 21.876257f, 17.247f, 21.658f),
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
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
