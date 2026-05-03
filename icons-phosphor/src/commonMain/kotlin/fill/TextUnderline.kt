package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorFillIcon(
            name = "TextUnderline",
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
                    PathNode.MoveTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 67.58172f, 83.58172f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(92.41828f, 64.0f, 96.0f, 67.58172f, 96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 137.67311f, 110.32689f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(145.67311f, 152.0f, 160.0f, 137.67311f, 160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 67.58172f, 163.58173f, 64.0f, 168.0f, 64.0f),
                    PathNode.CurveTo(172.41827f, 64.0f, 176.0f, 67.58172f, 176.0f, 72.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(176.0f, 146.50967f, 154.50967f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(101.49033f, 168.0f, 80.0f, 146.50967f, 80.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(75.58172f, 200.0f, 72.0f, 196.41827f, 72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 187.58173f, 75.58172f, 184.0f, 80.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(180.41827f, 184.0f, 184.0f, 187.58173f, 184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 196.41827f, 180.41827f, 200.0f, 176.0f, 200.0f),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
