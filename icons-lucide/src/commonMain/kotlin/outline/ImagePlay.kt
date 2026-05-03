package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImagePlay: ImageVector
    get() {
        if (_imagePlay != null) return _imagePlay!!
        _imagePlay = lucideOutlineIcon(
            name = "ImagePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.003f),
                    PathNode.CurveTo(14.99891f, 14.641666f, 15.192832f, 14.307848f, 15.507257f, 14.129805f),
                    PathNode.CurveTo(15.821684f, 13.951761f, 16.207703f, 13.957188f, 16.517f, 14.144f),
                    PathNode.LineTo(21.514f, 17.141f),
                    PathNode.CurveTo(21.816633f, 17.321375f, 22.002024f, 17.64769f, 22.002024f, 18.0f),
                    PathNode.CurveTo(22.002024f, 18.35231f, 21.816633f, 18.678625f, 21.514f, 18.859f),
                    PathNode.LineTo(16.517f, 21.856f),
                    PathNode.CurveTo(16.20755f, 22.042906f, 15.821314f, 22.04824f, 15.50682f, 21.869951f),
                    PathNode.CurveTo(15.192327f, 21.691662f, 14.998547f, 21.357513f, 15.0f, 20.996f),
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
                    PathNode.MoveTo(21.0f, 12.17f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 3.895431f, 20.10457f, 3.0f, 19.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f)
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
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.LineTo(11.0f, 16.0f)
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
                    PathNode.MoveTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 10.104569f, 10.104569f, 11.0f, 9.0f, 11.0f),
                    PathNode.CurveTo(7.895431f, 11.0f, 7.0f, 10.104569f, 7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 7.895431f, 7.895431f, 7.0f, 9.0f, 7.0f),
                    PathNode.CurveTo(10.104569f, 7.0f, 11.0f, 7.895431f, 11.0f, 9.0f),
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
        return _imagePlay!!
    }

private var _imagePlay: ImageVector? = null
