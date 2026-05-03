package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorBoldIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.88f, 6.17f),
                    PathNode.CurveTo(130.74884f, 3.279156f, 125.25116f, 3.279156f, 121.12f, 6.17f),
                    PathNode.CurveTo(105.65732f, 17.565681f, 91.51032f, 30.646122f, 78.94f, 45.17f),
                    PathNode.CurveTo(50.85f, 77.43f, 36.0f, 111.62f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(90.46063f, 211.96141f, 60.038586f, 181.53935f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 110.69f, 80.0f, 80.63f, 96.7f, 61.29f),
                    PathNode.CurveTo(106.23466f, 50.337807f, 116.707794f, 40.23942f, 128.0f, 31.11f),
                    PathNode.CurveTo(139.2922f, 40.23942f, 149.76535f, 50.337807f, 159.3f, 61.29f),
                    PathNode.CurveTo(176.0f, 80.63f, 196.0f, 110.69f, 196.0f, 144.0f),
                    PathNode.CurveTo(195.96141f, 181.53935f, 165.53935f, 211.96141f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.62f, 159.6f),
                    PathNode.CurveTo(172.52173f, 175.80727f, 159.82726f, 188.50172f, 143.62f, 193.6f),
                    PathNode.CurveTo(142.45427f, 193.96242f, 141.24075f, 194.14781f, 140.02f, 194.15f),
                    PathNode.CurveTo(134.09239f, 194.1543f, 129.04971f, 189.82986f, 128.15025f, 183.97089f),
                    PathNode.CurveTo(127.25079f, 178.11192f, 130.76407f, 172.47398f, 136.42f, 170.7f),
                    PathNode.CurveTo(145.15457f, 167.95576f, 151.99576f, 161.11456f, 154.74f, 152.38f),
                    PathNode.CurveTo(156.72823f, 146.05634f, 163.46634f, 142.54178f, 169.79f, 144.53f),
                    PathNode.CurveTo(176.11366f, 146.51822f, 179.62822f, 153.25633f, 177.64f, 159.58f),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
