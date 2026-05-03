package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorRegularIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.75f, 51.32f),
                    PathNode.CurveTo(237.81822f, 48.278206f, 232.68889f, 47.25308f, 227.89f, 48.55f),
                    PathNode.LineTo(224.41f, 49.49f),
                    PathNode.CurveTo(205.61f, 54.56f, 170.61f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(85.39f, 64.0f, 50.39f, 54.56f, 31.59f, 49.49f),
                    PathNode.LineTo(28.11f, 48.55f),
                    PathNode.CurveTo(23.31037f, 47.274284f, 18.190456f, 48.29964f, 14.252247f, 51.325268f),
                    PathNode.CurveTo(10.314038f, 54.35089f, 8.004071f, 59.033726f, 8.0f, 64.0f),
                    PathNode.LineTo(8.0f, 192.0f),
                    PathNode.CurveTo(8.0f, 200.83656f, 15.163444f, 208.0f, 24.0f, 208.0f),
                    PathNode.CurveTo(25.411327f, 207.9993f, 26.816528f, 207.8144f, 28.18f, 207.45f),
                    PathNode.LineTo(31.36f, 206.59f),
                    PathNode.CurveTo(50.13f, 201.49f, 85.17f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(170.83f, 192.0f, 205.87f, 201.49f, 224.69f, 206.59f),
                    PathNode.LineTo(227.87f, 207.45f),
                    PathNode.CurveTo(232.6724f, 208.7331f, 237.79837f, 207.71126f, 241.74165f, 204.68474f),
                    PathNode.CurveTo(245.68494f, 201.65822f, 247.99759f, 196.97084f, 248.0f, 192.0f),
                    PathNode.LineTo(248.0f, 64.0f),
                    PathNode.CurveTo(248.0135f, 59.028683f, 245.70105f, 54.337177f, 241.75f, 51.32f),
                    PathNode.Close,
                    PathNode.MoveTo(27.42f, 64.93f),
                    PathNode.CurveTo(46.94f, 70.2f, 83.27f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(172.73f, 80.0f, 209.06f, 70.2f, 228.58f, 64.93f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 182.76f),
                    PathNode.LineTo(173.93f, 124.69f),
                    PathNode.CurveTo(170.9293f, 121.68863f, 166.8591f, 120.00242f, 162.615f, 120.00242f),
                    PathNode.CurveTo(158.37091f, 120.00242f, 154.30069f, 121.68863f, 151.3f, 124.69f),
                    PathNode.LineTo(131.3f, 144.69f),
                    PathNode.LineTo(87.3f, 100.69f),
                    PathNode.CurveTo(81.05246f, 94.44656f, 70.927536f, 94.44656f, 64.68f, 100.69f),
                    PathNode.LineTo(24.0f, 141.37f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.84f, 187.21f),
                    PathNode.CurveTo(197.71446f, 183.17201f, 181.34796f, 180.16592f, 164.84f, 178.21f),
                    PathNode.LineTo(142.63f, 156.0f),
                    PathNode.LineTo(162.63f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(27.13f, 191.14f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.LineTo(76.0f, 112.0f),
                    PathNode.LineTo(140.25f, 176.25f),
                    PathNode.QuadTo(134.25f, 176.01f, 128.0f, 176.0f),
                    PathNode.CurveTo(83.0f, 176.0f, 45.28f, 186.23f, 27.13f, 191.14f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 108.0f),
                    PathNode.CurveTo(192.0f, 101.37258f, 197.37259f, 96.0f, 204.0f, 96.0f),
                    PathNode.CurveTo(210.62741f, 96.0f, 216.0f, 101.37258f, 216.0f, 108.0f),
                    PathNode.CurveTo(216.0f, 114.62742f, 210.62741f, 120.0f, 204.0f, 120.0f),
                    PathNode.CurveTo(197.37259f, 120.0f, 192.0f, 114.62742f, 192.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _panorama!!
    }

private var _panorama: ImageVector? = null
