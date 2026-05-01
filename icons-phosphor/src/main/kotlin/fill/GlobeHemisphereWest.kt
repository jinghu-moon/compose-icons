package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorFillIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.00874f, 139.28978f, 213.83556f, 150.47485f, 209.6f, 160.94f),
                    PathNode.LineTo(164.9f, 133.45f),
                    PathNode.CurveTo(162.99944f, 132.27722f, 160.87338f, 131.51743f, 158.66f, 131.22f),
                    PathNode.LineTo(135.84f, 128.14f),
                    PathNode.CurveTo(129.41093f, 127.30169f, 123.1058f, 130.3991f, 119.84f, 136.0f),
                    PathNode.LineTo(111.12f, 136.0f),
                    PathNode.LineTo(107.32f, 128.14f),
                    PathNode.CurveTo(105.19105f, 123.7047f, 101.129944f, 120.503815f, 96.32f, 119.47f),
                    PathNode.LineTo(88.32f, 117.74f),
                    PathNode.LineTo(96.14f, 104.0f),
                    PathNode.LineTo(112.85f, 104.0f),
                    PathNode.CurveTo(115.55395f, 103.9947f, 118.21278f, 103.30677f, 120.58f, 102.0f),
                    PathNode.LineTo(132.83f, 95.24f),
                    PathNode.CurveTo(133.90623f, 94.640076f, 134.91241f, 93.92233f, 135.83f, 93.1f),
                    PathNode.LineTo(162.74f, 68.76f),
                    PathNode.CurveTo(168.29768f, 63.779327f, 169.65265f, 55.60792f, 166.0f, 49.1f),
                    PathNode.LineTo(165.64f, 48.45f),
                    PathNode.CurveTo(196.37437f, 63.02318f, 215.97548f, 93.98561f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(39.986637f, 114.92019f, 42.904816f, 102.00366f, 48.54f, 90.2f),
                    PathNode.LineTo(59.88f, 120.47f),
                    PathNode.CurveTo(61.800335f, 125.562775f, 66.17792f, 129.33006f, 71.5f, 130.47f),
                    PathNode.LineTo(92.93f, 135.08f),
                    PathNode.LineTo(96.74f, 143.0f),
                    PathNode.CurveTo(99.43726f, 148.4949f, 105.018814f, 151.98335f, 111.14f, 152.0f),
                    PathNode.LineTo(112.62f, 152.0f),
                    PathNode.LineTo(105.39f, 168.23f),
                    PathNode.CurveTo(102.78621f, 174.07124f, 103.91089f, 180.90192f, 108.25f, 185.6f),
                    PathNode.LineTo(108.39f, 185.74f),
                    PathNode.LineTo(128.0f, 205.94f),
                    PathNode.LineTo(126.06f, 215.94f),
                    PathNode.CurveTo(78.26661f, 214.82779f, 40.0793f, 175.80626f, 40.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
