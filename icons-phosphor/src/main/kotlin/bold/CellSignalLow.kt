package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalLow: ImageVector
    get() {
        if (_cellSignalLow != null) return _cellSignalLow!!
        _cellSignalLow = phosphorBoldIcon(
            name = "CellSignalLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 206.62741f, 86.62742f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(73.37258f, 212.0f, 68.0f, 206.62741f, 68.0f, 200.0f),
                    PathNode.LineTo(68.0f, 152.0f),
                    PathNode.CurveTo(68.0f, 145.37259f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(86.62742f, 140.0f, 92.0f, 145.37259f, 92.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.CurveTo(46.62742f, 212.0f, 52.0f, 206.62741f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 185.37259f, 46.62742f, 180.0f, 40.0f, 180.0f),
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
        return _cellSignalLow!!
    }

private var _cellSignalLow: ImageVector? = null
