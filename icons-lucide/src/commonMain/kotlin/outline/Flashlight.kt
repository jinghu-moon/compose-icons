package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = lucideOutlineIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 14.0f)
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
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(17.552284f, 2.0f, 18.0f, 2.447715f, 18.0f, 3.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(18.0f, 7.649111f, 17.789467f, 8.280711f, 17.4f, 8.8f),
                    PathNode.LineTo(16.8f, 9.6f),
                    PathNode.CurveTo(16.280712f, 10.292385f, 16.0f, 11.13452f, 16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 21.10457f, 15.104569f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.895431f, 22.0f, 8.0f, 21.10457f, 8.0f, 20.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 11.13452f, 7.719289f, 10.292385f, 7.2f, 9.6f),
                    PathNode.LineTo(6.6f, 8.8f),
                    PathNode.CurveTo(6.210534f, 8.280711f, 6.0f, 7.649111f, 6.0f, 7.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(6.0f, 2.447715f, 6.447716f, 2.0f, 7.0f, 2.0f),
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
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f)
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
