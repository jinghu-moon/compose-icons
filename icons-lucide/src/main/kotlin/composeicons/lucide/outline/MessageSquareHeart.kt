package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareHeart: ImageVector
    get() {
        if (_messageSquareHeart != null) return _messageSquareHeart!!
        _messageSquareHeart = lucideOutlineIcon(
            name = "MessageSquareHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.10457f, 21.10457f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(6.828f, 19.0f),
                    PathNode.CurveTo(6.297611f, 19.000113f, 5.788986f, 19.210901f, 5.414f, 19.586f),
                    PathNode.LineTo(3.212f, 21.788f),
                    PathNode.CurveTo(3.008943f, 21.99102f, 2.703592f, 22.051746f, 2.438307f, 21.941868f),
                    PathNode.CurveTo(2.173023f, 21.83199f, 2.000037f, 21.57314f, 2.0f, 21.286f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 9.5f),
                    PathNode.CurveTo(7.5f, 10.187f, 7.765f, 10.883f, 8.197f, 11.344f),
                    PathNode.LineTo(11.206f, 14.608f),
                    PathNode.CurveTo(11.315991f, 14.742288f, 11.455196f, 14.849685f, 11.613f, 14.922f),
                    PathNode.CurveTo(11.863693f, 15.027153f, 12.146394f, 15.025708f, 12.396f, 14.918f),
                    PathNode.CurveTo(12.550153f, 14.845686f, 12.686149f, 14.739759f, 12.794f, 14.608f),
                    PathNode.LineTo(15.802f, 11.344f),
                    PathNode.CurveTo(16.252956f, 10.835746f, 16.501371f, 10.179471f, 16.5f, 9.5f),
                    PathNode.CurveTo(16.5f, 8.423924f, 15.811425f, 7.468577f, 14.790569f, 7.128292f),
                    PathNode.CurveTo(13.769714f, 6.788007f, 12.645645f, 7.139139f, 12.0f, 8.0f),
                    PathNode.CurveTo(11.354355f, 7.139139f, 10.230286f, 6.788007f, 9.209431f, 7.128292f),
                    PathNode.CurveTo(8.188575f, 7.468577f, 7.5f, 8.423924f, 7.5f, 9.5f)
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
        return _messageSquareHeart!!
    }

private var _messageSquareHeart: ImageVector? = null
