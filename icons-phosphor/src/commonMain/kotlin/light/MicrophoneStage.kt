package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorLightIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 18.0f),
                    PathNode.CurveTo(147.68694f, 17.986267f, 128.37144f, 26.804502f, 115.07584f, 42.161827f),
                    PathNode.CurveTo(101.780235f, 57.519154f, 95.818214f, 77.89817f, 98.74f, 98.0f),
                    PathNode.LineTo(28.74f, 193.46f),
                    PathNode.CurveTo(24.623613f, 199.02052f, 25.215706f, 206.76031f, 30.13f, 211.63f),
                    PathNode.LineTo(44.43f, 225.93f),
                    PathNode.CurveTo(49.301605f, 230.84013f, 57.038208f, 231.43199f, 62.6f, 227.32f),
                    PathNode.LineTo(158.06f, 157.32f),
                    PathNode.CurveTo(183.95596f, 160.95525f, 209.71892f, 149.85333f, 224.86119f, 128.53369f),
                    PathNode.CurveTo(240.00345f, 107.21405f, 241.99988f, 79.23197f, 230.03775f, 55.97852f),
                    PathNode.CurveTo(218.0756f, 32.725067f, 194.14975f, 18.078037f, 168.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 88.0f),
                    PathNode.CurveTo(226.01204f, 101.30897f, 221.4189f, 114.21219f, 213.0f, 124.52f),
                    PathNode.LineTo(131.49f, 43.0f),
                    PathNode.CurveTo(148.84352f, 28.889263f, 172.76834f, 26.024805f, 192.96251f, 35.64006f),
                    PathNode.CurveTo(213.15668f, 45.255314f, 226.01472f, 65.63357f, 226.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(55.5f, 217.59f),
                    PathNode.CurveTo(54.703037f, 218.17517f, 53.59809f, 218.09016f, 52.9f, 217.39f),
                    PathNode.LineTo(38.61f, 203.1f),
                    PathNode.CurveTo(37.90983f, 202.40192f, 37.824833f, 201.29697f, 38.41f, 200.5f),
                    PathNode.LineTo(102.63f, 112.94f),
                    PathNode.CurveTo(109.77448f, 131.5366f, 124.47163f, 146.23012f, 143.07f, 153.37f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 88.0f),
                    PathNode.CurveTo(109.99454f, 74.69216f, 114.58692f, 61.791096f, 123.0f, 51.48f),
                    PathNode.LineTo(204.53f, 133.0f),
                    PathNode.CurveTo(187.1658f, 147.08005f, 163.25526f, 149.92722f, 143.07028f, 140.31837f),
                    PathNode.CurveTo(122.88531f, 130.70953f, 110.01951f, 110.35537f, 110.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.25f, 147.75f),
                    PathNode.CurveTo(109.37666f, 148.87541f, 110.00972f, 150.40254f, 110.00972f, 151.995f),
                    PathNode.CurveTo(110.00972f, 153.58746f, 109.37666f, 155.1146f, 108.25f, 156.24f),
                    PathNode.LineTo(100.25f, 164.24f),
                    PathNode.CurveTo(97.905556f, 166.58444f, 94.10445f, 166.58444f, 91.76f, 164.24f),
                    PathNode.CurveTo(89.41555f, 161.89555f, 89.41555f, 158.09445f, 91.76f, 155.75f),
                    PathNode.LineTo(99.76f, 147.75f),
                    PathNode.CurveTo(100.88448f, 146.61894f, 102.41302f, 145.98215f, 104.00793f, 145.98027f),
                    PathNode.CurveTo(105.60284f, 145.9784f, 107.13286f, 146.6116f, 108.26f, 147.74f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
