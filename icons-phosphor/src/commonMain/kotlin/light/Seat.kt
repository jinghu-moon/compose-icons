package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorLightIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 232.0f),
                    PathNode.CurveTo(222.0f, 235.3137f, 219.3137f, 238.0f, 216.0f, 238.0f),
                    PathNode.LineTo(112.0f, 238.0f),
                    PathNode.CurveTo(108.686295f, 238.0f, 106.0f, 235.3137f, 106.0f, 232.0f),
                    PathNode.CurveTo(106.0f, 228.6863f, 108.686295f, 226.0f, 112.0f, 226.0f),
                    PathNode.LineTo(216.0f, 226.0f),
                    PathNode.CurveTo(219.3137f, 226.0f, 222.0f, 228.6863f, 222.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 160.0f),
                    PathNode.LineTo(222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 199.73198f, 215.73198f, 206.0f, 208.0f, 206.0f),
                    PathNode.LineTo(114.11f, 206.0f),
                    PathNode.CurveTo(108.80008f, 206.017f, 103.94164f, 203.01585f, 101.58f, 198.26f),
                    PathNode.LineTo(43.47f, 82.26f),
                    PathNode.CurveTo(41.509357f, 78.31694f, 41.509357f, 73.68306f, 43.47f, 69.74f),
                    PathNode.LineTo(65.59f, 25.74f),
                    PathNode.CurveTo(69.01221f, 18.907068f, 77.281586f, 16.08088f, 84.17f, 19.39f),
                    PathNode.LineTo(117.91f, 33.63f),
                    PathNode.LineTo(118.25f, 33.8f),
                    PathNode.CurveTo(121.57184f, 35.458923f, 124.09862f, 38.369503f, 125.274475f, 41.891438f),
                    PathNode.CurveTo(126.450325f, 45.413372f, 126.17893f, 49.258163f, 124.52f, 52.58f),
                    PathNode.LineTo(124.43f, 52.74f),
                    PathNode.LineTo(110.18f, 79.16f),
                    PathNode.CurveTo(109.917694f, 79.70684f, 109.917694f, 80.34316f, 110.18f, 80.89f),
                    PathNode.LineTo(141.96f, 144.89f),
                    PathNode.CurveTo(142.30167f, 145.55869f, 142.98909f, 145.97963f, 143.74f, 145.98f),
                    PathNode.LineTo(208.0f, 145.98f),
                    PathNode.CurveTo(211.71649f, 145.98f, 215.28049f, 147.45773f, 217.90657f, 150.08757f),
                    PathNode.CurveTo(220.53265f, 152.7174f, 222.00531f, 156.28351f, 222.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 160.0f),
                    PathNode.CurveTo(210.0f, 158.89543f, 209.10457f, 158.0f, 208.0f, 158.0f),
                    PathNode.LineTo(143.77f, 158.0f),
                    PathNode.CurveTo(138.46368f, 158.01318f, 133.61005f, 155.01262f, 131.25f, 150.26f),
                    PathNode.LineTo(99.47f, 86.26f),
                    PathNode.CurveTo(97.50663f, 82.32462f, 97.50663f, 77.69537f, 99.47f, 73.76f),
                    PathNode.LineTo(99.56f, 73.59f),
                    PathNode.LineTo(113.81f, 47.17f),
                    PathNode.CurveTo(114.0226f, 46.707993f, 114.0512f, 46.18235f, 113.89f, 45.7f),
                    PathNode.CurveTo(113.73728f, 45.237133f, 113.42079f, 44.84597f, 113.0f, 44.6f),
                    PathNode.LineTo(79.35f, 30.37f),
                    PathNode.LineTo(79.0f, 30.21f),
                    PathNode.CurveTo(78.72353f, 30.072208f, 78.4189f, 30.00033f, 78.11f, 30.0f),
                    PathNode.CurveTo(77.35328f, 29.998508f, 76.66052f, 30.424227f, 76.32f, 31.1f),
                    PathNode.LineTo(54.2f, 75.1f),
                    PathNode.CurveTo(53.921413f, 75.66063f, 53.921413f, 76.31937f, 54.2f, 76.88f),
                    PathNode.LineTo(112.32f, 192.88f),
                    PathNode.CurveTo(112.65773f, 193.55966f, 113.35106f, 193.9896f, 114.11f, 193.99f),
                    PathNode.LineTo(208.0f, 193.99f),
                    PathNode.CurveTo(209.10457f, 193.99f, 210.0f, 193.09457f, 210.0f, 191.99f),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
