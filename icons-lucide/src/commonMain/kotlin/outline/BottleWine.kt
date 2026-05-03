package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BottleWine: ImageVector
    get() {
        if (_bottleWine != null) return _bottleWine!!
        _bottleWine = lucideOutlineIcon(
            name = "BottleWine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 3.0f),
                    PathNode.CurveTo(10.0f, 2.447715f, 10.447715f, 2.0f, 11.0f, 2.0f),
                    PathNode.LineTo(13.0f, 2.0f),
                    PathNode.CurveTo(13.552285f, 2.0f, 14.0f, 2.447715f, 14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 6.298221f, 14.421067f, 7.561423f, 15.2f, 8.6f),
                    PathNode.LineTo(15.8f, 9.4f),
                    PathNode.CurveTo(16.578934f, 10.438577f, 17.0f, 11.701778f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(17.0f, 21.552284f, 16.552284f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.447716f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 11.701778f, 7.421067f, 10.438577f, 8.2f, 9.4f),
                    PathNode.LineTo(8.8f, 8.6f),
                    PathNode.CurveTo(9.578933f, 7.561423f, 10.0f, 6.298221f, 10.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(12.447715f, 13.0f, 12.0f, 13.447715f, 12.0f, 14.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(12.0f, 17.552284f, 12.447715f, 18.0f, 13.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f)
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
        return _bottleWine!!
    }

private var _bottleWine: ImageVector? = null
