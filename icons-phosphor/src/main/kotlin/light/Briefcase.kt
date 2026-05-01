package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorLightIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(106.0f, 112.0f),
                    PathNode.CurveTo(106.0f, 108.686295f, 108.686295f, 106.0f, 112.0f, 106.0f),
                    PathNode.LineTo(144.0f, 106.0f),
                    PathNode.CurveTo(147.3137f, 106.0f, 150.0f, 108.686295f, 150.0f, 112.0f),
                    PathNode.CurveTo(150.0f, 115.313705f, 147.3137f, 118.0f, 144.0f, 118.0f),
                    PathNode.LineTo(112.0f, 118.0f),
                    PathNode.CurveTo(108.686295f, 118.0f, 106.0f, 115.313705f, 106.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 72.0f),
                    PathNode.LineTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 207.73198f, 223.73198f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(40.0f, 214.0f),
                    PathNode.CurveTo(32.268013f, 214.0f, 26.0f, 207.73198f, 26.0f, 200.0f),
                    PathNode.LineTo(26.0f, 72.0f),
                    PathNode.CurveTo(26.0f, 64.26801f, 32.268013f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(82.0f, 58.0f),
                    PathNode.LineTo(82.0f, 48.0f),
                    PathNode.CurveTo(82.0f, 35.849735f, 91.84974f, 26.0f, 104.0f, 26.0f),
                    PathNode.LineTo(152.0f, 26.0f),
                    PathNode.CurveTo(164.15027f, 26.0f, 174.0f, 35.849735f, 174.0f, 48.0f),
                    PathNode.LineTo(174.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(223.73198f, 58.0f, 230.0f, 64.26801f, 230.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 58.0f),
                    PathNode.LineTo(162.0f, 58.0f),
                    PathNode.LineTo(162.0f, 48.0f),
                    PathNode.CurveTo(162.0f, 42.477154f, 157.52284f, 38.0f, 152.0f, 38.0f),
                    PathNode.LineTo(104.0f, 38.0f),
                    PathNode.CurveTo(98.47715f, 38.0f, 94.0f, 42.477154f, 94.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 72.0f),
                    PathNode.LineTo(38.0f, 114.79f),
                    PathNode.CurveTo(65.55244f, 130.01831f, 96.51924f, 138.0043f, 128.0f, 138.0f),
                    PathNode.CurveTo(159.48213f, 138.00519f, 190.44995f, 130.01549f, 218.0f, 114.78f),
                    PathNode.LineTo(218.0f, 72.0f),
                    PathNode.CurveTo(218.0f, 70.89543f, 217.10457f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(38.89543f, 70.0f, 38.0f, 70.89543f, 38.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.LineTo(218.0f, 128.37f),
                    PathNode.CurveTo(190.12874f, 142.58525f, 159.28706f, 149.99754f, 128.0f, 150.0f),
                    PathNode.CurveTo(96.71343f, 150.00328f, 65.871185f, 142.59428f, 38.0f, 128.38f),
                    PathNode.LineTo(38.0f, 200.0f),
                    PathNode.CurveTo(38.0f, 201.10457f, 38.89543f, 202.0f, 40.0f, 202.0f),
                    PathNode.LineTo(216.0f, 202.0f),
                    PathNode.CurveTo(217.10457f, 202.0f, 218.0f, 201.10457f, 218.0f, 200.0f),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
