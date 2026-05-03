package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorLightIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.0f, 78.55f),
                    PathNode.CurveTo(132.62764f, 71.411865f, 117.112946f, 72.76793f, 106.16655f, 81.94424f),
                    PathNode.CurveTo(95.22015f, 91.120544f, 91.176384f, 106.16025f, 96.044945f, 119.58877f),
                    PathNode.CurveTo(100.91351f, 133.01729f, 113.65619f, 141.97101f, 127.94f, 142.0f),
                    PathNode.CurveTo(129.84047f, 141.9975f, 131.73729f, 141.83359f, 133.61f, 141.51f),
                    PathNode.LineTo(114.85f, 172.93f),
                    PathNode.CurveTo(113.14896f, 175.77426f, 114.07574f, 179.45897f, 116.92f, 181.16f),
                    PathNode.CurveTo(119.76427f, 182.86104f, 123.44896f, 181.93427f, 125.15f, 179.09f),
                    PathNode.LineTo(157.45f, 125.0f),
                    PathNode.CurveTo(161.95988f, 117.18965f, 163.18181f, 107.907455f, 160.8469f, 99.196045f),
                    PathNode.CurveTo(158.51196f, 90.48463f, 152.81152f, 83.05784f, 145.0f, 78.55f),
                    PathNode.Close,
                    PathNode.MoveTo(147.06f, 119.0f),
                    PathNode.LineTo(147.06f, 119.0f),
                    PathNode.CurveTo(142.62505f, 126.72142f, 133.97296f, 131.00803f, 125.143005f, 129.8586f),
                    PathNode.CurveTo(116.31306f, 128.70917f, 109.04672f, 122.350395f, 106.73632f, 113.7509f),
                    PathNode.CurveTo(104.42593f, 105.151405f, 107.52713f, 96.007225f, 114.592125f, 90.58735f),
                    PathNode.CurveTo(121.65713f, 85.16747f, 131.29253f, 84.54084f, 139.0f, 89.0f),
                    PathNode.CurveTo(149.49002f, 95.07452f, 153.08983f, 108.48997f, 147.05f, 119.0f),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
