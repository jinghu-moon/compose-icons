package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudAlert: ImageVector
    get() {
        if (_cloudAlert != null) return _cloudAlert!!
        _cloudAlert = lucideOutlineIcon(
            name = "CloudAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
                    PathNode.MoveTo(12.0f, 20.0f),
                    PathNode.LineTo(12.01f, 20.0f)
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
                    PathNode.MoveTo(8.128001f, 16.949f),
                    PathNode.CurveTo(4.662941f, 16.512465f, 2.049774f, 13.588646f, 2.003572f, 10.096502f),
                    PathNode.CurveTo(1.95737f, 6.604359f, 4.492269f, 3.61243f, 7.944566f, 3.084375f),
                    PathNode.CurveTo(11.396863f, 2.556319f, 14.710213f, 4.653715f, 15.71f, 8.0f),
                    PathNode.LineTo(17.5f, 8.0f),
                    PathNode.CurveTo(19.98528f, 8.0f, 22.0f, 10.014719f, 22.0f, 12.5f),
                    PathNode.CurveTo(22.0f, 14.985281f, 19.98528f, 17.0f, 17.5f, 17.0f),
                    PathNode.LineTo(15.858f, 17.0f)
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
        return _cloudAlert!!
    }

private var _cloudAlert: ImageVector? = null
