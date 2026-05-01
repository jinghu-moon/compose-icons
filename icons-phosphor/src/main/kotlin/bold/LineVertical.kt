package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineVertical: ImageVector
    get() {
        if (_lineVertical != null) return _lineVertical!!
        _lineVertical = phosphorBoldIcon(
            name = "LineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 24.0f),
                    PathNode.LineTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 134.62741f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(121.37258f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.LineTo(116.0f, 24.0f),
                    PathNode.CurveTo(116.0f, 17.372583f, 121.37258f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(134.62741f, 12.0f, 140.0f, 17.372583f, 140.0f, 24.0f),
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
        return _lineVertical!!
    }

private var _lineVertical: ImageVector? = null
