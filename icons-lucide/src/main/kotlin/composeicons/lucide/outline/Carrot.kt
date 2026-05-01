package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = lucideOutlineIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.27f, 21.7f),
                    PathNode.CurveTo(2.27f, 21.7f, 12.14f, 18.2f, 15.0f, 15.34f),
                    PathNode.CurveTo(16.759027f, 13.583735f, 16.761265f, 10.734027f, 15.005f, 8.975f),
                    PathNode.CurveTo(13.248734f, 7.215973f, 10.399027f, 7.213735f, 8.64f, 8.97f),
                    PathNode.CurveTo(5.77f, 11.84f, 2.27f, 21.7f, 2.27f, 21.7f),
                    PathNode.Close,
                    PathNode.MoveTo(8.64f, 14.0f),
                    PathNode.LineTo(6.59f, 11.96f),
                    PathNode.MoveTo(15.34f, 15.0f),
                    PathNode.LineTo(12.88f, 12.54f)
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
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 9.0f, 20.67f, 7.0f, 18.5f, 7.0f),
                    PathNode.CurveTo(16.86f, 7.0f, 15.0f, 9.0f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 9.0f, 16.33f, 11.0f, 18.5f, 11.0f),
                    PathNode.CurveTo(20.67f, 11.0f, 22.0f, 9.0f, 22.0f, 9.0f),
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
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.0f, 2.0f, 13.0f, 3.33f, 13.0f, 5.5f),
                    PathNode.CurveTo(13.0f, 7.67f, 15.0f, 9.0f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 9.0f, 17.0f, 7.16f, 17.0f, 5.5f),
                    PathNode.CurveTo(17.0f, 3.33f, 15.0f, 2.0f, 15.0f, 2.0f),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
