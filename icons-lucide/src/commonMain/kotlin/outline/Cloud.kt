package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = lucideOutlineIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.5f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(5.395701f, 18.999075f, 2.381268f, 16.261406f, 2.034305f, 12.673845f),
                    PathNode.CurveTo(1.687342f, 9.086285f, 4.12128f, 5.821689f, 7.658602f, 5.130078f),
                    PathNode.CurveTo(11.195925f, 4.438468f, 14.6802f, 6.545946f, 15.71f, 10.0f),
                    PathNode.LineTo(17.5f, 10.0f),
                    PathNode.CurveTo(19.98528f, 10.0f, 22.0f, 12.014719f, 22.0f, 14.5f),
                    PathNode.CurveTo(22.0f, 16.98528f, 19.98528f, 19.0f, 17.5f, 19.0f),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
