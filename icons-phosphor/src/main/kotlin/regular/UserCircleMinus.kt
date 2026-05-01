package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorRegularIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 56.0f),
                    PathNode.CurveTo(168.0f, 51.581722f, 171.58173f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 60.418278f, 228.41827f, 64.0f, 224.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(171.58173f, 64.0f, 168.0f, 60.418278f, 168.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.08f, 93.33f),
                    PathNode.CurveTo(241.68373f, 137.52635f, 225.77455f, 186.69823f, 187.23932f, 213.37836f),
                    PathNode.CurveTo(148.70409f, 240.05849f, 97.07902f, 237.64438f, 61.201756f, 207.48454f),
                    PathNode.CurveTo(25.32449f, 177.32472f, 14.073498f, 126.88277f, 33.73356f, 84.335434f),
                    PathNode.CurveTo(53.393616f, 41.788105f, 99.0995f, 17.664495f, 145.32f, 25.44f),
                    PathNode.CurveTo(149.64227f, 26.204374f, 152.54147f, 30.308643f, 151.8172f, 34.63782f),
                    PathNode.CurveTo(151.09293f, 38.966995f, 147.0157f, 41.904106f, 142.68f, 41.22f),
                    PathNode.CurveTo(117.13937f, 36.923504f, 91.002304f, 44.086994f, 71.2212f, 60.804993f),
                    PathNode.CurveTo(51.44009f, 77.522995f, 40.0205f, 102.10052f, 40.0f, 128.0f),
                    PathNode.CurveTo(39.981037f, 149.54193f, 47.898487f, 170.3359f, 62.24f, 186.41f),
                    PathNode.CurveTo(71.16231f, 173.48077f, 83.708176f, 163.47818f, 98.3f, 157.66f),
                    PathNode.CurveTo(82.2332f, 145.00536f, 75.949425f, 123.56005f, 82.64587f, 104.23546f),
                    PathNode.CurveTo(89.342316f, 84.91087f, 107.54806f, 71.951775f, 128.0f, 71.951775f),
                    PathNode.CurveTo(148.45195f, 71.951775f, 166.65768f, 84.91087f, 173.35413f, 104.23546f),
                    PathNode.CurveTo(180.05058f, 123.56005f, 173.7668f, 145.00536f, 157.7f, 157.66f),
                    PathNode.CurveTo(172.29182f, 163.47818f, 184.83769f, 173.48077f, 193.76f, 186.41f),
                    PathNode.CurveTo(215.04448f, 162.47946f, 221.64745f, 128.87483f, 211.0f, 98.67f),
                    PathNode.CurveTo(209.5254f, 94.50301f, 211.708f, 89.9296f, 215.87502f, 88.455f),
                    PathNode.CurveTo(220.042f, 86.9804f, 224.6154f, 89.16301f, 226.09f, 93.33f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(145.67311f, 152.0f, 160.0f, 137.67311f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 102.32689f, 145.67311f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(110.32689f, 88.0f, 96.0f, 102.32689f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 137.67311f, 110.32689f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(147.53362f, 216.01971f, 166.51305f, 209.50786f, 181.92f, 197.5f),
                    PathNode.CurveTo(170.1589f, 179.1061f, 149.83252f, 167.97656f, 128.0f, 167.97656f),
                    PathNode.CurveTo(106.16747f, 167.97656f, 85.8411f, 179.1061f, 74.08f, 197.5f),
                    PathNode.CurveTo(89.48695f, 209.50786f, 108.46638f, 216.01971f, 128.0f, 216.0f),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
