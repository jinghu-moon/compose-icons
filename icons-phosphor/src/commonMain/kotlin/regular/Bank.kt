package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorRegularIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 104.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(27.581722f, 168.0f, 24.0f, 171.58173f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 180.41827f, 27.581722f, 184.0f, 32.0f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(228.41827f, 184.0f, 232.0f, 180.41827f, 232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 171.58173f, 228.41827f, 168.0f, 224.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(235.57652f, 103.99639f, 238.71614f, 101.6193f, 239.68977f, 98.17786f),
                    PathNode.CurveTo(240.66342f, 94.73642f, 239.23451f, 91.06682f, 236.19f, 89.19f),
                    PathNode.LineTo(132.19f, 25.19f),
                    PathNode.CurveTo(129.6201f, 23.609968f, 126.3799f, 23.609968f, 123.81f, 25.19f),
                    PathNode.LineTo(19.81f, 89.19f),
                    PathNode.CurveTo(16.765482f, 91.06682f, 15.336579f, 94.73642f, 16.310223f, 98.17786f),
                    PathNode.CurveTo(17.283863f, 101.6193f, 20.423477f, 103.99639f, 24.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 41.39f),
                    PathNode.LineTo(203.74f, 88.0f),
                    PathNode.LineTo(52.26f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 212.41827f, 244.41827f, 216.0f, 240.0f, 216.0f),
                    PathNode.LineTo(16.0f, 216.0f),
                    PathNode.CurveTo(11.581722f, 216.0f, 8.0f, 212.41827f, 8.0f, 208.0f),
                    PathNode.CurveTo(8.0f, 203.58173f, 11.581722f, 200.0f, 16.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 203.58173f, 248.0f, 208.0f),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
