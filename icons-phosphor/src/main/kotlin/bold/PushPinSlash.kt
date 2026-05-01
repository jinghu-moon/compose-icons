package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorBoldIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(60.0f, 71.0f),
                    PathNode.CurveTo(51.053547f, 73.94386f, 42.73222f, 78.525f, 35.46f, 84.51f),
                    PathNode.CurveTo(31.034117f, 88.07082f, 28.331207f, 93.345695f, 28.025938f, 99.01797f),
                    PathNode.CurveTo(27.72067f, 104.69025f, 29.841845f, 110.22474f, 33.86f, 114.24f),
                    PathNode.LineTo(79.32f, 159.71f),
                    PathNode.LineTo(39.52f, 199.51f),
                    PathNode.CurveTo(34.82558f, 204.20442f, 34.82558f, 211.81558f, 39.52f, 216.51f),
                    PathNode.CurveTo(44.21442f, 221.20442f, 51.82558f, 221.20442f, 56.52f, 216.51f),
                    PathNode.LineTo(96.32f, 176.7f),
                    PathNode.LineTo(141.79f, 222.16f),
                    PathNode.CurveTo(145.53577f, 225.89632f, 150.60936f, 227.99623f, 155.9f, 228.0f),
                    PathNode.CurveTo(156.37f, 228.0f, 156.84f, 228.0f, 157.31f, 227.95f),
                    PathNode.CurveTo(163.08534f, 227.53265f, 168.39635f, 224.63277f, 171.87f, 220.0f),
                    PathNode.CurveTo(175.52435f, 215.15489f, 178.7182f, 209.9791f, 181.41f, 204.54f),
                    PathNode.LineTo(199.13f, 224.03f),
                    PathNode.CurveTo(201.99785f, 227.26274f, 206.3824f, 228.7038f, 210.60889f, 227.80272f),
                    PathNode.CurveTo(214.83537f, 226.90164f, 218.25093f, 223.79764f, 219.55093f, 219.67633f),
                    PathNode.CurveTo(220.85092f, 215.55502f, 219.83453f, 211.05304f, 216.89f, 207.89f),
                    PathNode.Close,
                    PathNode.MoveTo(155.37f, 201.81f),
                    PathNode.LineTo(54.08f, 100.52f),
                    PathNode.CurveTo(62.0f, 95.0f, 70.31f, 92.12f, 78.91f, 91.83f),
                    PathNode.LineTo(163.42f, 184.83f),
                    PathNode.CurveTo(161.61497f, 190.86613f, 158.90047f, 196.59189f, 155.37f, 201.81f),
                    PathNode.Close,
                    PathNode.MoveTo(238.15f, 106.81f),
                    PathNode.LineTo(199.15f, 145.92f),
                    PathNode.CurveTo(194.46939f, 150.61443f, 186.86942f, 150.62561f, 182.175f, 145.945f),
                    PathNode.CurveTo(177.48058f, 141.26439f, 177.46939f, 133.66441f, 182.15f, 128.97f),
                    PathNode.LineTo(218.34f, 92.67f),
                    PathNode.LineTo(163.34f, 37.67f),
                    PathNode.LineTo(130.59f, 70.5f),
                    PathNode.CurveTo(125.90131f, 75.13107f, 118.35527f, 75.11442f, 113.687065f, 70.46269f),
                    PathNode.CurveTo(109.01887f, 65.810974f, 108.97553f, 58.265034f, 113.59f, 53.56f),
                    PathNode.LineTo(149.16f, 17.87f),
                    PathNode.CurveTo(152.91136f, 14.114459f, 158.0018f, 12.004267f, 163.31f, 12.004267f),
                    PathNode.CurveTo(168.61818f, 12.004267f, 173.70863f, 14.114459f, 177.46f, 17.87f),
                    PathNode.LineTo(238.15f, 78.55f),
                    PathNode.CurveTo(245.95764f, 86.36f, 245.95764f, 99.020004f, 238.15f, 106.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
