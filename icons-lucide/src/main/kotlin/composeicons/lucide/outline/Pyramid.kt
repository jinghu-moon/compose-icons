package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) return _pyramid!!
        _pyramid = lucideOutlineIcon(
            name = "Pyramid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.5f, 16.88f),
                    PathNode.CurveTo(2.259903f, 16.739841f, 2.08899f, 16.506058f, 2.028279f, 16.234756f),
                    PathNode.CurveTo(1.967568f, 15.963453f, 2.022539f, 15.679122f, 2.18f, 15.45f),
                    PathNode.LineTo(11.18f, 2.43f),
                    PathNode.CurveTo(11.367042f, 2.162034f, 11.673212f, 2.002364f, 12.0f, 2.002364f),
                    PathNode.CurveTo(12.326788f, 2.002364f, 12.632958f, 2.162034f, 12.82f, 2.43f),
                    PathNode.LineTo(21.82f, 15.44f),
                    PathNode.CurveTo(21.98088f, 15.669799f, 22.037842f, 15.956605f, 21.97699f, 16.230442f),
                    PathNode.CurveTo(21.916138f, 16.50428f, 21.743065f, 16.739967f, 21.5f, 16.88f),
                    PathNode.LineTo(12.99f, 21.74f),
                    PathNode.CurveTo(12.376301f, 22.089619f, 11.623699f, 22.089619f, 11.01f, 21.74f),
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
