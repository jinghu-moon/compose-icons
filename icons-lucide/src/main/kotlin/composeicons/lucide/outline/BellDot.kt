package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellDot: ImageVector
    get() {
        if (_bellDot != null) return _bellDot!!
        _bellDot = lucideOutlineIcon(
            name = "BellDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.268f, 21.0f),
                    PathNode.CurveTo(10.625278f, 21.618753f, 11.285505f, 21.999912f, 12.0f, 21.999912f),
                    PathNode.CurveTo(12.714495f, 21.999912f, 13.374722f, 21.618753f, 13.732f, 21.0f)
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
                    PathNode.MoveTo(11.68f, 2.009f),
                    PathNode.CurveTo(8.495356f, 2.17909f, 6.000245f, 4.810817f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 12.499f, 4.589f, 13.956f, 3.262f, 15.326f),
                    PathNode.CurveTo(2.995089f, 15.618546f, 2.925957f, 16.041039f, 3.085707f, 16.403399f),
                    PathNode.CurveTo(3.245456f, 16.765759f, 3.60399f, 16.99971f, 4.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.395962f, 17.000141f, 20.754717f, 16.766636f, 20.914888f, 16.404514f),
                    PathNode.CurveTo(21.075062f, 16.042395f, 21.006483f, 15.619871f, 20.74f, 15.327f),
                    PathNode.CurveTo(19.916f, 14.477f, 19.062f, 13.596f, 18.53f, 11.979f)
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
                    PathNode.MoveTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.656854f, 19.656855f, 8.0f, 18.0f, 8.0f),
                    PathNode.CurveTo(16.343145f, 8.0f, 15.0f, 6.656854f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.343146f, 16.343145f, 2.0f, 18.0f, 2.0f),
                    PathNode.CurveTo(19.656855f, 2.0f, 21.0f, 3.343146f, 21.0f, 5.0f),
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
        return _bellDot!!
    }

private var _bellDot: ImageVector? = null
