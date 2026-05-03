package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerFilledIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(4.895431f, 6.0f, 4.0f, 6.895431f, 4.0f, 8.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 17.10457f, 4.895431f, 18.0f, 6.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(19.10457f, 18.0f, 20.0f, 17.10457f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.0f, 6.895431f, 19.10457f, 6.0f, 18.0f, 6.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.CurveTo(17.046625f, 18.999668f, 17.916504f, 19.806322f, 17.995f, 20.85f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(17.999413f, 22.529093f, 17.58679f, 22.966166f, 17.058605f, 22.997171f),
                    PathNode.CurveTo(16.53042f, 23.02818f, 16.06949f, 22.642391f, 16.007f, 22.117f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.999413f, 22.529093f, 7.58679f, 22.966166f, 7.058605f, 22.997171f),
                    PathNode.CurveTo(6.530421f, 23.02818f, 6.069491f, 22.642391f, 6.007f, 22.117f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(5.999669f, 19.953375f, 6.806323f, 19.083496f, 7.85f, 19.005f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.LineTo(16.0f, 19.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 1.0f),
                    PathNode.CurveTo(17.506975f, 1.000067f, 17.933683f, 1.379507f, 17.993f, 1.883f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.000332f, 4.046625f, 17.193678f, 4.916504f, 16.15f, 4.995f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(6.953376f, 5.000332f, 6.083497f, 4.193677f, 6.005f, 3.15f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.000587f, 1.470907f, 6.413211f, 1.033835f, 6.941395f, 1.002828f),
                    PathNode.CurveTo(7.469579f, 0.971821f, 7.930509f, 1.35761f, 7.993f, 1.883f),
                    PathNode.LineTo(8.0f, 2.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.0f, 1.447715f, 16.447716f, 1.0f, 17.0f, 1.0f),
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
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
