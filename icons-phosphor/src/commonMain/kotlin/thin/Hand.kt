package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorThinIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 52.0f),
                    PathNode.CurveTo(182.09235f, 51.99565f, 176.39243f, 54.179436f, 172.0f, 58.13f),
                    PathNode.LineTo(172.0f, 44.0f),
                    PathNode.CurveTo(171.98312f, 31.107822f, 161.78381f, 20.532152f, 148.90068f, 20.04833f),
                    PathNode.CurveTo(136.0176f, 19.564508f, 125.053795f, 29.345402f, 124.07f, 42.2f),
                    PathNode.CurveTo(117.031204f, 35.854465f, 106.91748f, 34.24509f, 98.25673f, 38.092392f),
                    PathNode.CurveTo(89.59598f, 41.939693f, 84.01014f, 50.523174f, 84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 138.0f),
                    PathNode.LineTo(72.75f, 119.94f),
                    PathNode.CurveTo(66.14468f, 108.44695f, 51.473045f, 104.48467f, 39.98f, 111.09f),
                    PathNode.CurveTo(28.486954f, 117.69533f, 24.524673f, 132.36696f, 31.13f, 143.86f),
                    PathNode.CurveTo(64.44f, 214.12f, 82.17f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.37135f, 235.9504f, 211.9504f, 198.37135f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 76.0f),
                    PathNode.CurveTo(212.0f, 62.745167f, 201.25484f, 52.0f, 188.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 152.0f),
                    PathNode.CurveTo(203.95041f, 193.95308f, 169.95308f, 227.95041f, 128.0f, 228.0f),
                    PathNode.CurveTo(90.71f, 228.0f, 74.41f, 216.49f, 38.29f, 140.29f),
                    PathNode.LineTo(38.14f, 140.0f),
                    PathNode.CurveTo(33.85382f, 132.36073f, 36.507305f, 122.69502f, 44.09311f, 118.31491f),
                    PathNode.CurveTo(51.678913f, 113.9348f, 61.37662f, 116.46882f, 65.85f, 124.0f),
                    PathNode.CurveTo(65.877f, 124.03775f, 65.90043f, 124.07792f, 65.92f, 124.12f),
                    PathNode.LineTo(84.6f, 154.12f),
                    PathNode.CurveTo(85.54273f, 155.6412f, 87.38121f, 156.35109f, 89.101654f, 155.85822f),
                    PathNode.CurveTo(90.82209f, 155.36533f, 92.005775f, 153.78964f, 92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.CurveTo(92.0f, 51.163445f, 99.163445f, 44.0f, 108.0f, 44.0f),
                    PathNode.CurveTo(116.836555f, 44.0f, 124.0f, 51.163445f, 124.0f, 60.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.CurveTo(124.0f, 122.20914f, 125.79086f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(130.20914f, 124.0f, 132.0f, 122.20914f, 132.0f, 120.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.CurveTo(132.0f, 35.163445f, 139.16344f, 28.0f, 148.0f, 28.0f),
                    PathNode.CurveTo(156.83656f, 28.0f, 164.0f, 35.163445f, 164.0f, 44.0f),
                    PathNode.LineTo(164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 122.20914f, 165.79086f, 124.0f, 168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 122.20914f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 67.163445f, 179.16344f, 60.0f, 188.0f, 60.0f),
                    PathNode.CurveTo(196.83656f, 60.0f, 204.0f, 67.163445f, 204.0f, 76.0f),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
