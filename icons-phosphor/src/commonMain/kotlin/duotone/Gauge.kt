package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorDuotoneIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 180.41827f, 228.41827f, 184.0f, 224.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 153.13f),
                    PathNode.CurveTo(24.0f, 95.65f, 70.15f, 48.2f, 127.63f, 48.0f),
                    PathNode.CurveTo(155.27657f, 47.90164f, 181.82452f, 58.815315f, 201.4084f, 78.32977f),
                    PathNode.CurveTo(220.9923f, 97.84422f, 232.00015f, 124.35326f, 232.0f, 152.0f),
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
                    PathNode.MoveTo(207.06f, 72.67f),
                    PathNode.CurveTo(186.11475f, 51.677334f, 157.6545f, 39.91668f, 128.0f, 40.0f),
                    PathNode.LineTo(127.6f, 40.0f),
                    PathNode.CurveTo(66.07f, 40.21f, 16.0f, 91.0f, 16.0f, 153.13f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 184.83656f, 23.163445f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(232.83656f, 192.0f, 240.0f, 184.83656f, 240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(240.08298f, 122.213196f, 228.21744f, 93.63721f, 207.06f, 72.67f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.LineTo(119.71f, 176.0f),
                    PathNode.LineTo(174.47f, 100.7f),
                    PathNode.CurveTo(177.07126f, 97.12672f, 176.28328f, 92.12126f, 172.71f, 89.52f),
                    PathNode.CurveTo(169.13672f, 86.91874f, 164.13127f, 87.70672f, 161.53f, 91.28f),
                    PathNode.LineTo(99.92f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 153.13f),
                    PathNode.CurveTo(32.0f, 150.05f, 32.15f, 147.01f, 32.43f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(60.418278f, 144.0f, 64.0f, 140.41827f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 131.58173f, 60.418278f, 128.0f, 56.0f, 128.0f),
                    PathNode.LineTo(35.27f, 128.0f),
                    PathNode.CurveTo(45.59f, 89.14f, 79.27f, 59.76f, 120.0f, 56.34f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 84.41828f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 84.41828f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 56.33f),
                    PathNode.CurveTo(176.67508f, 59.753036f, 210.75438f, 88.48791f, 221.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(195.58173f, 128.0f, 192.0f, 131.58173f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 140.41827f, 195.58173f, 144.0f, 200.0f, 144.0f),
                    PathNode.LineTo(223.67f, 144.0f),
                    PathNode.CurveTo(223.88f, 146.65f, 224.0f, 149.31f, 224.0f, 152.0f),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
