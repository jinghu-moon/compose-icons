package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorLightIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 102.0f),
                    PathNode.LineTo(50.0f, 102.0f),
                    PathNode.LineTo(50.0f, 170.0f),
                    PathNode.LineTo(32.0f, 170.0f),
                    PathNode.CurveTo(28.68629f, 170.0f, 26.0f, 172.6863f, 26.0f, 176.0f),
                    PathNode.CurveTo(26.0f, 179.3137f, 28.68629f, 182.0f, 32.0f, 182.0f),
                    PathNode.LineTo(224.0f, 182.0f),
                    PathNode.CurveTo(227.3137f, 182.0f, 230.0f, 179.3137f, 230.0f, 176.0f),
                    PathNode.CurveTo(230.0f, 172.6863f, 227.3137f, 170.0f, 224.0f, 170.0f),
                    PathNode.LineTo(206.0f, 170.0f),
                    PathNode.LineTo(206.0f, 102.0f),
                    PathNode.LineTo(232.0f, 102.0f),
                    PathNode.CurveTo(234.68356f, 101.997986f, 237.03946f, 100.21426f, 237.76933f, 97.63185f),
                    PathNode.CurveTo(238.49919f, 95.04944f, 237.4255f, 92.29641f, 235.14f, 90.89f),
                    PathNode.LineTo(131.14f, 26.89f),
                    PathNode.CurveTo(129.21379f, 25.707024f, 126.7862f, 25.707024f, 124.86f, 26.89f),
                    PathNode.LineTo(20.86f, 90.89f),
                    PathNode.CurveTo(18.574495f, 92.29641f, 17.500813f, 95.04944f, 18.230673f, 97.63185f),
                    PathNode.CurveTo(18.960535f, 100.21426f, 21.316435f, 101.997986f, 24.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 102.0f),
                    PathNode.LineTo(98.0f, 102.0f),
                    PathNode.LineTo(98.0f, 170.0f),
                    PathNode.LineTo(62.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 102.0f),
                    PathNode.LineTo(146.0f, 170.0f),
                    PathNode.LineTo(110.0f, 170.0f),
                    PathNode.LineTo(110.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 170.0f),
                    PathNode.LineTo(158.0f, 170.0f),
                    PathNode.LineTo(158.0f, 102.0f),
                    PathNode.LineTo(194.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 39.0f),
                    PathNode.LineTo(210.8f, 90.0f),
                    PathNode.LineTo(45.2f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 208.0f),
                    PathNode.CurveTo(246.0f, 211.3137f, 243.3137f, 214.0f, 240.0f, 214.0f),
                    PathNode.LineTo(16.0f, 214.0f),
                    PathNode.CurveTo(12.686292f, 214.0f, 10.0f, 211.3137f, 10.0f, 208.0f),
                    PathNode.CurveTo(10.0f, 204.6863f, 12.686292f, 202.0f, 16.0f, 202.0f),
                    PathNode.LineTo(240.0f, 202.0f),
                    PathNode.CurveTo(243.3137f, 202.0f, 246.0f, 204.6863f, 246.0f, 208.0f),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
