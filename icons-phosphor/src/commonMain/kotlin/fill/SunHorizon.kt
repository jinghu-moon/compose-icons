package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorFillIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.CurveTo(248.0f, 164.41827f, 244.41827f, 168.0f, 240.0f, 168.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(11.581722f, 168.0f, 8.0f, 164.41827f, 8.0f, 160.0f),
                    PathNode.CurveTo(8.0f, 155.58173f, 11.581722f, 152.0f, 16.0f, 152.0f),
                    PathNode.LineTo(56.45f, 152.0f),
                    PathNode.CurveTo(56.154728f, 149.34349f, 56.004505f, 146.67287f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 104.2355f, 88.2355f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(167.7645f, 72.0f, 200.0f, 104.2355f, 200.0f, 144.0f),
                    PathNode.CurveTo(199.9955f, 146.67287f, 199.84528f, 149.34349f, 199.55f, 152.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(244.41827f, 152.0f, 248.0f, 155.58173f, 248.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(43.581722f, 192.0f, 40.0f, 195.58173f, 40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 43.581722f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(212.41827f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 195.58173f, 212.41827f, 192.0f, 208.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.84f, 59.58f),
                    PathNode.CurveTo(82.81718f, 63.53436f, 87.62564f, 65.13718f, 91.58f, 63.16f),
                    PathNode.CurveTo(95.534355f, 61.18282f, 97.13718f, 56.37436f, 95.16f, 52.42f),
                    PathNode.LineTo(87.16f, 36.42f),
                    PathNode.CurveTo(85.18282f, 32.46564f, 80.37436f, 30.86282f, 76.42f, 32.84f),
                    PathNode.CurveTo(72.465645f, 34.81718f, 70.86282f, 39.62564f, 72.84f, 43.58f),
                    PathNode.Close,
                    PathNode.MoveTo(20.42f, 103.16f),
                    PathNode.LineTo(36.42f, 111.16f),
                    PathNode.CurveTo(40.371597f, 113.13718f, 45.177822f, 111.5366f, 47.155f, 107.585f),
                    PathNode.CurveTo(49.13218f, 103.6334f, 47.531597f, 98.82718f, 43.58f, 96.85f),
                    PathNode.LineTo(27.58f, 88.85f),
                    PathNode.CurveTo(23.628403f, 86.87282f, 18.82218f, 88.4734f, 16.845f, 92.425f),
                    PathNode.CurveTo(14.867821f, 96.376595f, 16.468403f, 101.18282f, 20.42f, 103.16f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 112.0f),
                    PathNode.CurveTo(217.239f, 112.00023f, 218.4611f, 111.71267f, 219.57f, 111.16f),
                    PathNode.LineTo(235.57f, 103.16f),
                    PathNode.CurveTo(239.52159f, 101.18282f, 241.12218f, 96.376595f, 239.145f, 92.425f),
                    PathNode.CurveTo(237.16783f, 88.4734f, 232.3616f, 86.87282f, 228.41f, 88.85f),
                    PathNode.LineTo(212.41f, 96.85f),
                    PathNode.CurveTo(209.09576f, 98.51339f, 207.35905f, 102.23631f, 208.2141f, 105.84463f),
                    PathNode.CurveTo(209.06914f, 109.45294f, 212.29176f, 112.00069f, 216.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.42f, 63.16f),
                    PathNode.CurveTo(166.31871f, 64.11088f, 168.51758f, 64.26785f, 170.5321f, 63.596344f),
                    PathNode.CurveTo(172.54665f, 62.92483f, 174.21155f, 61.47993f, 175.16f, 59.58f),
                    PathNode.LineTo(183.16f, 43.58f),
                    PathNode.CurveTo(185.13718f, 39.62564f, 183.53436f, 34.81718f, 179.58f, 32.84f),
                    PathNode.CurveTo(175.62564f, 30.86282f, 170.81718f, 32.46564f, 168.84f, 36.42f),
                    PathNode.LineTo(160.84f, 52.42f),
                    PathNode.CurveTo(159.88911f, 54.318714f, 159.73215f, 56.51758f, 160.40367f, 58.532116f),
                    PathNode.CurveTo(161.07516f, 60.546646f, 162.52007f, 62.211555f, 164.42f, 63.16f),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
