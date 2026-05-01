package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorBoldIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 214.62741f, 222.62741f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(33.37258f, 220.0f, 28.0f, 214.62741f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 137.37259f, 33.37258f, 132.0f, 40.0f, 132.0f),
                    PathNode.CurveTo(46.62742f, 132.0f, 52.0f, 137.37259f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 137.37259f, 209.37259f, 132.0f, 216.0f, 132.0f),
                    PathNode.CurveTo(222.62741f, 132.0f, 228.0f, 137.37259f, 228.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.51f, 152.49f),
                    PathNode.CurveTo(121.76162f, 154.74945f, 124.82018f, 156.01947f, 128.01f, 156.01947f),
                    PathNode.CurveTo(131.19981f, 156.01947f, 134.25838f, 154.74945f, 136.51f, 152.49f),
                    PathNode.LineTo(176.51f, 112.49f),
                    PathNode.CurveTo(181.20442f, 107.79558f, 181.20442f, 100.18442f, 176.51f, 95.49f),
                    PathNode.CurveTo(171.81558f, 90.79558f, 164.20442f, 90.79558f, 159.51f, 95.49f),
                    PathNode.LineTo(140.0f, 115.0f),
                    PathNode.LineTo(140.0f, 32.0f),
                    PathNode.CurveTo(140.0f, 25.372583f, 134.62741f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(121.37258f, 20.0f, 116.0f, 25.372583f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 115.0f),
                    PathNode.LineTo(96.49f, 95.51f),
                    PathNode.CurveTo(91.79558f, 90.81558f, 84.18442f, 90.81558f, 79.49f, 95.51f),
                    PathNode.CurveTo(74.79558f, 100.20442f, 74.79558f, 107.81558f, 79.49f, 112.51f),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
