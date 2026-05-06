package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorLightIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114 80c0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14ZM66 80C66 45.758 93.758 18 128 18c34.242 0 62 27.758 62 62 0 58.81-56.61 91.83-59 93.21-1.856 1.072-4.144 1.072-6 0C122.61 171.83 66 138.81 66 80ZM78 80c0 44.52 38.81 73.49 50 80.91C139.18 153.49 178 124.53 178 80 178 52.386 155.614 30 128 30 100.386 30 78 52.386 78 80ZM202.08 149.51c-2.027-.82-4.34-.472-6.037 .908-1.696 1.38-2.508 3.574-2.117 5.726 .39 2.152 1.921 3.921 3.994 4.617C215.5 167.25 226 175.94 226 184c0 16.08-40.25 34-98 34C70.25 218 30 200.08 30 184c0-8.06 10.5-16.75 28.08-23.24 2.073-.696 3.603-2.465 3.994-4.617 .39-2.152-.421-4.346-2.117-5.726-1.696-1.38-4.009-1.728-6.037-.908C30.76 158.06 18 170.31 18 184c0 13.34 12.18 25.38 34.31 33.88C72.62 225.7 99.5 230 128 230c28.5 0 55.38-4.3 75.69-12.12C225.82 209.38 238 197.34 238 184c0-13.69-12.76-25.94-35.92-34.49Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
