package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorLightIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.76f, 84.24f),
                    PathNode.CurveTo(169.55713f, 81.87592f, 169.62213f, 78.191925f, 171.90703f, 75.90703f),
                    PathNode.CurveTo(174.19193f, 73.62213f, 177.87592f, 73.55713f, 180.24f, 75.76f),
                    PathNode.LineTo(194.0f, 89.51f),
                    PathNode.LineTo(194.0f, 48.0f),
                    PathNode.CurveTo(194.0f, 44.68629f, 196.6863f, 42.0f, 200.0f, 42.0f),
                    PathNode.CurveTo(203.3137f, 42.0f, 206.0f, 44.68629f, 206.0f, 48.0f),
                    PathNode.LineTo(206.0f, 89.51f),
                    PathNode.LineTo(219.76f, 75.76f),
                    PathNode.CurveTo(222.12408f, 73.55713f, 225.80807f, 73.62213f, 228.09297f, 75.90703f),
                    PathNode.CurveTo(230.37787f, 78.191925f, 230.44287f, 81.87592f, 228.24f, 84.24f),
                    PathNode.LineTo(204.24f, 108.24f),
                    PathNode.CurveTo(201.89746f, 110.57962f, 198.10254f, 110.57962f, 195.76f, 108.24f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 160.0f),
                    PathNode.LineTo(238.0f, 200.0f),
                    PathNode.CurveTo(238.0f, 207.73198f, 231.73198f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(168.0f, 214.0f),
                    PathNode.CurveTo(166.32504f, 214.00041f, 164.72618f, 213.30067f, 163.59f, 212.07f),
                    PathNode.LineTo(69.37f, 110.0f),
                    PathNode.LineTo(32.0f, 110.0f),
                    PathNode.CurveTo(24.268015f, 110.0f, 18.0f, 103.73199f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 56.0f),
                    PathNode.CurveTo(18.0f, 48.268013f, 24.268015f, 42.0f, 32.0f, 42.0f),
                    PathNode.LineTo(88.0f, 42.0f),
                    PathNode.CurveTo(89.67495f, 41.999588f, 91.27383f, 42.69932f, 92.41f, 43.93f),
                    PathNode.LineTo(186.63f, 146.0f),
                    PathNode.LineTo(224.0f, 146.0f),
                    PathNode.CurveTo(231.73198f, 146.0f, 238.0f, 152.26802f, 238.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 160.0f),
                    PathNode.CurveTo(226.0f, 158.89543f, 225.10457f, 158.0f, 224.0f, 158.0f),
                    PathNode.LineTo(184.0f, 158.0f),
                    PathNode.CurveTo(182.32504f, 158.00041f, 180.72618f, 157.30067f, 179.59f, 156.07f),
                    PathNode.LineTo(85.37f, 54.0f),
                    PathNode.LineTo(32.0f, 54.0f),
                    PathNode.CurveTo(30.89543f, 54.0f, 30.0f, 54.89543f, 30.0f, 56.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 97.10457f, 30.89543f, 98.0f, 32.0f, 98.0f),
                    PathNode.LineTo(72.0f, 98.0f),
                    PathNode.CurveTo(73.67495f, 97.999596f, 75.27383f, 98.699326f, 76.41f, 99.93f),
                    PathNode.LineTo(170.63f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(225.10457f, 202.0f, 226.0f, 201.10457f, 226.0f, 200.0f),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
