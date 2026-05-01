package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = phosphorLightIcon(
            name = "FileText",
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
                    PathNode.MoveTo(166.0f, 136.0f),
                    PathNode.CurveTo(166.0f, 139.3137f, 163.3137f, 142.0f, 160.0f, 142.0f),
                    PathNode.LineTo(96.0f, 142.0f),
                    PathNode.CurveTo(92.686295f, 142.0f, 90.0f, 139.3137f, 90.0f, 136.0f),
                    PathNode.CurveTo(90.0f, 132.6863f, 92.686295f, 130.0f, 96.0f, 130.0f),
                    PathNode.LineTo(160.0f, 130.0f),
                    PathNode.CurveTo(163.3137f, 130.0f, 166.0f, 132.6863f, 166.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 168.0f),
                    PathNode.CurveTo(166.0f, 171.3137f, 163.3137f, 174.0f, 160.0f, 174.0f),
                    PathNode.LineTo(96.0f, 174.0f),
                    PathNode.CurveTo(92.686295f, 174.0f, 90.0f, 171.3137f, 90.0f, 168.0f),
                    PathNode.CurveTo(90.0f, 164.6863f, 92.686295f, 162.0f, 96.0f, 162.0f),
                    PathNode.LineTo(160.0f, 162.0f),
                    PathNode.CurveTo(163.3137f, 162.0f, 166.0f, 164.6863f, 166.0f, 168.0f),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
