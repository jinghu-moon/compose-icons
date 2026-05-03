package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorLightIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 83.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(155.11586f, 26.63446f, 153.59076f, 26.0014f, 152.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.9986f, 86.40924f, 213.36554f, 84.88415f, 212.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 46.48f),
                    PathNode.LineTo(193.52f, 82.0f),
                    PathNode.LineTo(158.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(146.0f, 88.0f),
                    PathNode.CurveTo(146.0f, 91.313705f, 148.6863f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.LineTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.89f, 167.41f),
                    PathNode.CurveTo(161.97119f, 152.93596f, 159.32993f, 133.1594f, 145.8037f, 121.83823f),
                    PathNode.CurveTo(132.27745f, 110.51706f, 112.34483f, 111.39978f, 99.87231f, 123.87231f),
                    PathNode.CurveTo(87.39978f, 136.34483f, 86.51706f, 156.27745f, 97.83823f, 169.8037f),
                    PathNode.CurveTo(109.15939f, 183.32993f, 128.93596f, 185.97119f, 143.41f, 175.89f),
                    PathNode.LineTo(155.76f, 188.24f),
                    PathNode.CurveTo(158.12408f, 190.44287f, 161.80807f, 190.37787f, 164.09297f, 188.09297f),
                    PathNode.CurveTo(166.37787f, 185.80807f, 166.44287f, 182.12408f, 164.24f, 179.76f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 148.0f),
                    PathNode.CurveTo(102.0f, 135.84973f, 111.84974f, 126.0f, 124.0f, 126.0f),
                    PathNode.CurveTo(136.15027f, 126.0f, 146.0f, 135.84973f, 146.0f, 148.0f),
                    PathNode.CurveTo(146.0f, 160.15027f, 136.15027f, 170.0f, 124.0f, 170.0f),
                    PathNode.CurveTo(111.84974f, 170.0f, 102.0f, 160.15027f, 102.0f, 148.0f),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
