package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorRegularIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.CurveTo(211.58173f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 211.58173f, 32.0f, 216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 112.836555f, 184.83656f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(71.163445f, 120.0f, 64.0f, 112.836555f, 64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.CurveTo(64.0f, 55.163445f, 71.163445f, 48.0f, 80.0f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(184.83656f, 48.0f, 192.0f, 55.163445f, 192.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 200.83656f, 184.83656f, 208.0f, 176.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(31.163445f, 208.0f, 24.0f, 200.83656f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 143.16344f, 31.163445f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(184.83656f, 136.0f, 192.0f, 143.16344f, 192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
