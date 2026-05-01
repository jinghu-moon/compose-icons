package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutTemplate: ImageVector
    get() {
        if (_layoutTemplate != null) return _layoutTemplate!!
        _layoutTemplate = lucideOutlineIcon(
            name = "LayoutTemplate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.0f, 9.552285f, 20.552284f, 10.0f, 20.0f, 10.0f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.CurveTo(3.447715f, 10.0f, 3.0f, 9.552285f, 3.0f, 9.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
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
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(11.552285f, 14.0f, 12.0f, 14.447715f, 12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.0f, 20.552284f, 11.552285f, 21.0f, 11.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 14.447715f, 3.447715f, 14.0f, 4.0f, 14.0f),
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
                    PathNode.MoveTo(17.0f, 14.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.552284f, 14.0f, 21.0f, 14.447715f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(16.447716f, 21.0f, 16.0f, 20.552284f, 16.0f, 20.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 14.447715f, 16.447716f, 14.0f, 17.0f, 14.0f),
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
        return _layoutTemplate!!
    }

private var _layoutTemplate: ImageVector? = null
