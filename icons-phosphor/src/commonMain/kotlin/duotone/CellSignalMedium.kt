package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) return _cellSignalMedium!!
        _cellSignalMedium = phosphorDuotoneIcon(
            name = "CellSignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 100.7f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(28.762346f, 208.00255f, 25.842361f, 206.05338f, 24.60302f, 203.06232f),
                    PathNode.CurveTo(23.36368f, 200.07126f, 24.049358f, 196.6281f, 26.34f, 194.34f),
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
                    PathNode.MoveTo(112.0f, 120.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.LineTo(128.0f, 104.0f),
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
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
