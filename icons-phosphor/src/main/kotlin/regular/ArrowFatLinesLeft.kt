package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowFatLinesLeft: ImageVector
    get() {
        if (_arrowFatLinesLeft != null) return _arrowFatLinesLeft!!
        _arrowFatLinesLeft = phosphorRegularIcon(
            name = "ArrowFatLinesLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 72.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(128.00255f, 28.762346f, 126.05338f, 25.842361f, 123.062325f, 24.60302f),
                    PathNode.CurveTo(120.07126f, 23.36368f, 116.62809f, 24.049358f, 114.34f, 26.34f),
                    PathNode.LineTo(18.34f, 122.34f),
                    PathNode.CurveTo(16.837784f, 123.840546f, 15.993707f, 125.876724f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 130.12328f, 16.837784f, 132.15945f, 18.34f, 133.66f),
                    PathNode.LineTo(114.34f, 229.66f),
                    PathNode.CurveTo(116.62809f, 231.95064f, 120.07126f, 232.63632f, 123.062325f, 231.39697f),
                    PathNode.CurveTo(126.05338f, 230.15764f, 128.00255f, 227.23764f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.CurveTo(156.41827f, 184.0f, 160.0f, 180.41827f, 160.0f, 176.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 75.58172f, 156.41827f, 72.0f, 152.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 168.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(115.58172f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.LineTo(112.0f, 204.69f),
                    PathNode.LineTo(35.31f, 128.0f),
                    PathNode.LineTo(112.0f, 51.31f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 84.41828f, 115.58172f, 88.0f, 120.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 180.41827f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.CurveTo(211.58173f, 184.0f, 208.0f, 180.41827f, 208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(208.0f, 75.58172f, 211.58173f, 72.0f, 216.0f, 72.0f),
                    PathNode.CurveTo(220.41827f, 72.0f, 224.0f, 75.58172f, 224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 180.41827f, 188.41827f, 184.0f, 184.0f, 184.0f),
                    PathNode.CurveTo(179.58173f, 184.0f, 176.0f, 180.41827f, 176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 75.58172f, 179.58173f, 72.0f, 184.0f, 72.0f),
                    PathNode.CurveTo(188.41827f, 72.0f, 192.0f, 75.58172f, 192.0f, 80.0f),
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
        return _arrowFatLinesLeft!!
    }

private var _arrowFatLinesLeft: ImageVector? = null
