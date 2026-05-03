package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorDuotoneIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 188.18279f, 172.18279f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(83.81722f, 224.0f, 48.0f, 188.18279f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 113.43f, 62.42f, 85.74f, 79.0f, 64.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(138.27f, 24.0f),
                    PathNode.CurveTo(159.86f, 41.92f, 208.0f, 88.15f, 208.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.89f, 153.34f),
                    PathNode.CurveTo(179.64134f, 177.07161f, 161.06252f, 195.64644f, 137.33f, 199.89f),
                    PathNode.CurveTo(136.8901f, 199.96046f, 136.4455f, 199.99724f, 136.0f, 200.0f),
                    PathNode.CurveTo(131.8393f, 199.99892f, 128.374f, 196.80872f, 128.02954f, 192.6623f),
                    PathNode.CurveTo(127.68509f, 188.51585f, 130.57649f, 184.7976f, 134.68f, 184.11f),
                    PathNode.CurveTo(151.25f, 181.32f, 165.31f, 167.26f, 168.12f, 150.66f),
                    PathNode.CurveTo(168.86006f, 146.30247f, 172.99248f, 143.36993f, 177.35f, 144.11f),
                    PathNode.CurveTo(181.70752f, 144.85007f, 184.64006f, 148.98247f, 183.9f, 153.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 192.60106f, 176.60106f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(79.39894f, 232.0f, 40.0f, 192.60106f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 116.08f, 51.0f, 87.53f, 72.66f, 59.15f),
                    PathNode.CurveTo(74.04682f, 57.33232f, 76.14507f, 56.19486f, 78.42505f, 56.02477f),
                    PathNode.CurveTo(80.705025f, 55.85468f, 82.94883f, 56.668217f, 84.59f, 58.26f),
                    PathNode.LineTo(108.71f, 81.67f),
                    PathNode.LineTo(130.71f, 21.26f),
                    PathNode.CurveTo(131.60194f, 18.814926f, 133.62758f, 16.956585f, 136.14029f, 16.278172f),
                    PathNode.CurveTo(138.65298f, 15.59976f, 141.33867f, 16.18609f, 143.34f, 17.85f),
                    PathNode.CurveTo(165.21f, 36.0f, 216.0f, 84.55f, 216.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 97.91f, 164.21f, 58.08f, 141.79f, 37.67f),
                    PathNode.LineTo(119.52f, 98.74f),
                    PathNode.CurveTo(118.59132f, 101.28853f, 116.43454f, 103.19289f, 113.79062f, 103.798836f),
                    PathNode.CurveTo(111.146706f, 104.40477f, 108.375854f, 103.62974f, 106.43f, 101.74f),
                    PathNode.LineTo(80.06f, 76.16f),
                    PathNode.CurveTo(64.09f, 99.21f, 56.0f, 122.0f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 183.7645f, 88.2355f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(167.7645f, 216.0f, 200.0f, 183.7645f, 200.0f, 144.0f),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
