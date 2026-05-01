package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListVideo: ImageVector
    get() {
        if (_listVideo != null) return _listVideo!!
        _listVideo = lucideOutlineIcon(
            name = "ListVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.LineTo(3.0f, 5.0f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.LineTo(3.0f, 19.0f)
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
                    PathNode.MoveTo(15.0f, 12.003f),
                    PathNode.CurveTo(14.99891f, 11.641666f, 15.192832f, 11.307848f, 15.507257f, 11.129805f),
                    PathNode.CurveTo(15.821684f, 10.951761f, 16.207703f, 10.957188f, 16.517f, 11.144f),
                    PathNode.LineTo(21.514f, 14.141f),
                    PathNode.CurveTo(21.816633f, 14.321374f, 22.002024f, 14.64769f, 22.002024f, 15.0f),
                    PathNode.CurveTo(22.002024f, 15.35231f, 21.816633f, 15.678626f, 21.514f, 15.859f),
                    PathNode.LineTo(16.517f, 18.856f),
                    PathNode.CurveTo(16.20755f, 19.042906f, 15.821314f, 19.04824f, 15.50682f, 18.869951f),
                    PathNode.CurveTo(15.192327f, 18.691662f, 14.998547f, 18.357513f, 15.0f, 17.996f),
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
        return _listVideo!!
    }

private var _listVideo: ImageVector? = null
