package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorFillIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(59.581722f, 88.0f, 56.0f, 84.41828f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 171.58173f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(108.41828f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 123.58172f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.CurveTo(108.41828f, 120.0f, 112.0f, 123.58172f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 132.41827f, 108.41828f, 136.0f, 104.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.44f, 158.66f),
                    PathNode.LineTo(148.44f, 190.66f),
                    PathNode.CurveTo(147.12477f, 191.53528f, 145.57985f, 192.00154f, 144.0f, 192.0f),
                    PathNode.CurveTo(139.58173f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(135.99808f, 117.04819f, 137.62178f, 114.33517f, 140.22412f, 112.94194f),
                    PathNode.CurveTo(142.82645f, 111.54874f, 145.98453f, 111.701744f, 148.44f, 113.34f),
                    PathNode.LineTo(196.44f, 145.34f),
                    PathNode.CurveTo(198.6687f, 146.8232f, 200.0078f, 149.32288f, 200.0078f, 152.0f),
                    PathNode.CurveTo(200.0078f, 154.67712f, 198.6687f, 157.1768f, 196.44f, 158.66f),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
