package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorFillIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.CurveTo(215.93976f, 200.49808f, 176.69781f, 239.8294f, 128.2f, 240.0f),
                    PathNode.CurveTo(77.54f, 240.12f, 37.99f, 197.0f, 40.08f, 146.38f),
                    PathNode.CurveTo(41.29f, 117.17f, 51.79f, 85.84f, 69.31f, 59.56f),
                    PathNode.CurveTo(87.5f, 32.29f, 109.43f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(141.25f, 16.0f, 156.23f, 24.32f, 170.34f, 39.0f),
                    PathNode.CurveTo(171.78851f, 40.510563f, 171.82776f, 42.882347f, 170.43f, 44.44f),
                    PathNode.LineTo(122.0f, 98.67f),
                    PathNode.CurveTo(120.133705f, 100.75589f, 119.493256f, 103.66547f, 120.3112f, 106.34221f),
                    PathNode.CurveTo(121.12916f, 109.01895f, 123.28655f, 111.07357f, 126.0f, 111.76f),
                    PathNode.LineTo(150.61f, 117.91f),
                    PathNode.LineTo(144.1f, 150.43f),
                    PathNode.CurveTo(143.23592f, 154.76262f, 146.04747f, 158.97545f, 150.38f, 159.84f),
                    PathNode.CurveTo(150.91283f, 159.95044f, 151.45586f, 160.00406f, 152.0f, 160.0f),
                    PathNode.CurveTo(155.80762f, 159.99313f, 159.08276f, 157.30357f, 159.83f, 153.57f),
                    PathNode.LineTo(167.83f, 113.57f),
                    PathNode.CurveTo(168.66776f, 109.38394f, 166.07104f, 105.277626f, 161.93f, 104.24f),
                    PathNode.LineTo(142.77f, 99.45f),
                    PathNode.LineTo(179.66f, 58.12f),
                    PathNode.CurveTo(180.47957f, 57.201366f, 181.67648f, 56.711296f, 182.90498f, 56.791374f),
                    PathNode.CurveTo(184.13345f, 56.87145f, 185.25662f, 57.51275f, 185.95f, 58.53f),
                    PathNode.CurveTo(186.19f, 58.87f, 186.42f, 59.21f, 186.65f, 59.53f),
                    PathNode.CurveTo(205.3f, 87.54f, 216.0f, 121.23f, 216.0f, 152.0f),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
