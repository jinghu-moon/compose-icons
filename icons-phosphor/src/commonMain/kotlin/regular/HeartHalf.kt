package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorRegularIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(169.47f, 56.79f),
                    PathNode.CurveTo(173.81372f, 55.97814f, 176.67686f, 51.79872f, 175.865f, 47.455f),
                    PathNode.CurveTo(175.05315f, 43.111282f, 170.87372f, 40.248142f, 166.53f, 41.06f),
                    PathNode.CurveTo(150.42f, 44.08f, 137.0f, 52.18f, 128.0f, 64.0f),
                    PathNode.CurveTo(116.74f, 49.0f, 98.64f, 40.0f, 78.0f, 40.0f),
                    PathNode.CurveTo(43.774338f, 40.03858f, 16.038576f, 67.77434f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.0f, 172.0f, 119.79f, 228.67f, 124.21f, 231.0f),
                    PathNode.CurveTo(126.5731f, 232.28575f, 129.42691f, 232.28575f, 131.79f, 231.0f),
                    PathNode.LineTo(131.79f, 231.0f),
                    PathNode.CurveTo(146.14108f, 222.9555f, 159.87546f, 213.8572f, 172.88f, 203.78f),
                    PathNode.CurveTo(175.23825f, 202.06958f, 176.4803f, 199.21242f, 176.12244f, 196.32126f),
                    PathNode.CurveTo(175.76456f, 193.4301f, 173.86334f, 190.96202f, 171.15921f, 189.87822f),
                    PathNode.CurveTo(168.45508f, 188.79443f, 165.37558f, 189.26628f, 163.12f, 191.11f),
                    PathNode.CurveTo(152.81f, 199.05f, 143.12f, 205.48f, 136.0f, 209.93f),
                    PathNode.LineTo(136.0f, 81.7f),
                    PathNode.CurveTo(141.84f, 68.75f, 153.94f, 59.7f, 169.47f, 56.79f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 210.0f),
                    PathNode.CurveTo(93.58f, 193.41f, 32.0f, 149.71f, 32.0f, 102.0f),
                    PathNode.CurveTo(32.033054f, 76.608604f, 52.608604f, 56.033054f, 78.0f, 56.0f),
                    PathNode.CurveTo(96.91f, 56.0f, 112.86f, 65.78f, 120.0f, 81.64f),
                    PathNode.Close,
                    PathNode.MoveTo(232.55f, 104.0f),
                    PathNode.CurveTo(232.25352f, 104.01492f, 231.95648f, 104.01492f, 231.66f, 104.0f),
                    PathNode.CurveTo(227.58665f, 103.99417f, 224.16806f, 100.92863f, 223.72f, 96.88f),
                    PathNode.CurveTo(222.22762f, 83.39434f, 214.8428f, 71.26083f, 203.55f, 63.74f),
                    PathNode.CurveTo(201.09445f, 62.184635f, 199.67575f, 59.419758f, 199.84424f, 56.517956f),
                    PathNode.CurveTo(200.01273f, 53.616154f, 201.7419f, 51.034054f, 204.36095f, 49.773335f),
                    PathNode.CurveTo(206.98001f, 48.51262f, 210.0768f, 48.77167f, 212.45f, 50.45f),
                    PathNode.CurveTo(227.6664f, 60.589886f, 237.61417f, 76.944954f, 239.62f, 95.12f),
                    PathNode.CurveTo(239.8672f, 97.236435f, 239.25986f, 99.36404f, 237.93263f, 101.03104f),
                    PathNode.CurveTo(236.60542f, 102.69804f, 234.66801f, 103.76668f, 232.55f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.46f, 139.62f),
                    PathNode.CurveTo(224.79f, 150.99f, 216.52f, 162.62f, 205.87f, 174.11f),
                    PathNode.CurveTo(203.95554f, 176.30908f, 200.99628f, 177.29245f, 198.14638f, 176.67659f),
                    PathNode.CurveTo(195.2965f, 176.06073f, 193.00735f, 173.94319f, 192.17175f, 171.14981f),
                    PathNode.CurveTo(191.33615f, 168.35643f, 192.08644f, 165.32967f, 194.13f, 163.25f),
                    PathNode.CurveTo(203.74f, 152.85f, 211.13f, 142.5f, 216.13f, 132.48f),
                    PathNode.CurveTo(217.3511f, 129.83081f, 219.91739f, 128.05627f, 222.8271f, 127.84907f),
                    PathNode.CurveTo(225.73682f, 127.64188f, 228.52866f, 129.03487f, 230.11282f, 131.4843f),
                    PathNode.CurveTo(231.697f, 133.93373f, 231.82237f, 137.05127f, 230.44f, 139.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
