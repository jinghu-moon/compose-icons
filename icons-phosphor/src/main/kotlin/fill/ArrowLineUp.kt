package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorFillIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 138.34f),
                    PathNode.CurveTo(207.95064f, 140.6281f, 208.63632f, 144.07126f, 207.39697f, 147.06232f),
                    PathNode.CurveTo(206.15764f, 150.05338f, 203.23764f, 152.00255f, 200.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(52.76235f, 152.00255f, 49.84236f, 150.05338f, 48.60302f, 147.06232f),
                    PathNode.CurveTo(47.363674f, 144.07126f, 48.04936f, 140.6281f, 50.34f, 138.34f),
                    PathNode.LineTo(122.34f, 66.34f),
                    PathNode.CurveTo(123.840546f, 64.83778f, 125.876724f, 63.993706f, 128.0f, 63.993706f),
                    PathNode.CurveTo(130.12328f, 63.993706f, 132.15945f, 64.83778f, 133.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 44.418278f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 44.418278f, 224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
