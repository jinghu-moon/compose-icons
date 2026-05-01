package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerFilledIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(6.895431f, 4.0f, 6.0f, 4.895431f, 6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(6.0f, 19.10457f, 6.895431f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(17.10457f, 20.0f, 18.0f, 19.10457f, 18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.0f, 4.895431f, 17.10457f, 4.0f, 16.0f, 4.0f),
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
                    PathNode.MoveTo(22.0f, 6.0f),
                    PathNode.CurveTo(22.529093f, 6.000587f, 22.966166f, 6.413211f, 22.997171f, 6.941395f),
                    PathNode.CurveTo(23.02818f, 7.469579f, 22.642391f, 7.930509f, 22.117f, 7.993f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.529093f, 16.000587f, 22.966166f, 16.41321f, 22.997171f, 16.941395f),
                    PathNode.CurveTo(23.02818f, 17.46958f, 22.642391f, 17.93051f, 22.117f, 17.993f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(19.953375f, 18.000332f, 19.083496f, 17.193678f, 19.005f, 16.15f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(18.999668f, 6.953376f, 19.806322f, 6.083497f, 20.85f, 6.005f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(22.0f, 6.0f),
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.CurveTo(4.046625f, 5.999669f, 4.916504f, 6.806323f, 4.995f, 7.85f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(5.000332f, 17.046625f, 4.193677f, 17.916504f, 3.15f, 17.995f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(1.470907f, 17.999413f, 1.033835f, 17.58679f, 1.002828f, 17.058605f),
                    PathNode.CurveTo(0.971821f, 16.53042f, 1.35761f, 16.06949f, 1.883f, 16.007f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(1.470907f, 7.999413f, 1.033835f, 7.58679f, 1.002828f, 7.058605f),
                    PathNode.CurveTo(0.971821f, 6.530421f, 1.35761f, 6.069491f, 1.883f, 6.007f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
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
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
