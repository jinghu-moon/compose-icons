package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorRegularIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.92f, 199.0f),
                    PathNode.CurveTo(234.06483f, 200.04588f, 231.86923f, 200.30888f, 229.81953f, 199.73077f),
                    PathNode.CurveTo(227.76982f, 199.15265f, 226.03523f, 197.78111f, 225.0f, 195.92f),
                    PathNode.LineTo(155.32f, 72.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 84.41828f, 132.41827f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(123.58172f, 88.0f, 120.0f, 84.41828f, 120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.LineTo(100.68f, 72.0f),
                    PathNode.LineTo(31.0f, 195.92f),
                    PathNode.CurveTo(28.835043f, 199.786f, 23.945993f, 201.16496f, 20.08f, 199.0f),
                    PathNode.CurveTo(16.214006f, 196.83504f, 14.835044f, 191.946f, 17.0f, 188.08f),
                    PathNode.LineTo(82.32f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(19.581722f, 72.0f, 16.0f, 68.41828f, 16.0f, 64.0f),
                    PathNode.CurveTo(16.0f, 59.581722f, 19.581722f, 56.0f, 24.0f, 56.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(236.41827f, 56.0f, 240.0f, 59.581722f, 240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 68.41828f, 236.41827f, 72.0f, 232.0f, 72.0f),
                    PathNode.LineTo(173.68f, 72.0f),
                    PathNode.LineTo(239.0f, 188.08f),
                    PathNode.CurveTo(240.04588f, 189.93517f, 240.30888f, 192.13077f, 239.73077f, 194.18047f),
                    PathNode.CurveTo(239.15265f, 196.23018f, 237.78111f, 197.96477f, 235.92f, 199.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(123.58172f, 112.0f, 120.0f, 115.58172f, 120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 140.41827f, 123.58172f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(132.41827f, 144.0f, 136.0f, 140.41827f, 136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 115.58172f, 132.41827f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(123.58172f, 168.0f, 120.0f, 171.58173f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 196.41827f, 123.58172f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 196.41827f, 136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 171.58173f, 132.41827f, 168.0f, 128.0f, 168.0f),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
