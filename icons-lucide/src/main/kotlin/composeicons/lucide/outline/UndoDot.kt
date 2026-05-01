package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UndoDot: ImageVector
    get() {
        if (_undoDot != null) return _undoDot!!
        _undoDot = lucideOutlineIcon(
            name = "UndoDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.CurveTo(20.996769f, 13.452326f, 18.909723f, 10.237544f, 15.670492f, 8.790689f),
                    PathNode.CurveTo(12.431263f, 7.343832f, 8.644279f, 7.934882f, 6.0f, 10.3f),
                    PathNode.LineTo(3.0f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f)
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
                    PathNode.MoveTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 17.552284f, 12.552285f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(11.447715f, 18.0f, 11.0f, 17.552284f, 11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 16.447716f, 11.447715f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(12.552285f, 16.0f, 13.0f, 16.447716f, 13.0f, 17.0f),
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
        return _undoDot!!
    }

private var _undoDot: ImageVector? = null
