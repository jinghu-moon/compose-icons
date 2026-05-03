package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorFillIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 152.0f),
                    PathNode.CurveTo(72.0f, 156.41827f, 68.41828f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(59.581722f, 160.0f, 56.0f, 156.41827f, 56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 99.58172f, 59.581722f, 96.0f, 64.0f, 96.0f),
                    PathNode.CurveTo(68.41828f, 96.0f, 72.0f, 99.58172f, 72.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 188.41827f, 100.41828f, 192.0f, 96.0f, 192.0f),
                    PathNode.CurveTo(91.58172f, 192.0f, 88.0f, 188.41827f, 88.0f, 184.0f),
                    PathNode.LineTo(88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 67.58172f, 91.58172f, 64.0f, 96.0f, 64.0f),
                    PathNode.CurveTo(100.41828f, 64.0f, 104.0f, 67.58172f, 104.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 164.41827f, 160.0f, 160.0f, 160.0f),
                    PathNode.CurveTo(155.58173f, 160.0f, 152.0f, 156.41827f, 152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 99.58172f, 155.58173f, 96.0f, 160.0f, 96.0f),
                    PathNode.CurveTo(164.41827f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 164.41827f, 196.41827f, 168.0f, 192.0f, 168.0f),
                    PathNode.CurveTo(187.58173f, 168.0f, 184.0f, 164.41827f, 184.0f, 160.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 91.58172f, 187.58173f, 88.0f, 192.0f, 88.0f),
                    PathNode.CurveTo(196.41827f, 88.0f, 200.0f, 91.58172f, 200.0f, 96.0f),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
