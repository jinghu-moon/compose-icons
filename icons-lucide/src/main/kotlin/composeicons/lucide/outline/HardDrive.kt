package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = lucideOutlineIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(10.01f, 16.0f)
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
                    PathNode.MoveTo(2.212f, 11.577f),
                    PathNode.CurveTo(2.072611f, 11.855114f, 2.000021f, 12.16191f, 2.0f, 12.473f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 19.10457f, 2.895431f, 20.0f, 4.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(21.10457f, 20.0f, 22.0f, 19.10457f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 12.473f),
                    PathNode.CurveTo(21.99998f, 12.16191f, 21.92739f, 11.855114f, 21.788f, 11.577f),
                    PathNode.LineTo(18.55f, 5.11f),
                    PathNode.CurveTo(18.21227f, 4.430342f, 17.518944f, 4.000403f, 16.76f, 4.0f),
                    PathNode.LineTo(7.24f, 4.0f),
                    PathNode.CurveTo(6.481056f, 4.000403f, 5.78773f, 4.430342f, 5.45f, 5.11f),
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
                    PathNode.MoveTo(21.946f, 12.013f),
                    PathNode.LineTo(2.054f, 12.013f)
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(6.01f, 16.0f)
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
