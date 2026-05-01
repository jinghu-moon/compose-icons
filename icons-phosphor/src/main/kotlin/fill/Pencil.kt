package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = phosphorFillIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.31f, 73.37f),
                    PathNode.LineTo(182.63f, 28.68f),
                    PathNode.CurveTo(179.62932f, 25.678629f, 175.5591f, 23.992416f, 171.315f, 23.992416f),
                    PathNode.CurveTo(167.0709f, 23.992416f, 163.00069f, 25.678629f, 160.0f, 28.68f),
                    PathNode.LineTo(36.69f, 152.0f),
                    PathNode.CurveTo(33.67581f, 154.99025f, 31.986435f, 159.06421f, 32.0f, 163.31f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(92.69f, 224.0f),
                    PathNode.CurveTo(96.93579f, 224.01357f, 101.00975f, 222.32419f, 104.0f, 219.31f),
                    PathNode.LineTo(227.31f, 96.0f),
                    PathNode.CurveTo(230.31137f, 92.99931f, 231.99759f, 88.92911f, 231.99759f, 84.685f),
                    PathNode.CurveTo(231.99759f, 80.4409f, 230.31137f, 76.37069f, 227.31f, 73.37f),
                    PathNode.Close,
                    PathNode.MoveTo(51.31f, 160.0f),
                    PathNode.LineTo(141.66f, 69.65f),
                    PathNode.LineTo(158.34f, 86.34f),
                    PathNode.LineTo(68.0f, 176.68f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 179.31f),
                    PathNode.LineTo(76.69f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 204.69f),
                    PathNode.LineTo(79.31f, 188.0f),
                    PathNode.LineTo(169.66f, 97.65f),
                    PathNode.LineTo(169.66f, 97.65f),
                    PathNode.LineTo(186.34f, 114.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pencil!!
    }

private var _pencil: ImageVector? = null
