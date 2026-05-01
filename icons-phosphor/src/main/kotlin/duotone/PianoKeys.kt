package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorDuotoneIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 152.0f),
                    PathNode.CurveTo(116.41828f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 139.58173f, 152.0f, 144.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 148.41827f, 67.58172f, 152.0f, 72.0f, 152.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(188.41827f, 152.0f, 192.0f, 148.41827f, 192.0f, 144.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
