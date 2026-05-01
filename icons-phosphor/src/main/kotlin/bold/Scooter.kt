package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorBoldIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 132.0f),
                    PathNode.LineTo(211.32f, 132.0f),
                    PathNode.LineTo(179.38f, 36.21f),
                    PathNode.CurveTo(177.74876f, 31.30949f, 173.16487f, 28.002487f, 168.0f, 28.0f),
                    PathNode.LineTo(136.0f, 28.0f),
                    PathNode.CurveTo(129.37259f, 28.0f, 124.0f, 33.37258f, 124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 46.62742f, 129.37259f, 52.0f, 136.0f, 52.0f),
                    PathNode.LineTo(159.35f, 52.0f),
                    PathNode.LineTo(174.18f, 96.49f),
                    PathNode.LineTo(114.59f, 164.0f),
                    PathNode.LineTo(83.2f, 164.0f),
                    PathNode.CurveTo(79.267654f, 144.66174f, 61.819626f, 131.08096f, 42.107754f, 132.0156f),
                    PathNode.CurveTo(22.395882f, 132.95021f, 6.311086f, 148.12093f, 4.226083f, 167.74449f),
                    PathNode.CurveTo(2.141079f, 187.36806f, 14.678975f, 205.57993f, 33.754368f, 210.6357f),
                    PathNode.CurveTo(52.829758f, 215.69147f, 72.74194f, 206.08022f, 80.65f, 188.0f),
                    PathNode.LineTo(120.0f, 188.0f),
                    PathNode.CurveTo(123.44357f, 188.0007f, 126.721504f, 186.52199f, 129.0f, 183.94f),
                    PathNode.LineTo(183.0f, 122.81f),
                    PathNode.LineTo(188.6f, 139.62f),
                    PathNode.CurveTo(172.66353f, 151.1786f, 167.50697f, 172.61472f, 176.44315f, 190.15657f),
                    PathNode.CurveTo(185.37933f, 207.69843f, 205.75108f, 216.12988f, 224.47041f, 210.0341f),
                    PathNode.CurveTo(243.18974f, 203.93832f, 254.69041f, 185.12788f, 251.58372f, 165.68771f),
                    PathNode.CurveTo(248.47705f, 146.24754f, 231.6868f, 131.9582f, 212.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 188.0f),
                    PathNode.CurveTo(35.163445f, 188.0f, 28.0f, 180.83656f, 28.0f, 172.0f),
                    PathNode.CurveTo(28.0f, 163.16344f, 35.163445f, 156.0f, 44.0f, 156.0f),
                    PathNode.CurveTo(52.836555f, 156.0f, 60.0f, 163.16344f, 60.0f, 172.0f),
                    PathNode.CurveTo(60.0f, 180.83656f, 52.836555f, 188.0f, 44.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 188.0f),
                    PathNode.CurveTo(203.16344f, 188.0f, 196.0f, 180.83656f, 196.0f, 172.0f),
                    PathNode.CurveTo(196.0f, 163.16344f, 203.16344f, 156.0f, 212.0f, 156.0f),
                    PathNode.CurveTo(220.83656f, 156.0f, 228.0f, 163.16344f, 228.0f, 172.0f),
                    PathNode.CurveTo(228.0f, 180.83656f, 220.83656f, 188.0f, 212.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
