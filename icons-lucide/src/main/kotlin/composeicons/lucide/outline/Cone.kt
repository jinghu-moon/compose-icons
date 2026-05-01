package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = lucideOutlineIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.9f, 18.55f),
                    PathNode.LineTo(12.9f, 2.57f),
                    PathNode.CurveTo(12.732914f, 2.22501f, 12.383323f, 2.00589f, 12.0f, 2.00589f),
                    PathNode.CurveTo(11.616677f, 2.00589f, 11.267086f, 2.22501f, 11.1f, 2.57f),
                    PathNode.LineTo(3.1f, 18.55f)
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
                    PathNode.MoveTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 16.970562f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(7.029437f, 22.0f, 3.0f, 20.656855f, 3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 17.343145f, 7.029437f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(16.970562f, 16.0f, 21.0f, 17.343145f, 21.0f, 19.0f),
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
        return _cone!!
    }

private var _cone: ImageVector? = null
