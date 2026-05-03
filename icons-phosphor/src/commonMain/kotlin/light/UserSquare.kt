package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorLightIcon(
            name = "UserSquare",
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
                    PathNode.MoveTo(94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 101.22232f, 109.22232f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(146.77768f, 86.0f, 162.0f, 101.22232f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 138.77768f, 146.77768f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(109.22232f, 154.0f, 94.0f, 138.77768f, 94.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(65.77f, 210.0f),
                    PathNode.CurveTo(69.86209f, 198.48976f, 77.04881f, 188.33078f, 86.54f, 180.64f),
                    PathNode.CurveTo(110.73005f, 161.10986f, 145.26994f, 161.10986f, 169.46f, 180.64f),
                    PathNode.CurveTo(178.95119f, 188.33078f, 186.13791f, 198.48976f, 190.23f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(202.83f, 210.0f),
                    PathNode.CurveTo(195.72699f, 185.77695f, 177.32007f, 166.5015f, 153.45f, 158.29f),
                    PathNode.CurveTo(170.3479f, 147.06688f, 177.89934f, 126.099686f, 172.03773f, 106.67962f),
                    PathNode.CurveTo(166.17613f, 87.25956f, 148.2854f, 73.97163f, 128.0f, 73.97163f),
                    PathNode.CurveTo(107.71461f, 73.97163f, 89.82387f, 87.25956f, 83.96226f, 106.67962f),
                    PathNode.CurveTo(78.10066f, 126.099686f, 85.6521f, 147.06688f, 102.55f, 158.29f),
                    PathNode.CurveTo(78.67993f, 166.5015f, 60.273018f, 185.77695f, 53.17f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
