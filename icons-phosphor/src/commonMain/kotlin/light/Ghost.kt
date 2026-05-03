package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorLightIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(110.0f, 116.0f),
                    PathNode.CurveTo(110.0f, 121.52285f, 105.52285f, 126.0f, 100.0f, 126.0f),
                    PathNode.CurveTo(94.47715f, 126.0f, 90.0f, 121.52285f, 90.0f, 116.0f),
                    PathNode.CurveTo(90.0f, 110.47715f, 94.47715f, 106.0f, 100.0f, 106.0f),
                    PathNode.CurveTo(105.52285f, 106.0f, 110.0f, 110.47715f, 110.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 106.0f),
                    PathNode.CurveTo(150.47716f, 106.0f, 146.0f, 110.47715f, 146.0f, 116.0f),
                    PathNode.CurveTo(146.0f, 121.52285f, 150.47716f, 126.0f, 156.0f, 126.0f),
                    PathNode.CurveTo(161.52284f, 126.0f, 166.0f, 121.52285f, 166.0f, 116.0f),
                    PathNode.CurveTo(166.0f, 110.47715f, 161.52284f, 106.0f, 156.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 120.0f),
                    PathNode.LineTo(222.0f, 216.0f),
                    PathNode.CurveTo(221.99873f, 218.31789f, 220.66249f, 220.42772f, 218.56757f, 221.4196f),
                    PathNode.CurveTo(216.47264f, 222.41148f, 213.99376f, 222.10799f, 212.2f, 220.64f),
                    PathNode.LineTo(186.67f, 199.75f),
                    PathNode.LineTo(161.13f, 220.64f),
                    PathNode.CurveTo(158.9196f, 222.44897f, 155.7404f, 222.44897f, 153.53f, 220.64f),
                    PathNode.LineTo(128.0f, 199.75f),
                    PathNode.LineTo(102.47f, 220.64f),
                    PathNode.CurveTo(100.2596f, 222.44897f, 97.08041f, 222.44897f, 94.87f, 220.64f),
                    PathNode.LineTo(69.33f, 199.75f),
                    PathNode.LineTo(43.8f, 220.64f),
                    PathNode.CurveTo(42.00624f, 222.10799f, 39.527363f, 222.41148f, 37.432438f, 221.4196f),
                    PathNode.CurveTo(35.3375f, 220.42772f, 34.001266f, 218.31789f, 34.0f, 216.0f),
                    PathNode.LineTo(34.0f, 120.0f),
                    PathNode.CurveTo(34.0f, 68.085236f, 76.085236f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(179.91476f, 26.0f, 222.0f, 68.085236f, 222.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 120.0f),
                    PathNode.CurveTo(210.0f, 74.712654f, 173.28735f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(82.712654f, 38.0f, 46.0f, 74.712654f, 46.0f, 120.0f),
                    PathNode.LineTo(46.0f, 203.34f),
                    PathNode.LineTo(65.53f, 187.34f),
                    PathNode.CurveTo(67.7404f, 185.53104f, 70.91959f, 185.53104f, 73.13f, 187.34f),
                    PathNode.LineTo(98.67f, 208.23f),
                    PathNode.LineTo(124.2f, 187.34f),
                    PathNode.CurveTo(126.4104f, 185.53104f, 129.5896f, 185.53104f, 131.8f, 187.34f),
                    PathNode.LineTo(157.33f, 208.23f),
                    PathNode.LineTo(182.87f, 187.34f),
                    PathNode.CurveTo(185.0804f, 185.53104f, 188.2596f, 185.53104f, 190.47f, 187.34f),
                    PathNode.LineTo(210.0f, 203.34f),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
