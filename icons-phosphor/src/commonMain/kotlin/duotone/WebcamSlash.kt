package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorDuotoneIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(88.2355f, 32.0f, 56.0f, 64.2355f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 143.7645f, 88.2355f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(167.7645f, 176.0f, 200.0f, 143.7645f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 64.2355f, 167.7645f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 121.67311f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 121.67311f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.LineTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(58.82f, 63.8f),
                    PathNode.CurveTo(45.153187f, 87.31474f, 44.369434f, 116.16231f, 56.7393f, 140.38441f),
                    PathNode.CurveTo(69.10916f, 164.60654f, 92.93799f, 180.88484f, 120.0f, 183.6f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(197.19f, 216.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 104.0f),
                    PathNode.CurveTo(63.985985f, 94.44005f, 66.12561f, 84.999725f, 70.26f, 76.38f),
                    PathNode.LineTo(88.68f, 96.64f),
                    PathNode.CurveTo(86.4908f, 108.3347f, 89.62131f, 120.39698f, 97.221375f, 129.55109f),
                    PathNode.CurveTo(104.82145f, 138.70518f, 116.10216f, 144.00089f, 128.0f, 144.0f),
                    PathNode.CurveTo(129.2f, 144.0f, 130.39f, 143.94f, 131.58f, 143.83f),
                    PathNode.LineTo(150.0f, 164.11f),
                    PathNode.CurveTo(130.3703f, 171.2956f, 108.46852f, 168.44206f, 91.33526f, 156.4667f),
                    PathNode.CurveTo(74.20199f, 144.49135f, 63.996708f, 124.903534f, 64.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 183.59f),
                    PathNode.CurveTo(144.80406f, 182.71094f, 153.40103f, 180.37584f, 161.44f, 176.68f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.52f, 45.31f),
                    PathNode.CurveTo(84.47083f, 43.465473f, 84.19749f, 41.279675f, 84.76012f, 39.23358f),
                    PathNode.CurveTo(85.32274f, 37.187492f, 86.67524f, 35.448765f, 88.52f, 34.4f),
                    PathNode.CurveTo(121.05492f, 15.927325f, 162.04787f, 22.47105f, 187.21483f, 50.154705f),
                    PathNode.CurveTo(212.38179f, 77.83836f, 215.00064f, 119.267624f, 193.52f, 149.9f),
                    PathNode.CurveTo(190.98225f, 153.51747f, 185.99246f, 154.39275f, 182.37502f, 151.855f),
                    PathNode.CurveTo(178.75754f, 149.31725f, 177.88223f, 144.32747f, 180.42f, 140.71f),
                    PathNode.CurveTo(197.6045f, 116.2041f, 195.50943f, 83.060684f, 175.37585f, 60.913765f),
                    PathNode.CurveTo(155.2423f, 38.76684f, 122.44794f, 33.53186f, 96.42f, 48.31f),
                    PathNode.CurveTo(92.581184f, 50.488007f, 87.703705f, 49.14558f, 85.52f, 45.31f),
                    PathNode.Close,
                    PathNode.MoveTo(150.83f, 111.43f),
                    PathNode.CurveTo(153.20964f, 104.12099f, 151.94443f, 96.11437f, 147.42702f, 89.89527f),
                    PathNode.CurveTo(142.90958f, 83.676155f, 135.68663f, 79.99709f, 128.0f, 80.0f),
                    PathNode.CurveTo(126.23778f, 79.998405f, 124.48067f, 80.189545f, 122.76f, 80.57f),
                    PathNode.CurveTo(119.88293f, 81.453354f, 116.753525f, 80.64724f, 114.66128f, 78.483826f),
                    PathNode.CurveTo(112.56903f, 76.32041f, 111.86801f, 73.1658f, 112.84707f, 70.31988f),
                    PathNode.CurveTo(113.826126f, 67.473946f, 116.31959f, 65.41831f, 119.3f, 65.0f),
                    PathNode.CurveTo(133.30524f, 61.899326f, 147.89856f, 66.53537f, 157.54662f, 77.15028f),
                    PathNode.CurveTo(167.19463f, 87.76518f, 170.4201f, 102.73362f, 166.0f, 116.38f),
                    PathNode.CurveTo(164.55563f, 120.47471f, 160.1087f, 122.66977f, 155.97986f, 121.326065f),
                    PathNode.CurveTo(151.85103f, 119.98235f, 149.54778f, 115.59049f, 150.79f, 111.43f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
