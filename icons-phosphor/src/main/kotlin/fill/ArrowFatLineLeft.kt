package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLineLeft: ImageVector
    get() {
        if (_arrowFatLineLeft != null) return _arrowFatLineLeft!!
        _arrowFatLineLeft = phosphorFillIcon(
            name = "ArrowFatLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 180.41827f, 188.41827f, 184.0f, 184.0f, 184.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(128.00255f, 227.23764f, 126.05338f, 230.15764f, 123.062325f, 231.39697f),
                    PathNode.CurveTo(120.07126f, 232.63632f, 116.62809f, 231.95064f, 114.34f, 229.66f),
                    PathNode.LineTo(18.34f, 133.66f),
                    PathNode.CurveTo(16.837784f, 132.15945f, 15.993707f, 130.12328f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 125.876724f, 16.837784f, 123.840546f, 18.34f, 122.34f),
                    PathNode.LineTo(114.34f, 26.34f),
                    PathNode.CurveTo(116.62809f, 24.049358f, 120.07126f, 23.36368f, 123.062325f, 24.60302f),
                    PathNode.CurveTo(126.05338f, 25.842361f, 128.00255f, 28.762346f, 128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.CurveTo(188.41827f, 72.0f, 192.0f, 75.58172f, 192.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.CurveTo(211.58173f, 72.0f, 208.0f, 75.58172f, 208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 211.58173f, 184.0f, 216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 75.58172f, 220.41827f, 72.0f, 216.0f, 72.0f),
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
        return _arrowFatLineLeft!!
    }

private var _arrowFatLineLeft: ImageVector? = null
