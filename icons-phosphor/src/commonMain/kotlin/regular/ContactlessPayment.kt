package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorRegularIcon(
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
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.07f, 100.26f),
                    PathNode.CurveTo(106.2492f, 117.6143f, 106.2492f, 138.3857f, 97.07f, 155.74f),
                    PathNode.CurveTo(95.76844f, 158.32887f, 93.168686f, 160.0116f, 90.27382f, 160.13887f),
                    PathNode.CurveTo(87.37896f, 160.26613f, 84.64157f, 158.81807f, 83.11783f, 156.35338f),
                    PathNode.CurveTo(81.5941f, 153.88869f, 81.52225f, 150.79272f, 82.93f, 148.26f),
                    PathNode.CurveTo(89.73035f, 135.6093f, 89.73035f, 120.39071f, 82.93f, 107.74f),
                    PathNode.CurveTo(80.97444f, 103.850266f, 82.48837f, 99.11083f, 86.33674f, 97.075066f),
                    PathNode.CurveTo(90.185104f, 95.0393f, 94.954895f, 96.45466f, 97.07f, 100.26f),
                    PathNode.Close,
                    PathNode.MoveTo(153.07f, 68.26f),
                    PathNode.CurveTo(173.0542f, 105.60101f, 173.0542f, 150.45898f, 153.07f, 187.8f),
                    PathNode.CurveTo(150.85815f, 191.43172f, 146.1917f, 192.69852f, 142.44702f, 190.68379f),
                    PathNode.CurveTo(138.70236f, 188.66907f, 137.18814f, 184.07692f, 139.0f, 180.23f),
                    PathNode.CurveTo(156.47581f, 147.60274f, 156.47581f, 108.39726f, 139.0f, 75.77f),
                    PathNode.CurveTo(136.9179f, 71.87087f, 138.39087f, 67.02211f, 142.29f, 64.94f),
                    PathNode.CurveTo(146.18913f, 62.857887f, 151.03789f, 64.33087f, 153.12f, 68.23f),
                    PathNode.Close,
                    PathNode.MoveTo(125.07f, 84.26f),
                    PathNode.CurveTo(139.65489f, 111.61044f, 139.65489f, 144.42955f, 125.07f, 171.78f),
                    PathNode.CurveTo(123.75505f, 174.35443f, 121.15351f, 176.0192f, 118.26501f, 176.13464f),
                    PathNode.CurveTo(115.3765f, 176.25008f, 112.650406f, 174.79822f, 111.13421f, 172.33693f),
                    PathNode.CurveTo(109.61801f, 169.87567f, 109.54759f, 166.78784f, 110.95f, 164.26f),
                    PathNode.CurveTo(123.03178f, 141.61044f, 123.03178f, 114.42956f, 110.95f, 91.78f),
                    PathNode.CurveTo(109.54759f, 89.25215f, 109.61801f, 86.16435f, 111.13421f, 83.703064f),
                    PathNode.CurveTo(112.650406f, 81.24178f, 115.3765f, 79.789925f, 118.26501f, 79.90536f),
                    PathNode.CurveTo(121.15351f, 80.0208f, 123.75505f, 81.68557f, 125.07f, 84.26f),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
