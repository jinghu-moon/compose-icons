package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bold: ImageVector
    get() {
        if (_bold != null) return _bold!!
        _bold = lucideOutlineIcon(
            name = "Bold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(17.209139f, 12.0f, 19.0f, 13.790861f, 19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 18.209139f, 17.209139f, 20.0f, 15.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(6.447716f, 20.0f, 6.0f, 19.552284f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 4.447716f, 6.447716f, 4.0f, 7.0f, 4.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.CurveTo(16.209139f, 4.0f, 18.0f, 5.790861f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 10.209139f, 16.209139f, 12.0f, 14.0f, 12.0f)
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
        return _bold!!
    }

private var _bold: ImageVector? = null
