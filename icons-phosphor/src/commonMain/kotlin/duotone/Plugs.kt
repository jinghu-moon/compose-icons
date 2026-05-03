package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorDuotoneIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 124.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(103.0f, 209.0f),
                    PathNode.CurveTo(93.62755f, 218.37183f, 78.43246f, 218.37183f, 69.06f, 209.0f),
                    PathNode.LineTo(47.0f, 186.91f),
                    PathNode.CurveTo(37.648148f, 177.54099f, 37.648148f, 162.36902f, 47.0f, 153.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.0f, 69.09f),
                    PathNode.LineTo(186.91f, 47.0f),
                    PathNode.CurveTo(177.54099f, 37.648148f, 162.36902f, 37.648148f, 153.0f, 47.0f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(180.0f, 132.0f),
                    PathNode.LineTo(209.0f, 103.0f),
                    PathNode.CurveTo(218.35185f, 93.63099f, 218.35185f, 78.459015f, 209.0f, 69.09f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.66f, 138.34f),
                    PathNode.CurveTo(148.15945f, 136.83777f, 146.12328f, 135.99371f, 144.0f, 135.99371f),
                    PathNode.CurveTo(141.87672f, 135.99371f, 139.84055f, 136.83777f, 138.34f, 138.34f),
                    PathNode.LineTo(120.0f, 156.69f),
                    PathNode.LineTo(99.31f, 136.0f),
                    PathNode.LineTo(117.66f, 117.66f),
                    PathNode.CurveTo(120.785934f, 114.534065f, 120.785934f, 109.465935f, 117.66f, 106.34f),
                    PathNode.CurveTo(114.534065f, 103.214066f, 109.465935f, 103.214066f, 106.34f, 106.34f),
                    PathNode.LineTo(88.0f, 124.69f),
                    PathNode.LineTo(69.66f, 106.34f),
                    PathNode.CurveTo(66.534065f, 103.214066f, 61.46593f, 103.214066f, 58.34f, 106.34f),
                    PathNode.CurveTo(55.21407f, 109.465935f, 55.21407f, 114.534065f, 58.34f, 117.66f),
                    PathNode.LineTo(64.69f, 124.0f),
                    PathNode.LineTo(41.37f, 147.31f),
                    PathNode.CurveTo(35.367256f, 153.31137f, 31.994831f, 161.45181f, 31.994831f, 169.94f),
                    PathNode.CurveTo(31.994831f, 178.42819f, 35.367256f, 186.56862f, 41.37f, 192.57f),
                    PathNode.LineTo(46.75f, 197.94f),
                    PathNode.LineTo(18.34f, 226.34f),
                    PathNode.CurveTo(15.214068f, 229.46593f, 15.214068f, 234.53407f, 18.34f, 237.66f),
                    PathNode.CurveTo(21.46593f, 240.78593f, 26.53407f, 240.78593f, 29.66f, 237.66f),
                    PathNode.LineTo(58.06f, 209.25f),
                    PathNode.LineTo(63.43f, 214.63f),
                    PathNode.CurveTo(69.43137f, 220.63275f, 77.57181f, 224.00517f, 86.06f, 224.00517f),
                    PathNode.CurveTo(94.548195f, 224.00517f, 102.68863f, 220.63275f, 108.69f, 214.63f),
                    PathNode.LineTo(132.0f, 191.31f),
                    PathNode.LineTo(138.34f, 197.66f),
                    PathNode.CurveTo(141.46593f, 200.78593f, 146.53407f, 200.78593f, 149.66f, 197.66f),
                    PathNode.CurveTo(152.78593f, 194.53407f, 152.78593f, 189.46593f, 149.66f, 186.34f),
                    PathNode.LineTo(131.31f, 168.0f),
                    PathNode.LineTo(149.66f, 149.66f),
                    PathNode.CurveTo(151.16223f, 148.15945f, 152.00629f, 146.12328f, 152.00629f, 144.0f),
                    PathNode.CurveTo(152.00629f, 141.87672f, 151.16223f, 139.84055f, 149.66f, 138.34f),
                    PathNode.Close,
                    PathNode.MoveTo(97.37f, 203.34f),
                    PathNode.CurveTo(91.12246f, 209.58345f, 80.997536f, 209.58345f, 74.75f, 203.34f),
                    PathNode.LineTo(52.69f, 181.25f),
                    PathNode.CurveTo(46.446556f, 175.00246f, 46.446556f, 164.87753f, 52.69f, 158.63f),
                    PathNode.LineTo(76.0f, 135.31f),
                    PathNode.LineTo(120.69f, 180.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(203.31f, 97.34f),
                    PathNode.LineTo(180.0f, 120.69f),
                    PathNode.LineTo(135.31f, 76.0f),
                    PathNode.LineTo(158.63f, 52.69f),
                    PathNode.CurveTo(164.87753f, 46.446556f, 175.00246f, 46.446556f, 181.25f, 52.69f),
                    PathNode.LineTo(203.31f, 74.69f),
                    PathNode.CurveTo(206.3267f, 77.692696f, 208.02264f, 81.77363f, 208.02264f, 86.03f),
                    PathNode.CurveTo(208.02264f, 90.28636f, 206.3267f, 94.36731f, 203.31f, 97.37f),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
