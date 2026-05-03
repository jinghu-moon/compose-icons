package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorFillIcon(
            name = "ChartLineDown",
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
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(51.581722f, 192.0f, 48.0f, 188.41827f, 48.0f, 184.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 67.58172f, 51.581722f, 64.0f, 56.0f, 64.0f),
                    PathNode.CurveTo(60.418278f, 64.0f, 64.0f, 67.58172f, 64.0f, 72.0f),
                    PathNode.LineTo(64.0f, 92.69f),
                    PathNode.LineTo(96.0f, 124.69f),
                    PathNode.LineTo(130.34f, 90.34f),
                    PathNode.CurveTo(131.84055f, 88.83778f, 133.87672f, 87.993706f, 136.0f, 87.993706f),
                    PathNode.CurveTo(138.12328f, 87.993706f, 140.15945f, 88.83778f, 141.66f, 90.34f),
                    PathNode.LineTo(176.0f, 124.69f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 99.58172f, 179.58173f, 96.0f, 184.0f, 96.0f),
                    PathNode.CurveTo(188.41827f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(192.0f, 148.41827f, 188.41827f, 152.0f, 184.0f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(139.58173f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 139.58173f, 139.58173f, 136.0f, 144.0f, 136.0f),
                    PathNode.LineTo(164.69f, 136.0f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(101.66f, 141.66f),
                    PathNode.CurveTo(100.159454f, 143.16223f, 98.123276f, 144.00629f, 96.0f, 144.00629f),
                    PathNode.CurveTo(93.876724f, 144.00629f, 91.840546f, 143.16223f, 90.34f, 141.66f),
                    PathNode.LineTo(64.0f, 115.31f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(204.41827f, 176.0f, 208.0f, 179.58173f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 188.41827f, 204.41827f, 192.0f, 200.0f, 192.0f),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
