package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = lucideOutlineIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(6.0f, 2.0f)
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
                    PathNode.MoveTo(18.992f, 12.0f),
                    PathNode.LineTo(2.041f, 12.0f)
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
                    PathNode.MoveTo(21.145f, 18.38f),
                    PathNode.CurveTo(20.561863f, 17.900719f, 20.158266f, 17.238045f, 20.0f, 16.5f),
                    PathNode.CurveTo(19.844748f, 17.239243f, 19.440584f, 17.902847f, 18.855f, 18.38f),
                    PathNode.CurveTo(18.28f, 18.84f, 18.0f, 19.4f, 18.0f, 19.975f),
                    PathNode.CurveTo(17.993315f, 20.50975f, 18.201075f, 21.024906f, 18.576874f, 21.405403f),
                    PathNode.CurveTo(18.952671f, 21.7859f, 19.465206f, 22.000042f, 20.0f, 22.0f),
                    PathNode.CurveTo(20.534794f, 22.000042f, 21.047329f, 21.7859f, 21.423126f, 21.405403f),
                    PathNode.CurveTo(21.798925f, 21.024906f, 22.006685f, 20.50975f, 22.0f, 19.975f),
                    PathNode.CurveTo(22.0f, 19.395f, 21.715f, 18.845f, 21.145f, 18.38f)
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
                    PathNode.MoveTo(8.5f, 4.5f),
                    PathNode.LineTo(10.648f, 2.352f),
                    PathNode.CurveTo(11.118567f, 1.881503f, 11.881433f, 1.881503f, 12.352f, 2.352f),
                    PathNode.LineTo(19.648f, 9.648f),
                    PathNode.CurveTo(20.118496f, 10.118567f, 20.118496f, 10.881433f, 19.648f, 11.352f),
                    PathNode.LineTo(12.056f, 18.944f),
                    PathNode.CurveTo(10.644299f, 20.35549f, 8.355702f, 20.35549f, 6.944f, 18.944f),
                    PathNode.LineTo(3.056f, 15.056f),
                    PathNode.CurveTo(1.644509f, 13.644299f, 1.644509f, 11.355701f, 3.056f, 9.944f),
                    PathNode.LineTo(5.67f, 7.33f)
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
