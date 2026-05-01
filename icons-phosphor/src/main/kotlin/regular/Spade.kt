package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorRegularIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(131.58f, 16.85f),
                    PathNode.CurveTo(129.32652f, 15.722362f, 126.67347f, 15.722362f, 124.42f, 16.85f),
                    PathNode.CurveTo(120.32f, 18.9f, 24.0f, 67.84f, 24.0f, 136.0f),
                    PathNode.CurveTo(23.992617f, 154.08702f, 32.721462f, 171.064f, 47.436127f, 181.58156f),
                    PathNode.CurveTo(62.150795f, 192.09912f, 81.03931f, 194.86214f, 98.15f, 189.0f),
                    PathNode.LineTo(88.34f, 221.7f),
                    PathNode.CurveTo(87.61301f, 224.12192f, 88.07385f, 226.74496f, 89.582855f, 228.77403f),
                    PathNode.CurveTo(91.09185f, 230.8031f, 93.47132f, 231.99928f, 96.0f, 232.0f),
                    PathNode.LineTo(160.0f, 232.0f),
                    PathNode.CurveTo(162.52867f, 231.99928f, 164.90816f, 230.8031f, 166.41714f, 228.77403f),
                    PathNode.CurveTo(167.92615f, 226.74496f, 168.387f, 224.12192f, 167.66f, 221.7f),
                    PathNode.LineTo(157.85f, 189.0f),
                    PathNode.CurveTo(174.9607f, 194.86214f, 193.8492f, 192.09912f, 208.56387f, 181.58156f),
                    PathNode.CurveTo(223.27853f, 171.064f, 232.00739f, 154.08702f, 232.0f, 136.0f),
                    PathNode.CurveTo(232.0f, 67.84f, 135.68f, 18.9f, 131.58f, 16.85f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 176.0f),
                    PathNode.CurveTo(166.33441f, 176.00085f, 156.99544f, 172.50185f, 149.71f, 166.15f),
                    PathNode.CurveTo(147.02396f, 163.80766f, 143.1124f, 163.5246f, 140.11708f, 165.45578f),
                    PathNode.CurveTo(137.12177f, 167.38696f, 135.76514f, 171.06664f, 136.79f, 174.48f),
                    PathNode.LineTo(149.25f, 216.0f),
                    PathNode.LineTo(106.75f, 216.0f),
                    PathNode.LineTo(119.21f, 174.48f),
                    PathNode.CurveTo(120.23486f, 171.06664f, 118.87823f, 167.38696f, 115.88292f, 165.45578f),
                    PathNode.CurveTo(112.88761f, 163.5246f, 108.97604f, 163.80766f, 106.29f, 166.15f),
                    PathNode.CurveTo(94.46973f, 176.45802f, 77.71593f, 178.90714f, 63.439606f, 172.41399f),
                    PathNode.CurveTo(49.16329f, 165.92084f, 39.998787f, 151.68356f, 40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 106.12f, 64.41f, 79.45f, 84.89f, 62.34f),
                    PathNode.CurveTo(98.315475f, 51.25699f, 112.74836f, 41.454277f, 128.0f, 33.06f),
                    PathNode.CurveTo(143.25165f, 41.454277f, 157.68452f, 51.25699f, 171.11f, 62.34f),
                    PathNode.CurveTo(208.21f, 93.34f, 216.0f, 119.51f, 216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 158.09138f, 198.09138f, 176.0f, 176.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spade!!
    }

private var _spade: ImageVector? = null
