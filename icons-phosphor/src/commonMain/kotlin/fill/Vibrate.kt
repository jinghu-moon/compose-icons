package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorFillIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 56.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 213.25484f, 173.25484f, 224.0f, 160.0f, 224.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(82.74516f, 224.0f, 72.0f, 213.25484f, 72.0f, 200.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 42.745167f, 82.74516f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(173.25484f, 32.0f, 184.0f, 42.745167f, 184.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.CurveTo(203.58173f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 172.41827f, 203.58173f, 176.0f, 208.0f, 176.0f),
                    PathNode.CurveTo(212.41827f, 176.0f, 216.0f, 172.41827f, 216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 83.58172f, 212.41827f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 96.0f),
                    PathNode.CurveTo(235.58173f, 96.0f, 232.0f, 99.58172f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 156.41827f, 235.58173f, 160.0f, 240.0f, 160.0f),
                    PathNode.CurveTo(244.41827f, 160.0f, 248.0f, 156.41827f, 248.0f, 152.0f),
                    PathNode.LineTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.0f, 99.58172f, 244.41827f, 96.0f, 240.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 80.0f),
                    PathNode.CurveTo(43.581722f, 80.0f, 40.0f, 83.58172f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 172.41827f, 43.581722f, 176.0f, 48.0f, 176.0f),
                    PathNode.CurveTo(52.418278f, 176.0f, 56.0f, 172.41827f, 56.0f, 168.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 83.58172f, 52.418278f, 80.0f, 48.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 96.0f),
                    PathNode.CurveTo(11.581722f, 96.0f, 8.0f, 99.58172f, 8.0f, 104.0f),
                    PathNode.LineTo(8.0f, 152.0f),
                    PathNode.CurveTo(8.0f, 156.41827f, 11.581722f, 160.0f, 16.0f, 160.0f),
                    PathNode.CurveTo(20.418278f, 160.0f, 24.0f, 156.41827f, 24.0f, 152.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(24.0f, 99.58172f, 20.418278f, 96.0f, 16.0f, 96.0f),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
