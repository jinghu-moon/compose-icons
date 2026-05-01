package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorFillIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(145.67311f, 24.0f, 160.0f, 38.32689f, 160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 73.67311f, 145.67311f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(110.32689f, 88.0f, 96.0f, 73.67311f, 96.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.0f, 99.36f),
                    PathNode.CurveTo(219.5f, 98.16f, 183.78f, 70.36f, 131.49f, 105.93f),
                    PathNode.CurveTo(86.0f, 136.84f, 59.57f, 126.23f, 59.32f, 126.12f),
                    PathNode.CurveTo(56.7116f, 124.888176f, 53.642036f, 125.15599f, 51.286377f, 126.82092f),
                    PathNode.CurveTo(48.930717f, 128.48586f, 47.653812f, 131.29004f, 47.944477f, 134.16f),
                    PathNode.CurveTo(48.235134f, 137.02995f, 50.048355f, 139.52118f, 52.69f, 140.68f),
                    PathNode.CurveTo(53.3f, 140.96f, 60.18f, 143.95f, 72.36f, 143.95f),
                    PathNode.CurveTo(86.57f, 143.95f, 108.0f, 139.84f, 135.13f, 122.66f),
                    PathNode.CurveTo(132.85f, 152.07f, 122.4f, 206.13f, 61.7f, 224.34f),
                    PathNode.CurveTo(58.90165f, 225.10999f, 56.739815f, 227.33516f, 56.050957f, 230.15459f),
                    PathNode.CurveTo(55.362103f, 232.974f, 56.254288f, 235.94536f, 58.382305f, 237.91898f),
                    PathNode.CurveTo(60.510323f, 239.8926f, 63.54035f, 240.55887f, 66.3f, 239.66f),
                    PathNode.CurveTo(101.13f, 229.21f, 125.75f, 207.32f, 139.5f, 174.58f),
                    PathNode.CurveTo(141.45505f, 169.89798f, 143.15749f, 165.11444f, 144.6f, 160.25f),
                    PathNode.LineTo(166.68f, 178.65f),
                    PathNode.LineTo(152.41f, 221.47f),
                    PathNode.CurveTo(151.01273f, 225.66183f, 153.27815f, 230.19272f, 157.47f, 231.59f),
                    PathNode.CurveTo(161.66183f, 232.98727f, 166.19272f, 230.72185f, 167.59f, 226.53f),
                    PathNode.LineTo(183.59f, 178.53f),
                    PathNode.CurveTo(184.63295f, 175.4041f, 183.65245f, 171.95848f, 181.12f, 169.85f),
                    PathNode.LineTo(148.7f, 142.85f),
                    PathNode.CurveTo(150.41368f, 132.81999f, 151.41618f, 122.68139f, 151.7f, 112.51f),
                    PathNode.CurveTo(187.88f, 93.94f, 210.7f, 111.66f, 210.98f, 111.86f),
                    PathNode.CurveTo(213.19885f, 113.75467f, 216.27321f, 114.291084f, 219.00261f, 113.2598f),
                    PathNode.CurveTo(221.73198f, 112.228516f, 223.68346f, 109.79308f, 224.09497f, 106.90453f),
                    PathNode.CurveTo(224.50648f, 104.01598f, 223.31279f, 101.13248f, 220.98f, 99.38f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 112.0f),
                    PathNode.CurveTo(72.836555f, 112.0f, 80.0f, 104.836555f, 80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 87.163445f, 72.836555f, 80.0f, 64.0f, 80.0f),
                    PathNode.CurveTo(55.163445f, 80.0f, 48.0f, 87.163445f, 48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 104.836555f, 55.163445f, 112.0f, 64.0f, 112.0f),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
