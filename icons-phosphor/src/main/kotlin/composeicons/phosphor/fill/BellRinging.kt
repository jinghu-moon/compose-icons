package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorFillIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 71.1c-3.921 2.031-8.746 .5-10.78-3.42C205.584 52.595 194.026 39.845 179.76 30.77c-3.739-2.358-4.858-7.301-2.5-11.04 2.358-3.739 7.301-4.858 11.04-2.5 16.626 10.645 30.126 25.516 39.12 43.09 2.031 3.921 .5 8.746-3.42 10.78ZM35.71 72c2.988-.001 5.726-1.667 7.1-4.32C50.446 52.595 62.004 39.845 76.27 30.77c3.739-2.358 4.858-7.301 2.5-11.04C76.412 15.991 71.469 14.872 67.73 17.23 51.104 27.875 37.604 42.746 28.61 60.32c-1.285 2.479-1.183 5.449 .267 7.835 1.451 2.386 4.04 3.843 6.833 3.845ZM221.81 175.94c2.885 4.947 2.906 11.058 .055 16.025-2.851 4.967-8.138 8.031-13.865 8.035h-40.8c-3.786 18.643-20.177 32.04-39.2 32.04C108.977 232.04 92.586 218.643 88.8 200h-40.8c-5.723-.011-11.004-3.078-13.85-8.044-2.846-4.965-2.823-11.072 .06-16.016C43.22 160.39 48 138.28 48 112 48 67.817 83.817 32 128 32c44.183 0 80 35.817 80 80 0 26.27 4.78 48.38 13.81 63.94ZM150.62 200h-45.24c3.396 9.578 12.457 15.979 22.62 15.979 10.163 0 19.224-6.401 22.62-15.979Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
