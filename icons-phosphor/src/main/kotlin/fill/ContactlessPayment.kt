package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorFillIcon(
            name = "ContactlessPayment",
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
                    PathNode.MoveTo(97.07f, 155.74f),
                    PathNode.CurveTo(95.76844f, 158.32887f, 93.168686f, 160.0116f, 90.27382f, 160.13887f),
                    PathNode.CurveTo(87.37896f, 160.26613f, 84.64157f, 158.81807f, 83.11783f, 156.35338f),
                    PathNode.CurveTo(81.5941f, 153.88869f, 81.52225f, 150.79272f, 82.93f, 148.26f),
                    PathNode.CurveTo(89.73035f, 135.6093f, 89.73035f, 120.39071f, 82.93f, 107.74f),
                    PathNode.CurveTo(80.97444f, 103.850266f, 82.48837f, 99.11083f, 86.33674f, 97.075066f),
                    PathNode.CurveTo(90.185104f, 95.0393f, 94.954895f, 96.45466f, 97.07f, 100.26f),
                    PathNode.CurveTo(106.2492f, 117.6143f, 106.2492f, 138.3857f, 97.07f, 155.74f),
                    PathNode.Close,
                    PathNode.MoveTo(125.07f, 171.74f),
                    PathNode.CurveTo(123.75505f, 174.31442f, 121.15351f, 175.9792f, 118.26501f, 176.09464f),
                    PathNode.CurveTo(115.3765f, 176.21008f, 112.650406f, 174.75822f, 111.13421f, 172.29695f),
                    PathNode.CurveTo(109.61801f, 169.83565f, 109.54759f, 166.74785f, 110.95f, 164.22f),
                    PathNode.CurveTo(123.01934f, 141.56734f, 123.01934f, 114.39266f, 110.95f, 91.74f),
                    PathNode.CurveTo(109.54759f, 89.21215f, 109.61801f, 86.12435f, 111.13421f, 83.66306f),
                    PathNode.CurveTo(112.650406f, 81.20178f, 115.3765f, 79.74992f, 118.26501f, 79.86537f),
                    PathNode.CurveTo(121.15351f, 79.9808f, 123.75505f, 81.64557f, 125.07f, 84.22f),
                    PathNode.CurveTo(139.65887f, 111.577415f, 139.65512f, 144.40591f, 125.06f, 171.76f),
                    PathNode.Close,
                    PathNode.MoveTo(153.07f, 187.74f),
                    PathNode.CurveTo(150.81851f, 191.25037f, 146.24808f, 192.44229f, 142.56902f, 190.47855f),
                    PathNode.CurveTo(138.88992f, 188.51482f, 137.33656f, 184.05424f, 139.0f, 180.23f),
                    PathNode.CurveTo(156.47581f, 147.60274f, 156.47581f, 108.39726f, 139.0f, 75.77f),
                    PathNode.CurveTo(136.9179f, 71.87087f, 138.39087f, 67.02211f, 142.29f, 64.94f),
                    PathNode.CurveTo(146.18913f, 62.857887f, 151.03789f, 64.33087f, 153.12f, 68.23f),
                    PathNode.CurveTo(173.08858f, 105.57937f, 173.06982f, 150.43735f, 153.07f, 187.77f),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
