package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CirclePlay: ImageVector
    get() {
        if (_circlePlay != null) return _circlePlay!!
        _circlePlay = lucideOutlineIcon(
            name = "CirclePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.003f),
                    PathNode.CurveTo(8.99891f, 8.641666f, 9.192832f, 8.307848f, 9.507257f, 8.129805f),
                    PathNode.CurveTo(9.821684f, 7.951761f, 10.207703f, 7.957188f, 10.517f, 8.144f),
                    PathNode.LineTo(15.514f, 11.141f),
                    PathNode.CurveTo(15.816634f, 11.321374f, 16.002024f, 11.64769f, 16.002024f, 12.0f),
                    PathNode.CurveTo(16.002024f, 12.35231f, 15.816634f, 12.678626f, 15.514f, 12.859f),
                    PathNode.LineTo(10.517f, 15.856f),
                    PathNode.CurveTo(10.20755f, 16.042906f, 9.821314f, 16.04824f, 9.50682f, 15.869951f),
                    PathNode.CurveTo(9.192327f, 15.691662f, 8.998547f, 15.357512f, 9.0f, 14.996f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(17.522848f, 2.0f, 22.0f, 6.477153f, 22.0f, 12.0f),
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
        return _circlePlay!!
    }

private var _circlePlay: ImageVector? = null
