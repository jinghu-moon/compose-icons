package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorLightIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 88.59f),
                    PathNode.LineTo(51.92f, 34.59f),
                    PathNode.CurveTo(47.694725f, 33.357616f, 43.135876f, 34.183968f, 39.611984f, 36.82099f),
                    PathNode.CurveTo(36.08809f, 39.45801f, 34.009426f, 43.59868f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 199.73198f, 40.268013f, 206.0f, 48.0f, 206.0f),
                    PathNode.CurveTo(49.354256f, 205.98993f, 50.700512f, 205.79137f, 52.0f, 205.41f),
                    PathNode.LineTo(138.0f, 179.0f),
                    PathNode.LineTo(138.0f, 192.0f),
                    PathNode.CurveTo(138.0f, 199.73198f, 144.26802f, 206.0f, 152.0f, 206.0f),
                    PathNode.LineTo(184.0f, 206.0f),
                    PathNode.CurveTo(191.73198f, 206.0f, 198.0f, 199.73198f, 198.0f, 192.0f),
                    PathNode.LineTo(198.0f, 160.62f),
                    PathNode.LineTo(228.0f, 151.43f),
                    PathNode.CurveTo(233.92421f, 149.6398f, 237.98306f, 144.18875f, 238.0f, 138.0f),
                    PathNode.LineTo(238.0f, 102.0f),
                    PathNode.CurveTo(237.99716f, 95.81103f, 233.93098f, 90.35828f, 228.0f, 88.59f),
                    PathNode.Close,
                    PathNode.MoveTo(48.56f, 193.92f),
                    PathNode.CurveTo(47.955666f, 194.09627f, 47.30361f, 193.9777f, 46.8f, 193.6f),
                    PathNode.CurveTo(46.296387f, 193.22229f, 46.0f, 192.62952f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 47.370487f, 46.296387f, 46.777706f, 46.8f, 46.4f),
                    PathNode.CurveTo(47.147835f, 46.14351f, 47.567837f, 46.00351f, 48.0f, 46.0f),
                    PathNode.CurveTo(48.166256f, 46.003777f, 48.331177f, 46.0307f, 48.49f, 46.08f),
                    PathNode.LineTo(138.0f, 73.53f),
                    PathNode.LineTo(138.0f, 166.48f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 192.0f),
                    PathNode.CurveTo(186.0f, 193.10457f, 185.10457f, 194.0f, 184.0f, 194.0f),
                    PathNode.LineTo(152.0f, 194.0f),
                    PathNode.CurveTo(150.89543f, 194.0f, 150.0f, 193.10457f, 150.0f, 192.0f),
                    PathNode.LineTo(150.0f, 175.35f),
                    PathNode.LineTo(186.0f, 164.35f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 138.0f),
                    PathNode.CurveTo(226.0f, 138.88889f, 225.41333f, 139.67113f, 224.56f, 139.92f),
                    PathNode.LineTo(224.48f, 139.92f),
                    PathNode.LineTo(150.0f, 162.8f),
                    PathNode.LineTo(150.0f, 77.21f),
                    PathNode.LineTo(224.56f, 100.08f),
                    PathNode.CurveTo(225.41333f, 100.32889f, 226.0f, 101.111115f, 226.0f, 102.0f),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
