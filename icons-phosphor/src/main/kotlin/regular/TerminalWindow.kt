package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorRegularIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(128.00153f, 130.43092f, 126.89765f, 132.73067f, 125.0f, 134.25f),
                    PathNode.LineTo(85.0f, 166.25f),
                    PathNode.CurveTo(81.54822f, 169.01143f, 76.51142f, 168.45178f, 73.75f, 165.0f),
                    PathNode.CurveTo(70.98858f, 161.54822f, 71.54822f, 156.51143f, 75.0f, 153.75f),
                    PathNode.LineTo(107.19f, 128.0f),
                    PathNode.LineTo(75.0f, 102.25f),
                    PathNode.CurveTo(71.54822f, 99.48858f, 70.98858f, 94.45178f, 73.75f, 91.0f),
                    PathNode.CurveTo(76.51142f, 87.54822f, 81.54822f, 86.98858f, 85.0f, 89.75f),
                    PathNode.LineTo(125.0f, 121.75f),
                    PathNode.CurveTo(126.89765f, 123.26933f, 128.00153f, 125.56907f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(131.58173f, 152.0f, 128.0f, 155.58173f, 128.0f, 160.0f),
                    PathNode.CurveTo(128.0f, 164.41827f, 131.58173f, 168.0f, 136.0f, 168.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(180.41827f, 168.0f, 184.0f, 164.41827f, 184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 155.58173f, 180.41827f, 152.0f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
