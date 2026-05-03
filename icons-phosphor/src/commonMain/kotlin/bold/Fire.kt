package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorBoldIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(177.62f, 159.6f),
                    PathNode.CurveTo(172.52173f, 175.80727f, 159.82726f, 188.50172f, 143.62f, 193.6f),
                    PathNode.CurveTo(142.45427f, 193.96242f, 141.24075f, 194.14781f, 140.02f, 194.15f),
                    PathNode.CurveTo(134.09239f, 194.1543f, 129.04971f, 189.82986f, 128.15025f, 183.97089f),
                    PathNode.CurveTo(127.25079f, 178.11192f, 130.76407f, 172.47398f, 136.42f, 170.7f),
                    PathNode.CurveTo(145.15457f, 167.95576f, 151.99576f, 161.11456f, 154.74f, 152.38f),
                    PathNode.CurveTo(156.72823f, 146.05634f, 163.46634f, 142.54178f, 169.79f, 144.53f),
                    PathNode.CurveTo(176.11366f, 146.51822f, 179.62822f, 153.25633f, 177.64f, 159.58f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 194.8102f, 178.8102f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(77.18981f, 236.0f, 36.0f, 194.8102f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 115.19f, 47.27f, 85.82f, 69.48f, 56.72f),
                    PathNode.CurveTo(71.56099f, 53.99254f, 74.70984f, 52.286175f, 78.13108f, 52.03197f),
                    PathNode.CurveTo(81.55233f, 51.777767f, 84.91878f, 53.000034f, 87.38f, 55.39f),
                    PathNode.LineTo(107.07f, 74.5f),
                    PathNode.LineTo(127.0f, 19.89f),
                    PathNode.CurveTo(128.33734f, 16.223328f, 131.37434f, 13.436099f, 135.14204f, 12.417586f),
                    PathNode.CurveTo(138.90974f, 11.399074f, 142.93741f, 12.276529f, 145.94f, 14.77f),
                    PathNode.CurveTo(168.2f, 33.25f, 220.0f, 82.85f, 220.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 102.29f, 165.39f, 65.61f, 143.48f, 44.71f),
                    PathNode.LineTo(123.27f, 100.11f),
                    PathNode.CurveTo(121.87631f, 103.930855f, 118.64216f, 106.785736f, 114.67789f, 107.69451f),
                    PathNode.CurveTo(110.713615f, 108.60328f, 106.55885f, 107.442245f, 103.64f, 104.61f),
                    PathNode.LineTo(80.71f, 82.36f),
                    PathNode.CurveTo(67.0f, 103.38f, 60.0f, 124.06f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 181.55536f, 90.44463f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(165.55536f, 212.0f, 196.0f, 181.55536f, 196.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fire!!
    }

private var _fire: ImageVector? = null
