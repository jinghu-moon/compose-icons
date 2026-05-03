package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = lucideOutlineIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.38f, 3.46f),
                    PathNode.LineTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.0f, 4.209139f, 14.209139f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(9.790861f, 6.0f, 8.0f, 4.209139f, 8.0f, 2.0f),
                    PathNode.LineTo(3.62f, 3.46f),
                    PathNode.CurveTo(2.684835f, 3.771561f, 2.11611f, 4.71802f, 2.28f, 5.69f),
                    PathNode.LineTo(2.86f, 9.16f),
                    PathNode.CurveTo(2.938657f, 9.645285f, 3.358384f, 10.001417f, 3.85f, 10.0f),
                    PathNode.LineTo(6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 21.1f, 6.9f, 22.0f, 8.0f, 22.0f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.CurveTo(17.10457f, 22.0f, 18.0f, 21.10457f, 18.0f, 20.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(20.15f, 10.0f),
                    PathNode.CurveTo(20.641617f, 10.001417f, 21.061342f, 9.645285f, 21.14f, 9.16f),
                    PathNode.LineTo(21.72f, 5.69f),
                    PathNode.CurveTo(21.88389f, 4.71802f, 21.315166f, 3.771561f, 20.38f, 3.46f),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
