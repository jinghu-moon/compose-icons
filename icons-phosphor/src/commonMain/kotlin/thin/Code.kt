package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorThinIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(66.56f, 91.07f),
                    PathNode.LineTo(22.25f, 128.0f),
                    PathNode.LineTo(66.56f, 164.93f),
                    PathNode.CurveTo(67.85131f, 166.00856f, 68.329666f, 167.77988f, 67.75684f, 169.36185f),
                    PathNode.CurveTo(67.18402f, 170.94382f, 65.68249f, 171.99823f, 64.0f, 172.0f),
                    PathNode.CurveTo(63.063244f, 172.00418f, 62.155643f, 171.67447f, 61.44f, 171.07f),
                    PathNode.LineTo(13.44f, 131.07f),
                    PathNode.CurveTo(12.530095f, 130.31001f, 12.004196f, 129.18555f, 12.004196f, 128.0f),
                    PathNode.CurveTo(12.004196f, 126.81445f, 12.530095f, 125.689995f, 13.44f, 124.93f),
                    PathNode.LineTo(61.44f, 84.93f),
                    PathNode.CurveTo(63.142242f, 83.61326f, 65.58119f, 83.87935f, 66.95945f, 85.53218f),
                    PathNode.CurveTo(68.33771f, 87.18501f, 68.1612f, 89.63208f, 66.56f, 91.07f),
                    PathNode.Close,
                    PathNode.MoveTo(242.56f, 124.93f),
                    PathNode.LineTo(194.56f, 84.93f),
                    PathNode.CurveTo(193.47072f, 83.95179f, 191.93404f, 83.646835f, 190.55376f, 84.13496f),
                    PathNode.CurveTo(189.17346f, 84.62309f, 188.17014f, 85.8263f, 187.93799f, 87.27183f),
                    PathNode.CurveTo(187.70584f, 88.71736f, 188.28197f, 90.174225f, 189.44f, 91.07f),
                    PathNode.LineTo(233.75f, 128.0f),
                    PathNode.LineTo(189.44f, 164.93f),
                    PathNode.CurveTo(188.28197f, 165.82578f, 187.70584f, 167.28264f, 187.93799f, 168.72816f),
                    PathNode.CurveTo(188.17014f, 170.17369f, 189.17346f, 171.3769f, 190.55376f, 171.86504f),
                    PathNode.CurveTo(191.93404f, 172.35316f, 193.47072f, 172.04822f, 194.56f, 171.07f),
                    PathNode.LineTo(242.56f, 131.07f),
                    PathNode.CurveTo(243.46991f, 130.31001f, 243.9958f, 129.18555f, 243.9958f, 128.0f),
                    PathNode.CurveTo(243.9958f, 126.81445f, 243.46991f, 125.689995f, 242.56f, 124.93f),
                    PathNode.Close,
                    PathNode.MoveTo(161.37f, 36.24f),
                    PathNode.CurveTo(160.37282f, 35.876152f, 159.27191f, 35.923588f, 158.3097f, 36.37186f),
                    PathNode.CurveTo(157.3475f, 36.820137f, 156.60295f, 37.632484f, 156.24f, 38.63f),
                    PathNode.LineTo(92.24f, 214.63f),
                    PathNode.CurveTo(91.87615f, 215.62718f, 91.923584f, 216.72809f, 92.371864f, 217.6903f),
                    PathNode.CurveTo(92.82014f, 218.6525f, 93.632484f, 219.39705f, 94.63f, 219.76f),
                    PathNode.CurveTo(95.06976f, 219.91707f, 95.533035f, 219.99821f, 96.0f, 220.0f),
                    PathNode.CurveTo(97.68155f, 220.00081f, 99.18407f, 218.94984f, 99.76f, 217.37f),
                    PathNode.LineTo(163.76f, 41.37f),
                    PathNode.CurveTo(164.12386f, 40.37281f, 164.07642f, 39.271893f, 163.62814f, 38.309696f),
                    PathNode.CurveTo(163.17987f, 37.347504f, 162.36752f, 36.602943f, 161.37f, 36.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _code!!
    }

private var _code: ImageVector? = null
