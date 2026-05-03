package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorThinIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.02142f, 145.51978f, 215.00931f, 162.67691f, 205.56f, 177.43f),
                    PathNode.LineTo(132.0f, 125.92f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(181.18178f, 38.286674f, 219.94214f, 78.76922f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 36.09f),
                    PathNode.LineTo(124.0f, 125.92f),
                    PathNode.LineTo(50.44f, 177.43f),
                    PathNode.CurveTo(32.78327f, 149.71205f, 31.252802f, 114.68053f, 46.424973f, 85.52834f),
                    PathNode.CurveTo(61.59714f, 56.376163f, 91.16758f, 37.531006f, 124.0f, 36.09f),
                    PathNode.Close,
                    PathNode.MoveTo(55.0f, 184.0f),
                    PathNode.LineTo(124.0f, 135.71f),
                    PathNode.LineTo(124.0f, 219.94f),
                    PathNode.CurveTo(96.81481f, 218.76096f, 71.54832f, 205.60042f, 55.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 219.94f),
                    PathNode.LineTo(132.0f, 135.68f),
                    PathNode.LineTo(201.0f, 184.0f),
                    PathNode.CurveTo(184.44576f, 205.58914f, 159.18016f, 218.73824f, 132.0f, 219.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _peace!!
    }

private var _peace: ImageVector? = null
