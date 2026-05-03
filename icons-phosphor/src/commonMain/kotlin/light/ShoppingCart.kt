package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorLightIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.61f, 60.16f),
                    PathNode.CurveTo(227.4701f, 58.79145f, 225.7811f, 58.000072f, 224.0f, 58.0f),
                    PathNode.LineTo(61.0f, 58.0f),
                    PathNode.LineTo(54.63f, 22.93f),
                    PathNode.CurveTo(54.112915f, 20.076933f, 51.629547f, 18.001846f, 48.73f, 18.0f),
                    PathNode.LineTo(24.0f, 18.0f),
                    PathNode.CurveTo(20.68629f, 18.0f, 18.0f, 20.68629f, 18.0f, 24.0f),
                    PathNode.CurveTo(18.0f, 27.31371f, 20.68629f, 30.0f, 24.0f, 30.0f),
                    PathNode.LineTo(43.72f, 30.0f),
                    PathNode.LineTo(69.53f, 171.94f),
                    PathNode.CurveTo(70.339195f, 176.41547f, 72.51984f, 180.52864f, 75.77f, 183.71f),
                    PathNode.CurveTo(64.82521f, 192.45244f, 62.77378f, 208.29405f, 71.13066f, 219.536f),
                    PathNode.CurveTo(79.48754f, 230.77792f, 95.24832f, 233.37852f, 106.77383f, 225.4173f),
                    PathNode.CurveTo(118.29933f, 217.45605f, 121.44598f, 201.79515f, 113.89f, 190.0f),
                    PathNode.LineTo(166.11f, 190.0f),
                    PathNode.CurveTo(159.71396f, 200.00931f, 160.91473f, 213.08072f, 169.02731f, 221.75722f),
                    PathNode.CurveTo(177.1399f, 230.43373f, 190.10124f, 232.50893f, 200.5172f, 226.79895f),
                    PathNode.CurveTo(210.93315f, 221.08897f, 216.1549f, 209.04587f, 213.2036f, 197.53998f),
                    PathNode.CurveTo(210.25227f, 186.0341f, 199.87837f, 177.99136f, 188.0f, 178.0f),
                    PathNode.LineTo(91.17f, 178.0f),
                    PathNode.CurveTo(86.337006f, 178.00073f, 82.19511f, 174.54494f, 81.33f, 169.79f),
                    PathNode.LineTo(77.73f, 150.0f),
                    PathNode.LineTo(196.1f, 150.0f),
                    PathNode.CurveTo(206.7327f, 150.00275f, 215.84578f, 142.4008f, 217.75f, 131.94f),
                    PathNode.LineTo(229.9f, 65.07f),
                    PathNode.CurveTo(230.21768f, 63.32308f, 229.74532f, 61.52517f, 228.61f, 60.16f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 204.0f),
                    PathNode.CurveTo(106.0f, 211.73198f, 99.73199f, 218.0f, 92.0f, 218.0f),
                    PathNode.CurveTo(84.26801f, 218.0f, 78.0f, 211.73198f, 78.0f, 204.0f),
                    PathNode.CurveTo(78.0f, 196.26802f, 84.26801f, 190.0f, 92.0f, 190.0f),
                    PathNode.CurveTo(99.73199f, 190.0f, 106.0f, 196.26802f, 106.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 204.0f),
                    PathNode.CurveTo(202.0f, 211.73198f, 195.73198f, 218.0f, 188.0f, 218.0f),
                    PathNode.CurveTo(180.26802f, 218.0f, 174.0f, 211.73198f, 174.0f, 204.0f),
                    PathNode.CurveTo(174.0f, 196.26802f, 180.26802f, 190.0f, 188.0f, 190.0f),
                    PathNode.CurveTo(195.73198f, 190.0f, 202.0f, 196.26802f, 202.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.94f, 129.79f),
                    PathNode.CurveTo(205.07489f, 134.54494f, 200.933f, 138.00073f, 196.1f, 138.0f),
                    PathNode.LineTo(75.55f, 138.0f),
                    PathNode.LineTo(63.19f, 70.0f),
                    PathNode.LineTo(216.81f, 70.0f),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
