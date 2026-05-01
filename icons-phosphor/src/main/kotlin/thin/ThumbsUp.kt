package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorThinIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.0f, 82.76f),
                    PathNode.CurveTo(227.20128f, 78.45917f, 221.73824f, 75.997154f, 216.0f, 76.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 36.11775f, 139.88223f, 20.0f, 120.0f, 20.0f),
                    PathNode.CurveTo(118.484344f, 19.998915f, 117.09826f, 20.85457f, 116.42f, 22.21f),
                    PathNode.LineTo(77.53f, 100.0f),
                    PathNode.LineTo(32.0f, 100.0f),
                    PathNode.CurveTo(25.372583f, 100.0f, 20.0f, 105.37258f, 20.0f, 112.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 206.62741f, 25.372583f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(204.0f, 212.0f),
                    PathNode.CurveTo(214.0884f, 212.0022f, 222.59904f, 204.49054f, 223.85f, 194.48f),
                    PathNode.LineTo(235.85f, 98.48f),
                    PathNode.CurveTo(236.56305f, 92.786896f, 234.79669f, 87.06174f, 231.0f, 82.76f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 109.79086f, 29.790861f, 108.0f, 32.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.91f, 97.49f),
                    PathNode.LineTo(215.91f, 193.49f),
                    PathNode.CurveTo(215.1585f, 199.49553f, 210.05237f, 204.00145f, 204.0f, 204.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 104.94f),
                    PathNode.LineTo(122.42f, 28.1f),
                    PathNode.CurveTo(136.89343f, 29.355618f, 148.00246f, 41.472183f, 148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 82.20914f, 149.79086f, 84.0f, 152.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(219.44275f, 83.999176f, 222.72003f, 85.47706f, 224.99858f, 88.057884f),
                    PathNode.CurveTo(227.27715f, 90.638725f, 228.33748f, 94.07389f, 227.91f, 97.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
