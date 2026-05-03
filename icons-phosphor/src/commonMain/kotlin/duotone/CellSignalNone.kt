package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorDuotoneIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.12f, 25.23f),
                    PathNode.CurveTo(192.14273f, 22.756908f, 185.26437f, 24.126268f, 180.69f, 28.7f),
                    PathNode.LineTo(20.69f, 188.7f),
                    PathNode.CurveTo(16.124296f, 193.27676f, 14.761392f, 200.1514f, 17.235695f, 206.12386f),
                    PathNode.CurveTo(19.71f, 212.09631f, 25.535295f, 215.99297f, 32.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(200.83656f, 216.0f, 208.0f, 208.83656f, 208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(207.99463f, 33.532284f, 204.09589f, 27.7039f, 198.12f, 25.23f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(192.0f, 40.0f),
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
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
