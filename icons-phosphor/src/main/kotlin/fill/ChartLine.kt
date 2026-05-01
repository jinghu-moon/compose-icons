package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorFillIcon(
            name = "ChartLine",
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
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.CurveTo(204.41827f, 176.0f, 208.0f, 179.58173f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 188.41827f, 204.41827f, 192.0f, 200.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(51.581722f, 192.0f, 48.0f, 188.41827f, 48.0f, 184.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 67.58172f, 51.581722f, 64.0f, 56.0f, 64.0f),
                    PathNode.CurveTo(60.418278f, 64.0f, 64.0f, 67.58172f, 64.0f, 72.0f),
                    PathNode.LineTo(64.0f, 134.92f),
                    PathNode.LineTo(98.88f, 105.85f),
                    PathNode.CurveTo(101.60207f, 103.58161f, 105.492035f, 103.3741f, 108.44f, 105.34f),
                    PathNode.LineTo(151.44f, 134.03f),
                    PathNode.LineTo(194.85f, 97.85f),
                    PathNode.CurveTo(198.24655f, 95.0223f, 203.2923f, 95.483444f, 206.12f, 98.88f),
                    PathNode.CurveTo(208.9477f, 102.27655f, 208.48656f, 107.3223f, 205.09f, 110.15f),
                    PathNode.LineTo(157.09f, 150.15f),
                    PathNode.CurveTo(154.36792f, 152.4184f, 150.47797f, 152.6259f, 147.53f, 150.66f),
                    PathNode.LineTo(104.53f, 121.97f),
                    PathNode.LineTo(64.0f, 155.75f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
