package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorRegularIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.32f, 28.68f),
                    PathNode.CurveTo(223.22322f, 24.585852f, 217.2337f, 23.025364f, 211.66f, 24.6f),
                    PathNode.LineTo(211.51f, 24.6f),
                    PathNode.LineTo(19.57f, 82.84f),
                    PathNode.CurveTo(13.190495f, 84.67856f, 8.609216f, 90.265884f, 8.056395f, 96.88199f),
                    PathNode.CurveTo(7.503573f, 103.498085f, 11.094077f, 109.76822f, 17.08f, 112.64f),
                    PathNode.LineTo(102.0f, 154.0f),
                    PathNode.LineTo(143.3f, 238.87f),
                    PathNode.CurveTo(145.9229f, 244.46724f, 151.55876f, 248.03064f, 157.74f, 248.0f),
                    PathNode.QuadTo(158.43f, 248.0f, 159.12f, 247.94f),
                    PathNode.CurveTo(165.73286f, 247.40456f, 171.3159f, 242.8145f, 173.12f, 236.43f),
                    PathNode.LineTo(231.32f, 44.49f),
                    PathNode.CurveTo(231.32f, 44.44f, 231.32f, 44.39f, 231.32f, 44.34f),
                    PathNode.CurveTo(232.915f, 38.780712f, 231.38567f, 32.793396f, 227.32f, 28.68f),
                    PathNode.Close,
                    PathNode.MoveTo(157.83f, 231.85f),
                    PathNode.LineTo(157.78f, 231.99f),
                    PathNode.LineTo(157.78f, 231.92f),
                    PathNode.LineTo(117.72f, 149.62f),
                    PathNode.LineTo(165.72f, 101.62f),
                    PathNode.CurveTo(168.70824f, 98.474686f, 168.6448f, 93.52075f, 165.57703f, 90.45297f),
                    PathNode.CurveTo(162.50925f, 87.38519f, 157.55531f, 87.32177f, 154.41f, 90.31f),
                    PathNode.LineTo(106.41f, 138.31f),
                    PathNode.LineTo(24.08f, 98.25f),
                    PathNode.LineTo(24.01f, 98.25f),
                    PathNode.LineTo(24.15f, 98.25f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
