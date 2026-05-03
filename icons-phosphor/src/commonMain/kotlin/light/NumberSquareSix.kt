package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorLightIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
