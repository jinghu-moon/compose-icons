package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrink: ImageVector
    get() {
        if (_shrink != null) return _shrink!!
        _shrink = lucideOutlineIcon(
            name = "Shrink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(21.0f, 21.0f),
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 19.8f),
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(19.8f, 15.0f)
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
                    PathNode.MoveTo(9.0f, 19.8f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(4.2f, 15.0f),
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 4.2f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(19.8f, 9.0f),
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(21.0f, 3.0f)
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
                    PathNode.MoveTo(9.0f, 4.2f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(4.2f, 9.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(3.0f, 3.0f)
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
        return _shrink!!
    }

private var _shrink: ImageVector? = null
