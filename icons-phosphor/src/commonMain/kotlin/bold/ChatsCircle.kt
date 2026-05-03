package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorBoldIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.34f, 187.09f),
                    PathNode.CurveTo(247.38872f, 163.06012f, 246.47478f, 135.22987f, 233.87329f, 111.97665f),
                    PathNode.CurveTo(221.2718f, 88.72342f, 198.4546f, 72.76311f, 172.29f, 68.9f),
                    PathNode.CurveTo(152.70538f, 27.10371f, 103.06584f, 8.939623f, 61.13039f, 28.224487f),
                    PathNode.CurveTo(19.194946f, 47.509354f, 0.675895f, 97.01755f, 19.66f, 139.09f),
                    PathNode.LineTo(12.82f, 162.35f),
                    PathNode.CurveTo(10.755282f, 169.37126f, 12.690445f, 176.95956f, 17.86544f, 182.13457f),
                    PathNode.CurveTo(23.040434f, 187.30956f, 30.62874f, 189.24472f, 37.65f, 187.18f),
                    PathNode.LineTo(60.91f, 180.34f),
                    PathNode.CurveTo(68.1391f, 183.65344f, 75.80237f, 185.92279f, 83.67f, 187.08f),
                    PathNode.CurveTo(103.0627f, 229.22139f, 152.92755f, 247.68687f, 195.09f, 228.34f),
                    PathNode.LineTo(218.35f, 235.18f),
                    PathNode.CurveTo(225.37126f, 237.24472f, 232.95956f, 235.30956f, 238.13457f, 230.13457f),
                    PathNode.CurveTo(243.30956f, 224.95956f, 245.24472f, 217.37126f, 243.18f, 210.35f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 155.5f),
                    PathNode.CurveTo(60.852264f, 155.49872f, 59.710396f, 155.66377f, 58.61f, 155.99f),
                    PathNode.LineTo(37.89f, 162.08f),
                    PathNode.LineTo(44.0f, 141.35f),
                    PathNode.CurveTo(44.87619f, 138.34357f, 44.54244f, 135.11374f, 43.07f, 132.35f),
                    PathNode.CurveTo(29.007946f, 106.14313f, 36.266403f, 73.58989f, 60.129738f, 55.83931f),
                    PathNode.CurveTo(83.993065f, 38.088734f, 117.25853f, 40.49852f, 138.3144f, 61.50309f),
                    PathNode.CurveTo(159.37025f, 82.50765f, 161.86118f, 115.76716f, 144.16885f, 139.6737f),
                    PathNode.CurveTo(126.476524f, 163.58026f, 93.94109f, 170.91809f, 67.7f, 156.92f),
                    PathNode.CurveTo(65.94698f, 155.98175f, 63.9883f, 155.4938f, 62.0f, 155.5f),
                    PathNode.Close,
                    PathNode.MoveTo(212.89f, 180.3f),
                    PathNode.CurveTo(211.41756f, 183.06372f, 211.08382f, 186.29358f, 211.96f, 189.3f),
                    PathNode.LineTo(218.05f, 210.03f),
                    PathNode.LineTo(197.36f, 204.0f),
                    PathNode.CurveTo(194.33513f, 203.10739f, 191.08044f, 203.44148f, 188.3f, 204.93f),
                    PathNode.CurveTo(161.6061f, 219.20206f, 128.46164f, 211.35544f, 111.0f, 186.63f),
                    PathNode.CurveTo(154.24757f, 178.81766f, 184.14569f, 138.96658f, 179.55f, 95.26f),
                    PathNode.CurveTo(196.16345f, 100.98301f, 209.4332f, 113.70103f, 215.85614f, 130.05663f),
                    PathNode.CurveTo(222.27908f, 146.41223f, 221.2096f, 164.76135f, 212.93f, 180.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
