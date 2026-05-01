package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorThinIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 80.41828f, 160.41827f, 84.0f, 156.0f, 84.0f),
                    PathNode.CurveTo(151.58173f, 84.0f, 148.0f, 80.41828f, 148.0f, 76.0f),
                    PathNode.CurveTo(148.0f, 71.58172f, 151.58173f, 68.0f, 156.0f, 68.0f),
                    PathNode.CurveTo(160.41827f, 68.0f, 164.0f, 71.58172f, 164.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.77f, 152.73f),
                    PathNode.CurveTo(192.27f, 172.73f, 170.6f, 186.3f, 142.39f, 192.93f),
                    PathNode.CurveTo(121.48f, 197.84f, 96.78f, 198.93f, 68.59f, 196.35f),
                    PathNode.QuadTo(71.05f, 216.53f, 76.0f, 239.14f),
                    PathNode.CurveTo(76.47972f, 241.28407f, 75.140305f, 243.41374f, 73.0f, 243.91f),
                    PathNode.CurveTo(72.7172f, 243.96957f, 72.429f, 243.99974f, 72.14f, 244.0f),
                    PathNode.CurveTo(70.26466f, 243.99698f, 68.6432f, 242.69148f, 68.24f, 240.86f),
                    PathNode.CurveTo(64.906654f, 225.87923f, 62.33005f, 210.74004f, 60.52f, 195.5f),
                    PathNode.QuadTo(39.12f, 193.01f, 15.19f, 187.78f),
                    PathNode.CurveTo(13.670796f, 187.61533f, 12.37816f, 186.59947f, 11.858998f, 185.16226f),
                    PathNode.CurveTo(11.339837f, 183.72505f, 11.684875f, 182.11765f, 12.748127f, 181.0201f),
                    PathNode.CurveTo(13.81138f, 179.92256f, 15.407043f, 179.5267f, 16.86f, 180.0f),
                    PathNode.QuadTo(39.45f, 184.95f, 59.62f, 187.41f),
                    PathNode.CurveTo(57.0f, 159.25f, 58.14f, 134.57f, 63.05f, 113.68f),
                    PathNode.CurveTo(69.68f, 85.47f, 83.19f, 63.8f, 103.23f, 49.29f),
                    PathNode.CurveTo(127.32f, 31.8f, 156.61f, 28.0f, 177.53f, 28.0f),
                    PathNode.LineTo(179.24f, 28.0f),
                    PathNode.CurveTo(201.24f, 28.21f, 219.36f, 32.54f, 221.05f, 33.53f),
                    PathNode.CurveTo(221.63898f, 33.890118f, 222.12473f, 34.396538f, 222.46f, 35.0f),
                    PathNode.CurveTo(223.46f, 36.68f, 227.77f, 54.8f, 227.99f, 76.79f),
                    PathNode.CurveTo(228.2f, 97.75f, 224.69f, 128.0f, 206.77f, 152.73f),
                    PathNode.Close,
                    PathNode.MoveTo(194.54f, 155.16f),
                    PathNode.CurveTo(145.56412f, 149.00903f, 106.99097f, 110.43589f, 100.84f, 61.46f),
                    PathNode.CurveTo(72.92f, 86.54f, 61.84f, 129.08f, 67.7f, 188.27f),
                    PathNode.CurveTo(126.9f, 194.14f, 169.45f, 183.07f, 194.54f, 155.16f),
                    PathNode.Close,
                    PathNode.MoveTo(215.74f, 40.26f),
                    PathNode.CurveTo(204.9f, 37.73f, 148.5f, 26.69f, 108.3f, 55.46f),
                    PathNode.CurveTo(111.966415f, 104.80059f, 151.1898f, 144.02823f, 200.53f, 147.7f),
                    PathNode.CurveTo(229.29f, 107.52f, 218.27f, 51.11f, 215.74f, 40.26f),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
