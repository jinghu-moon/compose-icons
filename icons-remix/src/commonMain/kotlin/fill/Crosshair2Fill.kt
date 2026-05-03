package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Crosshair2Fill: ImageVector
    get() {
        if (_crosshair2Fill != null) return _crosshair2Fill!!
        _crosshair2Fill = remixIcon(
            name = "Crosshair2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 5.071 C 7.934 5.509 5.509 7.934 5.071 11.000 L 7.000 11.000 L 7.000 13.000 L 5.071 13.000 C 5.509 16.066 7.934 18.491 11.000 18.929 L 11.000 17.000 L 13.000 17.000 L 13.000 18.929 C 16.066 18.491 18.491 16.066 18.929 13.000 L 17.000 13.000 L 17.000 11.000 L 18.929 11.000 C 18.491 7.934 16.066 5.509 13.000 5.071 L 13.000 7.000 L 11.000 7.000 L 11.000 5.071 ZM 3.055 11.000 C 3.516 6.828 6.828 3.516 11.000 3.055 L 11.000 1.000 L 13.000 1.000 L 13.000 3.055 C 17.172 3.516 20.484 6.828 20.945 11.000 L 23.000 11.000 L 23.000 13.000 L 20.945 13.000 C 20.484 17.172 17.172 20.484 13.000 20.945 L 13.000 23.000 L 11.000 23.000 L 11.000 20.945 C 6.828 20.484 3.516 17.172 3.055 13.000 L 1.000 13.000 L 1.000 11.000 L 3.055 11.000 ZM 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 Z"),
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
        return _crosshair2Fill!!
    }

private var _crosshair2Fill: ImageVector? = null
