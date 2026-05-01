package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorLightIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.0f, 60.67f),
                    PathNode.CurveTo(167.18f, 34.0f, 145.87f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(110.13f, 18.0f, 88.82f, 34.0f, 71.0f, 60.67f),
                    PathNode.CurveTo(52.57f, 88.32f, 42.0f, 121.61f, 42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 199.49649f, 80.50351f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.49649f, 238.0f, 214.0f, 199.49649f, 214.0f, 152.0f),
                    PathNode.CurveTo(214.0f, 121.61f, 203.43f, 88.32f, 185.0f, 60.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(87.15149f, 225.95041f, 54.04959f, 192.84851f, 54.0f, 152.0f),
                    PathNode.CurveTo(54.0f, 123.92f, 63.84f, 93.06f, 81.0f, 67.33f),
                    PathNode.CurveTo(96.11f, 44.65f, 114.56f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(138.52f, 30.0f, 152.12f, 39.0f, 164.78f, 53.77f),
                    PathNode.LineTo(123.52f, 100.0f),
                    PathNode.CurveTo(122.11902f, 101.56439f, 121.63789f, 103.7474f, 122.25145f, 105.75579f),
                    PathNode.CurveTo(122.86501f, 107.764175f, 124.483955f, 109.30562f, 126.52f, 109.82f),
                    PathNode.LineTo(153.0f, 116.43f),
                    PathNode.LineTo(146.13f, 150.82f),
                    PathNode.CurveTo(145.47992f, 154.06711f, 147.58348f, 157.22693f, 150.83f, 157.88f),
                    PathNode.CurveTo(151.21521f, 157.95772f, 151.60704f, 157.99791f, 152.0f, 158.0f),
                    PathNode.CurveTo(154.854f, 157.9939f, 157.30872f, 155.97827f, 157.87f, 153.18f),
                    PathNode.LineTo(165.87f, 113.18f),
                    PathNode.CurveTo(166.50015f, 110.04113f, 164.55492f, 106.960434f, 161.45f, 106.18f),
                    PathNode.LineTo(139.08f, 100.59f),
                    PathNode.LineTo(172.28f, 63.39f),
                    PathNode.QuadTo(173.64f, 65.31f, 175.0f, 67.33f),
                    PathNode.CurveTo(192.15f, 93.06f, 202.0f, 123.92f, 202.0f, 152.0f),
                    PathNode.CurveTo(201.95041f, 192.84851f, 168.84851f, 225.95041f, 128.0f, 226.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
