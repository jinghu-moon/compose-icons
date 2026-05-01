package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorRegularIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 43.581722f, 27.581722f, 40.0f, 32.0f, 40.0f),
                    PathNode.CurveTo(36.418278f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 160.0f),
                    PathNode.CurveTo(138.62741f, 160.0f, 144.0f, 154.62741f, 144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 141.37259f, 138.62741f, 136.0f, 132.0f, 136.0f),
                    PathNode.CurveTo(125.37258f, 136.0f, 120.0f, 141.37259f, 120.0f, 148.0f),
                    PathNode.CurveTo(120.0f, 154.62741f, 125.37258f, 160.0f, 132.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 104.0f),
                    PathNode.CurveTo(114.62742f, 104.0f, 120.0f, 98.62742f, 120.0f, 92.0f),
                    PathNode.CurveTo(120.0f, 85.37258f, 114.62742f, 80.0f, 108.0f, 80.0f),
                    PathNode.CurveTo(101.37258f, 80.0f, 96.0f, 85.37258f, 96.0f, 92.0f),
                    PathNode.CurveTo(96.0f, 98.62742f, 101.37258f, 104.0f, 108.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 176.0f),
                    PathNode.CurveTo(82.62742f, 176.0f, 88.0f, 170.62741f, 88.0f, 164.0f),
                    PathNode.CurveTo(88.0f, 157.37259f, 82.62742f, 152.0f, 76.0f, 152.0f),
                    PathNode.CurveTo(69.37258f, 152.0f, 64.0f, 157.37259f, 64.0f, 164.0f),
                    PathNode.CurveTo(64.0f, 170.62741f, 69.37258f, 176.0f, 76.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(178.62741f, 128.0f, 184.0f, 122.62742f, 184.0f, 116.0f),
                    PathNode.CurveTo(184.0f, 109.37258f, 178.62741f, 104.0f, 172.0f, 104.0f),
                    PathNode.CurveTo(165.37259f, 104.0f, 160.0f, 109.37258f, 160.0f, 116.0f),
                    PathNode.CurveTo(160.0f, 122.62742f, 165.37259f, 128.0f, 172.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 88.0f),
                    PathNode.CurveTo(202.62741f, 88.0f, 208.0f, 82.62742f, 208.0f, 76.0f),
                    PathNode.CurveTo(208.0f, 69.37258f, 202.62741f, 64.0f, 196.0f, 64.0f),
                    PathNode.CurveTo(189.37259f, 64.0f, 184.0f, 69.37258f, 184.0f, 76.0f),
                    PathNode.CurveTo(184.0f, 82.62742f, 189.37259f, 88.0f, 196.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 164.0f),
                    PathNode.CurveTo(176.0f, 170.62741f, 181.37259f, 176.0f, 188.0f, 176.0f),
                    PathNode.CurveTo(194.62741f, 176.0f, 200.0f, 170.62741f, 200.0f, 164.0f),
                    PathNode.CurveTo(200.0f, 157.37259f, 194.62741f, 152.0f, 188.0f, 152.0f),
                    PathNode.CurveTo(181.37259f, 152.0f, 176.0f, 157.37259f, 176.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
