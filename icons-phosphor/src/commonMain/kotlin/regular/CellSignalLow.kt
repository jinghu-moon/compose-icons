package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalLow: ImageVector
    get() {
        if (_cellSignalLow != null) return _cellSignalLow!!
        _cellSignalLow = phosphorRegularIcon(
            name = "CellSignalLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(88.0f, 204.41827f, 84.41828f, 208.0f, 80.0f, 208.0f),
                    PathNode.CurveTo(75.58172f, 208.0f, 72.0f, 204.41827f, 72.0f, 200.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.CurveTo(72.0f, 147.58173f, 75.58172f, 144.0f, 80.0f, 144.0f),
                    PathNode.CurveTo(84.41828f, 144.0f, 88.0f, 147.58173f, 88.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.CurveTo(44.418278f, 208.0f, 48.0f, 204.41827f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(48.0f, 187.58173f, 44.418278f, 184.0f, 40.0f, 184.0f),
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
        return _cellSignalLow!!
    }

private var _cellSignalLow: ImageVector? = null
