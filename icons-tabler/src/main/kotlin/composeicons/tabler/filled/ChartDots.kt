package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots: ImageVector
    get() {
        if (_chartDots != null) return _chartDots!!
        _chartDots = tablerFilledIcon(
            name = "ChartDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 2.0f),
                    PathNode.CurveTo(3.552285f, 2.0f, 4.0f, 2.447715f, 4.0f, 3.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.506975f, 20.000067f, 21.933683f, 20.379507f, 21.993f, 20.883f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 3.0f),
                    PathNode.CurveTo(2.0f, 2.447715f, 2.447715f, 2.0f, 3.0f, 2.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.148691f, 4.002586f, 21.195057f, 4.660861f, 21.69465f, 5.695222f),
                    PathNode.CurveTo(22.194244f, 6.729584f, 22.059343f, 7.958408f, 21.347246f, 8.859749f),
                    PathNode.CurveTo(20.63515f, 9.761089f, 19.470894f, 10.176682f, 18.349f, 9.93f),
                    PathNode.LineTo(16.347f, 13.132f),
                    PathNode.CurveTo(17.291643f, 14.318813f, 17.201769f, 16.024017f, 16.137602f, 17.104954f),
                    PathNode.CurveTo(15.073435f, 18.18589f, 13.369843f, 18.302414f, 12.168406f, 17.376442f),
                    PathNode.CurveTo(10.966969f, 16.45047f, 10.645751f, 14.773383f, 11.42f, 13.469f),
                    PathNode.LineTo(10.042f, 11.814f),
                    PathNode.CurveTo(8.672021f, 12.321287f, 7.135811f, 11.767989f, 6.403913f, 10.503667f),
                    PathNode.CurveTo(5.672015f, 9.239346f, 5.95725f, 7.631639f, 7.079413f, 6.69626f),
                    PathNode.CurveTo(8.201576f, 5.760881f, 9.834365f, 5.769819f, 10.94622f, 6.717426f),
                    PathNode.CurveTo(12.058077f, 7.665034f, 12.325695f, 9.275766f, 11.58f, 10.532f),
                    PathNode.LineTo(12.958f, 12.186f),
                    PathNode.CurveTo(13.499434f, 11.9852f, 14.087385f, 11.945262f, 14.651f, 12.071f),
                    PathNode.LineTo(16.653f, 8.868f),
                    PathNode.CurveTo(15.935858f, 7.966789f, 15.797958f, 6.73458f, 16.29814f, 5.697135f),
                    PathNode.CurveTo(16.798323f, 4.659689f, 17.848272f, 4.000178f, 19.0f, 4.0f),
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
        return _chartDots!!
    }

private var _chartDots: ImageVector? = null
