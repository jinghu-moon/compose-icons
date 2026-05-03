package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorFillIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 164.41827f, 140.41827f, 168.0f, 136.0f, 168.0f),
                    PathNode.CurveTo(131.58173f, 168.0f, 128.0f, 164.41827f, 128.0f, 160.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.CurveTo(72.0f, 164.41827f, 68.41828f, 168.0f, 64.0f, 168.0f),
                    PathNode.CurveTo(59.581722f, 168.0f, 56.0f, 164.41827f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.CurveTo(68.41828f, 72.0f, 72.0f, 75.58172f, 72.0f, 80.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.CurveTo(128.0f, 75.58172f, 131.58173f, 72.0f, 136.0f, 72.0f),
                    PathNode.CurveTo(140.41827f, 72.0f, 144.0f, 75.58172f, 144.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 180.41827f, 196.41827f, 184.0f, 192.0f, 184.0f),
                    PathNode.CurveTo(187.58173f, 184.0f, 184.0f, 180.41827f, 184.0f, 176.0f),
                    PathNode.LineTo(184.0f, 111.0f),
                    PathNode.LineTo(172.44f, 118.71f),
                    PathNode.CurveTo(168.76178f, 121.16215f, 163.79214f, 120.16821f, 161.34f, 116.49f),
                    PathNode.CurveTo(158.88786f, 112.81178f, 159.88179f, 107.84214f, 163.56f, 105.39f),
                    PathNode.LineTo(187.56f, 89.39f),
                    PathNode.CurveTo(190.00801f, 87.75665f, 193.15512f, 87.59921f, 195.75392f, 88.98009f),
                    PathNode.CurveTo(198.35272f, 90.36096f, 199.98355f, 93.05716f, 200.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
