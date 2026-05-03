package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorRegularIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 88.0f),
                    PathNode.LineTo(230.47f, 88.0f),
                    PathNode.LineTo(221.18f, 44.65f),
                    PathNode.CurveTo(219.57243f, 37.286842f, 213.06654f, 32.028095f, 205.53f, 32.0f),
                    PathNode.LineTo(50.47f, 32.0f),
                    PathNode.CurveTo(42.93345f, 32.028095f, 36.42757f, 37.286842f, 34.82f, 44.65f),
                    PathNode.LineTo(25.53f, 88.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(11.581722f, 88.0f, 8.0f, 91.58172f, 8.0f, 96.0f),
                    PathNode.CurveTo(8.0f, 100.41828f, 11.581722f, 104.0f, 16.0f, 104.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(72.836555f, 216.0f, 80.0f, 208.83656f, 80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 208.83656f, 183.16344f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.LineTo(240.0f, 104.0f),
                    PathNode.CurveTo(244.41827f, 104.0f, 248.0f, 100.41828f, 248.0f, 96.0f),
                    PathNode.CurveTo(248.0f, 91.58172f, 244.41827f, 88.0f, 240.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.47f, 48.0f),
                    PathNode.LineTo(205.53f, 48.0f),
                    PathNode.LineTo(214.1f, 88.0f),
                    PathNode.LineTo(41.9f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 123.58172f, 148.41827f, 120.0f, 144.0f, 120.0f),
                    PathNode.CurveTo(139.58173f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 116.41828f, 120.0f, 112.0f, 120.0f),
                    PathNode.CurveTo(107.58172f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 132.0f),
                    PathNode.CurveTo(56.0f, 125.37258f, 61.37258f, 120.0f, 68.0f, 120.0f),
                    PathNode.CurveTo(74.62742f, 120.0f, 80.0f, 125.37258f, 80.0f, 132.0f),
                    PathNode.CurveTo(80.0f, 138.62741f, 74.62742f, 144.0f, 68.0f, 144.0f),
                    PathNode.CurveTo(61.37258f, 144.0f, 56.0f, 138.62741f, 56.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 132.0f),
                    PathNode.CurveTo(176.0f, 125.37258f, 181.37259f, 120.0f, 188.0f, 120.0f),
                    PathNode.CurveTo(194.62741f, 120.0f, 200.0f, 125.37258f, 200.0f, 132.0f),
                    PathNode.CurveTo(200.0f, 138.62741f, 194.62741f, 144.0f, 188.0f, 144.0f),
                    PathNode.CurveTo(181.37259f, 144.0f, 176.0f, 138.62741f, 176.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _jeep!!
    }

private var _jeep: ImageVector? = null
