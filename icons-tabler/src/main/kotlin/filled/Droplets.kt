package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerFilledIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 12.003 C 6.541 12.003 7.045 12.276 7.342 12.730 L 9.464 16.003 C 10.436 17.684 10.060 19.820 8.572 21.068 C 7.085 22.316 4.915 22.315 3.429 21.066 C 1.942 19.818 1.565 17.684 2.562 15.956 L 4.660 12.730 C 4.955 12.277 5.459 12.003 6.000 12.003"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 12.003 C 18.541 12.003 19.045 12.276 19.342 12.730 L 21.464 16.003 C 22.436 17.684 22.060 19.820 20.572 21.068 C 19.085 22.316 16.915 22.315 15.429 21.066 C 13.942 19.818 13.565 17.684 14.562 15.956 L 16.660 12.729 C 16.955 12.276 17.459 12.003 18.000 12.003"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 2.003 C 12.541 2.003 13.045 2.276 13.342 2.730 L 15.464 6.003 C 16.436 7.684 16.060 9.820 14.572 11.068 C 13.085 12.316 10.915 12.315 9.429 11.066 C 7.942 9.818 7.565 7.684 8.562 5.956 L 10.660 2.730 C 10.955 2.277 11.459 2.003 12.000 2.003"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
