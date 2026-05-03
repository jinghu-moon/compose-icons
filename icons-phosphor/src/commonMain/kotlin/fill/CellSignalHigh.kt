package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorFillIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.12f, 25.23f),
                    PathNode.CurveTo(192.14192f, 22.749874f, 185.25848f, 24.115513f, 180.68f, 28.69f),
                    PathNode.LineTo(20.68f, 188.69f),
                    PathNode.CurveTo(16.105873f, 193.26712f, 14.739068f, 200.14882f, 17.21684f, 206.12656f),
                    PathNode.CurveTo(19.694614f, 212.1043f, 25.529087f, 216.00104f, 32.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(200.83656f, 216.0f, 208.0f, 208.83656f, 208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.01091f, 33.527348f, 204.10666f, 27.690739f, 198.12f, 25.23f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.LineTo(192.0f, 40.0f),
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
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
