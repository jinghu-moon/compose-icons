package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilePlus: ImageVector
    get() {
        if (_filePlus != null) return _filePlus!!
        _filePlus = phosphorLightIcon(
            name = "FilePlus",
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
                    PathNode.MoveTo(158.0f, 152.0f),
                    PathNode.CurveTo(158.0f, 155.3137f, 155.3137f, 158.0f, 152.0f, 158.0f),
                    PathNode.LineTo(134.0f, 158.0f),
                    PathNode.LineTo(134.0f, 176.0f),
                    PathNode.CurveTo(134.0f, 179.3137f, 131.3137f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(124.686295f, 182.0f, 122.0f, 179.3137f, 122.0f, 176.0f),
                    PathNode.LineTo(122.0f, 158.0f),
                    PathNode.LineTo(104.0f, 158.0f),
                    PathNode.CurveTo(100.686295f, 158.0f, 98.0f, 155.3137f, 98.0f, 152.0f),
                    PathNode.CurveTo(98.0f, 148.6863f, 100.686295f, 146.0f, 104.0f, 146.0f),
                    PathNode.LineTo(122.0f, 146.0f),
                    PathNode.LineTo(122.0f, 128.0f),
                    PathNode.CurveTo(122.0f, 124.686295f, 124.686295f, 122.0f, 128.0f, 122.0f),
                    PathNode.CurveTo(131.3137f, 122.0f, 134.0f, 124.686295f, 134.0f, 128.0f),
                    PathNode.LineTo(134.0f, 146.0f),
                    PathNode.LineTo(152.0f, 146.0f),
                    PathNode.CurveTo(155.3137f, 146.0f, 158.0f, 148.6863f, 158.0f, 152.0f),
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
        return _filePlus!!
    }

private var _filePlus: ImageVector? = null
