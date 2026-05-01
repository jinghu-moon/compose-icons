package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots3: ImageVector
    get() {
        if (_chartDots3 != null) return _chartDots3!!
        _chartDots3 = tablerFilledIcon(
            name = "ChartDots3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.063412f, 2.000648f, 21.787731f, 3.57075f, 21.981134f, 5.625078f),
                    PathNode.CurveTo(22.17454f, 7.679407f, 20.773556f, 9.54374f, 18.74652f, 9.929482f),
                    PathNode.CurveTo(16.719484f, 10.315225f, 14.73166f, 9.095776f, 14.157f, 7.114f),
                    PathNode.LineTo(7.862f, 7.9f),
                    PathNode.CurveTo(7.834593f, 7.987052f, 7.803226f, 8.072808f, 7.768f, 8.157f),
                    PathNode.LineTo(14.214f, 12.588f),
                    PathNode.CurveTo(15.197923f, 11.859528f, 16.525778f, 11.802f, 17.569017f, 12.442648f),
                    PathNode.CurveTo(18.612255f, 13.083296f, 19.161554f, 14.293577f, 18.9569f, 15.500595f),
                    PathNode.CurveTo(18.752245f, 16.707613f, 17.8347f, 17.669186f, 16.638592f, 17.930145f),
                    PathNode.CurveTo(15.442483f, 18.191101f, 14.207804f, 17.69909f, 13.519f, 16.687f),
                    PathNode.LineTo(9.992f, 17.745f),
                    PathNode.QuadTo(10.0f, 17.872f, 10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 20.209139f, 8.209139f, 22.0f, 6.0f, 22.0f),
                    PathNode.CurveTo(3.790861f, 22.0f, 2.0f, 20.209139f, 2.0f, 18.0f),
                    PathNode.LineTo(2.005f, 17.8f),
                    PathNode.CurveTo(2.091699f, 16.061853f, 3.292286f, 14.579218f, 4.974415f, 14.132995f),
                    PathNode.CurveTo(6.656543f, 13.686771f, 8.434161f, 14.37937f, 9.371f, 15.846f),
                    PathNode.LineTo(13.011f, 14.752f),
                    PathNode.LineTo(13.021f, 14.65f),
                    PathNode.QuadTo(13.044f, 14.446f, 13.095f, 14.25f),
                    PathNode.LineTo(6.407f, 9.65f),
                    PathNode.CurveTo(5.477082f, 10.143809f, 4.356354f, 10.113976f, 3.454026f, 9.57139f),
                    PathNode.CurveTo(2.551697f, 9.028806f, 1.999858f, 8.052899f, 2.0f, 7.0f),
                    PathNode.LineTo(2.005f, 6.824f),
                    PathNode.CurveTo(2.086652f, 5.419128f, 3.133838f, 4.259825f, 4.523199f, 4.036192f),
                    PathNode.CurveTo(5.912559f, 3.812559f, 7.270633f, 4.584708f, 7.789f, 5.893f),
                    PathNode.LineTo(14.101f, 5.103f),
                    PathNode.CurveTo(14.518976f, 3.286584f, 16.136114f, 1.999593f, 18.0f, 2.0f)
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
        return _chartDots3!!
    }

private var _chartDots3: ImageVector? = null
