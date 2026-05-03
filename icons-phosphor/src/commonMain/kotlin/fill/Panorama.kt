package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorFillIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.75f, 51.32f),
                    PathNode.CurveTo(237.81888f, 48.276745f, 232.68884f, 47.25148f, 227.89f, 48.55f),
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
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(210.62741f, 96.0f, 216.0f, 101.37258f, 216.0f, 108.0f),
                    PathNode.CurveTo(216.0f, 114.62742f, 210.62741f, 120.0f, 204.0f, 120.0f),
                    PathNode.CurveTo(197.37259f, 120.0f, 192.0f, 114.62742f, 192.0f, 108.0f),
                    PathNode.CurveTo(192.0f, 101.37258f, 197.37259f, 96.0f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(83.0f, 176.0f, 45.28f, 186.23f, 27.13f, 191.14f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 152.7f),
                    PathNode.LineTo(70.34f, 106.35f),
                    PathNode.CurveTo(71.840546f, 104.847786f, 73.876724f, 104.0037f, 76.0f, 104.0037f),
                    PathNode.CurveTo(78.123276f, 104.0037f, 80.159454f, 104.847786f, 81.66f, 106.35f),
                    PathNode.LineTo(152.28f, 177.0f),
                    PathNode.CurveTo(144.49f, 176.35f, 136.37f, 176.0f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.87f, 191.14f),
                    PathNode.CurveTo(212.10182f, 186.41985f, 195.073f, 182.68018f, 177.87f, 179.94f),
                    PathNode.LineTo(142.61f, 144.68f),
                    PathNode.LineTo(157.0f, 130.34f),
                    PathNode.CurveTo(160.12376f, 127.21828f, 165.18623f, 127.21828f, 168.31f, 130.34f),
                    PathNode.LineTo(229.2f, 191.22f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _panorama!!
    }

private var _panorama: ImageVector? = null
