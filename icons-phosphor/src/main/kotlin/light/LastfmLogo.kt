package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorLightIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 160.0f),
                    PathNode.CurveTo(246.0f, 180.98682f, 228.98682f, 198.0f, 208.0f, 198.0f),
                    PathNode.LineTo(190.57f, 198.0f),
                    PathNode.CurveTo(169.60352f, 197.95145f, 150.54488f, 185.81685f, 141.63f, 166.84f),
                    PathNode.LineTo(111.49f, 102.24f),
                    PathNode.CurveTo(104.56265f, 87.47601f, 89.73835f, 78.03458f, 73.43f, 78.0f),
                    PathNode.LineTo(64.0f, 78.0f),
                    PathNode.CurveTo(40.80404f, 78.0f, 22.0f, 96.80404f, 22.0f, 120.0f),
                    PathNode.LineTo(22.0f, 144.0f),
                    PathNode.CurveTo(22.0f, 167.19595f, 40.80404f, 186.0f, 64.0f, 186.0f),
                    PathNode.LineTo(72.0f, 186.0f),
                    PathNode.CurveTo(85.52223f, 186.00337f, 97.76111f, 177.99333f, 103.17f, 165.6f),
                    PathNode.CurveTo(104.49548f, 162.56244f, 108.03243f, 161.17451f, 111.07f, 162.5f),
                    PathNode.CurveTo(114.10757f, 163.82549f, 115.49548f, 167.36243f, 114.17f, 170.4f),
                    PathNode.CurveTo(106.85226f, 187.16705f, 90.29436f, 198.0041f, 72.0f, 198.0f),
                    PathNode.LineTo(64.0f, 198.0f),
                    PathNode.CurveTo(34.19033f, 197.96693f, 10.033067f, 173.80966f, 10.0f, 144.0f),
                    PathNode.LineTo(10.0f, 120.0f),
                    PathNode.CurveTo(10.033067f, 90.19033f, 34.19033f, 66.033066f, 64.0f, 66.0f),
                    PathNode.LineTo(73.43f, 66.0f),
                    PathNode.CurveTo(94.396484f, 66.04856f, 113.45512f, 78.18315f, 122.37f, 97.16f),
                    PathNode.LineTo(152.51f, 161.76f),
                    PathNode.CurveTo(159.43735f, 176.52399f, 174.26164f, 185.96542f, 190.57f, 186.0f),
                    PathNode.LineTo(208.0f, 186.0f),
                    PathNode.CurveTo(222.3594f, 186.0f, 234.0f, 174.3594f, 234.0f, 160.0f),
                    PathNode.CurveTo(234.0f, 145.6406f, 222.3594f, 134.0f, 208.0f, 134.0f),
                    PathNode.LineTo(188.0f, 134.0f),
                    PathNode.CurveTo(169.22232f, 134.0f, 154.0f, 118.77768f, 154.0f, 100.0f),
                    PathNode.CurveTo(154.0f, 81.22232f, 169.22232f, 66.0f, 188.0f, 66.0f),
                    PathNode.LineTo(208.0f, 66.0f),
                    PathNode.CurveTo(224.56854f, 66.0f, 238.0f, 79.43146f, 238.0f, 96.0f),
                    PathNode.CurveTo(238.0f, 99.313705f, 235.3137f, 102.0f, 232.0f, 102.0f),
                    PathNode.CurveTo(228.6863f, 102.0f, 226.0f, 99.313705f, 226.0f, 96.0f),
                    PathNode.CurveTo(226.0f, 86.05888f, 217.94113f, 78.0f, 208.0f, 78.0f),
                    PathNode.LineTo(188.0f, 78.0f),
                    PathNode.CurveTo(175.84973f, 78.0f, 166.0f, 87.84974f, 166.0f, 100.0f),
                    PathNode.CurveTo(166.0f, 112.15026f, 175.84973f, 122.0f, 188.0f, 122.0f),
                    PathNode.LineTo(208.0f, 122.0f),
                    PathNode.CurveTo(228.98682f, 122.0f, 246.0f, 139.01318f, 246.0f, 160.0f),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
