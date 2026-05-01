package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorRegularIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 189.66f),
                    PathNode.LineTo(197.66f, 221.66f),
                    PathNode.CurveTo(196.15945f, 223.16223f, 194.12328f, 224.00629f, 192.0f, 224.00629f),
                    PathNode.CurveTo(189.87672f, 224.00629f, 187.84055f, 223.16223f, 186.34f, 221.66f),
                    PathNode.LineTo(154.34f, 189.66f),
                    PathNode.CurveTo(151.21407f, 186.53407f, 151.21407f, 181.46593f, 154.34f, 178.34f),
                    PathNode.CurveTo(157.46593f, 175.21407f, 162.53407f, 175.21407f, 165.66f, 178.34f),
                    PathNode.LineTo(184.0f, 196.69f),
                    PathNode.LineTo(184.0f, 139.31f),
                    PathNode.LineTo(128.0f, 83.31f),
                    PathNode.LineTo(72.0f, 139.31f),
                    PathNode.LineTo(72.0f, 196.69f),
                    PathNode.LineTo(90.34f, 178.34f),
                    PathNode.CurveTo(93.465935f, 175.21407f, 98.534065f, 175.21407f, 101.66f, 178.34f),
                    PathNode.CurveTo(104.785934f, 181.46593f, 104.785934f, 186.53407f, 101.66f, 189.66f),
                    PathNode.LineTo(69.66f, 221.66f),
                    PathNode.CurveTo(68.159454f, 223.16223f, 66.123276f, 224.00629f, 64.0f, 224.00629f),
                    PathNode.CurveTo(61.876724f, 224.00629f, 59.840546f, 223.16223f, 58.34f, 221.66f),
                    PathNode.LineTo(26.34f, 189.66f),
                    PathNode.CurveTo(23.214067f, 186.53407f, 23.21407f, 181.46593f, 26.34f, 178.34f),
                    PathNode.CurveTo(29.46593f, 175.21407f, 34.53407f, 175.21407f, 37.66f, 178.34f),
                    PathNode.LineTo(56.0f, 196.69f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(55.998333f, 133.87762f, 56.84009f, 131.84158f, 58.34f, 130.34f),
                    PathNode.LineTo(120.0f, 68.69f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 68.69f),
                    PathNode.LineTo(197.66f, 130.34f),
                    PathNode.CurveTo(199.15993f, 131.84158f, 200.00166f, 133.87762f, 200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 196.69f),
                    PathNode.LineTo(218.34f, 178.34f),
                    PathNode.CurveTo(221.46593f, 175.21407f, 226.53407f, 175.21407f, 229.66f, 178.34f),
                    PathNode.CurveTo(232.78593f, 181.46593f, 232.78593f, 186.53407f, 229.66f, 189.66f),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
