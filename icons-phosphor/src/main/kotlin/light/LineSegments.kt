package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorLightIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.23f, 34.77f),
                    PathNode.CurveTo(225.49904f, 23.078266f, 206.52097f, 23.078266f, 194.79f, 34.77f),
                    PathNode.LineTo(194.79f, 34.77f),
                    PathNode.CurveTo(183.09827f, 46.50096f, 183.09827f, 65.479034f, 194.79f, 77.21f),
                    PathNode.CurveTo(195.44f, 77.85f, 196.11f, 78.45f, 196.79f, 79.02f),
                    PathNode.LineTo(168.65f, 131.28f),
                    PathNode.CurveTo(160.11638f, 128.73387f, 150.8934f, 130.0959f, 143.46f, 135.0f),
                    PathNode.LineTo(121.0f, 112.54f),
                    PathNode.CurveTo(129.45543f, 99.69659f, 126.83099f, 82.53949f, 114.92285f, 72.81099f),
                    PathNode.CurveTo(103.01472f, 63.082493f, 85.6789f, 63.932816f, 74.78f, 74.78f),
                    PathNode.LineTo(74.78f, 74.78f),
                    PathNode.CurveTo(69.15281f, 80.406235f, 65.99141f, 88.037636f, 65.99141f, 95.995f),
                    PathNode.CurveTo(65.99141f, 103.95238f, 69.15281f, 111.58376f, 74.78f, 117.21f),
                    PathNode.CurveTo(75.41499f, 117.850586f, 76.08254f, 118.45805f, 76.78f, 119.03f),
                    PathNode.LineTo(48.64f, 171.29f),
                    PathNode.CurveTo(38.061905f, 168.09868f, 26.585844f, 170.98018f, 18.77f, 178.79f),
                    PathNode.LineTo(18.77f, 178.79f),
                    PathNode.CurveTo(7.059796f, 190.5077f, 7.063853f, 209.49916f, 18.779062f, 221.21187f),
                    PathNode.CurveTo(30.494272f, 232.92458f, 49.485725f, 232.92458f, 61.20094f, 221.21187f),
                    PathNode.CurveTo(72.916145f, 209.49916f, 72.92021f, 190.5077f, 61.21f, 178.79f),
                    PathNode.CurveTo(60.56f, 178.15f, 59.89f, 177.55f, 59.21f, 176.98f),
                    PathNode.LineTo(87.35f, 124.72f),
                    PathNode.CurveTo(95.883224f, 127.271774f, 105.10863f, 125.909386f, 112.54f, 121.0f),
                    PathNode.LineTo(135.0f, 143.46f),
                    PathNode.CurveTo(126.29845f, 156.63078f, 129.29218f, 174.29166f, 141.84813f, 183.85905f),
                    PathNode.CurveTo(154.40407f, 193.42642f, 172.22629f, 191.62686f, 182.6162f, 179.7426f),
                    PathNode.CurveTo(193.0061f, 167.85829f, 192.40884f, 149.95541f, 181.25f, 138.79f),
                    PathNode.CurveTo(180.615f, 138.14941f, 179.94745f, 137.54195f, 179.25f, 136.97f),
                    PathNode.LineTo(207.39f, 84.71f),
                    PathNode.CurveTo(220.55716f, 88.68043f, 234.73776f, 83.18932f, 241.79715f, 71.38664f),
                    PathNode.CurveTo(248.85657f, 59.583958f, 246.9866f, 44.492737f, 237.26f, 34.77f),
                    PathNode.Close,
                    PathNode.MoveTo(52.72f, 212.77f),
                    PathNode.CurveTo(45.689957f, 219.79774f, 34.294056f, 219.79651f, 27.265541f, 212.76723f),
                    PathNode.CurveTo(20.237028f, 205.73795f, 20.237028f, 194.34207f, 27.265541f, 187.31277f),
                    PathNode.CurveTo(34.294056f, 180.2835f, 45.689957f, 180.28226f, 52.72f, 187.31f),
                    PathNode.CurveTo(59.732224f, 194.33647f, 59.732224f, 205.71353f, 52.72f, 212.74f),
                    PathNode.Close,
                    PathNode.MoveTo(83.27f, 108.77f),
                    PathNode.CurveTo(76.24225f, 101.73996f, 76.2435f, 90.344055f, 83.27277f, 83.315544f),
                    PathNode.CurveTo(90.30205f, 76.287025f, 101.69795f, 76.287025f, 108.72723f, 83.315544f),
                    PathNode.CurveTo(115.7565f, 90.344055f, 115.75775f, 101.73996f, 108.73f, 108.77f),
                    PathNode.CurveTo(105.34888f, 112.141624f, 100.76663f, 114.03167f, 95.991714f, 114.02416f),
                    PathNode.CurveTo(91.2168f, 114.01666f, 86.64052f, 112.11224f, 83.27f, 108.73f),
                    PathNode.Close,
                    PathNode.MoveTo(172.73f, 172.77f),
                    PathNode.CurveTo(165.69995f, 179.79774f, 154.30406f, 179.79651f, 147.27554f, 172.76723f),
                    PathNode.CurveTo(140.24702f, 165.73795f, 140.24702f, 154.34207f, 147.27554f, 147.31277f),
                    PathNode.CurveTo(154.30406f, 140.2835f, 165.69995f, 140.28226f, 172.73f, 147.31f),
                    PathNode.CurveTo(179.73558f, 154.33531f, 179.73558f, 165.70468f, 172.73f, 172.73f),
                    PathNode.Close,
                    PathNode.MoveTo(228.73f, 68.77f),
                    PathNode.CurveTo(221.69995f, 75.797745f, 210.30406f, 75.79651f, 203.27554f, 68.76723f),
                    PathNode.CurveTo(196.24702f, 61.73795f, 196.24702f, 50.34205f, 203.27554f, 43.31277f),
                    PathNode.CurveTo(210.30406f, 36.283493f, 221.69995f, 36.282253f, 228.73f, 43.31f),
                    PathNode.CurveTo(235.73169f, 50.331406f, 235.73616f, 61.693085f, 228.74f, 68.72f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
