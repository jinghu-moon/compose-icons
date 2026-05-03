package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorFillIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 196.41827f, 196.41827f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(36.76235f, 200.00255f, 33.84236f, 198.05338f, 32.60302f, 195.06232f),
                    PathNode.CurveTo(31.36368f, 192.07126f, 32.04936f, 188.6281f, 34.34f, 186.34f),
                    PathNode.LineTo(186.34f, 34.34f),
                    PathNode.CurveTo(188.6281f, 32.04936f, 192.07126f, 31.36368f, 195.06232f, 32.60302f),
                    PathNode.CurveTo(198.05338f, 33.84236f, 200.00255f, 36.76235f, 200.0f, 40.0f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
