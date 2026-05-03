package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorFillIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(223.66f, 120.0f),
                    PathNode.CurveTo(219.6964f, 73.32691f, 182.67308f, 36.303608f, 136.0f, 32.34f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 32.34f),
                    PathNode.CurveTo(73.32691f, 36.303608f, 36.303608f, 73.32691f, 32.34f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.LineTo(32.34f, 136.0f),
                    PathNode.CurveTo(36.303608f, 182.67308f, 73.32691f, 219.6964f, 120.0f, 223.66f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 223.66f),
                    PathNode.CurveTo(182.67308f, 219.6964f, 219.6964f, 182.67308f, 223.66f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.LineTo(207.6f, 136.0f),
                    PathNode.CurveTo(203.73999f, 173.82967f, 173.82967f, 203.73999f, 136.0f, 207.6f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 195.58173f, 132.41827f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 195.58173f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 207.6f),
                    PathNode.CurveTo(82.17034f, 203.73999f, 52.26001f, 173.82967f, 48.4f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(60.418278f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 60.418278f, 120.0f, 56.0f, 120.0f),
                    PathNode.LineTo(48.4f, 120.0f),
                    PathNode.CurveTo(52.26001f, 82.17034f, 82.17034f, 52.26001f, 120.0f, 48.4f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.0f, 60.418278f, 123.58172f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(132.41827f, 64.0f, 136.0f, 60.418278f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 48.4f),
                    PathNode.CurveTo(173.82967f, 52.26001f, 203.73999f, 82.17034f, 207.6f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(195.58173f, 120.0f, 192.0f, 123.58172f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 132.41827f, 195.58173f, 136.0f, 200.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
