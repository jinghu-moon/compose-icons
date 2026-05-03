package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorDuotoneIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 90.34f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(165.66f, 34.34f),
                    PathNode.CurveTo(168.78375f, 31.218275f, 173.84624f, 31.218275f, 176.97f, 34.34f),
                    PathNode.LineTo(221.66f, 79.0f),
                    PathNode.CurveTo(223.16835f, 80.50135f, 224.01633f, 82.54182f, 224.01633f, 84.67f),
                    PathNode.CurveTo(224.01633f, 86.79818f, 223.16835f, 88.83865f, 221.66f, 90.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(92.69f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 163.31f),
                    PathNode.LineTo(136.0f, 75.31f),
                    PathNode.LineTo(180.69f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 108.68f),
                    PathNode.LineTo(147.31f, 64.0f),
                    PathNode.LineTo(171.31f, 40.0f),
                    PathNode.LineTo(216.0f, 84.68f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
