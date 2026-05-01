package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorThinIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.79f, 114.38f),
                    PathNode.LineTo(204.0f, 109.12f),
                    PathNode.LineTo(204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 49.37258f, 198.62741f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(64.0f, 44.0f),
                    PathNode.CurveTo(57.37258f, 44.0f, 52.0f, 49.37258f, 52.0f, 56.0f),
                    PathNode.LineTo(52.0f, 109.12f),
                    PathNode.LineTo(36.2f, 114.38f),
                    PathNode.CurveTo(31.29995f, 116.01587f, 27.996746f, 120.604095f, 28.0f, 125.77f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 176.46f, 45.32f, 198.77f, 78.09f, 216.52f),
                    PathNode.CurveTo(93.61107f, 224.79716f, 110.01874f, 231.2918f, 127.0f, 235.88f),
                    PathNode.CurveTo(127.63687f, 236.0392f, 128.30313f, 236.0392f, 128.94f, 235.88f),
                    PathNode.CurveTo(145.93156f, 231.29393f, 162.34941f, 224.79926f, 177.88f, 216.52f),
                    PathNode.CurveTo(210.68f, 198.77f, 228.0f, 176.46f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 125.77f),
                    PathNode.CurveTo(228.0018f, 120.60144f, 224.694f, 116.012405f, 219.79f, 114.38f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 53.79086f, 61.79086f, 52.0f, 64.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(194.20914f, 52.0f, 196.0f, 53.79086f, 196.0f, 56.0f),
                    PathNode.LineTo(196.0f, 106.45f),
                    PathNode.LineTo(129.26f, 84.21f),
                    PathNode.CurveTo(128.44327f, 83.93038f, 127.55674f, 83.93038f, 126.74f, 84.21f),
                    PathNode.LineTo(60.0f, 106.45f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 201.32f, 137.92f, 225.16f, 128.0f, 227.86f),
                    PathNode.CurveTo(118.08f, 225.16f, 36.0f, 201.32f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 125.77f),
                    PathNode.CurveTo(35.997f, 124.04769f, 37.0968f, 122.51683f, 38.73f, 121.97f),
                    PathNode.LineTo(124.0f, 93.55f),
                    PathNode.LineTo(124.0f, 168.0f),
                    PathNode.CurveTo(124.0f, 170.20914f, 125.79086f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(130.20914f, 172.0f, 132.0f, 170.20914f, 132.0f, 168.0f),
                    PathNode.LineTo(132.0f, 93.55f),
                    PathNode.LineTo(217.26f, 122.0f),
                    PathNode.CurveTo(218.89716f, 122.543365f, 220.00157f, 124.075035f, 220.0f, 125.8f),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
