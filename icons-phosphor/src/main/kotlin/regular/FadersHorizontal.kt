package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorRegularIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 75.58172f, 179.58173f, 72.0f, 184.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 75.58172f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 84.41828f, 220.41827f, 88.0f, 216.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(179.58173f, 88.0f, 176.0f, 84.41828f, 176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 108.41828f, 147.58173f, 112.0f, 152.0f, 112.0f),
                    PathNode.CurveTo(156.41827f, 112.0f, 160.0f, 108.41828f, 160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 51.581722f, 156.41827f, 48.0f, 152.0f, 48.0f),
                    PathNode.CurveTo(147.58173f, 48.0f, 144.0f, 51.581722f, 144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 75.58172f, 32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 84.41828f, 35.581722f, 88.0f, 40.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(115.58172f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 115.58172f, 184.0f, 120.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.58173f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.CurveTo(83.58172f, 144.0f, 80.0f, 147.58173f, 80.0f, 152.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(80.0f, 204.41827f, 83.58172f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(92.41828f, 208.0f, 96.0f, 204.41827f, 96.0f, 200.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 147.58173f, 92.41828f, 144.0f, 88.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
