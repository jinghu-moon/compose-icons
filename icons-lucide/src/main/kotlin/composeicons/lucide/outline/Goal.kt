package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Goal: ImageVector
    get() {
        if (_goal != null) return _goal!!
        _goal = lucideOutlineIcon(
            name = "Goal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.LineTo(12.0f, 10.0f)
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
                    PathNode.MoveTo(20.561f, 10.222f),
                    PathNode.CurveTo(22.042652f, 14.788601f, 19.679012f, 19.71422f, 15.189609f, 21.41551f),
                    PathNode.CurveTo(10.700205f, 23.116802f, 5.665793f, 20.994726f, 3.748864f, 16.593077f),
                    PathNode.CurveTo(1.831934f, 12.191427f, 3.707455f, 7.06006f, 8.011f, 4.932f)
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
                    PathNode.MoveTo(8.002f, 9.997f),
                    PathNode.CurveTo(6.621566f, 11.834537f, 6.671582f, 14.376469f, 8.12323f, 16.158281f),
                    PathNode.CurveTo(9.574879f, 17.940094f, 12.054243f, 18.502825f, 14.132857f, 17.522264f),
                    PathNode.CurveTo(16.211472f, 16.541702f, 17.353924f, 14.27042f, 16.902f, 12.017f)
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
        return _goal!!
    }

private var _goal: ImageVector? = null
