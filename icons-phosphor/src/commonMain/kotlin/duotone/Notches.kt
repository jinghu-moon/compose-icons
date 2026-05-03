package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorDuotoneIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
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
                    PathNode.MoveTo(195.06f, 32.61f),
                    PathNode.CurveTo(192.07097f, 31.369936f, 188.62924f, 32.052757f, 186.34f, 34.34f),
                    PathNode.LineTo(34.34f, 186.34f),
                    PathNode.CurveTo(32.04936f, 188.6281f, 31.36368f, 192.07126f, 32.60302f, 195.06232f),
                    PathNode.CurveTo(33.84236f, 198.05338f, 36.76235f, 200.00255f, 40.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(196.41827f, 200.0f, 200.0f, 196.41827f, 200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(199.99933f, 36.764324f, 198.04962f, 33.847645f, 195.06f, 32.61f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(59.31f, 184.0f),
                    PathNode.LineTo(184.0f, 59.31f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
