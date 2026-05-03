package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorLightIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 67.76f),
                    PathNode.CurveTo(233.89746f, 65.42037f, 230.10254f, 65.42037f, 227.76f, 67.76f),
                    PathNode.LineTo(192.0f, 103.51f),
                    PathNode.LineTo(152.49f, 64.0f),
                    PathNode.LineTo(188.24f, 28.24f),
                    PathNode.CurveTo(190.44287f, 25.875921f, 190.37787f, 22.191923f, 188.09297f, 19.907026f),
                    PathNode.CurveTo(185.80807f, 17.62213f, 182.12408f, 17.557129f, 179.76f, 19.76f),
                    PathNode.LineTo(144.0f, 55.51f),
                    PathNode.LineTo(116.24f, 27.76f),
                    PathNode.CurveTo(114.74423f, 26.154774f, 112.491554f, 25.494007f, 110.3657f, 26.036915f),
                    PathNode.CurveTo(108.23982f, 26.579824f, 106.57983f, 28.239822f, 106.03692f, 30.365688f),
                    PathNode.CurveTo(105.494f, 32.491554f, 106.15478f, 34.744236f, 107.76f, 36.24f),
                    PathNode.LineTo(115.51f, 44.0f),
                    PathNode.LineTo(61.13f, 98.38f),
                    PathNode.CurveTo(54.000595f, 105.50678f, 49.995113f, 115.174355f, 49.995113f, 125.255f),
                    PathNode.CurveTo(49.995113f, 135.33565f, 54.000595f, 145.00322f, 61.13f, 152.13f),
                    PathNode.LineTo(78.26f, 169.25f),
                    PathNode.LineTo(27.76f, 219.76f),
                    PathNode.CurveTo(26.154774f, 221.25575f, 25.494007f, 223.50844f, 26.036915f, 225.63431f),
                    PathNode.CurveTo(26.579824f, 227.76018f, 28.239822f, 229.42018f, 30.365688f, 229.96309f),
                    PathNode.CurveTo(32.491554f, 230.506f, 34.744236f, 229.84523f, 36.24f, 228.24f),
                    PathNode.LineTo(86.75f, 177.74f),
                    PathNode.LineTo(103.88f, 194.87f),
                    PathNode.CurveTo(118.71991f, 209.70984f, 142.78009f, 209.70984f, 157.62f, 194.87f),
                    PathNode.LineTo(212.0f, 140.49f),
                    PathNode.LineTo(219.76f, 148.24f),
                    PathNode.CurveTo(222.12408f, 150.44287f, 225.80807f, 150.37787f, 228.09297f, 148.09297f),
                    PathNode.CurveTo(230.37787f, 145.80807f, 230.44287f, 142.12408f, 228.24f, 139.76f),
                    PathNode.LineTo(200.49f, 112.0f),
                    PathNode.LineTo(236.24f, 76.24f),
                    PathNode.CurveTo(238.57962f, 73.89746f, 238.57962f, 70.10254f, 236.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(149.13f, 186.38f),
                    PathNode.CurveTo(144.25404f, 191.2561f, 137.64073f, 193.99545f, 130.745f, 193.99545f),
                    PathNode.CurveTo(123.84926f, 193.99545f, 117.23596f, 191.2561f, 112.36f, 186.38f),
                    PathNode.LineTo(69.62f, 143.64f),
                    PathNode.CurveTo(64.74392f, 138.76404f, 62.00455f, 132.15074f, 62.00455f, 125.255f),
                    PathNode.CurveTo(62.00455f, 118.35926f, 64.74392f, 111.74597f, 69.62f, 106.87f),
                    PathNode.LineTo(124.0f, 52.49f),
                    PathNode.LineTo(203.51f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plug!!
    }

private var _plug: ImageVector? = null
