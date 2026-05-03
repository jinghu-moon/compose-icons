package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorLightIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 209.570 90.000 L 169.190 90.000 C 164.377 71.449 155.598 54.162 143.460 39.330 C 172.436 44.439 197.106 63.347 209.570 90.000 ZM 218.000 128.000 C 218.007 136.808 216.716 145.568 214.170 154.000 L 171.810 154.000 C 174.730 136.790 174.730 119.210 171.810 102.000 L 214.170 102.000 C 216.716 110.432 218.007 119.192 218.000 128.000 ZM 128.000 215.830 C 122.223 209.937 117.128 203.413 112.810 196.380 C 106.983 186.902 102.456 176.684 99.350 166.000 L 156.650 166.000 C 153.544 176.684 149.017 186.902 143.190 196.380 C 138.872 203.413 133.777 209.937 128.000 215.830 ZM 96.450 154.000 C 93.183 136.821 93.183 119.179 96.450 102.000 L 159.550 102.000 C 162.817 119.179 162.817 136.821 159.550 154.000 ZM 38.000 128.000 C 37.993 119.192 39.284 110.432 41.830 102.000 L 84.190 102.000 C 81.270 119.210 81.270 136.790 84.190 154.000 L 41.830 154.000 C 39.284 145.568 37.993 136.808 38.000 128.000 ZM 128.000 40.170 C 133.777 46.063 138.872 52.587 143.190 59.620 C 149.017 69.098 153.544 79.316 156.650 90.000 L 99.350 90.000 C 102.456 79.316 106.983 69.098 112.810 59.620 C 117.128 52.587 122.223 46.063 128.000 40.170 ZM 112.540 39.330 C 100.402 54.162 91.623 71.449 86.810 90.000 L 46.430 90.000 C 58.894 63.347 83.564 44.439 112.540 39.330 ZM 46.430 166.000 L 86.810 166.000 C 91.623 184.551 100.402 201.838 112.540 216.670 C 83.564 211.561 58.894 192.653 46.430 166.000 ZM 143.430 216.670 C 155.579 201.841 164.368 184.554 169.190 166.000 L 209.570 166.000 C 197.106 192.653 172.436 211.561 143.460 216.670 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
