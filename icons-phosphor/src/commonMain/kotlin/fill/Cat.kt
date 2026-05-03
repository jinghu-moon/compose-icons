package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorFillIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.83f, 33.54f),
                    PathNode.CurveTo(216.72438f, 30.657331f, 209.46634f, 31.917688f, 204.69f, 36.69f),
                    PathNode.CurveTo(204.55f, 36.83f, 204.43f, 36.96f, 204.31f, 37.1f),
                    PathNode.LineTo(187.05f, 57.0f),
                    PathNode.CurveTo(150.94267f, 34.408047f, 105.10733f, 34.408047f, 69.0f, 57.0f),
                    PathNode.LineTo(51.69f, 37.1f),
                    PathNode.CurveTo(51.57f, 36.96f, 51.45f, 36.83f, 51.31f, 36.69f),
                    PathNode.CurveTo(46.53367f, 31.917688f, 39.275616f, 30.657331f, 33.17f, 33.54f),
                    PathNode.CurveTo(27.491537f, 36.32845f, 23.923195f, 42.1343f, 24.0f, 48.46f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 185.0f, 64.06f, 225.63f, 115.56f, 231.32f),
                    PathNode.CurveTo(116.694786f, 231.4456f, 117.82916f, 231.08032f, 118.677414f, 230.31613f),
                    PathNode.CurveTo(119.52566f, 229.55194f, 120.00693f, 228.4617f, 120.0f, 227.32f),
                    PathNode.LineTo(120.0f, 195.32f),
                    PathNode.LineTo(106.58f, 181.89f),
                    PathNode.CurveTo(103.41881f, 178.82211f, 103.23798f, 173.8076f, 106.17f, 170.52f),
                    PathNode.CurveTo(107.65237f, 168.94118f, 109.711494f, 168.0308f, 111.876884f, 167.99689f),
                    PathNode.CurveTo(114.042274f, 167.96297f, 116.12891f, 168.8084f, 117.66f, 170.34f),
                    PathNode.LineTo(128.0f, 180.68f),
                    PathNode.LineTo(138.34f, 170.33f),
                    PathNode.CurveTo(139.8711f, 168.79839f, 141.95772f, 167.95296f, 144.12312f, 167.98688f),
                    PathNode.CurveTo(146.28851f, 168.02081f, 148.34764f, 168.93118f, 149.83f, 170.51f),
                    PathNode.CurveTo(152.76201f, 173.7976f, 152.5812f, 178.81212f, 149.42f, 181.88f),
                    PathNode.LineTo(136.0f, 195.31f),
                    PathNode.LineTo(136.0f, 227.31f),
                    PathNode.CurveTo(135.99307f, 228.45169f, 136.47433f, 229.54193f, 137.32259f, 230.30612f),
                    PathNode.CurveTo(138.17084f, 231.07031f, 139.30522f, 231.4356f, 140.44f, 231.31f),
                    PathNode.CurveTo(191.94f, 225.62f, 232.0f, 185.0f, 232.0f, 136.0f),
                    PathNode.LineTo(232.0f, 48.46f),
                    PathNode.CurveTo(232.07681f, 42.1343f, 228.50847f, 36.32845f, 222.83f, 33.54f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 152.0f),
                    PathNode.CurveTo(77.37258f, 152.0f, 72.0f, 146.62741f, 72.0f, 140.0f),
                    PathNode.CurveTo(72.0f, 133.37259f, 77.37258f, 128.0f, 84.0f, 128.0f),
                    PathNode.CurveTo(90.62742f, 128.0f, 96.0f, 133.37259f, 96.0f, 140.0f),
                    PathNode.CurveTo(96.0f, 146.62741f, 90.62742f, 152.0f, 84.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 92.41828f, 100.41828f, 96.0f, 96.0f, 96.0f),
                    PathNode.CurveTo(91.58172f, 96.0f, 88.0f, 92.41828f, 88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 69.0f),
                    PathNode.CurveTo(88.0f, 64.58172f, 91.58172f, 61.0f, 96.0f, 61.0f),
                    PathNode.CurveTo(100.41828f, 61.0f, 104.0f, 64.58172f, 104.0f, 69.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 92.41828f, 132.41827f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(123.58172f, 96.0f, 120.0f, 92.41828f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 59.581722f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 69.0f),
                    PathNode.CurveTo(152.0f, 64.58172f, 155.58173f, 61.0f, 160.0f, 61.0f),
                    PathNode.CurveTo(164.41827f, 61.0f, 168.0f, 64.58172f, 168.0f, 69.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.0f, 92.41828f, 164.41827f, 96.0f, 160.0f, 96.0f),
                    PathNode.CurveTo(155.58173f, 96.0f, 152.0f, 92.41828f, 152.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 152.0f),
                    PathNode.CurveTo(165.37259f, 152.0f, 160.0f, 146.62741f, 160.0f, 140.0f),
                    PathNode.CurveTo(160.0f, 133.37259f, 165.37259f, 128.0f, 172.0f, 128.0f),
                    PathNode.CurveTo(178.62741f, 128.0f, 184.0f, 133.37259f, 184.0f, 140.0f),
                    PathNode.CurveTo(184.0f, 146.62741f, 178.62741f, 152.0f, 172.0f, 152.0f),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
