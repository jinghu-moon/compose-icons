package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorDuotoneIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 184.0f),
                    PathNode.CurveTo(79.163445f, 184.0f, 72.0f, 176.83656f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 159.16344f, 79.163445f, 152.0f, 88.0f, 152.0f),
                    PathNode.CurveTo(96.836555f, 152.0f, 104.0f, 159.16344f, 104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 176.83656f, 96.836555f, 184.0f, 88.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 120.0f),
                    PathNode.CurveTo(159.16344f, 120.0f, 152.0f, 112.836555f, 152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 95.163445f, 159.16344f, 88.0f, 168.0f, 88.0f),
                    PathNode.CurveTo(176.83656f, 88.0f, 184.0f, 95.163445f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 112.836555f, 176.83656f, 120.0f, 168.0f, 120.0f),
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
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 160.0f),
                    PathNode.CurveTo(92.41828f, 160.0f, 96.0f, 163.58173f, 96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 172.41827f, 92.41828f, 176.0f, 88.0f, 176.0f),
                    PathNode.CurveTo(83.58172f, 176.0f, 80.0f, 172.41827f, 80.0f, 168.0f),
                    PathNode.CurveTo(80.0f, 163.58173f, 83.58172f, 160.0f, 88.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 145.38f),
                    PathNode.CurveTo(68.97963f, 149.27629f, 62.369022f, 160.54533f, 64.345634f, 172.06586f),
                    PathNode.CurveTo(66.32224f, 183.5864f, 76.31113f, 192.0074f, 88.0f, 192.0074f),
                    PathNode.CurveTo(99.68887f, 192.0074f, 109.67776f, 183.5864f, 111.654366f, 172.06586f),
                    PathNode.CurveTo(113.630974f, 160.54533f, 107.02037f, 149.27629f, 96.0f, 145.38f),
                    PathNode.LineTo(96.0f, 115.31f),
                    PathNode.LineTo(144.0f, 163.31f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(160.00166f, 157.87762f, 159.15993f, 155.84158f, 157.66f, 154.34f),
                    PathNode.LineTo(96.0f, 92.69f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.CurveTo(127.99833f, 74.12237f, 128.84009f, 76.158424f, 130.34f, 77.66f),
                    PathNode.LineTo(146.34f, 93.66f),
                    PathNode.CurveTo(144.79056f, 96.886215f, 143.9906f, 100.42101f, 144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 117.25484f, 154.74516f, 128.0f, 168.0f, 128.0f),
                    PathNode.CurveTo(181.25484f, 128.0f, 192.0f, 117.25484f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 90.74516f, 181.25484f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(164.42024f, 79.99373f, 160.8854f, 80.7971f, 157.66f, 82.35f),
                    PathNode.LineTo(144.0f, 68.69f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(163.58173f, 112.0f, 160.0f, 108.41828f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 99.58172f, 163.58173f, 96.0f, 168.0f, 96.0f),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
