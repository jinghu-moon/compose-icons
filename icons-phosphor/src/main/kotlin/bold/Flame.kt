package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorBoldIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.69f, 48.72f),
                    PathNode.CurveTo(164.00333f, 35.35623f, 149.72305f, 23.601536f, 134.17f, 13.72f),
                    PathNode.CurveTo(130.37177f, 11.443045f, 125.62823f, 11.443045f, 121.83f, 13.72f),
                    PathNode.CurveTo(106.276955f, 23.601536f, 91.99667f, 35.35623f, 79.31f, 48.72f),
                    PathNode.CurveTo(51.0f, 78.47f, 36.0f, 111.42f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 111.42f, 205.0f, 78.47f, 176.69f, 48.72f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 170.67f, 105.53f, 157.74f, 116.45f, 145.55f),
                    PathNode.CurveTo(119.98514f, 141.61824f, 123.849144f, 137.99512f, 128.0f, 134.72f),
                    PathNode.CurveTo(132.15086f, 137.99512f, 136.01486f, 141.61824f, 139.55f, 145.55f),
                    PathNode.CurveTo(150.47f, 157.74f, 156.0f, 170.67f, 156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 199.46397f, 143.46397f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(112.536026f, 212.0f, 100.0f, 199.46397f, 100.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.84f, 187.94f),
                    PathNode.CurveTo(179.93f, 186.64f, 180.0f, 185.33f, 180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 137.74f, 136.0f, 110.83f, 134.17f, 109.71f),
                    PathNode.CurveTo(130.37177f, 107.433044f, 125.62823f, 107.433044f, 121.83f, 109.71f),
                    PathNode.CurveTo(120.0f, 110.83f, 76.0f, 137.74f, 76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 185.33f, 76.07f, 186.64f, 76.16f, 187.94f),
                    PathNode.CurveTo(65.71766f, 175.68214f, 59.987946f, 160.10272f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 117.48f, 72.21f, 91.14f, 96.28f, 65.7f),
                    PathNode.CurveTo(105.93138f, 55.577667f, 116.55597f, 46.430206f, 128.0f, 38.39f),
                    PathNode.CurveTo(145.82f, 50.86f, 196.0f, 90.71f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.01205f, 160.10272f, 190.28235f, 175.68214f, 179.84f, 187.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flame!!
    }

private var _flame: ImageVector? = null
