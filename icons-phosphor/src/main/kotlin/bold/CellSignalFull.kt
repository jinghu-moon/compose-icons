package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorBoldIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 72.0f),
                    PathNode.LineTo(172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 206.62741f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.CurveTo(153.37259f, 212.0f, 148.0f, 206.62741f, 148.0f, 200.0f),
                    PathNode.LineTo(148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 65.37258f, 153.37259f, 60.0f, 160.0f, 60.0f),
                    PathNode.CurveTo(166.62741f, 60.0f, 172.0f, 65.37258f, 172.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.CurveTo(193.37259f, 20.0f, 188.0f, 25.372583f, 188.0f, 32.0f),
                    PathNode.LineTo(188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 206.62741f, 193.37259f, 212.0f, 200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 32.0f),
                    PathNode.CurveTo(212.0f, 25.372583f, 206.62741f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 100.0f),
                    PathNode.CurveTo(113.37258f, 100.0f, 108.0f, 105.37258f, 108.0f, 112.0f),
                    PathNode.LineTo(108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 206.62741f, 113.37258f, 212.0f, 120.0f, 212.0f),
                    PathNode.CurveTo(126.62742f, 212.0f, 132.0f, 206.62741f, 132.0f, 200.0f),
                    PathNode.LineTo(132.0f, 112.0f),
                    PathNode.CurveTo(132.0f, 105.37258f, 126.62742f, 100.0f, 120.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 140.0f),
                    PathNode.CurveTo(73.37258f, 140.0f, 68.0f, 145.37259f, 68.0f, 152.0f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 206.62741f, 73.37258f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(86.62742f, 212.0f, 92.0f, 206.62741f, 92.0f, 200.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 145.37259f, 86.62742f, 140.0f, 80.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.CurveTo(46.62742f, 212.0f, 52.0f, 206.62741f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 185.37259f, 46.62742f, 180.0f, 40.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
