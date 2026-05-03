package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorBoldIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 164.0f),
                    PathNode.CurveTo(172.0f, 170.62741f, 166.62741f, 176.0f, 160.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(89.37258f, 176.0f, 84.0f, 170.62741f, 84.0f, 164.0f),
                    PathNode.CurveTo(84.0f, 157.37259f, 89.37258f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(166.62741f, 152.0f, 172.0f, 157.37259f, 172.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(89.37258f, 112.0f, 84.0f, 117.37258f, 84.0f, 124.0f),
                    PathNode.CurveTo(84.0f, 130.62741f, 89.37258f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(166.62741f, 136.0f, 172.0f, 130.62741f, 172.0f, 124.0f),
                    PathNode.CurveTo(172.0f, 117.37258f, 166.62741f, 112.0f, 160.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 227.0457f, 211.0457f, 236.0f, 200.0f, 236.0f),
                    PathNode.LineTo(56.0f, 236.0f),
                    PathNode.CurveTo(44.954304f, 236.0f, 36.0f, 227.0457f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 36.954304f, 44.954304f, 28.0f, 56.0f, 28.0f),
                    PathNode.LineTo(90.53f, 28.0f),
                    PathNode.CurveTo(100.31595f, 17.781021f, 113.85107f, 12.002217f, 128.0f, 12.002217f),
                    PathNode.CurveTo(142.14894f, 12.002217f, 155.68405f, 17.781021f, 165.47f, 28.0f),
                    PathNode.LineTo(200.0f, 28.0f),
                    PathNode.CurveTo(211.0457f, 28.0f, 220.0f, 36.954304f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.29f, 60.0f),
                    PathNode.LineTo(155.71f, 60.0f),
                    PathNode.CurveTo(153.71301f, 46.232746f, 141.91133f, 36.01944f, 128.0f, 36.01944f),
                    PathNode.CurveTo(114.08867f, 36.01944f, 102.286995f, 46.232746f, 100.29f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 52.0f),
                    PathNode.LineTo(178.59f, 52.0f),
                    PathNode.CurveTo(179.52353f, 55.931828f, 179.9967f, 59.958866f, 180.0f, 64.0f),
                    PathNode.LineTo(180.0f, 72.0f),
                    PathNode.CurveTo(180.0f, 78.62742f, 174.62741f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(88.0f, 84.0f),
                    PathNode.CurveTo(81.37258f, 84.0f, 76.0f, 78.62742f, 76.0f, 72.0f),
                    PathNode.LineTo(76.0f, 64.0f),
                    PathNode.CurveTo(76.00329f, 59.958866f, 76.47646f, 55.931828f, 77.41f, 52.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
