package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = lucideOutlineIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 4.0f),
                    PathNode.LineTo(17.5f, 4.0f),
                    PathNode.LineTo(19.5f, 15.05f)
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
                    PathNode.MoveTo(6.95f, 17.0f),
                    PathNode.LineTo(12.092f, 17.0f),
                    PathNode.CurveTo(12.615f, 17.0f, 13.042f, 16.594f, 13.155f, 16.084f),
                    PathNode.CurveTo(13.736629f, 13.473786f, 15.857569f, 11.486174f, 18.5f, 11.075f)
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
                    PathNode.MoveTo(22.0f, 17.5f),
                    PathNode.CurveTo(22.0f, 18.880713f, 20.880713f, 20.0f, 19.5f, 20.0f),
                    PathNode.CurveTo(18.119287f, 20.0f, 17.0f, 18.880713f, 17.0f, 17.5f),
                    PathNode.CurveTo(17.0f, 16.119287f, 18.119287f, 15.0f, 19.5f, 15.0f),
                    PathNode.CurveTo(20.880713f, 15.0f, 22.0f, 16.119287f, 22.0f, 17.5f),
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
                    PathNode.MoveTo(7.0f, 17.5f),
                    PathNode.CurveTo(7.0f, 18.880713f, 5.880712f, 20.0f, 4.5f, 20.0f),
                    PathNode.CurveTo(3.119288f, 20.0f, 2.0f, 18.880713f, 2.0f, 17.5f),
                    PathNode.CurveTo(2.0f, 16.119287f, 3.119288f, 15.0f, 4.5f, 15.0f),
                    PathNode.CurveTo(5.880712f, 15.0f, 7.0f, 16.119287f, 7.0f, 17.5f),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
