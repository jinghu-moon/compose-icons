package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorLightIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(68.53f, 42.0f),
                    PathNode.CurveTo(63.613472f, 42.002342f, 59.0585f, 44.583492f, 56.53f, 48.8f),
                    PathNode.LineTo(10.86f, 124.91f),
                    PathNode.CurveTo(9.717522f, 126.81159f, 9.717522f, 129.1884f, 10.86f, 131.09f),
                    PathNode.LineTo(56.53f, 207.2f),
                    PathNode.CurveTo(59.0585f, 211.41649f, 63.613472f, 213.99767f, 68.53f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(68.53f, 202.0f),
                    PathNode.CurveTo(67.82336f, 201.99219f, 67.1733f, 201.61203f, 66.82f, 201.0f),
                    PathNode.LineTo(66.82f, 201.0f),
                    PathNode.LineTo(23.0f, 128.0f),
                    PathNode.LineTo(66.82f, 55.0f),
                    PathNode.CurveTo(67.1733f, 54.387966f, 67.82336f, 54.007816f, 68.53f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 108.24f),
                    PathNode.LineTo(144.48f, 128.0f),
                    PathNode.LineTo(164.24f, 147.76f),
                    PathNode.CurveTo(165.84523f, 149.25575f, 166.506f, 151.50844f, 165.96309f, 153.63431f),
                    PathNode.CurveTo(165.42018f, 155.76018f, 163.76018f, 157.42018f, 161.63431f, 157.96309f),
                    PathNode.CurveTo(159.50844f, 158.506f, 157.25575f, 157.84523f, 155.76f, 156.24f),
                    PathNode.LineTo(136.0f, 136.48f),
                    PathNode.LineTo(116.24f, 156.24f),
                    PathNode.CurveTo(113.87592f, 158.44287f, 110.191925f, 158.37787f, 107.90703f, 156.09297f),
                    PathNode.CurveTo(105.62213f, 153.80807f, 105.55713f, 150.12408f, 107.76f, 147.76f),
                    PathNode.LineTo(127.52f, 128.0f),
                    PathNode.LineTo(107.76f, 108.24f),
                    PathNode.CurveTo(105.55713f, 105.87592f, 105.62213f, 102.191925f, 107.90703f, 99.90703f),
                    PathNode.CurveTo(110.191925f, 97.62213f, 113.87592f, 97.55713f, 116.24f, 99.76f),
                    PathNode.LineTo(136.0f, 119.52f),
                    PathNode.LineTo(155.76f, 99.76f),
                    PathNode.CurveTo(158.12408f, 97.55713f, 161.80807f, 97.62213f, 164.09297f, 99.90703f),
                    PathNode.CurveTo(166.37787f, 102.191925f, 166.44287f, 105.87592f, 164.24f, 108.24f),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
