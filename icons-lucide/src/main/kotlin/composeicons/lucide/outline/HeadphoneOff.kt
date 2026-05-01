package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeadphoneOff: ImageVector
    get() {
        if (_headphoneOff != null) return _headphoneOff!!
        _headphoneOff = lucideOutlineIcon(
            name = "HeadphoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 14.0f),
                    PathNode.LineTo(19.657f, 14.0f)
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
                    PathNode.MoveTo(9.128f, 3.47f),
                    PathNode.CurveTo(11.874403f, 2.545244f, 14.898074f, 2.999508f, 17.251507f, 4.690442f),
                    PathNode.CurveTo(19.604939f, 6.381377f, 21.000175f, 9.102086f, 21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 15.343f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(20.414f, 20.414f),
                    PathNode.CurveTo(20.039015f, 20.789099f, 19.53039f, 20.999887f, 19.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(16.89543f, 21.0f, 16.0f, 20.10457f, 16.0f, 19.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.CurveTo(7.10457f, 14.0f, 8.0f, 14.895431f, 8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 20.10457f, 7.10457f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(2.999979f, 9.613044f, 3.948177f, 7.323844f, 5.636f, 5.636f)
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
        return _headphoneOff!!
    }

private var _headphoneOff: ImageVector? = null
