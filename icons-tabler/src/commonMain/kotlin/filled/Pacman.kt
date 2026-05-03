package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerFilledIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.557f, 2.015f),
                    PathNode.CurveTo(16.398556f, 2.17348f, 19.037975f, 3.535198f, 20.814f, 5.759f),
                    PathNode.CurveTo(21.131767f, 6.156811f, 21.099907f, 6.729866f, 20.74f, 7.09f),
                    PathNode.LineTo(15.828f, 12.0f),
                    PathNode.LineTo(20.74f, 16.91f),
                    PathNode.CurveTo(21.100494f, 17.27027f, 21.13237f, 17.844015f, 20.814f, 18.242f),
                    PathNode.CurveTo(18.524462f, 21.103313f, 14.853249f, 22.483118f, 11.245884f, 21.838125f),
                    PathNode.CurveTo(7.63852f, 21.193132f, 4.672896f, 18.626669f, 3.516714f, 15.149263f),
                    PathNode.CurveTo(2.360532f, 11.67186f, 3.19901f, 7.84059f, 5.702f, 5.164f),
                    PathNode.LineTo(5.937f, 4.922f),
                    PathNode.LineTo(6.007f, 4.859f),
                    PathNode.CurveTo(8.011246f, 2.89067f, 10.752232f, 1.858172f, 13.557f, 2.015f),
                    PathNode.MoveTo(12.5f, 5.5f),
                    PathNode.CurveTo(11.48f, 5.5f, 10.64f, 6.262f, 10.518f, 7.248f),
                    PathNode.LineTo(10.505f, 7.398f),
                    PathNode.CurveTo(10.501597f, 7.431893f, 10.499928f, 7.465937f, 10.5f, 7.5f),
                    PathNode.CurveTo(10.5f, 8.604569f, 11.395431f, 9.5f, 12.5f, 9.5f),
                    PathNode.CurveTo(13.604569f, 9.5f, 14.5f, 8.604569f, 14.5f, 7.5f),
                    PathNode.CurveTo(14.5f, 6.395431f, 13.604569f, 5.5f, 12.5f, 5.5f)
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
        return _pacman!!
    }

private var _pacman: ImageVector? = null
