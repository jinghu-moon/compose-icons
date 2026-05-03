package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorRegularIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.66f, 69.66f),
                    PathNode.LineTo(83.31f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.CurveTo(172.41827f, 184.0f, 176.0f, 187.58173f, 176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 83.58172f, 59.581722f, 80.0f, 64.0f, 80.0f),
                    PathNode.CurveTo(68.41828f, 80.0f, 72.0f, 83.58172f, 72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 172.69f),
                    PathNode.LineTo(186.34f, 58.34f),
                    PathNode.CurveTo(189.46593f, 55.21407f, 194.53407f, 55.21407f, 197.66f, 58.34f),
                    PathNode.CurveTo(200.78593f, 61.46593f, 200.78593f, 66.534065f, 197.66f, 69.66f),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
