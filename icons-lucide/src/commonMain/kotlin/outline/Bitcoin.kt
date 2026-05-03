package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) return _bitcoin!!
        _bitcoin = lucideOutlineIcon(
            name = "Bitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.767f, 19.089f),
                    PathNode.CurveTo(16.691f, 19.957f, 17.907f, 13.064f, 12.983f, 12.195f),
                    PathNode.MoveTo(11.767f, 19.089f),
                    PathNode.LineTo(5.86f, 18.047f),
                    PathNode.MoveTo(11.768f, 19.089f),
                    PathNode.LineTo(11.421f, 21.059f),
                    PathNode.MoveTo(12.984f, 12.195f),
                    PathNode.CurveTo(17.908f, 13.064f, 19.124f, 6.17f, 14.199f, 5.302f),
                    PathNode.MoveTo(12.984f, 12.195f),
                    PathNode.LineTo(9.044f, 11.501f),
                    PathNode.MoveTo(14.199f, 5.301f),
                    PathNode.LineTo(8.29f, 4.26f),
                    PathNode.MoveTo(14.198f, 5.302f),
                    PathNode.LineTo(14.546f, 3.332f),
                    PathNode.MoveTo(7.48f, 20.364f),
                    PathNode.LineTo(10.606f, 2.637f)
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
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
