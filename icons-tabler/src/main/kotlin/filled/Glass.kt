package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Glass: ImageVector
    get() {
        if (_glass != null) return _glass!!
        _glass = tablerFilledIcon(
            name = "Glass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 15.205 2.000 17.894 3.050 17.997 4.890 L 18.987 10.836 L 19.000 11.000 C 19.000 14.226 16.440 16.564 13.000 16.945 L 13.000 20.000 L 16.000 20.000 C 16.552 20.000 17.000 20.448 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 L 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 C 7.000 20.448 7.448 20.000 8.000 20.000 L 11.000 20.000 L 11.000 16.945 C 7.560 16.565 5.000 14.226 5.000 11.000 L 5.014 10.836 L 6.005 4.881 L 6.006 4.843 C 6.152 3.033 8.823 2.000 12.000 2.000M 12.000 4.000 C 10.776 4.000 9.641 4.192 8.836 4.514 C 8.242 4.752 8.000 4.981 8.000 5.000 C 8.000 5.020 8.242 5.248 8.836 5.486 C 9.640 5.808 10.776 6.000 12.000 6.000 C 13.224 6.000 14.359 5.808 15.164 5.486 C 15.758 5.248 16.000 5.019 16.000 5.000 L 15.980 4.974 C 15.910 4.904 15.659 4.712 15.164 4.514 C 14.360 4.192 13.224 4.000 12.000 4.000"),
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
        return _glass!!
    }

private var _glass: ImageVector? = null
