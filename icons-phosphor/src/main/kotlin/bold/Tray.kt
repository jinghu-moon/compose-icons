package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorBoldIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.LineTo(179.31f, 144.0f),
                    PathNode.CurveTo(174.00302f, 143.98563f, 168.91106f, 146.09589f, 165.17f, 149.86f),
                    PathNode.LineTo(147.0f, 168.0f),
                    PathNode.LineTo(109.0f, 168.0f),
                    PathNode.LineTo(90.83f, 149.86f),
                    PathNode.CurveTo(87.088936f, 146.09589f, 81.99697f, 143.98563f, 76.69f, 144.0f),
                    PathNode.LineTo(52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.LineTo(75.0f, 168.0f),
                    PathNode.LineTo(93.14f, 186.14f),
                    PathNode.CurveTo(96.888374f, 189.91154f, 101.99264f, 192.0224f, 107.31f, 192.0f),
                    PathNode.LineTo(148.69f, 192.0f),
                    PathNode.CurveTo(153.99698f, 192.01437f, 159.08894f, 189.90411f, 162.83f, 186.14f),
                    PathNode.LineTo(181.0f, 168.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tray!!
    }

private var _tray: ImageVector? = null
