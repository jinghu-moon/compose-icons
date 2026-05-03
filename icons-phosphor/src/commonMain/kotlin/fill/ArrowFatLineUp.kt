package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) return _arrowFatLineUp!!
        _arrowFatLineUp = phosphorFillIcon(
            name = "ArrowFatLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 216.0f),
                    PathNode.CurveTo(184.0f, 220.41827f, 180.41827f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(75.58172f, 224.0f, 72.0f, 220.41827f, 72.0f, 216.0f),
                    PathNode.CurveTo(72.0f, 211.58173f, 75.58172f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(180.41827f, 208.0f, 184.0f, 211.58173f, 184.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.66f, 114.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(26.34f, 114.34f),
                    PathNode.CurveTo(24.049358f, 116.62809f, 23.36368f, 120.07126f, 24.60302f, 123.062325f),
                    PathNode.CurveTo(25.842361f, 126.05338f, 28.762346f, 128.00255f, 32.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(72.0f, 188.41827f, 75.58172f, 192.0f, 80.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(180.41827f, 192.0f, 184.0f, 188.41827f, 184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(227.23764f, 128.00255f, 230.15764f, 126.05338f, 231.39697f, 123.062325f),
                    PathNode.CurveTo(232.63632f, 120.07126f, 231.95064f, 116.62809f, 229.66f, 114.34f),
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
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
