package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorFillIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 204.5f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(200.0f, 236.41827f, 196.41827f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(187.58173f, 240.0f, 184.0f, 236.41827f, 184.0f, 232.0f),
                    PathNode.LineTo(184.0f, 204.5f),
                    PathNode.CurveTo(184.08003f, 180.23378f, 170.35948f, 158.03195f, 148.62f, 147.25f),
                    PathNode.LineTo(100.22f, 123.06f),
                    PathNode.CurveTo(73.04715f, 109.58292f, 55.898197f, 81.83125f, 56.0f, 51.5f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(56.0f, 19.581722f, 59.581722f, 16.0f, 64.0f, 16.0f),
                    PathNode.CurveTo(68.41828f, 16.0f, 72.0f, 19.581722f, 72.0f, 24.0f),
                    PathNode.LineTo(72.0f, 51.5f),
                    PathNode.CurveTo(71.919975f, 75.76623f, 85.64051f, 97.968056f, 107.38f, 108.75f),
                    PathNode.LineTo(155.78f, 132.94f),
                    PathNode.CurveTo(182.95285f, 146.41707f, 200.1018f, 174.16875f, 200.0f, 204.5f),
                    PathNode.Close,
                    PathNode.MoveTo(163.18f, 192.0f),
                    PathNode.LineTo(83.91f, 192.0f),
                    PathNode.CurveTo(81.69316f, 192.00487f, 79.57369f, 191.08966f, 78.05719f, 189.47269f),
                    PathNode.CurveTo(76.54069f, 187.85571f, 75.76313f, 185.68199f, 75.91f, 183.47f),
                    PathNode.CurveTo(76.28183f, 179.19687f, 79.8912f, 175.93666f, 84.18f, 176.0f),
                    PathNode.LineTo(149.7f, 176.0f),
                    PathNode.CurveTo(151.33562f, 175.99796f, 152.8052f, 175.00032f, 153.41077f, 173.48093f),
                    PathNode.CurveTo(154.01633f, 171.96153f, 153.63583f, 170.22653f, 152.45f, 169.1f),
                    PathNode.CurveTo(149.14948f, 166.09303f, 145.44745f, 163.55885f, 141.45f, 161.57f),
                    PathNode.LineTo(94.8f, 138.23f),
                    PathNode.CurveTo(93.48787f, 137.57436f, 91.92212f, 137.68948f, 90.72f, 138.53f),
                    PathNode.CurveTo(68.91608f, 153.39565f, 55.90849f, 178.1108f, 56.0f, 204.5f),
                    PathNode.LineTo(56.0f, 231.73f),
                    PathNode.CurveTo(55.931744f, 236.02065f, 59.19454f, 239.63287f, 63.47f, 240.0f),
                    PathNode.CurveTo(65.68197f, 240.14687f, 67.85571f, 239.36931f, 69.47269f, 237.85281f),
                    PathNode.CurveTo(71.08966f, 236.3363f, 72.00487f, 234.21684f, 72.0f, 232.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(164.0f, 216.0f),
                    PathNode.CurveTo(166.20914f, 216.0f, 168.0f, 214.20914f, 168.0f, 212.0f),
                    PathNode.LineTo(168.0f, 204.5f),
                    PathNode.CurveTo(167.99966f, 201.37166f, 167.69829f, 198.2506f, 167.1f, 195.18f),
                    PathNode.CurveTo(166.71153f, 193.32529f, 165.07495f, 191.99765f, 163.18f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.47f, 16.0f),
                    PathNode.CurveTo(187.19453f, 16.367125f, 183.93175f, 19.979347f, 184.0f, 24.27f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(92.0f, 40.0f),
                    PathNode.CurveTo(89.79086f, 40.0f, 88.0f, 41.79086f, 88.0f, 44.0f),
                    PathNode.LineTo(88.0f, 51.5f),
                    PathNode.CurveTo(88.00033f, 54.628345f, 88.30172f, 57.749397f, 88.9f, 60.82f),
                    PathNode.CurveTo(89.28847f, 62.674713f, 90.92504f, 64.00234f, 92.82f, 64.0f),
                    PathNode.LineTo(171.82f, 64.0f),
                    PathNode.CurveTo(176.10115f, 63.94723f, 179.6987f, 67.20465f, 180.07f, 71.47f),
                    PathNode.CurveTo(180.21687f, 73.68197f, 179.43932f, 75.85571f, 177.9228f, 77.47269f),
                    PathNode.CurveTo(176.40631f, 79.08966f, 174.28683f, 80.00487f, 172.07f, 80.0f),
                    PathNode.LineTo(106.3f, 80.0f),
                    PathNode.CurveTo(104.66438f, 80.002045f, 103.194786f, 80.99969f, 102.58923f, 82.51908f),
                    PathNode.CurveTo(101.98367f, 84.038475f, 102.364174f, 85.773476f, 103.55f, 86.9f),
                    PathNode.CurveTo(106.850525f, 89.90696f, 110.55253f, 92.441154f, 114.55f, 94.43f),
                    PathNode.LineTo(161.22f, 117.77f),
                    PathNode.CurveTo(162.53214f, 118.42564f, 164.09787f, 118.31052f, 165.3f, 117.47f),
                    PathNode.CurveTo(187.09633f, 102.599846f, 200.09602f, 77.88545f, 200.0f, 51.5f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(200.00487f, 21.783163f, 199.08966f, 19.663696f, 197.47269f, 18.147192f),
                    PathNode.CurveTo(195.85571f, 16.630688f, 193.68199f, 15.853129f, 191.47f, 16.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dna!!
    }

private var _dna: ImageVector? = null
