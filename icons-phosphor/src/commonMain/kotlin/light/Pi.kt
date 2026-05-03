package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorLightIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 172.0f),
                    PathNode.CurveTo(230.0f, 190.77768f, 214.77768f, 206.0f, 196.0f, 206.0f),
                    PathNode.CurveTo(177.22232f, 206.0f, 162.0f, 190.77768f, 162.0f, 172.0f),
                    PathNode.LineTo(162.0f, 70.0f),
                    PathNode.LineTo(94.0f, 70.0f),
                    PathNode.LineTo(94.0f, 200.0f),
                    PathNode.CurveTo(94.0f, 203.3137f, 91.313705f, 206.0f, 88.0f, 206.0f),
                    PathNode.CurveTo(84.686295f, 206.0f, 82.0f, 203.3137f, 82.0f, 200.0f),
                    PathNode.LineTo(82.0f, 70.0f),
                    PathNode.LineTo(72.0f, 70.0f),
                    PathNode.CurveTo(48.80404f, 70.0f, 30.0f, 88.80404f, 30.0f, 112.0f),
                    PathNode.CurveTo(30.0f, 115.313705f, 27.31371f, 118.0f, 24.0f, 118.0f),
                    PathNode.CurveTo(20.68629f, 118.0f, 18.0f, 115.313705f, 18.0f, 112.0f),
                    PathNode.CurveTo(18.033068f, 82.19033f, 42.19033f, 58.033066f, 72.0f, 58.0f),
                    PathNode.LineTo(224.0f, 58.0f),
                    PathNode.CurveTo(227.3137f, 58.0f, 230.0f, 60.68629f, 230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 67.313705f, 227.3137f, 70.0f, 224.0f, 70.0f),
                    PathNode.LineTo(174.0f, 70.0f),
                    PathNode.LineTo(174.0f, 172.0f),
                    PathNode.CurveTo(174.0f, 184.15027f, 183.84973f, 194.0f, 196.0f, 194.0f),
                    PathNode.CurveTo(208.15027f, 194.0f, 218.0f, 184.15027f, 218.0f, 172.0f),
                    PathNode.CurveTo(218.0f, 168.6863f, 220.6863f, 166.0f, 224.0f, 166.0f),
                    PathNode.CurveTo(227.3137f, 166.0f, 230.0f, 168.6863f, 230.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pi!!
    }

private var _pi: ImageVector? = null
