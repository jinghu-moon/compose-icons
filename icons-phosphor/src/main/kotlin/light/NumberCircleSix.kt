package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorLightIcon(
            name = "NumberCircleSix",
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
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(126.12366f, 114.00412f, 124.25078f, 114.16131f, 122.4f, 114.47f),
                    PathNode.LineTo(141.15f, 83.08f),
                    PathNode.CurveTo(142.85104f, 80.23573f, 141.92427f, 76.55104f, 139.08f, 74.85f),
                    PathNode.CurveTo(136.23573f, 73.14896f, 132.55104f, 74.07574f, 130.85f, 76.92f),
                    PathNode.LineTo(98.61f, 130.92f),
                    PathNode.CurveTo(90.87478f, 144.23405f, 93.052956f, 161.08455f, 103.919426f, 171.99406f),
                    PathNode.CurveTo(114.785904f, 182.90358f, 131.62766f, 185.14835f, 144.97218f, 177.46582f),
                    PathNode.CurveTo(158.31671f, 169.7833f, 164.8323f, 154.09155f, 160.85432f, 139.2163f),
                    PathNode.CurveTo(156.87636f, 124.341034f, 143.39798f, 113.99614f, 128.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(115.84974f, 170.0f, 106.0f, 160.15027f, 106.0f, 148.0f),
                    PathNode.CurveTo(106.0f, 135.84973f, 115.84974f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(140.15027f, 126.0f, 150.0f, 135.84973f, 150.0f, 148.0f),
                    PathNode.CurveTo(150.0f, 160.15027f, 140.15027f, 170.0f, 128.0f, 170.0f),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
