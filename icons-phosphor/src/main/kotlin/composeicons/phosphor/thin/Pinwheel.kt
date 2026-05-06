package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorThinIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.83 221.17 173.35 167.7c3.334-.574 6.611-1.444 9.79-2.6 29.06-10.578 44.044-42.709 33.47-71.77-.363-.998-1.107-1.81-2.07-2.258-.962-.448-2.063-.496-3.06-.132l-55.31 20.13c2.794-3.502 5.164-7.321 7.06-11.38 9.564-20.526 5.826-44.791-9.473-61.486C138.458 21.509 114.611 15.67 93.33 23.41c-2.072 .756-3.141 3.046-2.39 5.12l20.13 55.32c-3.499-2.797-7.319-5.168-11.38-7.06C79.164 67.226 54.899 70.964 38.204 86.263 21.509 101.562 15.67 125.409 23.41 146.69c.349 1.015 1.091 1.848 2.06 2.31 .962 .448 2.063 .494 3.06 .13L83.85 129c-15.715 19.593-16.462 47.252-1.829 67.665 14.633 20.413 41.068 28.586 64.669 19.995 .998-.363 1.81-1.108 2.258-2.07 .448-.962 .496-2.063 .132-3.06L129 156.17c3.5 2.796 7.32 5.166 11.38 7.06 7.047 3.292 14.704 5.077 22.48 5.24l58.36 58.36c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM99.88 29.71c24.088-6.564 49.186 6.434 57.725 29.895 8.539 23.461-2.333 49.55-25.005 60.005ZM125.09 122.38l-7.45 2.71-2.72-7.45 7.46-2.72ZM29.71 140.14C23.146 116.052 36.144 90.954 59.605 82.415c23.461-8.539 49.55 2.333 60.005 25.005ZM140.14 210.31c-24.088 6.564-49.186-6.434-57.725-29.895-8.539-23.461 2.333-49.55 25.005-60.005ZM164.43 160.49c-18.869 .143-36.077-10.765-44-27.89L210.33 99.88c3.906 14.343 .946 29.686-8.014 41.547-8.961 11.861-22.911 18.901-37.776 19.063Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
