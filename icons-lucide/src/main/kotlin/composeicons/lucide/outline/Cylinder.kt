package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = lucideOutlineIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.656854f, 16.970562f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(7.029437f, 8.0f, 3.0f, 6.656854f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 7.029437f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(16.970562f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.656855f, 7.029437f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(16.970562f, 22.0f, 21.0f, 20.656855f, 21.0f, 19.0f),
                    PathNode.LineTo(21.0f, 5.0f)
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
