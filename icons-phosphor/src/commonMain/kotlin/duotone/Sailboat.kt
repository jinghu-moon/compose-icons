package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorDuotoneIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 176.0f),
                    PathNode.LineTo(210.4f, 213.0f),
                    PathNode.CurveTo(208.88286f, 214.89491f, 206.58742f, 215.99849f, 204.16f, 216.0f),
                    PathNode.LineTo(51.84f, 216.0f),
                    PathNode.CurveTo(49.41258f, 215.99849f, 47.117134f, 214.89491f, 45.6f, 213.0f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 8.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
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
                    PathNode.MoveTo(247.21f, 172.53f),
                    PathNode.CurveTo(245.87662f, 169.76016f, 243.07407f, 167.99933f, 240.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(219.16606f, 143.9997f, 222.03407f, 142.13223f, 223.31511f, 139.23692f),
                    PathNode.CurveTo(224.59616f, 136.34161f, 224.04918f, 132.9632f, 221.92f, 130.62f),
                    PathNode.LineTo(144.0f, 44.91f),
                    PathNode.LineTo(144.0f, 8.0f),
                    PathNode.CurveTo(143.98174f, 4.621249f, 141.84271f, 1.618271f, 138.65546f, 0.496789f),
                    PathNode.CurveTo(135.4682f, -0.624693f, 131.92001f, 0.377157f, 129.79f, 3.0f),
                    PathNode.LineTo(25.79f, 131.0f),
                    PathNode.CurveTo(23.871523f, 133.39612f, 23.493189f, 136.67865f, 24.816269f, 139.44838f),
                    PathNode.CurveTo(26.139345f, 142.21811f, 28.930511f, 143.98659f, 32.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(12.923291f, 167.99808f, 10.118098f, 169.76076f, 8.784977f, 172.53365f),
                    PathNode.CurveTo(7.451857f, 175.30653f, 7.827057f, 178.59825f, 9.75f, 181.0f),
                    PathNode.LineTo(39.35f, 218.0f),
                    PathNode.CurveTo(42.379913f, 221.80078f, 46.979317f, 224.01027f, 51.84f, 224.0f),
                    PathNode.LineTo(204.16f, 224.0f),
                    PathNode.CurveTo(209.02068f, 224.01027f, 213.62009f, 221.80078f, 216.65f, 218.0f),
                    PathNode.LineTo(246.25f, 181.0f),
                    PathNode.CurveTo(248.17278f, 178.59645f, 248.54607f, 175.30292f, 247.21f, 172.53f),
                    PathNode.Close,
                    PathNode.MoveTo(197.92f, 128.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 68.69f),
                    PathNode.Close,
                    PathNode.MoveTo(48.81f, 128.0f),
                    PathNode.LineTo(128.0f, 30.53f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.16f, 208.0f),
                    PathNode.LineTo(51.84f, 208.0f),
                    PathNode.LineTo(32.64f, 184.0f),
                    PathNode.LineTo(223.36f, 184.0f),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
