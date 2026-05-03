package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Droplet: ImageVector
    get() {
        if (_droplet != null) return _droplet!!
        _droplet = lucideOutlineIcon(
            name = "Droplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.CurveTo(15.865993f, 22.0f, 19.0f, 18.865993f, 19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 13.0f, 18.0f, 11.1f, 16.0f, 9.5f),
                    PathNode.CurveTo(14.0f, 7.9f, 12.5f, 5.5f, 12.0f, 3.0f),
                    PathNode.CurveTo(11.5f, 5.5f, 10.0f, 7.9f, 8.0f, 9.5f),
                    PathNode.CurveTo(6.0f, 11.1f, 5.0f, 13.0f, 5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 18.865993f, 8.134007f, 22.0f, 12.0f, 22.0f),
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
        return _droplet!!
    }

private var _droplet: ImageVector? = null
