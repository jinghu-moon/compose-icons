package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorFillIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 80.0f),
                    PathNode.CurveTo(184.0f, 75.58172f, 187.58173f, 72.0f, 192.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 75.58172f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 84.41828f, 220.41827f, 88.0f, 216.0f, 88.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(187.58173f, 88.0f, 184.0f, 84.41828f, 184.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 108.41828f, 139.58173f, 112.0f, 144.0f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(164.41827f, 112.0f, 168.0f, 108.41828f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 51.581722f, 164.41827f, 48.0f, 160.0f, 48.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(139.58173f, 48.0f, 136.0f, 51.581722f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 75.58172f, 32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 84.41828f, 35.581722f, 88.0f, 40.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.CurveTo(123.58172f, 168.0f, 120.0f, 171.58173f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.58173f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(75.58172f, 144.0f, 72.0f, 147.58173f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 204.41827f, 75.58172f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(100.41828f, 208.0f, 104.0f, 204.41827f, 104.0f, 200.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 147.58173f, 100.41828f, 144.0f, 96.0f, 144.0f),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
