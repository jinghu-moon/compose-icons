package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorLightIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(55.72f, 57.41f),
                    PathNode.CurveTo(46.73075f, 71.28337f, 41.964363f, 87.46895f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 136.64f, 54.12f, 148.33f, 63.85f, 157.71f),
                    PathNode.CurveTo(71.76f, 165.34f, 78.0f, 171.36f, 78.0f, 188.0f),
                    PathNode.CurveTo(78.03306f, 215.60052f, 100.39947f, 237.96693f, 128.0f, 238.0f),
                    PathNode.CurveTo(142.34f, 238.0f, 154.66f, 231.88f, 164.63f, 219.82f),
                    PathNode.CurveTo(166.73973f, 217.26292f, 166.37708f, 213.47972f, 163.82f, 211.37f),
                    PathNode.CurveTo(161.26292f, 209.26027f, 157.47972f, 209.62292f, 155.37f, 212.18f),
                    PathNode.CurveTo(147.69f, 221.48f, 138.74f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(107.013176f, 226.0f, 90.0f, 208.98682f, 90.0f, 188.0f),
                    PathNode.CurveTo(90.0f, 166.26f, 80.94f, 157.52f, 72.18f, 149.08f),
                    PathNode.CurveTo(62.83f, 140.06f, 54.0f, 131.55f, 54.0f, 104.0f),
                    PathNode.CurveTo(53.971684f, 90.868904f, 57.466473f, 77.97064f, 64.12f, 66.65f),
                    PathNode.LineTo(84.49f, 89.06f),
                    PathNode.CurveTo(82.8402f, 93.86821f, 81.9988f, 98.916626f, 82.0f, 104.0f),
                    PathNode.CurveTo(82.0f, 107.313705f, 84.686295f, 110.0f, 88.0f, 110.0f),
                    PathNode.CurveTo(91.313705f, 110.0f, 94.0f, 107.313705f, 94.0f, 104.0f),
                    PathNode.CurveTo(94.00597f, 102.599495f, 94.09277f, 101.2005f, 94.26f, 99.81f),
                    PathNode.LineTo(139.41f, 149.47f),
                    PathNode.CurveTo(138.4659f, 152.90007f, 137.9916f, 156.44238f, 138.0f, 160.0f),
                    PathNode.CurveTo(138.00156f, 167.21193f, 141.53777f, 173.96513f, 147.46442f, 178.0745f),
                    PathNode.CurveTo(153.39105f, 182.18384f, 160.95546f, 183.12746f, 167.71f, 180.6f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(150.08f, 161.25f),
                    PathNode.LineTo(157.86f, 169.8f),
                    PathNode.CurveTo(153.70265f, 168.88449f, 150.58063f, 165.43742f, 150.08f, 161.21f),
                    PathNode.Close,
                    PathNode.MoveTo(81.83f, 38.38f),
                    PathNode.CurveTo(80.13534f, 35.537964f, 81.061424f, 31.860453f, 83.9f, 30.16f),
                    PathNode.CurveTo(110.47463f, 14.286958f, 143.52933f, 13.919957f, 170.44984f, 29.199053f),
                    PathNode.CurveTo(197.37035f, 44.478146f, 214.00282f, 73.04577f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 107.313705f, 211.3137f, 110.0f, 208.0f, 110.0f),
                    PathNode.CurveTo(204.6863f, 110.0f, 202.0f, 107.313705f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0058f, 77.36465f, 187.69691f, 52.781147f, 164.53398f, 39.63121f),
                    PathNode.CurveTo(141.37103f, 26.481272f, 112.928215f, 26.79398f, 90.06f, 40.45f),
                    PathNode.CurveTo(88.69418f, 41.267067f, 87.05971f, 41.508003f, 85.51621f, 41.119785f),
                    PathNode.CurveTo(83.97273f, 40.73157f, 82.64673f, 39.746017f, 81.83f, 38.38f),
                    PathNode.Close,
                    PathNode.MoveTo(158.66f, 117.25f),
                    PathNode.CurveTo(160.85442f, 113.17846f, 162.00217f, 108.62525f, 162.0f, 104.0f),
                    PathNode.CurveTo(161.99954f, 93.024956f, 156.70135f, 82.725044f, 147.77315f, 76.34237f),
                    PathNode.CurveTo(138.84492f, 69.95969f, 127.38479f, 68.27925f, 117.0f, 71.83f),
                    PathNode.CurveTo(113.88623f, 72.83577f, 110.54079f, 71.16119f, 109.47989f, 68.065765f),
                    PathNode.CurveTo(108.41899f, 64.970345f, 110.033905f, 61.59569f, 113.11f, 60.48f),
                    PathNode.CurveTo(127.16026f, 55.6732f, 142.66681f, 57.94476f, 154.748f, 66.57957f),
                    PathNode.CurveTo(166.8292f, 75.21438f, 173.9989f, 89.150246f, 174.0f, 104.0f),
                    PathNode.CurveTo(173.99756f, 110.541954f, 172.39061f, 116.98346f, 169.32f, 122.76f),
                    PathNode.CurveTo(168.34259f, 124.67656f, 166.41385f, 125.92312f, 164.26497f, 126.027115f),
                    PathNode.CurveTo(162.11607f, 126.1311f, 160.07599f, 125.076614f, 158.91808f, 123.26338f),
                    PathNode.CurveTo(157.76018f, 121.45016f, 157.6617f, 119.15577f, 158.66f, 117.25f),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
