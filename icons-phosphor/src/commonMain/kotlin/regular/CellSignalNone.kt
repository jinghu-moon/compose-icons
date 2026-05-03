package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorRegularIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 44.418278f, 208.0f, 40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 187.58173f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.CurveTo(44.418278f, 184.0f, 48.0f, 187.58173f, 48.0f, 192.0f),
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
