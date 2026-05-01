package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorRegularIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(116.41828f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 116.41828f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 196.41827f, 136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 187.58173f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 197.66f),
                    PathNode.CurveTo(236.15945f, 199.16223f, 234.12328f, 200.00629f, 232.0f, 200.00629f),
                    PathNode.CurveTo(229.87672f, 200.00629f, 227.84055f, 199.16223f, 226.34f, 197.66f),
                    PathNode.LineTo(206.0f, 177.36f),
                    PathNode.CurveTo(188.86508f, 188.66492f, 165.95403f, 185.1637f, 152.9775f, 169.2572f),
                    PathNode.CurveTo(140.00096f, 153.35071f, 141.17203f, 130.20328f, 155.68765f, 115.68765f),
                    PathNode.CurveTo(170.20328f, 101.17203f, 193.35071f, 100.00096f, 209.2572f, 112.97749f),
                    PathNode.CurveTo(225.1637f, 125.95402f, 228.66492f, 148.86508f, 217.36f, 166.0f),
                    PathNode.LineTo(237.66f, 186.3f),
                    PathNode.CurveTo(239.1745f, 187.80214f, 240.02638f, 189.8469f, 240.02638f, 191.98f),
                    PathNode.CurveTo(240.02638f, 194.1131f, 239.1745f, 196.15787f, 237.66f, 197.66f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 168.0f),
                    PathNode.CurveTo(197.25484f, 168.0f, 208.0f, 157.25484f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 130.74516f, 197.25484f, 120.0f, 184.0f, 120.0f),
                    PathNode.CurveTo(170.74516f, 120.0f, 160.0f, 130.74516f, 160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 157.25484f, 170.74516f, 168.0f, 184.0f, 168.0f),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
