package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorLightIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.37f, 213.32f),
                    PathNode.LineTo(189.37f, 101.32f),
                    PathNode.CurveTo(188.35503f, 99.28351f, 186.2754f, 97.9964f, 184.0f, 97.9964f),
                    PathNode.CurveTo(181.7246f, 97.9964f, 179.64497f, 99.28351f, 178.63f, 101.32f),
                    PathNode.LineTo(156.33f, 145.92f),
                    PathNode.CurveTo(137.69243f, 145.14691f, 119.75555f, 138.60185f, 105.0f, 127.19f),
                    PathNode.CurveTo(122.15391f, 109.6466f, 132.38927f, 86.4945f, 133.82f, 62.0f),
                    PathNode.LineTo(160.0f, 62.0f),
                    PathNode.CurveTo(163.3137f, 62.0f, 166.0f, 59.31371f, 166.0f, 56.0f),
                    PathNode.CurveTo(166.0f, 52.68629f, 163.3137f, 50.0f, 160.0f, 50.0f),
                    PathNode.LineTo(102.0f, 50.0f),
                    PathNode.LineTo(102.0f, 32.0f),
                    PathNode.CurveTo(102.0f, 28.68629f, 99.313705f, 26.0f, 96.0f, 26.0f),
                    PathNode.CurveTo(92.686295f, 26.0f, 90.0f, 28.68629f, 90.0f, 32.0f),
                    PathNode.LineTo(90.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(28.68629f, 50.0f, 26.0f, 52.68629f, 26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 59.31371f, 28.68629f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(121.79f, 62.0f),
                    PathNode.CurveTo(120.365875f, 83.55998f, 111.208176f, 103.88163f, 96.0f, 119.23f),
                    PathNode.CurveTo(86.671745f, 109.82907f, 79.53806f, 98.48143f, 75.11f, 86.0f),
                    PathNode.CurveTo(74.433525f, 83.92958f, 72.68814f, 82.38838f, 70.54991f, 81.97337f),
                    PathNode.CurveTo(68.41168f, 81.55837f, 66.216484f, 82.33475f, 64.814606f, 84.00178f),
                    PathNode.CurveTo(63.412735f, 85.66881f, 63.02439f, 87.964645f, 63.8f, 90.0f),
                    PathNode.CurveTo(68.73567f, 103.93978f, 76.6531f, 116.63496f, 87.0f, 127.2f),
                    PathNode.CurveTo(71.26659f, 139.407f, 51.913574f, 146.0222f, 32.0f, 146.0f),
                    PathNode.CurveTo(28.68629f, 146.0f, 26.0f, 148.6863f, 26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 155.3137f, 28.68629f, 158.0f, 32.0f, 158.0f),
                    PathNode.CurveTo(55.29762f, 158.02145f, 77.89416f, 150.03146f, 96.0f, 135.37f),
                    PathNode.CurveTo(111.60629f, 147.95262f, 130.57114f, 155.66307f, 150.53f, 157.54f),
                    PathNode.LineTo(122.64f, 213.32f),
                    PathNode.CurveTo(121.159874f, 216.28577f, 122.36423f, 219.88988f, 125.33f, 221.37f),
                    PathNode.CurveTo(128.29578f, 222.85013f, 131.89987f, 221.64577f, 133.38f, 218.68f),
                    PathNode.LineTo(147.71f, 190.0f),
                    PathNode.LineTo(220.29f, 190.0f),
                    PathNode.LineTo(234.63f, 218.68f),
                    PathNode.CurveTo(235.646f, 220.71509f, 237.7254f, 222.00069f, 240.0f, 222.0f),
                    PathNode.CurveTo(240.93146f, 222.00232f, 241.8501f, 221.78294f, 242.68f, 221.36f),
                    PathNode.CurveTo(245.64072f, 219.88065f, 246.84433f, 216.28322f, 245.37f, 213.32f),
                    PathNode.Close,
                    PathNode.MoveTo(153.71f, 178.0f),
                    PathNode.LineTo(184.0f, 117.42f),
                    PathNode.LineTo(214.29f, 178.0f),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
