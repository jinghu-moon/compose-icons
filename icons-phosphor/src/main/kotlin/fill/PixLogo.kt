package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorFillIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.34f, 139.28f),
                    PathNode.LineTo(215.78f, 158.83f),
                    PathNode.CurveTo(215.0415f, 159.56781f, 214.04384f, 159.9877f, 213.0f, 160.0f),
                    PathNode.LineTo(171.32f, 160.0f),
                    PathNode.LineTo(139.32f, 128.0f),
                    PathNode.LineTo(171.32f, 96.0f),
                    PathNode.LineTo(213.0f, 96.0f),
                    PathNode.CurveTo(214.05772f, 96.001816f, 215.07167f, 96.42249f, 215.82f, 97.17f),
                    PathNode.LineTo(235.38f, 116.72f),
                    PathNode.CurveTo(241.57253f, 122.971596f, 241.55466f, 133.0504f, 235.34f, 139.28f),
                    PathNode.Close,
                    PathNode.MoveTo(67.05f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.CurveTo(90.118904f, 80.000984f, 92.15087f, 80.842545f, 93.65f, 82.34f),
                    PathNode.LineTo(128.0f, 116.68f),
                    PathNode.LineTo(162.35f, 82.34f),
                    PathNode.CurveTo(163.84912f, 80.842545f, 165.88109f, 80.000984f, 168.0f, 80.0f),
                    PathNode.LineTo(189.0f, 80.0f),
                    PathNode.CurveTo(190.61882f, 80.001274f, 192.07881f, 79.02669f, 192.69849f, 77.53116f),
                    PathNode.CurveTo(193.31816f, 76.03563f, 192.97533f, 74.31405f, 191.83f, 73.17f),
                    PathNode.LineTo(139.33f, 20.66f),
                    PathNode.CurveTo(133.0894f, 14.456423f, 123.0106f, 14.456423f, 116.77f, 20.66f),
                    PathNode.LineTo(64.22f, 73.17f),
                    PathNode.CurveTo(63.07468f, 74.31405f, 62.73184f, 76.03563f, 63.35151f, 77.53116f),
                    PathNode.CurveTo(63.97118f, 79.02669f, 65.431175f, 80.001274f, 67.05f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.CurveTo(165.88109f, 175.99902f, 163.84912f, 175.15746f, 162.35f, 173.66f),
                    PathNode.LineTo(128.0f, 139.31f),
                    PathNode.LineTo(93.65f, 173.66f),
                    PathNode.CurveTo(92.15087f, 175.15746f, 90.118904f, 175.99902f, 88.0f, 176.0f),
                    PathNode.LineTo(67.0f, 176.0f),
                    PathNode.CurveTo(65.38117f, 175.99873f, 63.92118f, 176.97331f, 63.30151f, 178.46884f),
                    PathNode.CurveTo(62.68184f, 179.96437f, 63.02468f, 181.68596f, 64.17f, 182.83f),
                    PathNode.LineTo(116.67f, 235.34f),
                    PathNode.CurveTo(122.9106f, 241.54358f, 132.9894f, 241.54358f, 139.23f, 235.34f),
                    PathNode.LineTo(191.73f, 182.83f),
                    PathNode.CurveTo(192.86327f, 181.69891f, 193.21284f, 180.001f, 192.61858f, 178.51424f),
                    PathNode.CurveTo(192.0243f, 177.02745f, 190.60068f, 176.03831f, 189.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.74f, 128.0f),
                    PathNode.LineTo(84.74f, 96.0f),
                    PathNode.LineTo(43.0f, 96.0f),
                    PathNode.CurveTo(41.94228f, 96.001816f, 40.928337f, 96.42249f, 40.18f, 97.17f),
                    PathNode.LineTo(20.66f, 116.72f),
                    PathNode.CurveTo(14.456423f, 122.9606f, 14.456423f, 133.0394f, 20.66f, 139.28f),
                    PathNode.LineTo(40.22f, 158.83f),
                    PathNode.CurveTo(40.958492f, 159.56781f, 41.956165f, 159.9877f, 43.0f, 160.0f),
                    PathNode.LineTo(84.68f, 160.0f),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
