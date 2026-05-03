package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorLightIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.9f, 58.31f),
                    PathNode.LineTo(129.9f, 26.31f),
                    PathNode.CurveTo(128.6668f, 25.898294f, 127.33321f, 25.898294f, 126.1f, 26.31f),
                    PathNode.LineTo(30.1f, 58.31f),
                    PathNode.CurveTo(27.65172f, 59.127354f, 26.000525f, 61.418888f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 144.0f),
                    PathNode.CurveTo(26.0f, 147.3137f, 28.68629f, 150.0f, 32.0f, 150.0f),
                    PathNode.CurveTo(35.31371f, 150.0f, 38.0f, 147.3137f, 38.0f, 144.0f),
                    PathNode.LineTo(38.0f, 72.32f),
                    PathNode.LineTo(76.68f, 85.22f),
                    PathNode.CurveTo(66.81517f, 99.79875f, 63.612347f, 117.88354f, 67.87041f, 134.96346f),
                    PathNode.CurveTo(72.12846f, 152.04338f, 83.44597f, 166.50822f, 99.0f, 174.75f),
                    PathNode.CurveTo(79.75f, 181.28f, 63.0f, 194.34f, 51.0f, 212.75f),
                    PathNode.CurveTo(49.570827f, 215.4873f, 50.45267f, 218.86237f, 53.038185f, 220.5507f),
                    PathNode.CurveTo(55.6237f, 222.23904f, 59.068462f, 221.68925f, 61.0f, 219.28f),
                    PathNode.CurveTo(76.47f, 195.59f, 100.88f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(155.12f, 182.0f, 179.53f, 195.59f, 195.0f, 219.28f),
                    PathNode.CurveTo(196.92123f, 221.74228f, 200.41006f, 222.31894f, 203.02145f, 220.60588f),
                    PathNode.CurveTo(205.63284f, 218.8928f, 206.49338f, 215.46294f, 205.0f, 212.72f),
                    PathNode.CurveTo(193.0f, 194.34f, 176.27f, 181.28f, 157.0f, 174.72f),
                    PathNode.CurveTo(172.5457f, 166.46925f, 183.85237f, 152.00043f, 188.10068f, 134.92133f),
                    PathNode.CurveTo(192.349f, 117.84223f, 189.1386f, 99.76239f, 179.27f, 85.19f),
                    PathNode.LineTo(225.9f, 69.69f),
                    PathNode.CurveTo(228.34683f, 68.87138f, 229.99635f, 66.58014f, 229.99635f, 64.0f),
                    PathNode.CurveTo(229.99635f, 61.419857f, 228.34683f, 59.128616f, 225.9f, 58.31f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 120.0f),
                    PathNode.CurveTo(178.00967f, 141.88474f, 163.78595f, 161.23264f, 142.89482f, 167.75203f),
                    PathNode.CurveTo(122.00369f, 174.27141f, 99.30048f, 166.4471f, 86.86166f, 148.44106f),
                    PathNode.CurveTo(74.42284f, 130.43501f, 75.13932f, 106.432045f, 88.63f, 89.2f),
                    PathNode.LineTo(126.1f, 101.69f),
                    PathNode.CurveTo(127.33321f, 102.10171f, 128.6668f, 102.10171f, 129.9f, 101.69f),
                    PathNode.LineTo(167.37f, 89.2f),
                    PathNode.CurveTo(174.26808f, 97.98353f, 178.01207f, 108.831566f, 178.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 89.68f),
                    PathNode.LineTo(51.0f, 64.0f),
                    PathNode.LineTo(128.0f, 38.32f),
                    PathNode.LineTo(205.0f, 64.0f),
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
        return _student!!
    }

private var _student: ImageVector? = null
