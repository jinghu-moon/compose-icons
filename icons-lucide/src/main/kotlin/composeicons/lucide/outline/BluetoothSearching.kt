package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BluetoothSearching: ImageVector
    get() {
        if (_bluetoothSearching != null) return _bluetoothSearching!!
        _bluetoothSearching = lucideOutlineIcon(
            name = "BluetoothSearching",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.LineTo(7.0f, 17.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.83f, 14.83f),
                    PathNode.CurveTo(21.581108f, 14.079727f, 22.003147f, 13.061637f, 22.003147f, 12.0f),
                    PathNode.CurveTo(22.003147f, 10.938363f, 21.581108f, 9.920273f, 20.83f, 9.17f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.LineTo(18.01f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothSearching!!
    }

private var _bluetoothSearching: ImageVector? = null
