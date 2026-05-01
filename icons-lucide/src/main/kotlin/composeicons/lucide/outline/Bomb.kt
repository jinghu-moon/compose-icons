package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = lucideOutlineIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 17.970562f, 15.970563f, 22.0f, 11.0f, 22.0f),
                    PathNode.CurveTo(6.029437f, 22.0f, 2.0f, 17.970562f, 2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 8.029437f, 6.029437f, 4.0f, 11.0f, 4.0f),
                    PathNode.CurveTo(15.970563f, 4.0f, 20.0f, 8.029437f, 20.0f, 13.0f),
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
                    PathNode.MoveTo(14.35f, 4.65f),
                    PathNode.LineTo(16.3f, 2.7f),
                    PathNode.CurveTo(17.240211f, 1.764326f, 18.759789f, 1.764326f, 19.7f, 2.7f),
                    PathNode.LineTo(21.3f, 4.3f),
                    PathNode.CurveTo(21.75189f, 4.750325f, 22.005892f, 5.362036f, 22.005892f, 6.0f),
                    PathNode.CurveTo(22.005892f, 6.637964f, 21.75189f, 7.249676f, 21.3f, 7.7f),
                    PathNode.LineTo(19.35f, 9.65f)
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
                    PathNode.MoveTo(22.0f, 2.0f),
                    PathNode.LineTo(20.5f, 3.5f)
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
