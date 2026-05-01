package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Blocks: ImageVector
    get() {
        if (_blocks != null) return _blocks!!
        _blocks = lucideOutlineIcon(
            name = "Blocks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 22.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(10.0f, 6.447716f, 9.552285f, 6.0f, 9.0f, 6.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(2.895431f, 6.0f, 2.0f, 6.895431f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 20.0f),
                    PathNode.CurveTo(2.0f, 21.10457f, 2.895431f, 22.0f, 4.0f, 22.0f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.CurveTo(17.10457f, 22.0f, 18.0f, 21.10457f, 18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 14.447715f, 17.552284f, 14.0f, 17.0f, 14.0f),
                    PathNode.LineTo(2.0f, 14.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.LineTo(21.0f, 2.0f),
                    PathNode.CurveTo(21.552284f, 2.0f, 22.0f, 2.447715f, 22.0f, 3.0f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 9.552285f, 21.552284f, 10.0f, 21.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(14.447715f, 10.0f, 14.0f, 9.552285f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.0f, 2.447715f, 14.447715f, 2.0f, 15.0f, 2.0f),
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
        return _blocks!!
    }

private var _blocks: ImageVector? = null
