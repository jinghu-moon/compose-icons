package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LibraryBig: ImageVector
    get() {
        if (_libraryBig != null) return _libraryBig!!
        _libraryBig = lucideOutlineIcon(
            name = "LibraryBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 3.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.CurveTo(10.552285f, 3.0f, 11.0f, 3.447715f, 11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(11.0f, 20.552284f, 10.552285f, 21.0f, 10.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
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
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
                    PathNode.MoveTo(20.4f, 18.9f),
                    PathNode.CurveTo(20.6f, 19.4f, 20.3f, 20.0f, 19.8f, 20.2f),
                    PathNode.LineTo(17.9f, 20.9f),
                    PathNode.CurveTo(17.4f, 21.1f, 16.8f, 20.8f, 16.6f, 20.3f),
                    PathNode.LineTo(11.1f, 5.1f),
                    PathNode.CurveTo(10.9f, 4.6f, 11.2f, 4.0f, 11.7f, 3.8f),
                    PathNode.LineTo(13.6f, 3.1f),
                    PathNode.CurveTo(14.1f, 2.9f, 14.7f, 3.2f, 14.9f, 3.7f),
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
        return _libraryBig!!
    }

private var _libraryBig: ImageVector? = null
