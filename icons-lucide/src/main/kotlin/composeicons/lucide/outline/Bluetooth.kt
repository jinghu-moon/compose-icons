package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = lucideOutlineIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.LineTo(7.0f, 17.0f)
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
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
