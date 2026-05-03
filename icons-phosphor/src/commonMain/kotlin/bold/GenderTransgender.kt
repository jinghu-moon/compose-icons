package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorBoldIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(172.0f, 28.0f),
                    PathNode.CurveTo(165.37259f, 28.0f, 160.0f, 33.37258f, 160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 46.62742f, 165.37259f, 52.0f, 172.0f, 52.0f),
                    PathNode.LineTo(187.0f, 52.0f),
                    PathNode.LineTo(168.0f, 71.0f),
                    PathNode.LineTo(152.49f, 55.52f),
                    PathNode.CurveTo(147.79558f, 50.82558f, 140.18442f, 50.82558f, 135.49f, 55.52f),
                    PathNode.CurveTo(130.79558f, 60.21442f, 130.79558f, 67.82558f, 135.49f, 72.52f),
                    PathNode.LineTo(151.0f, 88.0f),
                    PathNode.LineTo(140.58f, 98.46f),
                    PathNode.CurveTo(108.47338f, 75.21921f, 63.89689f, 80.554726f, 38.182186f, 110.71635f),
                    PathNode.CurveTo(12.467495f, 140.87798f, 14.249745f, 185.73726f, 42.276245f, 213.76376f),
                    PathNode.CurveTo(70.30274f, 241.79025f, 115.162025f, 243.57251f, 145.32365f, 217.8578f),
                    PathNode.CurveTo(175.48528f, 192.14313f, 180.82079f, 147.56662f, 157.58f, 115.46f),
                    PathNode.LineTo(168.0f, 105.0f),
                    PathNode.LineTo(183.51f, 120.52f),
                    PathNode.CurveTo(188.20442f, 125.21442f, 195.81558f, 125.21442f, 200.51f, 120.52f),
                    PathNode.CurveTo(205.20442f, 115.82558f, 205.20442f, 108.214424f, 200.51f, 103.52f),
                    PathNode.LineTo(185.0f, 88.0f),
                    PathNode.LineTo(204.0f, 69.0f),
                    PathNode.LineTo(204.0f, 84.0f),
                    PathNode.CurveTo(204.0f, 90.62742f, 209.37259f, 96.0f, 216.0f, 96.0f),
                    PathNode.CurveTo(222.62741f, 96.0f, 228.0f, 90.62742f, 228.0f, 84.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.77f, 196.8f),
                    PathNode.CurveTo(115.230415f, 214.34001f, 87.74395f, 217.04953f, 67.117165f, 203.27185f),
                    PathNode.CurveTo(46.490376f, 189.49417f, 38.46672f, 163.06563f, 47.952248f, 140.1459f),
                    PathNode.CurveTo(57.437775f, 117.22618f, 81.79127f, 104.1972f, 106.12183f, 109.025505f),
                    PathNode.CurveTo(130.4524f, 113.85381f, 147.98526f, 135.19499f, 148.0f, 160.0f),
                    PathNode.CurveTo(148.0027f, 173.80066f, 142.52455f, 187.03746f, 132.77f, 196.8f),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
