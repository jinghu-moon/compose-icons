package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorFillIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(108.202515f, 20.643194f, 94.327194f, 33.48885f, 82.0f, 47.75f),
                    PathNode.CurveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.Close,
                    PathNode.MoveTo(183.85f, 153.34f),
                    PathNode.CurveTo(179.60135f, 177.07161f, 161.02252f, 195.64644f, 137.29f, 199.89f),
                    PathNode.CurveTo(136.86331f, 199.95847f, 136.43213f, 199.99524f, 136.0f, 200.0f),
                    PathNode.CurveTo(131.8393f, 199.99892f, 128.374f, 196.80872f, 128.02954f, 192.6623f),
                    PathNode.CurveTo(127.68509f, 188.51585f, 130.57649f, 184.7976f, 134.68f, 184.11f),
                    PathNode.CurveTo(151.25f, 181.32f, 165.31f, 167.26f, 168.12f, 150.66f),
                    PathNode.CurveTo(168.86006f, 146.30247f, 172.99248f, 143.36993f, 177.35f, 144.11f),
                    PathNode.CurveTo(181.70752f, 144.85007f, 184.64006f, 148.98247f, 183.9f, 153.34f),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
