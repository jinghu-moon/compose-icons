package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorFillIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
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
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(112.536026f, 116.0f, 100.0f, 103.463974f, 100.0f, 88.0f),
                    PathNode.CurveTo(100.0f, 72.536026f, 112.536026f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(143.46397f, 60.0f, 156.0f, 72.536026f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 103.463974f, 143.46397f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(143.46397f, 140.0f, 156.0f, 152.53603f, 156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 183.46397f, 143.46397f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(112.536026f, 196.0f, 100.0f, 183.46397f, 100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 152.53603f, 112.536026f, 140.0f, 128.0f, 140.0f),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
