package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = lucideOutlineIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 18.0f, 16.5f, 20.5f, 12.34f, 21.95f),
                    PathNode.CurveTo(12.122163f, 22.023817f, 11.885537f, 22.020287f, 11.67f, 21.94f),
                    PathNode.CurveTo(7.5f, 20.5f, 4.0f, 18.0f, 4.0f, 13.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 5.447716f, 4.447716f, 5.0f, 5.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 5.0f, 9.5f, 3.8f, 11.24f, 2.28f),
                    PathNode.CurveTo(11.677673f, 1.906067f, 12.322327f, 1.906067f, 12.76f, 2.28f),
                    PathNode.CurveTo(14.51f, 3.81f, 17.0f, 5.0f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.552284f, 5.0f, 20.0f, 5.447716f, 20.0f, 6.0f),
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
        return _shield!!
    }

private var _shield: ImageVector? = null
