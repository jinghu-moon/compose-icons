package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Loader3Fill: ImageVector
    get() {
        if (_loader3Fill != null) return _loader3Fill!!
        _loader3Fill = remixIcon(
            name = "Loader3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.055 13.000 L 5.071 13.000 C 5.556 16.392 8.473 19.000 12.000 19.000 C 15.526 19.000 18.444 16.392 18.929 13.000 L 20.945 13.000 C 20.447 17.500 16.632 21.000 12.000 21.000 C 7.367 21.000 3.552 17.500 3.055 13.000 ZM 3.055 11.000 C 3.552 6.500 7.367 3.000 12.000 3.000 C 16.632 3.000 20.447 6.500 20.945 11.000 L 18.929 11.000 C 18.444 7.608 15.526 5.000 12.000 5.000 C 8.473 5.000 5.556 7.608 5.071 11.000 L 3.055 11.000 Z"),
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
        return _loader3Fill!!
    }

private var _loader3Fill: ImageVector? = null
