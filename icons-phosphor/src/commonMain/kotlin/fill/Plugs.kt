package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorFillIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.66f, 149.66f),
                    PathNode.LineTo(131.31f, 168.0f),
                    PathNode.LineTo(149.66f, 186.34f),
                    PathNode.CurveTo(152.78593f, 189.46593f, 152.78593f, 194.53407f, 149.66f, 197.66f),
                    PathNode.CurveTo(146.53407f, 200.78593f, 141.46593f, 200.78593f, 138.34f, 197.66f),
                    PathNode.LineTo(132.0f, 191.31f),
                    PathNode.LineTo(108.69f, 214.63f),
                    PathNode.CurveTo(96.17896f, 227.09718f, 75.94104f, 227.09718f, 63.43f, 214.63f),
                    PathNode.LineTo(58.06f, 209.25f),
                    PathNode.LineTo(29.66f, 237.66f),
                    PathNode.CurveTo(26.53407f, 240.78593f, 21.46593f, 240.78593f, 18.34f, 237.66f),
                    PathNode.CurveTo(15.214068f, 234.53407f, 15.214068f, 229.46593f, 18.34f, 226.34f),
                    PathNode.LineTo(46.75f, 197.94f),
                    PathNode.LineTo(41.37f, 192.57f),
                    PathNode.CurveTo(35.367256f, 186.56862f, 31.994831f, 178.42819f, 31.994831f, 169.94f),
                    PathNode.CurveTo(31.994831f, 161.45181f, 35.367256f, 153.31137f, 41.37f, 147.31f),
                    PathNode.LineTo(64.69f, 124.0f),
                    PathNode.LineTo(58.34f, 117.66f),
                    PathNode.CurveTo(55.21407f, 114.534065f, 55.21407f, 109.465935f, 58.34f, 106.34f),
                    PathNode.CurveTo(61.46593f, 103.214066f, 66.534065f, 103.214066f, 69.66f, 106.34f),
                    PathNode.LineTo(88.0f, 124.69f),
                    PathNode.LineTo(106.34f, 106.34f),
                    PathNode.CurveTo(109.465935f, 103.214066f, 114.534065f, 103.214066f, 117.66f, 106.34f),
                    PathNode.CurveTo(120.785934f, 109.465935f, 120.785934f, 114.534065f, 117.66f, 117.66f),
                    PathNode.LineTo(99.31f, 136.0f),
                    PathNode.LineTo(120.0f, 156.69f),
                    PathNode.LineTo(138.34f, 138.34f),
                    PathNode.CurveTo(141.46593f, 135.21407f, 146.53407f, 135.21407f, 149.66f, 138.34f),
                    PathNode.CurveTo(152.78593f, 141.46593f, 152.78593f, 146.53407f, 149.66f, 149.66f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 18.34f),
                    PathNode.CurveTo(236.15945f, 16.837784f, 234.12328f, 15.993707f, 232.0f, 15.993707f),
                    PathNode.CurveTo(229.87672f, 15.993707f, 227.84055f, 16.837784f, 226.34f, 18.34f),
                    PathNode.LineTo(197.94f, 46.75f),
                    PathNode.LineTo(192.57f, 41.37f),
                    PathNode.CurveTo(180.06123f, 28.89733f, 159.81877f, 28.89733f, 147.31f, 41.37f),
                    PathNode.LineTo(124.0f, 64.69f),
                    PathNode.LineTo(117.66f, 58.34f),
                    PathNode.CurveTo(114.534065f, 55.21407f, 109.465935f, 55.21407f, 106.34f, 58.34f),
                    PathNode.CurveTo(103.214066f, 61.46593f, 103.214066f, 66.534065f, 106.34f, 69.66f),
                    PathNode.LineTo(186.34f, 149.66f),
                    PathNode.CurveTo(189.46593f, 152.78593f, 194.53407f, 152.78593f, 197.66f, 149.66f),
                    PathNode.CurveTo(200.78593f, 146.53407f, 200.78593f, 141.46593f, 197.66f, 138.34f),
                    PathNode.LineTo(191.31f, 132.0f),
                    PathNode.LineTo(214.63f, 108.69f),
                    PathNode.CurveTo(220.63275f, 102.68863f, 224.00517f, 94.548195f, 224.00517f, 86.06f),
                    PathNode.CurveTo(224.00517f, 77.57181f, 220.63275f, 69.43137f, 214.63f, 63.43f),
                    PathNode.LineTo(209.25f, 58.06f),
                    PathNode.LineTo(237.66f, 29.66f),
                    PathNode.CurveTo(239.16223f, 28.159454f, 240.00629f, 26.123274f, 240.00629f, 24.0f),
                    PathNode.CurveTo(240.00629f, 21.876726f, 239.16223f, 19.840546f, 237.66f, 18.34f),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
