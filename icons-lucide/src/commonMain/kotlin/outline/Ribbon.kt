package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ribbon: ImageVector
    get() {
        if (_ribbon != null) return _ribbon!!
        _ribbon = lucideOutlineIcon(
            name = "Ribbon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 11.22f),
                    PathNode.CurveTo(11.0f, 9.997f, 10.0f, 9.0f, 10.0f, 8.0f),
                    PathNode.CurveTo(10.0f, 6.895431f, 10.895431f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(13.104569f, 6.0f, 14.0f, 6.895431f, 14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 9.0f, 13.002f, 10.002f, 11.99f, 11.22f)
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
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(14.57f, 14.5f)
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
                    PathNode.MoveTo(6.243f, 9.016f),
                    PathNode.CurveTo(7.549229f, 7.127937f, 9.698275f, 6.000428f, 11.994143f, 5.998633f),
                    PathNode.CurveTo(14.290012f, 5.996837f, 16.440819f, 7.120982f, 17.75f, 9.007f)
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
                    PathNode.MoveTo(9.35f, 14.53f),
                    PathNode.LineTo(12.0f, 11.22f)
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
                    PathNode.MoveTo(9.35f, 14.53f),
                    PathNode.CurveTo(7.728f, 12.246f, 6.0f, 10.221f, 6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 4.238577f, 8.686292f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(15.313708f, 2.0f, 18.0f, 4.238577f, 18.0f, 7.0f),
                    PathNode.CurveTo(17.995f, 10.22f, 16.222f, 12.235f, 14.57f, 14.5f),
                    PathNode.LineTo(18.127f, 19.027f),
                    PathNode.CurveTo(18.29546f, 19.241426f, 18.36905f, 19.515348f, 18.330723f, 19.785328f),
                    PathNode.CurveTo(18.292397f, 20.05531f, 18.145481f, 20.297928f, 17.924f, 20.457f),
                    PathNode.LineTo(16.03f, 21.817f),
                    PathNode.CurveTo(15.587125f, 22.134312f, 14.97174f, 22.038713f, 14.646f, 21.602f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(9.321f, 21.593f),
                    PathNode.CurveTo(8.994252f, 22.032795f, 8.374448f, 22.127773f, 7.931f, 21.806f),
                    PathNode.LineTo(6.066f, 20.453f),
                    PathNode.CurveTo(5.846909f, 20.294003f, 5.701638f, 20.052975f, 5.663381f, 19.784986f),
                    PathNode.CurveTo(5.625124f, 19.516998f, 5.69715f, 19.24495f, 5.863f, 19.031f),
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
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
