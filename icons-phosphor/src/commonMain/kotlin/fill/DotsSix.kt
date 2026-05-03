package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorFillIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 168.0f),
                    PathNode.CurveTo(61.37258f, 168.0f, 56.0f, 162.62741f, 56.0f, 156.0f),
                    PathNode.CurveTo(56.0f, 149.37259f, 61.37258f, 144.0f, 68.0f, 144.0f),
                    PathNode.CurveTo(74.62742f, 144.0f, 80.0f, 149.37259f, 80.0f, 156.0f),
                    PathNode.CurveTo(80.0f, 162.62741f, 74.62742f, 168.0f, 68.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 112.0f),
                    PathNode.CurveTo(61.37258f, 112.0f, 56.0f, 106.62742f, 56.0f, 100.0f),
                    PathNode.CurveTo(56.0f, 93.37258f, 61.37258f, 88.0f, 68.0f, 88.0f),
                    PathNode.CurveTo(74.62742f, 88.0f, 80.0f, 93.37258f, 80.0f, 100.0f),
                    PathNode.CurveTo(80.0f, 106.62742f, 74.62742f, 112.0f, 68.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(121.37258f, 168.0f, 116.0f, 162.62741f, 116.0f, 156.0f),
                    PathNode.CurveTo(116.0f, 149.37259f, 121.37258f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(134.62741f, 144.0f, 140.0f, 149.37259f, 140.0f, 156.0f),
                    PathNode.CurveTo(140.0f, 162.62741f, 134.62741f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(121.37258f, 112.0f, 116.0f, 106.62742f, 116.0f, 100.0f),
                    PathNode.CurveTo(116.0f, 93.37258f, 121.37258f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(134.62741f, 88.0f, 140.0f, 93.37258f, 140.0f, 100.0f),
                    PathNode.CurveTo(140.0f, 106.62742f, 134.62741f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 168.0f),
                    PathNode.CurveTo(181.37259f, 168.0f, 176.0f, 162.62741f, 176.0f, 156.0f),
                    PathNode.CurveTo(176.0f, 149.37259f, 181.37259f, 144.0f, 188.0f, 144.0f),
                    PathNode.CurveTo(194.62741f, 144.0f, 200.0f, 149.37259f, 200.0f, 156.0f),
                    PathNode.CurveTo(200.0f, 162.62741f, 194.62741f, 168.0f, 188.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 112.0f),
                    PathNode.CurveTo(181.37259f, 112.0f, 176.0f, 106.62742f, 176.0f, 100.0f),
                    PathNode.CurveTo(176.0f, 93.37258f, 181.37259f, 88.0f, 188.0f, 88.0f),
                    PathNode.CurveTo(194.62741f, 88.0f, 200.0f, 93.37258f, 200.0f, 100.0f),
                    PathNode.CurveTo(200.0f, 106.62742f, 194.62741f, 112.0f, 188.0f, 112.0f),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
