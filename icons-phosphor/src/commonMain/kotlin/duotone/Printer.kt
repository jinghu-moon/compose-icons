package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorDuotoneIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 96.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 87.16f, 31.76f, 80.0f, 41.33f, 80.0f),
                    PathNode.LineTo(214.67f, 80.0f),
                    PathNode.CurveTo(224.24f, 80.0f, 232.0f, 87.16f, 232.0f, 96.0f),
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
                    PathNode.MoveTo(214.67f, 72.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 35.581722f, 196.41827f, 32.0f, 192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(59.581722f, 32.0f, 56.0f, 35.581722f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(41.33f, 72.0f),
                    PathNode.CurveTo(27.36f, 72.0f, 16.0f, 82.77f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 180.41827f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 220.41827f, 59.581722f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(196.41827f, 224.0f, 200.0f, 220.41827f, 200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 180.41827f, 240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 82.77f, 228.64f, 72.0f, 214.67f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 147.58173f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 147.58173f, 56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 91.59f, 36.19f, 88.0f, 41.33f, 88.0f),
                    PathNode.LineTo(214.67f, 88.0f),
                    PathNode.CurveTo(219.81f, 88.0f, 224.0f, 91.59f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 116.0f),
                    PathNode.CurveTo(200.0f, 122.62742f, 194.62741f, 128.0f, 188.0f, 128.0f),
                    PathNode.CurveTo(181.37259f, 128.0f, 176.0f, 122.62742f, 176.0f, 116.0f),
                    PathNode.CurveTo(176.0f, 109.37258f, 181.37259f, 104.0f, 188.0f, 104.0f),
                    PathNode.CurveTo(194.62741f, 104.0f, 200.0f, 109.37258f, 200.0f, 116.0f),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
