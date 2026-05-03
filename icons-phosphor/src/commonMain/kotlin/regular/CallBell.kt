package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorRegularIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 180.41827f, 240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 171.58173f, 236.41827f, 168.0f, 232.0f, 168.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(223.93958f, 102.106834f, 185.71486f, 60.55483f, 136.0f, 56.34f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(156.41827f, 40.0f, 160.0f, 36.418278f, 160.0f, 32.0f),
                    PathNode.CurveTo(160.0f, 27.581722f, 156.41827f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(99.58172f, 24.0f, 96.0f, 27.581722f, 96.0f, 32.0f),
                    PathNode.CurveTo(96.0f, 36.418278f, 99.58172f, 40.0f, 104.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 56.34f),
                    PathNode.CurveTo(70.28514f, 60.55483f, 32.060425f, 102.106834f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(19.581722f, 168.0f, 16.0f, 171.58173f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 180.41827f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 107.81722f, 83.81722f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(172.18279f, 72.0f, 208.0f, 107.81722f, 208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 212.41827f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(19.581722f, 216.0f, 16.0f, 212.41827f, 16.0f, 208.0f),
                    PathNode.CurveTo(16.0f, 203.58173f, 19.581722f, 200.0f, 24.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 203.58173f, 240.0f, 208.0f),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
