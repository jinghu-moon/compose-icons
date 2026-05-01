package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorThinIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 20.0f),
                    PathNode.CurveTo(130.4629f, 20.044083f, 100.04408f, 50.462914f, 100.0f, 88.0f),
                    PathNode.CurveTo(99.9987f, 91.512726f, 100.27287f, 95.02014f, 100.82f, 98.49f),
                    PathNode.LineTo(30.34f, 194.59f),
                    PathNode.CurveTo(26.814348f, 199.36041f, 27.325417f, 205.99576f, 31.54f, 210.17f),
                    PathNode.LineTo(45.83f, 224.47f),
                    PathNode.CurveTo(50.008755f, 228.6773f, 56.640736f, 229.18387f, 61.41f, 225.66f),
                    PathNode.LineTo(157.52f, 155.18f),
                    PathNode.CurveTo(182.77492f, 159.1379f, 208.11589f, 148.59755f, 223.11421f, 127.896675f),
                    PathNode.CurveTo(238.11253f, 107.1958f, 240.23393f, 79.83227f, 228.60536f, 57.067104f),
                    PathNode.CurveTo(216.97679f, 34.30195f, 193.56317f, 19.981838f, 168.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.01085f, 102.527695f, 222.72398f, 116.560844f, 213.13f, 127.47f),
                    PathNode.LineTo(128.54f, 42.87f),
                    PathNode.CurveTo(146.24057f, 27.347824f, 171.38872f, 23.624771f, 192.82741f, 33.352585f),
                    PathNode.CurveTo(214.2661f, 43.080395f, 228.02502f, 64.45754f, 228.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.68f, 219.21f),
                    PathNode.CurveTo(55.086075f, 220.38033f, 52.87618f, 220.21034f, 51.48f, 218.81f),
                    PathNode.LineTo(37.19f, 204.52f),
                    PathNode.CurveTo(35.78966f, 203.12383f, 35.619667f, 200.91393f, 36.79f, 199.32f),
                    PathNode.LineTo(103.25f, 108.7f),
                    PathNode.CurveTo(109.99363f, 129.6137f, 126.38631f, 146.00638f, 147.3f, 152.75f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 88.0f),
                    PathNode.CurveTo(107.995575f, 73.47347f, 113.281624f, 59.442516f, 122.87f, 48.53f),
                    PathNode.LineTo(207.47f, 133.13f),
                    PathNode.CurveTo(189.75401f, 148.60364f, 164.63039f, 152.29808f, 143.20987f, 142.5795f),
                    PathNode.CurveTo(121.78936f, 132.86092f, 108.02344f, 111.522095f, 108.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.83f, 149.17f),
                    PathNode.CurveTo(108.387535f, 150.73131f, 108.387535f, 153.2587f, 106.83f, 154.82f),
                    PathNode.LineTo(98.83f, 162.82f),
                    PathNode.CurveTo(97.83889f, 163.91383f, 96.32593f, 164.37296f, 94.89407f, 164.01436f),
                    PathNode.CurveTo(93.46222f, 163.65578f, 92.34422f, 162.53778f, 91.985634f, 161.10593f),
                    PathNode.CurveTo(91.627045f, 159.67409f, 92.08616f, 158.16112f, 93.18f, 157.17f),
                    PathNode.LineTo(101.18f, 149.17f),
                    PathNode.CurveTo(101.92895f, 148.41757f, 102.94629f, 147.99373f, 104.00793f, 147.99185f),
                    PathNode.CurveTo(105.069565f, 147.98997f, 106.0884f, 148.41022f, 106.84f, 149.16f),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
