package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorLightIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 184.0f),
                    PathNode.CurveTo(182.0f, 200.56854f, 168.56854f, 214.0f, 152.0f, 214.0f),
                    PathNode.CurveTo(139.1f, 214.0f, 126.64f, 205.62f, 122.37f, 194.08f),
                    PathNode.CurveTo(121.221245f, 190.97064f, 122.81064f, 187.51875f, 125.92f, 186.37f),
                    PathNode.CurveTo(129.02936f, 185.22125f, 132.48125f, 186.81064f, 133.63f, 189.92f),
                    PathNode.CurveTo(136.13f, 196.69f, 144.2f, 202.0f, 152.0f, 202.0f),
                    PathNode.CurveTo(161.94113f, 202.0f, 170.0f, 193.94113f, 170.0f, 184.0f),
                    PathNode.CurveTo(170.0f, 174.05887f, 161.94113f, 166.0f, 152.0f, 166.0f),
                    PathNode.LineTo(40.0f, 166.0f),
                    PathNode.CurveTo(36.68629f, 166.0f, 34.0f, 163.3137f, 34.0f, 160.0f),
                    PathNode.CurveTo(34.0f, 156.6863f, 36.68629f, 154.0f, 40.0f, 154.0f),
                    PathNode.LineTo(152.0f, 154.0f),
                    PathNode.CurveTo(168.56854f, 154.0f, 182.0f, 167.43146f, 182.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 72.0f),
                    PathNode.CurveTo(150.0f, 55.431458f, 136.56854f, 42.0f, 120.0f, 42.0f),
                    PathNode.CurveTo(107.1f, 42.0f, 94.64f, 50.38f, 90.37f, 61.92f),
                    PathNode.CurveTo(89.221245f, 65.029366f, 90.81064f, 68.48125f, 93.92f, 69.63f),
                    PathNode.CurveTo(97.029366f, 70.778755f, 100.48125f, 69.18936f, 101.63f, 66.08f),
                    PathNode.CurveTo(104.13f, 59.31f, 112.2f, 54.0f, 120.0f, 54.0f),
                    PathNode.CurveTo(129.94113f, 54.0f, 138.0f, 62.058876f, 138.0f, 72.0f),
                    PathNode.CurveTo(138.0f, 81.94112f, 129.94113f, 90.0f, 120.0f, 90.0f),
                    PathNode.LineTo(24.0f, 90.0f),
                    PathNode.CurveTo(20.68629f, 90.0f, 18.0f, 92.686295f, 18.0f, 96.0f),
                    PathNode.CurveTo(18.0f, 99.313705f, 20.68629f, 102.0f, 24.0f, 102.0f),
                    PathNode.LineTo(120.0f, 102.0f),
                    PathNode.CurveTo(136.56854f, 102.0f, 150.0f, 88.56854f, 150.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 74.0f),
                    PathNode.CurveTo(195.1f, 74.0f, 182.64f, 82.38f, 178.37f, 93.92f),
                    PathNode.CurveTo(177.22125f, 97.029366f, 178.81064f, 100.48125f, 181.92f, 101.63f),
                    PathNode.CurveTo(185.02936f, 102.778755f, 188.48125f, 101.18936f, 189.63f, 98.08f),
                    PathNode.CurveTo(192.13f, 91.31f, 200.2f, 86.0f, 208.0f, 86.0f),
                    PathNode.CurveTo(217.94113f, 86.0f, 226.0f, 94.05888f, 226.0f, 104.0f),
                    PathNode.CurveTo(226.0f, 113.94112f, 217.94113f, 122.0f, 208.0f, 122.0f),
                    PathNode.LineTo(32.0f, 122.0f),
                    PathNode.CurveTo(28.68629f, 122.0f, 26.0f, 124.686295f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 131.3137f, 28.68629f, 134.0f, 32.0f, 134.0f),
                    PathNode.LineTo(208.0f, 134.0f),
                    PathNode.CurveTo(224.56854f, 134.0f, 238.0f, 120.56854f, 238.0f, 104.0f),
                    PathNode.CurveTo(238.0f, 87.43146f, 224.56854f, 74.0f, 208.0f, 74.0f),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
