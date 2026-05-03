package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorLightIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 154.0f),
                    PathNode.LineTo(197.28f, 154.0f),
                    PathNode.CurveTo(197.75565f, 150.68784f, 197.99625f, 147.34615f, 198.0f, 144.0f),
                    PathNode.CurveTo(198.0f, 105.340065f, 166.65993f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(89.340065f, 74.0f, 58.0f, 105.340065f, 58.0f, 144.0f),
                    PathNode.CurveTo(58.003757f, 147.34615f, 58.24436f, 150.68784f, 58.72f, 154.0f),
                    PathNode.LineTo(16.0f, 154.0f),
                    PathNode.CurveTo(12.686292f, 154.0f, 10.0f, 156.6863f, 10.0f, 160.0f),
                    PathNode.CurveTo(10.0f, 163.3137f, 12.686292f, 166.0f, 16.0f, 166.0f),
                    PathNode.LineTo(240.0f, 166.0f),
                    PathNode.CurveTo(243.3137f, 166.0f, 246.0f, 163.3137f, 246.0f, 160.0f),
                    PathNode.CurveTo(246.0f, 156.6863f, 243.3137f, 154.0f, 240.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 144.0f),
                    PathNode.CurveTo(69.99692f, 122.07503f, 82.3573f, 102.02224f, 101.94561f, 92.17324f),
                    PathNode.CurveTo(121.53391f, 82.32424f, 145.00172f, 84.36262f, 162.59856f, 97.44146f),
                    PathNode.CurveTo(180.19539f, 110.520294f, 188.91325f, 132.4039f, 185.13f, 154.0f),
                    PathNode.LineTo(70.87f, 154.0f),
                    PathNode.CurveTo(70.29466f, 150.69766f, 70.0036f, 147.35208f, 70.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 203.3137f, 211.3137f, 206.0f, 208.0f, 206.0f),
                    PathNode.LineTo(48.0f, 206.0f),
                    PathNode.CurveTo(44.68629f, 206.0f, 42.0f, 203.3137f, 42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 196.6863f, 44.68629f, 194.0f, 48.0f, 194.0f),
                    PathNode.LineTo(208.0f, 194.0f),
                    PathNode.CurveTo(211.3137f, 194.0f, 214.0f, 196.6863f, 214.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.63f, 42.69f),
                    PathNode.CurveTo(73.14712f, 39.72423f, 74.34922f, 36.117886f, 77.315f, 34.635f),
                    PathNode.CurveTo(80.28077f, 33.152115f, 83.887115f, 34.354233f, 85.37f, 37.32f),
                    PathNode.LineTo(93.37f, 53.32f),
                    PathNode.CurveTo(94.85012f, 56.28577f, 93.64577f, 59.889877f, 90.68f, 61.37f),
                    PathNode.CurveTo(87.71423f, 62.850124f, 84.11012f, 61.645767f, 82.63f, 58.68f),
                    PathNode.Close,
                    PathNode.MoveTo(18.63f, 93.32f),
                    PathNode.CurveTo(19.340456f, 91.89548f, 20.58788f, 90.81168f, 22.097672f, 90.30716f),
                    PathNode.CurveTo(23.607464f, 89.80264f, 25.255861f, 89.91878f, 26.68f, 90.63f),
                    PathNode.LineTo(42.68f, 98.63f),
                    PathNode.CurveTo(45.645767f, 100.11012f, 46.850124f, 103.71423f, 45.37f, 106.68f),
                    PathNode.CurveTo(43.889877f, 109.64577f, 40.28577f, 110.85012f, 37.32f, 109.37f),
                    PathNode.LineTo(21.32f, 101.37f),
                    PathNode.CurveTo(19.89548f, 100.659546f, 18.811672f, 99.41212f, 18.307158f, 97.90233f),
                    PathNode.CurveTo(17.802645f, 96.39253f, 17.91878f, 94.74414f, 18.63f, 93.32f),
                    PathNode.Close,
                    PathNode.MoveTo(210.63f, 106.68f),
                    PathNode.CurveTo(209.91878f, 105.25586f, 209.80264f, 103.60747f, 210.30716f, 102.09767f),
                    PathNode.CurveTo(210.81168f, 100.58788f, 211.89548f, 99.340454f, 213.32f, 98.63f),
                    PathNode.LineTo(229.32f, 90.63f),
                    PathNode.CurveTo(232.28577f, 89.14988f, 235.88988f, 90.35423f, 237.37f, 93.32f),
                    PathNode.CurveTo(238.85013f, 96.28577f, 237.64577f, 99.88988f, 234.68f, 101.37f),
                    PathNode.LineTo(218.68f, 109.37f),
                    PathNode.CurveTo(217.25586f, 110.08122f, 215.60747f, 110.19736f, 214.09767f, 109.69284f),
                    PathNode.CurveTo(212.58788f, 109.18832f, 211.34045f, 108.10452f, 210.63f, 106.68f),
                    PathNode.Close,
                    PathNode.MoveTo(162.63f, 53.32f),
                    PathNode.LineTo(170.63f, 37.32f),
                    PathNode.CurveTo(172.11288f, 34.354233f, 175.71924f, 33.152115f, 178.685f, 34.635f),
                    PathNode.CurveTo(181.65077f, 36.117886f, 182.85289f, 39.72423f, 181.37f, 42.69f),
                    PathNode.LineTo(173.37f, 58.69f),
                    PathNode.CurveTo(171.88988f, 61.65577f, 168.28577f, 62.860123f, 165.32f, 61.38f),
                    PathNode.CurveTo(162.35423f, 59.899876f, 161.14987f, 56.29577f, 162.63f, 53.33f),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
