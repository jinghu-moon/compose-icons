package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorThinIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 168.4f),
                    PathNode.LineTo(187.11f, 135.51f),
                    PathNode.CurveTo(184.85838f, 133.25055f, 181.79982f, 131.98053f, 178.61f, 131.98053f),
                    PathNode.CurveTo(175.42018f, 131.98053f, 172.36162f, 133.25055f, 170.11f, 135.51f),
                    PathNode.LineTo(147.28f, 158.34f),
                    PathNode.LineTo(100.46f, 111.51f),
                    PathNode.CurveTo(98.208374f, 109.25055f, 95.14982f, 107.98054f, 91.96f, 107.98054f),
                    PathNode.CurveTo(88.77018f, 107.98054f, 85.711624f, 109.25055f, 83.46f, 111.51f),
                    PathNode.LineTo(36.0f, 159.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 170.34f),
                    PathNode.LineTo(89.17f, 117.17f),
                    PathNode.CurveTo(89.92027f, 116.418884f, 90.93836f, 115.99686f, 92.0f, 115.99686f),
                    PathNode.CurveTo(93.06164f, 115.99686f, 94.07973f, 116.418884f, 94.83f, 117.17f),
                    PathNode.LineTo(181.66f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.LineTo(193.0f, 204.0f),
                    PathNode.LineTo(153.0f, 164.0f),
                    PathNode.LineTo(175.83f, 141.17f),
                    PathNode.CurveTo(176.58028f, 140.41888f, 177.59836f, 139.99686f, 178.66f, 139.99686f),
                    PathNode.CurveTo(179.72163f, 139.99686f, 180.73973f, 140.41888f, 181.49f, 141.17f),
                    PathNode.LineTo(220.0f, 179.71f),
                    PathNode.LineTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 95.58172f, 151.58173f, 92.0f, 156.0f, 92.0f),
                    PathNode.CurveTo(160.41827f, 92.0f, 164.0f, 95.58172f, 164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 104.41828f, 160.41827f, 108.0f, 156.0f, 108.0f),
                    PathNode.CurveTo(151.58173f, 108.0f, 148.0f, 104.41828f, 148.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _image!!
    }

private var _image: ImageVector? = null
