package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorBoldIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.09f, 41.5f),
                    PathNode.CurveTo(239.88023f, 38.070732f, 236.07957f, 35.99902f, 232.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(147.30386f, 35.995583f, 143.03671f, 38.730934f, 141.08f, 43.0f),
                    PathNode.LineTo(133.36f, 60.0f),
                    PathNode.LineTo(28.0f, 60.0f),
                    PathNode.CurveTo(23.25091f, 60.00046f, 18.948883f, 62.80163f, 17.027325f, 67.14461f),
                    PathNode.CurveTo(15.105767f, 71.48759f, 15.926237f, 76.555214f, 19.12f, 80.07f),
                    PathNode.LineTo(51.78f, 116.0f),
                    PathNode.LineTo(19.12f, 151.93f),
                    PathNode.CurveTo(15.926237f, 155.4448f, 15.105767f, 160.5124f, 17.027325f, 164.8554f),
                    PathNode.CurveTo(18.948883f, 169.19836f, 23.25091f, 171.99954f, 28.0f, 172.0f),
                    PathNode.LineTo(101.09f, 172.0f),
                    PathNode.CurveTo(105.78251f, 172.0005f, 110.044785f, 169.26578f, 112.0f, 165.0f),
                    PathNode.LineTo(119.71f, 148.0f),
                    PathNode.LineTo(173.34f, 148.0f),
                    PathNode.LineTo(141.06f, 219.0f),
                    PathNode.CurveTo(138.29857f, 225.03647f, 140.95352f, 232.16858f, 146.99f, 234.93f),
                    PathNode.CurveTo(153.02647f, 237.69142f, 160.15857f, 235.03647f, 162.92f, 229.0f),
                    PathNode.LineTo(242.92f, 53.0f),
                    PathNode.CurveTo(244.62367f, 49.276154f, 244.31076f, 44.940605f, 242.09f, 41.5f),
                    PathNode.Close,
                    PathNode.MoveTo(55.13f, 148.0f),
                    PathNode.LineTo(76.88f, 124.07f),
                    PathNode.CurveTo(81.038445f, 119.49356f, 81.038445f, 112.50644f, 76.88f, 107.93f),
                    PathNode.LineTo(55.13f, 84.0f),
                    PathNode.LineTo(122.45f, 84.0f),
                    PathNode.LineTo(93.36f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.27f, 124.0f),
                    PathNode.LineTo(130.64f, 124.0f),
                    PathNode.LineTo(159.73f, 60.0f),
                    PathNode.LineTo(213.36f, 60.0f),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
