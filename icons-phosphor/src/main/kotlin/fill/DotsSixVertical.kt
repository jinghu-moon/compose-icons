package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorFillIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 16.0f),
                    PathNode.LineTo(64.0f, 16.0f),
                    PathNode.CurveTo(55.163445f, 16.0f, 48.0f, 23.163445f, 48.0f, 32.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(48.0f, 232.83656f, 55.163445f, 240.0f, 64.0f, 240.0f),
                    PathNode.LineTo(192.0f, 240.0f),
                    PathNode.CurveTo(200.83656f, 240.0f, 208.0f, 232.83656f, 208.0f, 224.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 23.163445f, 200.83656f, 16.0f, 192.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 200.0f),
                    PathNode.CurveTo(93.37258f, 200.0f, 88.0f, 194.62741f, 88.0f, 188.0f),
                    PathNode.CurveTo(88.0f, 181.37259f, 93.37258f, 176.0f, 100.0f, 176.0f),
                    PathNode.CurveTo(106.62742f, 176.0f, 112.0f, 181.37259f, 112.0f, 188.0f),
                    PathNode.CurveTo(112.0f, 194.62741f, 106.62742f, 200.0f, 100.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 140.0f),
                    PathNode.CurveTo(93.37258f, 140.0f, 88.0f, 134.62741f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 121.37258f, 93.37258f, 116.0f, 100.0f, 116.0f),
                    PathNode.CurveTo(106.62742f, 116.0f, 112.0f, 121.37258f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 134.62741f, 106.62742f, 140.0f, 100.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 80.0f),
                    PathNode.CurveTo(93.37258f, 80.0f, 88.0f, 74.62742f, 88.0f, 68.0f),
                    PathNode.CurveTo(88.0f, 61.37258f, 93.37258f, 56.0f, 100.0f, 56.0f),
                    PathNode.CurveTo(106.62742f, 56.0f, 112.0f, 61.37258f, 112.0f, 68.0f),
                    PathNode.CurveTo(112.0f, 74.62742f, 106.62742f, 80.0f, 100.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 200.0f),
                    PathNode.CurveTo(149.37259f, 200.0f, 144.0f, 194.62741f, 144.0f, 188.0f),
                    PathNode.CurveTo(144.0f, 181.37259f, 149.37259f, 176.0f, 156.0f, 176.0f),
                    PathNode.CurveTo(162.62741f, 176.0f, 168.0f, 181.37259f, 168.0f, 188.0f),
                    PathNode.CurveTo(168.0f, 194.62741f, 162.62741f, 200.0f, 156.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 140.0f),
                    PathNode.CurveTo(149.37259f, 140.0f, 144.0f, 134.62741f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 121.37258f, 149.37259f, 116.0f, 156.0f, 116.0f),
                    PathNode.CurveTo(162.62741f, 116.0f, 168.0f, 121.37258f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 134.62741f, 162.62741f, 140.0f, 156.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 80.0f),
                    PathNode.CurveTo(149.37259f, 80.0f, 144.0f, 74.62742f, 144.0f, 68.0f),
                    PathNode.CurveTo(144.0f, 61.37258f, 149.37259f, 56.0f, 156.0f, 56.0f),
                    PathNode.CurveTo(162.62741f, 56.0f, 168.0f, 61.37258f, 168.0f, 68.0f),
                    PathNode.CurveTo(168.0f, 74.62742f, 162.62741f, 80.0f, 156.0f, 80.0f),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
