package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorDuotoneIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 172.41827f, 216.0f, 168.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(83.58172f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.LineTo(128.0f, 24.0f),
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
                    PathNode.MoveTo(229.66f, 114.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(26.34f, 114.34f),
                    PathNode.CurveTo(24.049358f, 116.62809f, 23.36368f, 120.07126f, 24.60302f, 123.062325f),
                    PathNode.CurveTo(25.842361f, 126.05338f, 28.762346f, 128.00255f, 32.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(72.0f, 216.83656f, 79.163445f, 224.0f, 88.0f, 224.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(176.83656f, 224.0f, 184.0f, 216.83656f, 184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(227.23764f, 128.00255f, 230.15764f, 126.05338f, 231.39697f, 123.062325f),
                    PathNode.CurveTo(232.63632f, 120.07126f, 231.95064f, 116.62809f, 229.66f, 114.34f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.CurveTo(171.58173f, 112.0f, 168.0f, 115.58172f, 168.0f, 120.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 115.58172f, 84.41828f, 112.0f, 80.0f, 112.0f),
                    PathNode.LineTo(51.31f, 112.0f),
                    PathNode.LineTo(128.0f, 35.31f),
                    PathNode.LineTo(204.69f, 112.0f),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
