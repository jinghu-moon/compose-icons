package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorFillIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 64.0f),
                    PathNode.LineTo(8.0f, 64.0f),
                    PathNode.CurveTo(3.581722f, 64.0f, 0f, 67.58172f, 0f, 72.0f),
                    PathNode.CurveTo(0f, 76.41828f, 3.581722f, 80.0f, 8.0f, 80.0f),
                    PathNode.LineTo(16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 196.41827f, 19.581722f, 200.0f, 24.0f, 200.0f),
                    PathNode.CurveTo(28.418278f, 200.0f, 32.0f, 196.41827f, 32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 227.58173f, 200.0f, 232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 196.41827f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.LineTo(248.0f, 80.0f),
                    PathNode.CurveTo(252.41827f, 80.0f, 256.0f, 76.41828f, 256.0f, 72.0f),
                    PathNode.CurveTo(256.0f, 67.58172f, 252.41827f, 64.0f, 248.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(51.581722f, 112.0f, 48.0f, 108.41828f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 99.58172f, 51.581722f, 96.0f, 56.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(84.41828f, 96.0f, 88.0f, 99.58172f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 108.41828f, 84.41828f, 112.0f, 80.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 124.41828f, 132.41827f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(123.58172f, 128.0f, 120.0f, 124.41828f, 120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.CurveTo(171.58173f, 112.0f, 168.0f, 108.41828f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 99.58172f, 171.58173f, 96.0f, 176.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(204.41827f, 96.0f, 208.0f, 99.58172f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 108.41828f, 204.41827f, 112.0f, 200.0f, 112.0f),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
