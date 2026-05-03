package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = lucideOutlineIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(8.0f, 2.0f, 4.0f, 8.0f, 4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 18.418278f, 7.581722f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(16.418278f, 22.0f, 20.0f, 18.418278f, 20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 8.0f, 16.0f, 2.0f, 12.0f, 2.0f)
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
        return _egg!!
    }

private var _egg: ImageVector? = null
