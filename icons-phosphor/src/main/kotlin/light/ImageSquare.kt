package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorLightIcon(
            name = "ImageSquare",
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
                    PathNode.MoveTo(46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 130.2f),
                    PathNode.LineTo(181.9f, 102.1f),
                    PathNode.CurveTo(179.27444f, 99.47418f, 175.71329f, 97.99899f, 172.0f, 97.99899f),
                    PathNode.CurveTo(168.28671f, 97.99899f, 164.72556f, 99.47418f, 162.1f, 102.1f),
                    PathNode.LineTo(54.2f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(71.17f, 210.0f),
                    PathNode.LineTo(170.58f, 110.59f),
                    PathNode.CurveTo(170.95514f, 110.21445f, 171.46419f, 110.003426f, 171.995f, 110.003426f),
                    PathNode.CurveTo(172.52582f, 110.003426f, 173.03487f, 110.21445f, 173.41f, 110.59f),
                    PathNode.LineTo(210.0f, 147.17f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 118.0f),
                    PathNode.CurveTo(108.15026f, 118.0f, 118.0f, 108.15026f, 118.0f, 96.0f),
                    PathNode.CurveTo(118.0f, 83.84974f, 108.15026f, 74.0f, 96.0f, 74.0f),
                    PathNode.CurveTo(83.84974f, 74.0f, 74.0f, 83.84974f, 74.0f, 96.0f),
                    PathNode.CurveTo(74.0f, 108.15026f, 83.84974f, 118.0f, 96.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 86.0f),
                    PathNode.CurveTo(101.52285f, 86.0f, 106.0f, 90.47715f, 106.0f, 96.0f),
                    PathNode.CurveTo(106.0f, 101.52285f, 101.52285f, 106.0f, 96.0f, 106.0f),
                    PathNode.CurveTo(90.47715f, 106.0f, 86.0f, 101.52285f, 86.0f, 96.0f),
                    PathNode.CurveTo(86.0f, 90.47715f, 90.47715f, 86.0f, 96.0f, 86.0f),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
