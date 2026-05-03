package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileStack: ImageVector
    get() {
        if (_fileStack != null) return _fileStack!!
        _fileStack = lucideOutlineIcon(
            name = "FileStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 21.0f),
                    PathNode.CurveTo(11.0f, 21.552284f, 10.552285f, 22.0f, 10.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(3.447715f, 22.0f, 3.0f, 21.552284f, 3.0f, 21.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 12.447715f, 3.447715f, 12.0f, 4.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.552284f, 15.552285f, 17.0f, 15.0f, 17.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(8.447715f, 17.0f, 8.0f, 16.552284f, 8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 7.447716f, 8.447715f, 7.0f, 9.0f, 7.0f)
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
                    PathNode.MoveTo(21.0f, 6.0f),
                    PathNode.CurveTo(20.999887f, 5.46961f, 20.789099f, 4.960986f, 20.414f, 4.586f),
                    PathNode.LineTo(18.414f, 2.586f),
                    PathNode.CurveTo(18.039015f, 2.210901f, 17.53039f, 2.000113f, 17.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(13.447715f, 2.0f, 13.0f, 2.447715f, 13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 11.552285f, 13.447715f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.552284f, 12.0f, 21.0f, 11.552285f, 21.0f, 11.0f),
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
        return _fileStack!!
    }

private var _fileStack: ImageVector? = null
