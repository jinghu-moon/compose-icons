package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorBoldIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(65.87f, 20.0f, 36.0f, 67.44f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 188.56f, 65.87f, 236.0f, 104.0f, 236.0f),
                    PathNode.LineTo(152.0f, 236.0f),
                    PathNode.CurveTo(190.13f, 236.0f, 220.0f, 188.56f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 67.44f, 190.13f, 20.0f, 152.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.21f, 172.0f),
                    PathNode.LineTo(166.31f, 172.0f),
                    PathNode.CurveTo(169.13531f, 161.53627f, 170.90746f, 150.8163f, 171.6f, 140.0f),
                    PathNode.LineTo(195.53f, 140.0f),
                    PathNode.CurveTo(194.74205f, 150.88527f, 192.61948f, 161.63248f, 189.21f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.6f, 116.0f),
                    PathNode.CurveTo(170.90746f, 105.1837f, 169.13531f, 94.46373f, 166.31f, 84.0f),
                    PathNode.LineTo(189.21f, 84.0f),
                    PathNode.CurveTo(192.61948f, 94.36752f, 194.74205f, 105.11472f, 195.53f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.23f, 60.0f),
                    PathNode.LineTo(157.23f, 60.0f),
                    PathNode.CurveTo(154.41762f, 54.35824f, 151.06886f, 49.00021f, 147.23f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(157.37f, 44.0f, 167.25f, 46.25f, 177.23f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.77f, 189.84f),
                    PathNode.CurveTo(65.24f, 173.51f, 60.0f, 151.55f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 104.45f, 65.24f, 82.49f, 74.77f, 66.16f),
                    PathNode.CurveTo(86.0f, 46.88f, 97.91f, 44.0f, 104.0f, 44.0f),
                    PathNode.CurveTo(110.09f, 44.0f, 122.0f, 46.88f, 133.23f, 66.16f),
                    PathNode.CurveTo(142.76f, 82.49f, 148.0f, 104.45f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 151.55f, 142.76f, 173.51f, 133.23f, 189.84f),
                    PathNode.CurveTo(122.0f, 209.12f, 110.09f, 212.0f, 104.0f, 212.0f),
                    PathNode.CurveTo(97.91f, 212.0f, 86.0f, 209.12f, 74.77f, 189.84f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 212.0f),
                    PathNode.LineTo(147.21f, 212.0f),
                    PathNode.CurveTo(151.04886f, 206.99979f, 154.39763f, 201.64175f, 157.21f, 196.0f),
                    PathNode.LineTo(177.21f, 196.0f),
                    PathNode.CurveTo(167.25f, 209.75f, 157.37f, 212.0f, 152.0f, 212.0f),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
