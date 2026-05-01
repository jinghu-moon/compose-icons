package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = lucideOutlineIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.83f, 2.38f),
                    PathNode.CurveTo(11.528613f, 1.876089f, 12.471387f, 1.876089f, 13.17f, 2.38f),
                    PathNode.LineTo(21.17f, 8.12f),
                    PathNode.CurveTo(21.878311f, 8.630301f, 22.173801f, 9.541059f, 21.9f, 10.37f),
                    PathNode.LineTo(18.86f, 19.63f),
                    PathNode.CurveTo(18.588318f, 20.448576f, 17.822483f, 21.000784f, 16.96f, 21.0f),
                    PathNode.LineTo(7.04f, 21.0f),
                    PathNode.CurveTo(6.177518f, 21.000784f, 5.411682f, 20.448576f, 5.14f, 19.63f),
                    PathNode.LineTo(2.1f, 10.37f),
                    PathNode.CurveTo(1.826198f, 9.541059f, 2.121688f, 8.630301f, 2.83f, 8.12f),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
