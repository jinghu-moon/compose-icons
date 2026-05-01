package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorLightIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 130.0f),
                    PathNode.LineTo(214.91f, 130.0f),
                    PathNode.LineTo(237.56f, 74.26f),
                    PathNode.CurveTo(238.80817f, 71.1893f, 237.3307f, 67.68816f, 234.26f, 66.44f),
                    PathNode.CurveTo(231.1893f, 65.19183f, 227.68816f, 66.6693f, 226.44f, 69.74f),
                    PathNode.LineTo(202.0f, 130.0f),
                    PathNode.LineTo(158.0f, 130.0f),
                    PathNode.LineTo(133.56f, 69.74f),
                    PathNode.CurveTo(132.64178f, 67.47631f, 130.44283f, 65.99531f, 128.0f, 65.99531f),
                    PathNode.CurveTo(125.55717f, 65.99531f, 123.35822f, 67.47631f, 122.44f, 69.74f),
                    PathNode.LineTo(98.0f, 130.0f),
                    PathNode.LineTo(54.0f, 130.0f),
                    PathNode.LineTo(29.56f, 69.74f),
                    PathNode.CurveTo(28.311836f, 66.6693f, 24.810703f, 65.19183f, 21.74f, 66.44f),
                    PathNode.CurveTo(18.669296f, 67.68816f, 17.191837f, 71.1893f, 18.44f, 74.26f),
                    PathNode.LineTo(41.09f, 130.0f),
                    PathNode.LineTo(16.0f, 130.0f),
                    PathNode.CurveTo(12.686292f, 130.0f, 10.0f, 132.6863f, 10.0f, 136.0f),
                    PathNode.CurveTo(10.0f, 139.3137f, 12.686292f, 142.0f, 16.0f, 142.0f),
                    PathNode.LineTo(46.0f, 142.0f),
                    PathNode.LineTo(70.48f, 202.26f),
                    PathNode.CurveTo(71.398224f, 204.5237f, 73.59717f, 206.0047f, 76.04f, 206.0047f),
                    PathNode.CurveTo(78.482834f, 206.0047f, 80.68178f, 204.5237f, 81.6f, 202.26f),
                    PathNode.LineTo(106.0f, 142.0f),
                    PathNode.LineTo(150.0f, 142.0f),
                    PathNode.LineTo(174.48f, 202.26f),
                    PathNode.CurveTo(175.39822f, 204.5237f, 177.59717f, 206.0047f, 180.04f, 206.0047f),
                    PathNode.CurveTo(182.48283f, 206.0047f, 184.68178f, 204.5237f, 185.6f, 202.26f),
                    PathNode.LineTo(210.0f, 142.0f),
                    PathNode.LineTo(240.0f, 142.0f),
                    PathNode.CurveTo(243.3137f, 142.0f, 246.0f, 139.3137f, 246.0f, 136.0f),
                    PathNode.CurveTo(246.0f, 132.6863f, 243.3137f, 130.0f, 240.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 184.06f),
                    PathNode.LineTo(58.91f, 142.0f),
                    PathNode.LineTo(93.09f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.91f, 130.0f),
                    PathNode.LineTo(128.0f, 87.94f),
                    PathNode.LineTo(145.09f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 184.06f),
                    PathNode.LineTo(162.91f, 142.0f),
                    PathNode.LineTo(197.09f, 142.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
