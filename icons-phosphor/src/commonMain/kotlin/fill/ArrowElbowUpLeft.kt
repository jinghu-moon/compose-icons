package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorFillIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 228.41827f, 196.41827f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(187.58173f, 232.0f, 184.0f, 228.41827f, 184.0f, 224.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.00255f, 131.23766f, 102.05338f, 134.15764f, 99.062325f, 135.39697f),
                    PathNode.CurveTo(96.07126f, 136.63632f, 92.62809f, 135.95064f, 90.34f, 133.66f),
                    PathNode.LineTo(42.34f, 85.66f),
                    PathNode.CurveTo(40.837784f, 84.159454f, 39.993706f, 82.123276f, 39.993706f, 80.0f),
                    PathNode.CurveTo(39.993706f, 77.876724f, 40.837784f, 75.840546f, 42.34f, 74.34f),
                    PathNode.LineTo(90.34f, 26.34f),
                    PathNode.CurveTo(92.62809f, 24.049358f, 96.07126f, 23.36368f, 99.062325f, 24.60302f),
                    PathNode.CurveTo(102.05338f, 25.842361f, 104.00255f, 28.762346f, 104.0f, 32.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
