package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorRegularIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.23f, 203.42f),
                    PathNode.CurveTo(206.3226f, 205.33972f, 204.68924f, 206.81996f, 202.68974f, 207.5346f),
                    PathNode.CurveTo(200.69023f, 208.24925f, 198.48865f, 208.13966f, 196.57f, 207.23f),
                    PathNode.LineTo(44.57f, 135.23f),
                    PathNode.CurveTo(41.775913f, 133.90659f, 39.994484f, 131.09166f, 39.994484f, 128.0f),
                    PathNode.CurveTo(39.994484f, 124.90834f, 41.775913f, 122.093414f, 44.57f, 120.77f),
                    PathNode.LineTo(196.57f, 48.77f),
                    PathNode.CurveTo(200.56302f, 46.878426f, 205.33342f, 48.58198f, 207.225f, 52.575f),
                    PathNode.CurveTo(209.11658f, 56.56802f, 207.41302f, 61.338425f, 203.42f, 63.23f),
                    PathNode.LineTo(66.69f, 128.0f),
                    PathNode.LineTo(203.42f, 192.77f),
                    PathNode.CurveTo(207.41217f, 194.65958f, 209.11768f, 199.42693f, 207.23f, 203.42f),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
