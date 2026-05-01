package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = lucideOutlineIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 21.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 9.447715f, 17.552284f, 9.0f, 17.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(6.447716f, 9.0f, 6.0f, 9.447715f, 6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 21.0f)
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
                    PathNode.MoveTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.10457f, 21.10457f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(2.895431f, 21.0f, 2.0f, 20.10457f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(1.999549f, 7.231416f, 2.439573f, 6.530566f, 3.132f, 6.197f),
                    PathNode.LineTo(11.082f, 2.223f),
                    PathNode.CurveTo(11.658113f, 1.925152f, 12.342886f, 1.925152f, 12.919f, 2.223f),
                    PathNode.LineTo(20.867f, 6.197f),
                    PathNode.CurveTo(21.559816f, 6.53028f, 22.000269f, 7.231189f, 22.0f, 8.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f)
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
