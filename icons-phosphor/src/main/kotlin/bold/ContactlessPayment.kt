package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorBoldIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.58f, 66.35f),
                    PathNode.CurveTo(173.2007f, 104.86354f, 173.2007f, 151.13646f, 152.58f, 189.65f),
                    PathNode.CurveTo(150.60019f, 193.50307f, 146.69737f, 195.98999f, 142.36864f, 196.15678f),
                    PathNode.CurveTo(138.03989f, 196.3236f, 133.95728f, 194.1444f, 131.68681f, 190.45511f),
                    PathNode.CurveTo(129.41635f, 186.76582f, 129.31056f, 182.13922f, 131.41f, 178.35f),
                    PathNode.CurveTo(148.24573f, 146.89436f, 148.24573f, 109.10563f, 131.41f, 77.65f),
                    PathNode.CurveTo(129.22841f, 73.85567f, 129.28566f, 69.17451f, 131.5594f, 65.43466f),
                    PathNode.CurveTo(133.83315f, 61.69482f, 137.96269f, 59.48953f, 142.33534f, 59.680027f),
                    PathNode.CurveTo(146.708f, 59.87052f, 150.63011f, 62.426586f, 152.57f, 66.35f),
                    PathNode.Close,
                    PathNode.MoveTo(100.36f, 77.41f),
                    PathNode.CurveTo(97.54304f, 78.8975f, 95.433136f, 81.44403f, 94.49525f, 84.48842f),
                    PathNode.CurveTo(93.55736f, 87.5328f, 93.86846f, 90.82519f, 95.36f, 93.64f),
                    PathNode.CurveTo(106.816f, 115.114334f, 106.816f, 140.88567f, 95.36f, 162.36f),
                    PathNode.CurveTo(93.256386f, 166.15178f, 93.36202f, 170.78348f, 95.636314f, 174.4754f),
                    PathNode.CurveTo(97.910614f, 178.16733f, 101.99975f, 180.34511f, 106.33251f, 180.17195f),
                    PathNode.CurveTo(110.66526f, 179.99881f, 114.56757f, 177.50165f, 116.54f, 173.64f),
                    PathNode.CurveTo(131.75067f, 145.11433f, 131.75067f, 110.885666f, 116.54f, 82.36f),
                    PathNode.CurveTo(113.42548f, 76.54144f, 106.1969f, 74.32998f, 100.36f, 77.41f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 81.60808f, 174.39192f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(81.60808f, 44.0f, 44.0f, 81.60808f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 174.39192f, 81.60808f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(174.37135f, 211.9504f, 211.9504f, 174.37135f, 212.0f, 128.0f),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
