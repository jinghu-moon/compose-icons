package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorFillIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 198.65f),
                    PathNode.LineTo(232.0f, 240.0f),
                    PathNode.CurveTo(232.0f, 244.41827f, 228.41827f, 248.0f, 224.0f, 248.0f),
                    PathNode.CurveTo(219.58173f, 248.0f, 216.0f, 244.41827f, 216.0f, 240.0f),
                    PathNode.LineTo(216.0f, 198.65f),
                    PathNode.CurveTo(215.9247f, 177.89336f, 207.2324f, 158.10027f, 192.0f, 144.0f),
                    PathNode.LineTo(192.0f, 202.35f),
                    PathNode.CurveTo(191.99701f, 205.88535f, 189.67381f, 208.99953f, 186.28586f, 210.00969f),
                    PathNode.CurveTo(182.89789f, 211.01985f, 179.2486f, 209.68643f, 177.31f, 206.73f),
                    PathNode.LineTo(166.63f, 190.42f),
                    PathNode.CurveTo(166.55f, 190.3f, 166.47f, 190.17f, 166.4f, 190.04f),
                    PathNode.CurveTo(163.13322f, 184.2714f, 155.80861f, 182.24326f, 150.04f, 185.51f),
                    PathNode.CurveTo(144.2714f, 188.77676f, 142.24326f, 196.10138f, 145.51f, 201.87f),
                    PathNode.LineTo(167.64f, 235.66f),
                    PathNode.CurveTo(170.059f, 239.35753f, 169.02255f, 244.316f, 165.325f, 246.735f),
                    PathNode.CurveTo(161.62746f, 249.154f, 156.669f, 248.11755f, 154.25f, 244.42f),
                    PathNode.LineTo(131.99f, 210.42f),
                    PathNode.LineTo(131.75f, 210.04f),
                    PathNode.CurveTo(131.37f, 209.38f, 131.02f, 208.71f, 130.7f, 208.04f),
                    PathNode.LineTo(56.0f, 208.04f),
                    PathNode.CurveTo(51.581722f, 208.04f, 48.0f, 204.45828f, 48.0f, 200.04f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 87.163445f, 55.163445f, 80.0f, 64.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 132.41827f, 115.58172f, 136.0f, 120.0f, 136.0f),
                    PathNode.CurveTo(124.41828f, 136.0f, 128.0f, 132.41827f, 128.0f, 128.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(184.83656f, 80.0f, 192.0f, 87.163445f, 192.0f, 96.0f),
                    PathNode.LineTo(192.0f, 123.62f),
                    PathNode.CurveTo(216.9308f, 140.46713f, 231.90808f, 168.56076f, 232.0f, 198.65f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 35.31f),
                    PathNode.LineTo(146.34f, 53.66f),
                    PathNode.CurveTo(149.46593f, 56.78593f, 154.53407f, 56.78593f, 157.66f, 53.66f),
                    PathNode.CurveTo(160.78593f, 50.53407f, 160.78593f, 45.46593f, 157.66f, 42.34f),
                    PathNode.LineTo(125.66f, 10.34f),
                    PathNode.CurveTo(124.159454f, 8.837784f, 122.123276f, 7.993707f, 120.0f, 7.993707f),
                    PathNode.CurveTo(117.876724f, 7.993707f, 115.840546f, 8.837784f, 114.34f, 10.34f),
                    PathNode.LineTo(82.34f, 42.34f),
                    PathNode.CurveTo(79.214066f, 45.46593f, 79.214066f, 50.53407f, 82.34f, 53.66f),
                    PathNode.CurveTo(85.465935f, 56.78593f, 90.534065f, 56.78593f, 93.66f, 53.66f),
                    PathNode.LineTo(112.0f, 35.31f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
