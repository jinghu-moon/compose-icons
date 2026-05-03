package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorFillIcon(
            name = "ChartScatter",
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
                    PathNode.MoveTo(188.0f, 72.0f),
                    PathNode.CurveTo(194.62741f, 72.0f, 200.0f, 77.37258f, 200.0f, 84.0f),
                    PathNode.CurveTo(200.0f, 90.62742f, 194.62741f, 96.0f, 188.0f, 96.0f),
                    PathNode.CurveTo(181.37259f, 96.0f, 176.0f, 90.62742f, 176.0f, 84.0f),
                    PathNode.CurveTo(176.0f, 77.37258f, 181.37259f, 72.0f, 188.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 128.0f),
                    PathNode.CurveTo(194.62741f, 128.0f, 200.0f, 133.37259f, 200.0f, 140.0f),
                    PathNode.CurveTo(200.0f, 146.62741f, 194.62741f, 152.0f, 188.0f, 152.0f),
                    PathNode.CurveTo(181.37259f, 152.0f, 176.0f, 146.62741f, 176.0f, 140.0f),
                    PathNode.CurveTo(176.0f, 133.37259f, 181.37259f, 128.0f, 188.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 112.0f),
                    PathNode.CurveTo(154.62741f, 112.0f, 160.0f, 117.37258f, 160.0f, 124.0f),
                    PathNode.CurveTo(160.0f, 130.62741f, 154.62741f, 136.0f, 148.0f, 136.0f),
                    PathNode.CurveTo(141.37259f, 136.0f, 136.0f, 130.62741f, 136.0f, 124.0f),
                    PathNode.CurveTo(136.0f, 117.37258f, 141.37259f, 112.0f, 148.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 72.0f),
                    PathNode.CurveTo(130.62741f, 72.0f, 136.0f, 77.37258f, 136.0f, 84.0f),
                    PathNode.CurveTo(136.0f, 90.62742f, 130.62741f, 96.0f, 124.0f, 96.0f),
                    PathNode.CurveTo(117.37258f, 96.0f, 112.0f, 90.62742f, 112.0f, 84.0f),
                    PathNode.CurveTo(112.0f, 77.37258f, 117.37258f, 72.0f, 124.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 128.0f),
                    PathNode.CurveTo(106.62742f, 128.0f, 112.0f, 133.37259f, 112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 146.62741f, 106.62742f, 152.0f, 100.0f, 152.0f),
                    PathNode.CurveTo(93.37258f, 152.0f, 88.0f, 146.62741f, 88.0f, 140.0f),
                    PathNode.CurveTo(88.0f, 133.37259f, 93.37258f, 128.0f, 100.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(51.581722f, 192.0f, 48.0f, 188.41827f, 48.0f, 184.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 67.58172f, 51.581722f, 64.0f, 56.0f, 64.0f),
                    PathNode.CurveTo(60.418278f, 64.0f, 64.0f, 67.58172f, 64.0f, 72.0f),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
