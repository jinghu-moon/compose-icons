package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorFillIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 212.41827f, 244.41827f, 216.0f, 240.0f, 216.0f),
                    PathNode.LineTo(16.0f, 216.0f),
                    PathNode.CurveTo(11.581722f, 216.0f, 8.0f, 212.41827f, 8.0f, 208.0f),
                    PathNode.CurveTo(8.0f, 203.58173f, 11.581722f, 200.0f, 16.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 203.58173f, 248.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.3f, 98.18f),
                    PathNode.CurveTo(15.322222f, 94.73247f, 16.756327f, 91.05527f, 19.81f, 89.18f),
                    PathNode.LineTo(123.81f, 25.18f),
                    PathNode.CurveTo(126.3799f, 23.599968f, 129.6201f, 23.599968f, 132.19f, 25.18f),
                    PathNode.LineTo(236.19f, 89.18f),
                    PathNode.CurveTo(239.24458f, 91.05297f, 240.68124f, 94.72857f, 239.70642f, 98.1765f),
                    PathNode.CurveTo(238.73161f, 101.62443f, 235.58308f, 104.00367f, 232.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(228.41827f, 168.0f, 232.0f, 171.58173f, 232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 180.41827f, 228.41827f, 184.0f, 224.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 171.58173f, 27.581722f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(20.420286f, 104.00123f, 17.275473f, 101.624245f, 16.3f, 98.18f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 164.41827f, 147.58173f, 168.0f, 152.0f, 168.0f),
                    PathNode.CurveTo(156.41827f, 168.0f, 160.0f, 164.41827f, 160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 107.58172f, 156.41827f, 104.0f, 152.0f, 104.0f),
                    PathNode.CurveTo(147.58173f, 104.0f, 144.0f, 107.58172f, 144.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 160.0f),
                    PathNode.CurveTo(96.0f, 164.41827f, 99.58172f, 168.0f, 104.0f, 168.0f),
                    PathNode.CurveTo(108.41828f, 168.0f, 112.0f, 164.41827f, 112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 107.58172f, 108.41828f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(99.58172f, 104.0f, 96.0f, 107.58172f, 96.0f, 112.0f),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
