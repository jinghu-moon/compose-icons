package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorBoldIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.0f, 96.0f),
                    PathNode.LineTo(60.0f, 160.0f),
                    PathNode.CurveTo(60.0f, 166.62741f, 54.62742f, 172.0f, 48.0f, 172.0f),
                    PathNode.CurveTo(41.37258f, 172.0f, 36.0f, 166.62741f, 36.0f, 160.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 89.37258f, 41.37258f, 84.0f, 48.0f, 84.0f),
                    PathNode.CurveTo(54.62742f, 84.0f, 60.0f, 89.37258f, 60.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 20.0f),
                    PathNode.CurveTo(81.37258f, 20.0f, 76.0f, 25.372583f, 76.0f, 32.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 230.62741f, 81.37258f, 236.0f, 88.0f, 236.0f),
                    PathNode.CurveTo(94.62742f, 236.0f, 100.0f, 230.62741f, 100.0f, 224.0f),
                    PathNode.LineTo(100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 25.372583f, 94.62742f, 20.0f, 88.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 52.0f),
                    PathNode.CurveTo(121.37258f, 52.0f, 116.0f, 57.37258f, 116.0f, 64.0f),
                    PathNode.LineTo(116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 198.62741f, 121.37258f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(134.62741f, 204.0f, 140.0f, 198.62741f, 140.0f, 192.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 57.37258f, 134.62741f, 52.0f, 128.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 84.0f),
                    PathNode.CurveTo(161.37259f, 84.0f, 156.0f, 89.37258f, 156.0f, 96.0f),
                    PathNode.LineTo(156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 166.62741f, 161.37259f, 172.0f, 168.0f, 172.0f),
                    PathNode.CurveTo(174.62741f, 172.0f, 180.0f, 166.62741f, 180.0f, 160.0f),
                    PathNode.LineTo(180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 89.37258f, 174.62741f, 84.0f, 168.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 68.0f),
                    PathNode.CurveTo(201.37259f, 68.0f, 196.0f, 73.37258f, 196.0f, 80.0f),
                    PathNode.LineTo(196.0f, 176.0f),
                    PathNode.CurveTo(196.0f, 182.62741f, 201.37259f, 188.0f, 208.0f, 188.0f),
                    PathNode.CurveTo(214.62741f, 188.0f, 220.0f, 182.62741f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 73.37258f, 214.62741f, 68.0f, 208.0f, 68.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveform!!
    }

private var _waveform: ImageVector? = null
