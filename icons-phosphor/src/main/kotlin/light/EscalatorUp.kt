package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorLightIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 42.0f),
                    PathNode.LineTo(168.0f, 42.0f),
                    PathNode.CurveTo(166.32504f, 41.999588f, 164.72618f, 42.69932f, 163.59f, 43.93f),
                    PathNode.LineTo(69.37f, 146.0f),
                    PathNode.LineTo(32.0f, 146.0f),
                    PathNode.CurveTo(24.268015f, 146.0f, 18.0f, 152.26802f, 18.0f, 160.0f),
                    PathNode.LineTo(18.0f, 200.0f),
                    PathNode.CurveTo(18.0f, 207.73198f, 24.268015f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(88.0f, 214.0f),
                    PathNode.CurveTo(89.67495f, 214.00041f, 91.27383f, 213.30067f, 92.41f, 212.07f),
                    PathNode.LineTo(186.63f, 110.0f),
                    PathNode.LineTo(224.0f, 110.0f),
                    PathNode.CurveTo(231.73198f, 110.0f, 238.0f, 103.73199f, 238.0f, 96.0f),
                    PathNode.LineTo(238.0f, 56.0f),
                    PathNode.CurveTo(238.0f, 48.268013f, 231.73198f, 42.0f, 224.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 96.0f),
                    PathNode.CurveTo(226.0f, 97.10457f, 225.10457f, 98.0f, 224.0f, 98.0f),
                    PathNode.LineTo(184.0f, 98.0f),
                    PathNode.CurveTo(182.32504f, 97.999596f, 180.72618f, 98.699326f, 179.59f, 99.93f),
                    PathNode.LineTo(85.37f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(30.89543f, 202.0f, 30.0f, 201.10457f, 30.0f, 200.0f),
                    PathNode.LineTo(30.0f, 160.0f),
                    PathNode.CurveTo(30.0f, 158.89543f, 30.89543f, 158.0f, 32.0f, 158.0f),
                    PathNode.LineTo(72.0f, 158.0f),
                    PathNode.CurveTo(73.67495f, 158.00041f, 75.27383f, 157.30067f, 76.41f, 156.07f),
                    PathNode.LineTo(170.63f, 54.0f),
                    PathNode.LineTo(224.0f, 54.0f),
                    PathNode.CurveTo(225.10457f, 54.0f, 226.0f, 54.89543f, 226.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 171.76f),
                    PathNode.CurveTo(229.84523f, 173.25575f, 230.506f, 175.50844f, 229.96309f, 177.63431f),
                    PathNode.CurveTo(229.42018f, 179.76018f, 227.76018f, 181.42018f, 225.63431f, 181.96309f),
                    PathNode.CurveTo(223.50844f, 182.506f, 221.25575f, 181.84523f, 219.76f, 180.24f),
                    PathNode.LineTo(206.0f, 166.49f),
                    PathNode.LineTo(206.0f, 208.0f),
                    PathNode.CurveTo(206.0f, 211.3137f, 203.3137f, 214.0f, 200.0f, 214.0f),
                    PathNode.CurveTo(196.6863f, 214.0f, 194.0f, 211.3137f, 194.0f, 208.0f),
                    PathNode.LineTo(194.0f, 166.49f),
                    PathNode.LineTo(180.24f, 180.24f),
                    PathNode.CurveTo(177.87592f, 182.44287f, 174.19193f, 182.37787f, 171.90703f, 180.09297f),
                    PathNode.CurveTo(169.62213f, 177.80807f, 169.55713f, 174.12408f, 171.76f, 171.76f),
                    PathNode.LineTo(195.76f, 147.76f),
                    PathNode.CurveTo(198.10254f, 145.42038f, 201.89746f, 145.42038f, 204.24f, 147.76f),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
