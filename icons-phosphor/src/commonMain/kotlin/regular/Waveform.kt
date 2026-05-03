package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorRegularIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.0f, 164.41827f, 52.418278f, 168.0f, 48.0f, 168.0f),
                    PathNode.CurveTo(43.581722f, 168.0f, 40.0f, 164.41827f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 91.58172f, 43.581722f, 88.0f, 48.0f, 88.0f),
                    PathNode.CurveTo(52.418278f, 88.0f, 56.0f, 91.58172f, 56.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 24.0f),
                    PathNode.CurveTo(83.58172f, 24.0f, 80.0f, 27.581722f, 80.0f, 32.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 228.41827f, 83.58172f, 232.0f, 88.0f, 232.0f),
                    PathNode.CurveTo(92.41828f, 232.0f, 96.0f, 228.41827f, 96.0f, 224.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(96.0f, 27.581722f, 92.41828f, 24.0f, 88.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(123.58172f, 56.0f, 120.0f, 59.581722f, 120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 196.41827f, 123.58172f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 196.41827f, 136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 59.581722f, 132.41827f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 88.0f),
                    PathNode.CurveTo(163.58173f, 88.0f, 160.0f, 91.58172f, 160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 164.41827f, 163.58173f, 168.0f, 168.0f, 168.0f),
                    PathNode.CurveTo(172.41827f, 168.0f, 176.0f, 164.41827f, 176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 91.58172f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 72.0f),
                    PathNode.CurveTo(203.58173f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 180.41827f, 203.58173f, 184.0f, 208.0f, 184.0f),
                    PathNode.CurveTo(212.41827f, 184.0f, 216.0f, 180.41827f, 216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 75.58172f, 212.41827f, 72.0f, 208.0f, 72.0f),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
