package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorLightIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.59f, 160.3f),
                    PathNode.LineTo(174.35f, 139.13f),
                    PathNode.CurveTo(170.00153f, 137.26678f, 165.00621f, 137.7257f, 161.07f, 140.35f),
                    PathNode.CurveTo(160.87338f, 140.47621f, 160.68622f, 140.6166f, 160.51f, 140.77f),
                    PathNode.LineTo(135.82f, 161.77f),
                    PathNode.CurveTo(135.30063f, 162.0532f, 134.67825f, 162.07542f, 134.14f, 161.83f),
                    PathNode.CurveTo(118.27f, 154.17f, 101.83f, 137.83f, 94.14f, 122.18f),
                    PathNode.CurveTo(93.88049f, 121.65006f, 93.88049f, 121.02994f, 94.14f, 120.5f),
                    PathNode.LineTo(115.21f, 95.5f),
                    PathNode.CurveTo(115.36118f, 95.31502f, 115.50142f, 95.12135f, 115.63f, 94.92f),
                    PathNode.CurveTo(118.217926f, 90.9688f, 118.63906f, 85.97906f, 116.75f, 81.65f),
                    PathNode.LineTo(95.73f, 34.49f),
                    PathNode.CurveTo(93.27801f, 28.771608f, 87.34627f, 25.357595f, 81.17f, 26.11f),
                    PathNode.CurveTo(54.136597f, 29.663973f, 33.94333f, 52.734043f, 34.0f, 80.0f),
                    PathNode.CurveTo(34.0f, 158.3f, 97.7f, 222.0f, 176.0f, 222.0f),
                    PathNode.CurveTo(203.2643f, 222.05225f, 226.33186f, 201.86118f, 229.89f, 174.83f),
                    PathNode.CurveTo(230.64066f, 168.68417f, 227.26523f, 162.77515f, 221.59f, 160.3f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 210.0f),
                    PathNode.CurveTo(104.32f, 210.0f, 46.0f, 151.68f, 46.0f, 80.0f),
                    PathNode.CurveTo(45.930843f, 58.773712f, 61.62836f, 40.794556f, 82.67f, 38.0f),
                    PathNode.LineTo(82.9f, 38.0f),
                    PathNode.CurveTo(83.72481f, 38.0154f, 84.455536f, 38.535645f, 84.74f, 39.31f),
                    PathNode.LineTo(105.84f, 86.42f),
                    PathNode.CurveTo(106.08353f, 86.950035f, 106.08353f, 87.55997f, 105.84f, 88.09f),
                    PathNode.LineTo(84.73f, 113.15f),
                    PathNode.CurveTo(84.57251f, 113.328896f, 84.428764f, 113.51944f, 84.3f, 113.72f),
                    PathNode.CurveTo(81.61329f, 117.82154f, 81.2681f, 123.02975f, 83.39f, 127.45f),
                    PathNode.CurveTo(92.26f, 145.61f, 110.56f, 163.77f, 128.92f, 172.64f),
                    PathNode.CurveTo(133.36665f, 174.75044f, 138.59492f, 174.37076f, 142.69f, 171.64f),
                    PathNode.CurveTo(142.88f, 171.51f, 143.07f, 171.37f, 143.25f, 171.22f),
                    PathNode.LineTo(167.93f, 150.22f),
                    PathNode.CurveTo(168.42323f, 149.95496f, 169.0076f, 149.91843f, 169.53f, 150.12f),
                    PathNode.LineTo(216.78f, 171.29f),
                    PathNode.CurveTo(217.57149f, 171.62706f, 218.05878f, 172.43248f, 217.99f, 173.29f),
                    PathNode.CurveTo(215.21011f, 194.3415f, 197.23418f, 210.05707f, 176.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phone!!
    }

private var _phone: ImageVector? = null
