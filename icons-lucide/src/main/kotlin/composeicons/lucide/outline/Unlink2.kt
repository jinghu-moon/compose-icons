package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Unlink2: ImageVector
    get() {
        if (_unlink2 != null) return _unlink2!!
        _unlink2 = lucideOutlineIcon(
            name = "Unlink2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(19.761423f, 7.0f, 22.0f, 9.238576f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 14.761424f, 19.761423f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(4.238577f, 17.0f, 2.0f, 14.761424f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 9.238576f, 4.238577f, 7.0f, 7.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f)
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
        return _unlink2!!
    }

private var _unlink2: ImageVector? = null
