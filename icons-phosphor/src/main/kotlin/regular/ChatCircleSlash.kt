package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorRegularIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(52.33f, 56.66f),
                    PathNode.CurveTo(21.732185f, 89.12799f, 15.235644f, 137.48799f, 36.18f, 176.88f),
                    PathNode.LineTo(24.83f, 210.93f),
                    PathNode.CurveTo(22.912483f, 216.67986f, 24.408623f, 223.0196f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(32.980404f, 231.59138f, 39.320145f, 233.08752f, 45.07f, 231.17f),
                    PathNode.LineTo(79.12f, 219.82f),
                    PathNode.CurveTo(115.320045f, 239.07697f, 159.45613f, 235.26646f, 191.82f, 210.09f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(112.52978f, 216.01053f, 97.33097f, 211.93658f, 83.94f, 204.19f),
                    PathNode.CurveTo(81.95523f, 203.0432f, 79.57388f, 202.80286f, 77.4f, 203.53f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(52.47f, 178.6f),
                    PathNode.CurveTo(53.19712f, 176.42612f, 52.956802f, 174.04477f, 51.81f, 172.06f),
                    PathNode.CurveTo(32.572765f, 138.78214f, 37.160057f, 96.86896f, 63.14f, 68.54f),
                    PathNode.LineTo(181.0f, 198.23f),
                    PathNode.CurveTo(165.74213f, 209.77122f, 147.1312f, 216.01115f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00012f, 145.18668f, 227.74704f, 162.10626f, 219.62f, 177.25f),
                    PathNode.CurveTo(217.50824f, 181.10327f, 212.68394f, 182.5321f, 208.81438f, 180.4504f),
                    PathNode.CurveTo(204.94481f, 178.36868f, 203.47845f, 173.55565f, 205.53f, 169.67f),
                    PathNode.CurveTo(223.21786f, 136.81259f, 218.25946f, 96.37202f, 193.15756f, 68.76106f),
                    PathNode.CurveTo(168.05568f, 41.15011f, 128.26889f, 32.37297f, 93.88f, 46.86f),
                    PathNode.CurveTo(89.80691f, 48.574844f, 85.114845f, 46.6631f, 83.4f, 42.59f),
                    PathNode.CurveTo(81.68516f, 38.5169f, 83.5969f, 33.824844f, 87.67f, 32.11f),
                    PathNode.CurveTo(119.78548f, 18.631498f, 156.51462f, 22.113787f, 185.52486f, 41.387608f),
                    PathNode.CurveTo(214.53506f, 60.66143f, 231.9792f, 93.1708f, 232.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
