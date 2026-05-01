package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorRegularIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 16.0f),
                    PathNode.CurveTo(124.507065f, 16.003256f, 96.260765f, 35.37987f, 84.92f, 64.76f),
                    PathNode.CurveTo(81.97327f, 64.25678f, 78.989395f, 64.002556f, 76.0f, 64.0f),
                    PathNode.CurveTo(47.281193f, 64.0f, 24.0f, 87.2812f, 24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 144.71881f, 47.281193f, 168.0f, 76.0f, 168.0f),
                    PathNode.LineTo(113.87f, 168.0f),
                    PathNode.LineTo(97.14f, 195.88f),
                    PathNode.CurveTo(95.655014f, 198.35167f, 95.61504f, 201.43124f, 97.03537f, 203.94063f),
                    PathNode.CurveTo(98.4557f, 206.45001f, 101.11654f, 208.0009f, 104.0f, 208.0f),
                    PathNode.LineTo(129.87f, 208.0f),
                    PathNode.LineTo(113.14f, 235.88f),
                    PathNode.CurveTo(110.864586f, 239.66867f, 112.09132f, 244.58458f, 115.88f, 246.86f),
                    PathNode.CurveTo(119.66867f, 249.1354f, 124.58459f, 247.90868f, 126.86f, 244.12f),
                    PathNode.LineTo(150.86f, 204.12f),
                    PathNode.CurveTo(152.34499f, 201.64833f, 152.38495f, 198.56876f, 150.96463f, 196.05937f),
                    PathNode.CurveTo(149.54431f, 193.54999f, 146.88345f, 191.9991f, 144.0f, 192.0f),
                    PathNode.LineTo(118.13f, 192.0f),
                    PathNode.LineTo(132.53f, 168.0f),
                    PathNode.LineTo(156.0f, 168.0f),
                    PathNode.CurveTo(197.97365f, 168.0f, 232.0f, 133.97365f, 232.0f, 92.0f),
                    PathNode.CurveTo(232.0f, 50.02636f, 197.97365f, 16.0f, 156.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 152.0f),
                    PathNode.LineTo(76.0f, 152.0f),
                    PathNode.CurveTo(56.11775f, 152.0f, 40.0f, 135.88223f, 40.0f, 116.0f),
                    PathNode.CurveTo(40.0f, 96.11775f, 56.11775f, 80.0f, 76.0f, 80.0f),
                    PathNode.CurveTo(77.59826f, 80.003f, 79.19474f, 80.10654f, 80.78f, 80.31f),
                    PathNode.QuadTo(80.22f, 83.88f, 80.01f, 87.54f),
                    PathNode.CurveTo(79.75595f, 91.958275f, 83.13172f, 95.74595f, 87.55f, 96.0f),
                    PathNode.CurveTo(91.96828f, 96.25405f, 95.75595f, 92.87828f, 96.01f, 88.46f),
                    PathNode.CurveTo(97.90551f, 55.80111f, 125.58989f, 30.666002f, 158.27953f, 31.924463f),
                    PathNode.CurveTo(190.96916f, 33.182926f, 216.6392f, 60.37203f, 216.0183f, 93.07999f),
                    PathNode.CurveTo(215.39734f, 125.78795f, 188.71385f, 151.98317f, 156.0f, 152.0f),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
