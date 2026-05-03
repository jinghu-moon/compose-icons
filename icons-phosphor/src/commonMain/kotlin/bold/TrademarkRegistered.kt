package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorBoldIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.7f, 141.42f),
                    PathNode.CurveTo(169.51483f, 132.38274f, 175.00575f, 116.090034f, 170.2752f, 101.139656f),
                    PathNode.CurveTo(165.54466f, 86.18928f, 151.68092f, 76.02072f, 136.0f, 76.0f),
                    PathNode.LineTo(104.0f, 76.0f),
                    PathNode.CurveTo(97.37258f, 76.0f, 92.0f, 81.37258f, 92.0f, 88.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 174.62741f, 97.37258f, 180.0f, 104.0f, 180.0f),
                    PathNode.CurveTo(110.62742f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(132.24f, 148.0f),
                    PathNode.LineTo(150.0f, 174.66f),
                    PathNode.CurveTo(153.67822f, 180.18285f, 161.13715f, 181.67822f, 166.66f, 178.0f),
                    PathNode.CurveTo(172.18285f, 174.32178f, 173.67822f, 166.86285f, 170.0f, 161.34f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 100.0f),
                    PathNode.LineTo(136.0f, 100.0f),
                    PathNode.CurveTo(142.62741f, 100.0f, 148.0f, 105.37258f, 148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 118.62742f, 142.62741f, 124.0f, 136.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
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
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
