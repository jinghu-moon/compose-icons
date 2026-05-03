package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorLightIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.57f, 123.54f),
                    PathNode.CurveTo(156.60785f, 115.62874f, 160.53139f, 102.22661f, 156.34477f, 90.15106f),
                    PathNode.CurveTo(152.15814f, 78.075516f, 140.78072f, 69.97827f, 128.0f, 69.97827f),
                    PathNode.CurveTo(115.21929f, 69.97827f, 103.84186f, 78.075516f, 99.65523f, 90.15106f),
                    PathNode.CurveTo(95.468605f, 102.22661f, 99.39214f, 115.62874f, 109.43f, 123.54f),
                    PathNode.CurveTo(96.82567f, 131.75826f, 91.12222f, 147.28387f, 95.409f, 161.7072f),
                    PathNode.CurveTo(99.69578f, 176.13052f, 112.95311f, 186.02078f, 128.0f, 186.02078f),
                    PathNode.CurveTo(143.04689f, 186.02078f, 156.30423f, 176.13052f, 160.591f, 161.7072f),
                    PathNode.CurveTo(164.87778f, 147.28387f, 159.17433f, 131.75826f, 146.57f, 123.54f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 100.0f),
                    PathNode.CurveTo(110.0f, 90.05888f, 118.05888f, 82.0f, 128.0f, 82.0f),
                    PathNode.CurveTo(137.94113f, 82.0f, 146.0f, 90.05888f, 146.0f, 100.0f),
                    PathNode.CurveTo(146.0f, 109.94112f, 137.94113f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(118.05888f, 118.0f, 110.0f, 109.94112f, 110.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 174.0f),
                    PathNode.CurveTo(115.84974f, 174.0f, 106.0f, 164.15027f, 106.0f, 152.0f),
                    PathNode.CurveTo(106.0f, 139.84973f, 115.84974f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(140.15027f, 130.0f, 150.0f, 139.84973f, 150.0f, 152.0f),
                    PathNode.CurveTo(150.0f, 164.15027f, 140.15027f, 174.0f, 128.0f, 174.0f),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
