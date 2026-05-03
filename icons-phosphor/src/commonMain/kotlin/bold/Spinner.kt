package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spinner: ImageVector
    get() {
        if (_spinner != null) return _spinner!!
        _spinner = phosphorBoldIcon(
            name = "Spinner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 32.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 70.62742f, 134.62741f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(121.37258f, 76.0f, 116.0f, 70.62742f, 116.0f, 64.0f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(116.0f, 25.372583f, 121.37258f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(134.62741f, 20.0f, 140.0f, 25.372583f, 140.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.25f, 94.75f),
                    PathNode.CurveTo(176.435f, 94.749855f, 179.48927f, 93.48353f, 181.74f, 91.23f),
                    PathNode.LineTo(204.37f, 68.6f),
                    PathNode.CurveTo(209.06442f, 63.90558f, 209.06442f, 56.294422f, 204.37f, 51.6f),
                    PathNode.CurveTo(199.67558f, 46.90558f, 192.06442f, 46.90558f, 187.37f, 51.6f),
                    PathNode.LineTo(164.77f, 74.26f),
                    PathNode.CurveTo(161.33533f, 77.69085f, 160.30618f, 82.85317f, 162.16263f, 87.33886f),
                    PathNode.CurveTo(164.01907f, 91.82454f, 168.39534f, 94.74977f, 173.25f, 94.75f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(185.37259f, 116.0f, 180.0f, 121.37258f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 134.62741f, 185.37259f, 140.0f, 192.0f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(230.62741f, 140.0f, 236.0f, 134.62741f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 121.37258f, 230.62741f, 116.0f, 224.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.74f, 164.77f),
                    PathNode.CurveTo(177.04558f, 160.07558f, 169.43442f, 160.07558f, 164.74f, 164.77f),
                    PathNode.CurveTo(160.04558f, 169.46442f, 160.04558f, 177.07558f, 164.74f, 181.77f),
                    PathNode.LineTo(187.37f, 204.4f),
                    PathNode.CurveTo(192.06442f, 209.09442f, 199.67558f, 209.09442f, 204.37f, 204.4f),
                    PathNode.CurveTo(209.06442f, 199.70558f, 209.06442f, 192.09442f, 204.37f, 187.4f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 185.37259f, 116.0f, 192.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 230.62741f, 121.37258f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(134.62741f, 236.0f, 140.0f, 230.62741f, 140.0f, 224.0f),
                    PathNode.LineTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 185.37259f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.26f, 164.77f),
                    PathNode.LineTo(51.63f, 187.4f),
                    PathNode.CurveTo(46.93558f, 192.09442f, 46.93558f, 199.70558f, 51.63f, 204.4f),
                    PathNode.CurveTo(56.32442f, 209.09442f, 63.93558f, 209.09442f, 68.63f, 204.4f),
                    PathNode.LineTo(91.26f, 181.77f),
                    PathNode.CurveTo(95.95442f, 177.07558f, 95.95442f, 169.46442f, 91.26f, 164.77f),
                    PathNode.CurveTo(86.56558f, 160.07558f, 78.95442f, 160.07558f, 74.26f, 164.77f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 121.37258f, 70.62742f, 116.0f, 64.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(25.372583f, 116.0f, 20.0f, 121.37258f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 134.62741f, 25.372583f, 140.0f, 32.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(70.62742f, 140.0f, 76.0f, 134.62741f, 76.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.6f, 51.63f),
                    PathNode.CurveTo(63.90558f, 46.93558f, 56.294422f, 46.93558f, 51.6f, 51.63f),
                    PathNode.CurveTo(46.90558f, 56.32442f, 46.90558f, 63.93558f, 51.6f, 68.63f),
                    PathNode.LineTo(74.26f, 91.23f),
                    PathNode.CurveTo(78.95442f, 95.92442f, 86.56558f, 95.92442f, 91.26f, 91.23f),
                    PathNode.CurveTo(95.95442f, 86.535576f, 95.95442f, 78.92442f, 91.26f, 74.23f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spinner!!
    }

private var _spinner: ImageVector? = null
