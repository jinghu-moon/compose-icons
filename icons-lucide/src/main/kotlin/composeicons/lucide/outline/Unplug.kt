package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Unplug: ImageVector
    get() {
        if (_unplug != null) return _unplug!!
        _unplug = lucideOutlineIcon(
            name = "Unplug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.LineTo(22.0f, 2.0f)
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
                    PathNode.MoveTo(2.0f, 22.0f),
                    PathNode.LineTo(5.0f, 19.0f)
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
                    PathNode.MoveTo(6.3f, 20.3f),
                    PathNode.CurveTo(6.750325f, 20.75189f, 7.362036f, 21.005892f, 8.0f, 21.005892f),
                    PathNode.CurveTo(8.637963f, 21.005892f, 9.249676f, 20.75189f, 9.7f, 20.3f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(3.7f, 14.3f),
                    PathNode.CurveTo(3.248109f, 14.750324f, 2.994108f, 15.362037f, 2.994108f, 16.0f),
                    PathNode.CurveTo(2.994108f, 16.637964f, 3.248109f, 17.249676f, 3.7f, 17.7f),
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
                    PathNode.MoveTo(7.5f, 13.5f),
                    PathNode.LineTo(10.0f, 11.0f)
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
                    PathNode.MoveTo(10.5f, 16.5f),
                    PathNode.LineTo(13.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(20.3f, 9.7f),
                    PathNode.CurveTo(20.75189f, 9.249676f, 21.005892f, 8.637963f, 21.005892f, 8.0f),
                    PathNode.CurveTo(21.005892f, 7.362036f, 20.75189f, 6.750325f, 20.3f, 6.3f),
                    PathNode.LineTo(17.7f, 3.7f),
                    PathNode.CurveTo(17.249676f, 3.248109f, 16.637964f, 2.994108f, 16.0f, 2.994108f),
                    PathNode.CurveTo(15.362037f, 2.994108f, 14.750324f, 3.248109f, 14.3f, 3.7f),
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
        return _unplug!!
    }

private var _unplug: ImageVector? = null
