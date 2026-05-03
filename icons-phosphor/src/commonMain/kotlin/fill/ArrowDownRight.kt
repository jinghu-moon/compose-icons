package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorFillIcon(
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
                    PathNode.CurveTo(84.762344f, 200.00255f, 81.84236f, 198.05338f, 80.60302f, 195.06232f),
                    PathNode.CurveTo(79.36368f, 192.07126f, 80.04936f, 188.6281f, 82.34f, 186.34f),
                    PathNode.LineTo(128.69f, 140.0f),
                    PathNode.LineTo(58.34f, 69.66f),
                    PathNode.CurveTo(55.21407f, 66.534065f, 55.21407f, 61.46593f, 58.34f, 58.34f),
                    PathNode.CurveTo(61.46593f, 55.21407f, 66.534065f, 55.21407f, 69.66f, 58.34f),
                    PathNode.LineTo(140.0f, 128.69f),
                    PathNode.LineTo(186.34f, 82.34f),
                    PathNode.CurveTo(188.6281f, 80.04936f, 192.07126f, 79.36368f, 195.06232f, 80.60302f),
                    PathNode.CurveTo(198.05338f, 81.84236f, 200.00255f, 84.762344f, 200.0f, 88.0f),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
