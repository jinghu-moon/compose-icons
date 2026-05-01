package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorLightIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 64.0f),
                    PathNode.CurveTo(229.99678f, 48.21324f, 217.75935f, 35.13006f, 202.008f, 34.0734f),
                    PathNode.CurveTo(186.25664f, 33.016743f, 172.3814f, 44.348194f, 170.26962f, 59.993073f),
                    PathNode.CurveTo(168.15785f, 75.63795f, 178.5322f, 90.242645f, 194.0f, 93.4f),
                    PathNode.LineTo(194.0f, 112.0f),
                    PathNode.CurveTo(194.0f, 117.52285f, 189.52284f, 122.0f, 184.0f, 122.0f),
                    PathNode.LineTo(96.0f, 122.0f),
                    PathNode.CurveTo(92.521515f, 121.9988f, 89.09305f, 122.82848f, 86.0f, 124.42f),
                    PathNode.LineTo(86.0f, 93.42f),
                    PathNode.CurveTo(101.08978f, 90.33981f, 111.39602f, 76.33381f, 109.84808f, 61.010853f),
                    PathNode.CurveTo(108.300156f, 45.6879f, 95.40093f, 34.026123f, 80.0f, 34.026123f),
                    PathNode.CurveTo(64.59906f, 34.026123f, 51.69985f, 45.6879f, 50.151917f, 61.010853f),
                    PathNode.CurveTo(48.60398f, 76.33381f, 58.91022f, 90.33981f, 74.0f, 93.42f),
                    PathNode.LineTo(74.0f, 162.62f),
                    PathNode.CurveTo(58.91022f, 165.7002f, 48.60398f, 179.70619f, 50.151917f, 195.02916f),
                    PathNode.CurveTo(51.69985f, 210.3521f, 64.59906f, 222.01387f, 80.0f, 222.01387f),
                    PathNode.CurveTo(95.40093f, 222.01387f, 108.300156f, 210.3521f, 109.84808f, 195.02916f),
                    PathNode.CurveTo(111.39602f, 179.70619f, 101.08978f, 165.7002f, 86.0f, 162.62f),
                    PathNode.LineTo(86.0f, 144.0f),
                    PathNode.CurveTo(86.0f, 138.47716f, 90.47715f, 134.0f, 96.0f, 134.0f),
                    PathNode.LineTo(184.0f, 134.0f),
                    PathNode.CurveTo(196.15027f, 134.0f, 206.0f, 124.15026f, 206.0f, 112.0f),
                    PathNode.LineTo(206.0f, 93.4f),
                    PathNode.CurveTo(219.95935f, 90.53081f, 229.98355f, 78.25116f, 230.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 64.0f),
                    PathNode.CurveTo(62.0f, 54.058876f, 70.05888f, 46.0f, 80.0f, 46.0f),
                    PathNode.CurveTo(89.94112f, 46.0f, 98.0f, 54.058876f, 98.0f, 64.0f),
                    PathNode.CurveTo(98.0f, 73.94112f, 89.94112f, 82.0f, 80.0f, 82.0f),
                    PathNode.CurveTo(70.05888f, 82.0f, 62.0f, 73.94112f, 62.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 192.0f),
                    PathNode.CurveTo(98.0f, 201.94113f, 89.94112f, 210.0f, 80.0f, 210.0f),
                    PathNode.CurveTo(70.05888f, 210.0f, 62.0f, 201.94113f, 62.0f, 192.0f),
                    PathNode.CurveTo(62.0f, 182.05887f, 70.05888f, 174.0f, 80.0f, 174.0f),
                    PathNode.CurveTo(89.94112f, 174.0f, 98.0f, 182.05887f, 98.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 82.0f),
                    PathNode.CurveTo(190.05887f, 82.0f, 182.0f, 73.94112f, 182.0f, 64.0f),
                    PathNode.CurveTo(182.0f, 54.058876f, 190.05887f, 46.0f, 200.0f, 46.0f),
                    PathNode.CurveTo(209.94113f, 46.0f, 218.0f, 54.058876f, 218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 73.94112f, 209.94113f, 82.0f, 200.0f, 82.0f),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
