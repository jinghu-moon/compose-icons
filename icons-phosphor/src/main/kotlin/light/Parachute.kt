package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorLightIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 120.0f),
                    PathNode.CurveTo(230.0f, 63.666958f, 184.33304f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(71.666954f, 18.0f, 26.0f, 63.666958f, 26.0f, 120.0f),
                    PathNode.CurveTo(26.002954f, 121.82745f, 26.838587f, 123.55393f, 28.27f, 124.69f),
                    PathNode.LineTo(28.4f, 124.8f),
                    PathNode.LineTo(122.0f, 195.0f),
                    PathNode.LineTo(122.0f, 218.0f),
                    PathNode.LineTo(112.0f, 218.0f),
                    PathNode.CurveTo(108.686295f, 218.0f, 106.0f, 220.6863f, 106.0f, 224.0f),
                    PathNode.CurveTo(106.0f, 227.3137f, 108.686295f, 230.0f, 112.0f, 230.0f),
                    PathNode.LineTo(144.0f, 230.0f),
                    PathNode.CurveTo(147.3137f, 230.0f, 150.0f, 227.3137f, 150.0f, 224.0f),
                    PathNode.CurveTo(150.0f, 220.6863f, 147.3137f, 218.0f, 144.0f, 218.0f),
                    PathNode.LineTo(134.0f, 218.0f),
                    PathNode.LineTo(134.0f, 195.0f),
                    PathNode.LineTo(227.6f, 124.8f),
                    PathNode.LineTo(227.6f, 124.8f),
                    PathNode.CurveTo(229.11082f, 123.66687f, 230.0f, 121.88854f, 230.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.8f, 114.0f),
                    PathNode.LineTo(173.9f, 114.0f),
                    PathNode.CurveTo(172.6f, 71.08f, 157.4f, 45.38f, 145.47f, 31.7f),
                    PathNode.CurveTo(185.38852f, 39.66968f, 215.02261f, 73.38854f, 217.8f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 31.43f),
                    PathNode.CurveTo(134.00273f, 36.46931f, 139.20242f, 42.39399f, 143.42f, 49.0f),
                    PathNode.CurveTo(157.26f, 70.08f, 161.24f, 95.0f, 161.89f, 114.0f),
                    PathNode.LineTo(94.11f, 114.0f),
                    PathNode.CurveTo(95.17f, 82.12f, 104.6f, 61.14f, 112.58f, 49.0f),
                    PathNode.CurveTo(116.79193f, 42.389744f, 121.99233f, 36.464252f, 128.0f, 31.43f),
                    PathNode.Close,
                    PathNode.MoveTo(157.8f, 126.0f),
                    PathNode.LineTo(128.0f, 179.65f),
                    PathNode.LineTo(98.2f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.47f, 126.0f),
                    PathNode.LineTo(109.09f, 170.32f),
                    PathNode.LineTo(50.0f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.53f, 126.0f),
                    PathNode.LineTo(206.0f, 126.0f),
                    PathNode.LineTo(146.91f, 170.32f),
                    PathNode.Close,
                    PathNode.MoveTo(110.53f, 31.7f),
                    PathNode.CurveTo(98.6f, 45.38f, 83.4f, 71.08f, 82.1f, 114.0f),
                    PathNode.LineTo(38.2f, 114.0f),
                    PathNode.CurveTo(40.977394f, 73.38854f, 70.61147f, 39.66968f, 110.53f, 31.7f),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
