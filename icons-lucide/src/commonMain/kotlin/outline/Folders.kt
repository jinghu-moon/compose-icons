package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = lucideOutlineIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.10457f, 5.0f, 22.0f, 5.895431f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.104569f, 21.10457f, 16.0f, 20.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(7.895431f, 16.0f, 7.0f, 15.104569f, 7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.895431f, 7.895431f, 3.0f, 9.0f, 3.0f),
                    PathNode.LineTo(11.5f, 3.0f),
                    PathNode.CurveTo(11.972136f, 3.0f, 12.416718f, 3.222291f, 12.7f, 3.6f),
                    PathNode.LineTo(13.3f, 4.4f),
                    PathNode.CurveTo(13.583282f, 4.777709f, 14.027864f, 5.0f, 14.5f, 5.0f),
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
                    PathNode.MoveTo(3.0f, 8.268f),
                    PathNode.CurveTo(2.379353f, 8.626327f, 1.99787f, 9.289344f, 2.0f, 10.006f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 20.10457f, 2.895431f, 21.0f, 4.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.714513f, 20.99998f, 16.374744f, 20.618786f, 16.732f, 20.0f)
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
        return _folders!!
    }

private var _folders: ImageVector? = null
