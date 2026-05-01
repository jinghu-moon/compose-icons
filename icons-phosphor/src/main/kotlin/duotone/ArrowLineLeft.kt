package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorDuotoneIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(72.0f, 128.0f),
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
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.CurveTo(152.00255f, 52.76235f, 150.05338f, 49.84236f, 147.06232f, 48.60302f),
                    PathNode.CurveTo(144.07126f, 47.363674f, 140.6281f, 48.04936f, 138.34f, 50.34f),
                    PathNode.LineTo(66.34f, 122.34f),
                    PathNode.CurveTo(64.83778f, 123.840546f, 63.993706f, 125.876724f, 63.993706f, 128.0f),
                    PathNode.CurveTo(63.993706f, 130.12328f, 64.83778f, 132.15945f, 66.34f, 133.66f),
                    PathNode.LineTo(138.34f, 205.66f),
                    PathNode.CurveTo(140.6281f, 207.95064f, 144.07126f, 208.63632f, 147.06232f, 207.39697f),
                    PathNode.CurveTo(150.05338f, 206.15764f, 152.00255f, 203.23764f, 152.0f, 200.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 180.69f),
                    PathNode.LineTo(83.31f, 128.0f),
                    PathNode.LineTo(136.0f, 75.31f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 220.41827f, 44.418278f, 224.0f, 40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 35.581722f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.CurveTo(44.418278f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
