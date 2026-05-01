package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorFillIcon(
            name = "ChartLineUp",
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
                    PathNode.LineTo(64.0f, 148.69f),
                    PathNode.LineTo(98.34f, 114.34f),
                    PathNode.CurveTo(99.840546f, 112.83778f, 101.876724f, 111.993706f, 104.0f, 111.993706f),
                    PathNode.CurveTo(106.123276f, 111.993706f, 108.159454f, 112.83778f, 109.66f, 114.34f),
                    PathNode.LineTo(128.0f, 132.69f),
                    PathNode.LineTo(172.69f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(139.58173f, 88.0f, 136.0f, 84.41828f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 75.58172f, 139.58173f, 72.0f, 144.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 132.41827f, 196.41827f, 136.0f, 192.0f, 136.0f),
                    PathNode.CurveTo(187.58173f, 136.0f, 184.0f, 132.41827f, 184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 99.31f),
                    PathNode.LineTo(133.66f, 149.66f),
                    PathNode.CurveTo(132.15945f, 151.16223f, 130.12328f, 152.00629f, 128.0f, 152.00629f),
                    PathNode.CurveTo(125.876724f, 152.00629f, 123.840546f, 151.16223f, 122.34f, 149.66f),
                    PathNode.LineTo(104.0f, 131.31f),
                    PathNode.LineTo(64.0f, 171.31f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(204.41827f, 176.0f, 208.0f, 179.58173f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 188.41827f, 204.41827f, 192.0f, 200.0f, 192.0f),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
