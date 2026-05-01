package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorDuotoneIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.06f, 80.61f),
                    PathNode.CurveTo(192.07097f, 79.369934f, 188.62924f, 80.05276f, 186.34f, 82.34f),
                    PathNode.LineTo(140.0f, 128.69f),
                    PathNode.LineTo(69.66f, 58.34f),
                    PathNode.CurveTo(66.534065f, 55.21407f, 61.46593f, 55.21407f, 58.34f, 58.34f),
                    PathNode.CurveTo(55.21407f, 61.46593f, 55.21407f, 66.534065f, 58.34f, 69.66f),
                    PathNode.LineTo(128.69f, 140.0f),
                    PathNode.LineTo(82.34f, 186.34f),
                    PathNode.CurveTo(80.04936f, 188.6281f, 79.36368f, 192.07126f, 80.60302f, 195.06232f),
                    PathNode.CurveTo(81.84236f, 198.05338f, 84.762344f, 200.00255f, 88.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(196.41827f, 200.0f, 200.0f, 196.41827f, 200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(199.99933f, 84.76432f, 198.04962f, 81.84765f, 195.06f, 80.61f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(107.31f, 184.0f),
                    PathNode.LineTo(145.65f, 145.66f),
                    PathNode.LineTo(145.65f, 145.66f),
                    PathNode.LineTo(184.0f, 107.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
