package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorLightIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 101.22232f, 109.22232f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(146.77768f, 86.0f, 162.0f, 101.22232f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 138.77768f, 146.77768f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(109.22232f, 154.0f, 94.0f, 138.77768f, 94.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(69.21f, 202.0f),
                    PathNode.CurveTo(80.4836f, 179.90427f, 103.19445f, 165.9956f, 128.0f, 165.9956f),
                    PathNode.CurveTo(152.80556f, 165.9956f, 175.5164f, 179.90427f, 186.79f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(191.412f, 181.46852f, 174.48077f, 165.57025f, 153.45f, 158.29f),
                    PathNode.CurveTo(170.3479f, 147.06688f, 177.89934f, 126.099686f, 172.03773f, 106.67962f),
                    PathNode.CurveTo(166.17613f, 87.25956f, 148.2854f, 73.97163f, 128.0f, 73.97163f),
                    PathNode.CurveTo(107.71461f, 73.97163f, 89.82387f, 87.25956f, 83.96226f, 106.67962f),
                    PathNode.CurveTo(78.10066f, 126.099686f, 85.6521f, 147.06688f, 102.55f, 158.29f),
                    PathNode.CurveTo(81.519226f, 165.57025f, 64.588f, 181.46852f, 56.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
