package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorRegularIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 196.41827f, 196.41827f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(83.58172f, 200.0f, 80.0f, 196.41827f, 80.0f, 192.0f),
                    PathNode.CurveTo(80.0f, 187.58173f, 83.58172f, 184.0f, 88.0f, 184.0f),
                    PathNode.LineTo(172.69f, 184.0f),
                    PathNode.LineTo(58.34f, 69.66f),
                    PathNode.CurveTo(55.21407f, 66.534065f, 55.21407f, 61.46593f, 58.34f, 58.34f),
                    PathNode.CurveTo(61.46593f, 55.21407f, 66.534065f, 55.21407f, 69.66f, 58.34f),
                    PathNode.LineTo(184.0f, 172.69f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 83.58172f, 187.58173f, 80.0f, 192.0f, 80.0f),
                    PathNode.CurveTo(196.41827f, 80.0f, 200.0f, 83.58172f, 200.0f, 88.0f),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
