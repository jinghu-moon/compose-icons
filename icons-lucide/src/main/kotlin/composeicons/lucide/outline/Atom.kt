package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = lucideOutlineIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 12.552285f, 12.552285f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 12.552285f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 11.447715f, 11.447715f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(12.552285f, 11.0f, 13.0f, 11.447715f, 13.0f, 12.0f),
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
                    PathNode.MoveTo(20.2f, 20.2f),
                    PathNode.CurveTo(22.24f, 18.17f, 20.22f, 12.84f, 15.7f, 8.3f),
                    PathNode.CurveTo(11.16f, 3.78f, 5.83f, 1.76f, 3.8f, 3.8f),
                    PathNode.CurveTo(1.76f, 5.83f, 3.78f, 11.16f, 8.3f, 15.7f),
                    PathNode.CurveTo(12.84f, 20.22f, 18.17f, 22.24f, 20.2f, 20.2f),
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
                    PathNode.MoveTo(15.7f, 15.7f),
                    PathNode.CurveTo(20.22f, 11.16f, 22.24f, 5.83f, 20.2f, 3.8f),
                    PathNode.CurveTo(18.17f, 1.76f, 12.84f, 3.78f, 8.3f, 8.3f),
                    PathNode.CurveTo(3.78f, 12.84f, 1.76f, 18.17f, 3.8f, 20.2f),
                    PathNode.CurveTo(5.83f, 22.24f, 11.16f, 20.22f, 15.7f, 15.7f),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
