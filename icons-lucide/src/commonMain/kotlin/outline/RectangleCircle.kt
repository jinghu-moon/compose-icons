package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleCircle: ImageVector
    get() {
        if (_rectangleCircle != null) return _rectangleCircle!!
        _rectangleCircle = lucideOutlineIcon(
            name = "RectangleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(2.447715f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 4.447716f, 2.447715f, 4.0f, 3.0f, 4.0f),
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
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 16.418278f, 18.418278f, 20.0f, 14.0f, 20.0f),
                    PathNode.CurveTo(9.581722f, 20.0f, 6.0f, 16.418278f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 7.581722f, 9.581722f, 4.0f, 14.0f, 4.0f),
                    PathNode.CurveTo(18.418278f, 4.0f, 22.0f, 7.581722f, 22.0f, 12.0f),
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
        return _rectangleCircle!!
    }

private var _rectangleCircle: ImageVector? = null
