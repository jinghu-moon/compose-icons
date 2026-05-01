package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorBoldIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(25.372583f, 220.0f, 20.0f, 214.62741f, 20.0f, 208.0f),
                    PathNode.LineTo(20.0f, 48.0f),
                    PathNode.CurveTo(20.0f, 41.37258f, 25.372583f, 36.0f, 32.0f, 36.0f),
                    PathNode.CurveTo(38.62742f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 201.37259f, 236.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 148.0f),
                    PathNode.CurveTo(116.0f, 156.83656f, 123.163445f, 164.0f, 132.0f, 164.0f),
                    PathNode.CurveTo(140.83656f, 164.0f, 148.0f, 156.83656f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 139.16344f, 140.83656f, 132.0f, 132.0f, 132.0f),
                    PathNode.CurveTo(123.163445f, 132.0f, 116.0f, 139.16344f, 116.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 108.0f),
                    PathNode.CurveTo(116.836555f, 108.0f, 124.0f, 100.836555f, 124.0f, 92.0f),
                    PathNode.CurveTo(124.0f, 83.163445f, 116.836555f, 76.0f, 108.0f, 76.0f),
                    PathNode.CurveTo(99.163445f, 76.0f, 92.0f, 83.163445f, 92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 100.836555f, 99.163445f, 108.0f, 108.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 180.0f),
                    PathNode.CurveTo(84.836555f, 180.0f, 92.0f, 172.83656f, 92.0f, 164.0f),
                    PathNode.CurveTo(92.0f, 155.16344f, 84.836555f, 148.0f, 76.0f, 148.0f),
                    PathNode.CurveTo(67.163445f, 148.0f, 60.0f, 155.16344f, 60.0f, 164.0f),
                    PathNode.CurveTo(60.0f, 172.83656f, 67.163445f, 180.0f, 76.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 132.0f),
                    PathNode.CurveTo(180.83656f, 132.0f, 188.0f, 124.836555f, 188.0f, 116.0f),
                    PathNode.CurveTo(188.0f, 107.163445f, 180.83656f, 100.0f, 172.0f, 100.0f),
                    PathNode.CurveTo(163.16344f, 100.0f, 156.0f, 107.163445f, 156.0f, 116.0f),
                    PathNode.CurveTo(156.0f, 124.836555f, 163.16344f, 132.0f, 172.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 92.0f),
                    PathNode.CurveTo(204.83656f, 92.0f, 212.0f, 84.836555f, 212.0f, 76.0f),
                    PathNode.CurveTo(212.0f, 67.163445f, 204.83656f, 60.0f, 196.0f, 60.0f),
                    PathNode.CurveTo(187.16344f, 60.0f, 180.0f, 67.163445f, 180.0f, 76.0f),
                    PathNode.CurveTo(180.0f, 84.836555f, 187.16344f, 92.0f, 196.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.CurveTo(172.0f, 172.83656f, 179.16344f, 180.0f, 188.0f, 180.0f),
                    PathNode.CurveTo(196.83656f, 180.0f, 204.0f, 172.83656f, 204.0f, 164.0f),
                    PathNode.CurveTo(204.0f, 155.16344f, 196.83656f, 148.0f, 188.0f, 148.0f),
                    PathNode.CurveTo(179.16344f, 148.0f, 172.0f, 155.16344f, 172.0f, 164.0f),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
