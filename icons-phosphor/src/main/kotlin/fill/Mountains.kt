package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorFillIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(254.88f, 195.92f),
                    PathNode.LineTo(200.32f, 103.84f),
                    PathNode.CurveTo(197.45634f, 98.958244f, 192.20961f, 95.97099f, 186.55f, 96.0f),
                    PathNode.LineTo(186.55f, 96.0f),
                    PathNode.CurveTo(180.89287f, 95.97045f, 175.64886f, 98.95831f, 172.79f, 103.84f),
                    PathNode.LineTo(157.15f, 130.23f),
                    PathNode.CurveTo(156.4082f, 131.48528f, 156.4082f, 133.04474f, 157.15f, 134.3f),
                    PathNode.LineTo(183.95f, 179.77f),
                    PathNode.CurveTo(186.05534f, 183.26292f, 185.247f, 187.77518f, 182.06f, 190.32f),
                    PathNode.CurveTo(180.24344f, 191.73042f, 177.90773f, 192.29083f, 175.64897f, 191.85822f),
                    PathNode.CurveTo(173.3902f, 191.42561f, 171.42686f, 190.04182f, 170.26f, 188.06f),
                    PathNode.LineTo(101.79f, 71.88f),
                    PathNode.CurveTo(98.91505f, 66.99389f, 93.66916f, 63.99393f, 88.0f, 63.99393f),
                    PathNode.CurveTo(82.33084f, 63.99393f, 77.08495f, 66.99389f, 74.21f, 71.88f),
                    PathNode.LineTo(1.11f, 195.94f),
                    PathNode.CurveTo(-0.701393f, 198.9847f, -0.294517f, 202.85815f, 2.11f, 205.46f),
                    PathNode.CurveTo(3.703998f, 207.12677f, 5.924221f, 208.04823f, 8.23f, 208.0f),
                    PathNode.LineTo(247.77f, 208.0f),
                    PathNode.CurveTo(250.0655f, 208.0299f, 252.27065f, 207.10657f, 253.86f, 205.45f),
                    PathNode.CurveTo(256.27585f, 202.85107f, 256.6911f, 198.97134f, 254.88f, 195.92f),
                    PathNode.Close,
                    PathNode.MoveTo(64.43f, 120.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.LineTo(111.57f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 52.0f),
                    PathNode.CurveTo(140.0f, 38.745167f, 150.74516f, 28.0f, 164.0f, 28.0f),
                    PathNode.CurveTo(177.25484f, 28.0f, 188.0f, 38.745167f, 188.0f, 52.0f),
                    PathNode.CurveTo(188.0f, 65.25484f, 177.25484f, 76.0f, 164.0f, 76.0f),
                    PathNode.CurveTo(150.74516f, 76.0f, 140.0f, 65.25484f, 140.0f, 52.0f),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
