package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = lucideOutlineIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 3.343146f, 14.209139f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(9.790861f, 2.0f, 8.0f, 3.343146f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 9.0f, 16.0f, 8.0f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 13.656855f, 14.209139f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(9.790861f, 15.0f, 8.0f, 13.656855f, 8.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 20.656855f, 9.790861f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(14.209139f, 22.0f, 16.0f, 20.656855f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 15.0f, 8.0f, 16.0f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 10.343145f, 9.790861f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(14.209139f, 9.0f, 16.0f, 10.343145f, 16.0f, 12.0f)
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
        return _section!!
    }

private var _section: ImageVector? = null
