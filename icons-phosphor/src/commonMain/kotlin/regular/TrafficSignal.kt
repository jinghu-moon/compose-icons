package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorRegularIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(110.32689f, 56.0f, 96.0f, 70.32689f, 96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 105.67311f, 110.32689f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(145.67311f, 120.0f, 160.0f, 105.67311f, 160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 70.32689f, 145.67311f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(119.163445f, 104.0f, 112.0f, 96.836555f, 112.0f, 88.0f),
                    PathNode.CurveTo(112.0f, 79.163445f, 119.163445f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(136.83656f, 72.0f, 144.0f, 79.163445f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 96.836555f, 136.83656f, 104.0f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 150.32689f, 96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 185.67311f, 110.32689f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(145.67311f, 200.0f, 160.0f, 185.67311f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 150.32689f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(119.163445f, 184.0f, 112.0f, 176.83656f, 112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 159.16344f, 119.163445f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(136.83656f, 152.0f, 144.0f, 159.16344f, 144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 176.83656f, 136.83656f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.CurveTo(220.41827f, 80.0f, 224.0f, 76.41828f, 224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 67.58172f, 220.41827f, 64.0f, 216.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 31.163445f, 192.83656f, 24.0f, 184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(35.581722f, 64.0f, 32.0f, 67.58172f, 32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 76.41828f, 35.581722f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(35.581722f, 144.0f, 32.0f, 147.58173f, 32.0f, 152.0f),
                    PathNode.CurveTo(32.0f, 156.41827f, 35.581722f, 160.0f, 40.0f, 160.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 224.83656f, 63.163445f, 232.0f, 72.0f, 232.0f),
                    PathNode.LineTo(184.0f, 232.0f),
                    PathNode.CurveTo(192.83656f, 232.0f, 200.0f, 224.83656f, 200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(220.41827f, 160.0f, 224.0f, 156.41827f, 224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 147.58173f, 220.41827f, 144.0f, 216.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 216.0f),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
