package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorFillIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 136.0f),
                    PathNode.CurveTo(212.0f, 142.62741f, 206.62741f, 148.0f, 200.0f, 148.0f),
                    PathNode.CurveTo(193.37259f, 148.0f, 188.0f, 142.62741f, 188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 129.37259f, 193.37259f, 124.0f, 200.0f, 124.0f),
                    PathNode.CurveTo(206.62741f, 124.0f, 212.0f, 129.37259f, 212.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 176.37f, 226.92f, 208.0f, 200.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(29.08f, 208.0f, 8.0f, 176.37f, 8.0f, 136.0f),
                    PathNode.CurveTo(8.0f, 95.63f, 29.08f, 64.0f, 56.0f, 64.0f),
                    PathNode.LineTo(92.69f, 64.0f),
                    PathNode.LineTo(130.34f, 26.34f),
                    PathNode.CurveTo(131.84158f, 24.840092f, 133.87762f, 23.998331f, 136.0f, 24.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(172.41827f, 24.0f, 176.0f, 27.581722f, 176.0f, 32.0f),
                    PathNode.CurveTo(176.0f, 36.418278f, 172.41827f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(139.31f, 40.0f),
                    PathNode.LineTo(115.31f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(226.92f, 64.0f, 248.0f, 95.63f, 248.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(108.41828f, 128.0f, 112.0f, 124.41828f, 112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 115.58172f, 108.41828f, 112.0f, 104.0f, 112.0f),
                    PathNode.LineTo(33.26f, 112.0f),
                    PathNode.CurveTo(28.841722f, 112.0f, 25.26f, 115.58172f, 25.26f, 120.0f),
                    PathNode.CurveTo(25.26f, 124.41828f, 28.841722f, 128.0f, 33.26f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.91f, 160.0f),
                    PathNode.CurveTo(154.91f, 155.58173f, 151.32828f, 152.0f, 146.91f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(75.58172f, 152.0f, 72.0f, 155.58173f, 72.0f, 160.0f),
                    PathNode.CurveTo(72.0f, 164.41827f, 75.58172f, 168.0f, 80.0f, 168.0f),
                    PathNode.LineTo(146.91f, 168.0f),
                    PathNode.CurveTo(151.32828f, 168.0f, 154.91f, 164.41827f, 154.91f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 136.0f),
                    PathNode.CurveTo(232.0f, 105.64f, 217.35f, 80.0f, 200.0f, 80.0f),
                    PathNode.CurveTo(182.65f, 80.0f, 168.0f, 105.64f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 166.36f, 182.65f, 192.0f, 200.0f, 192.0f),
                    PathNode.CurveTo(217.35f, 192.0f, 232.0f, 166.36f, 232.0f, 136.0f),
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
        return _log!!
    }

private var _log: ImageVector? = null
