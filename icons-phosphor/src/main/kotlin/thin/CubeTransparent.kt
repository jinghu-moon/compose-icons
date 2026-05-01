package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorThinIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.92f, 95.22f),
                    PathNode.CurveTo(219.89731f, 95.107056f, 219.86382f, 94.996544f, 219.82f, 94.89f),
                    PathNode.CurveTo(219.78583f, 94.74733f, 219.7424f, 94.60703f, 219.69f, 94.47f),
                    PathNode.CurveTo(219.63673f, 94.34175f, 219.57318f, 94.21802f, 219.5f, 94.1f),
                    PathNode.CurveTo(219.44f, 93.99f, 219.39f, 93.88f, 219.33f, 93.78f),
                    PathNode.CurveTo(219.18546f, 93.56255f, 219.01782f, 93.36138f, 218.83f, 93.18f),
                    PathNode.LineTo(218.83f, 93.18f),
                    PathNode.LineTo(162.83f, 37.18f),
                    PathNode.LineTo(162.83f, 37.18f),
                    PathNode.CurveTo(162.72852f, 37.080063f, 162.61806f, 36.98968f, 162.5f, 36.91f),
                    PathNode.CurveTo(161.7949f, 36.330303f, 160.91275f, 36.009197f, 160.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 160.0f),
                    PathNode.CurveTo(36.006374f, 160.91154f, 36.323902f, 161.79356f, 36.9f, 162.5f),
                    PathNode.CurveTo(36.97968f, 162.61806f, 37.07006f, 162.72852f, 37.17f, 162.83f),
                    PathNode.LineTo(93.17f, 218.83f),
                    PathNode.CurveTo(93.92079f, 219.57996f, 94.93881f, 220.00084f, 96.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(219.99812f, 95.73805f, 219.97134f, 95.476875f, 219.92f, 95.22f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 49.66f),
                    PathNode.LineTo(206.34f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 206.34f),
                    PathNode.LineTo(49.66f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 49.66f),
                    PathNode.LineTo(92.0f, 97.66f),
                    PathNode.Close,
                    PathNode.MoveTo(49.66f, 44.0f),
                    PathNode.LineTo(156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 92.0f),
                    PathNode.LineTo(97.66f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 100.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 212.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(158.34f, 164.0f),
                    PathNode.LineTo(206.34f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 206.34f),
                    PathNode.LineTo(164.0f, 158.34f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(212.0f, 100.0f),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
