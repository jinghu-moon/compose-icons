package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blade: ImageVector
    get() {
        if (_blade != null) return _blade!!
        _blade = tablerFilledIcon(
            name = "Blade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.586 3.000 C 12.367 2.219 13.633 2.219 14.414 3.000 L 15.000 3.585 L 15.586 3.000 C 16.320 2.267 17.492 2.216 18.286 2.883 L 18.414 3.000 L 21.000 5.586 C 21.781 6.367 21.781 7.633 21.000 8.414 L 20.414 9.000 L 21.000 9.586 C 21.781 10.367 21.781 11.633 21.000 12.414 L 12.414 21.000 C 11.633 21.781 10.367 21.781 9.586 21.000 L 9.000 20.414 L 8.414 21.000 C 7.633 21.781 6.367 21.781 5.586 21.000 L 3.000 18.414 C 2.219 17.633 2.219 16.367 3.000 15.586 L 3.585 14.999 L 3.000 14.414 C 2.267 13.680 2.216 12.508 2.883 11.714 L 3.000 11.585 ZM 14.613 7.210 C 14.196 6.887 13.600 6.944 13.251 7.340 C 12.903 7.735 12.921 8.334 13.293 8.707 L 13.585 9.000 L 12.517 10.067 C 11.942 9.914 11.328 10.025 10.842 10.370 C 10.357 10.714 10.050 11.257 10.005 11.851 L 10.000 12.000 L 10.005 12.150 C 10.015 12.275 10.035 12.398 10.067 12.517 L 9.000 13.585 L 8.707 13.293 L 8.613 13.210 C 8.196 12.887 7.600 12.944 7.251 13.340 C 6.903 13.735 6.921 14.334 7.293 14.707 L 7.585 15.000 L 7.293 15.293 L 7.210 15.387 C 6.887 15.804 6.944 16.400 7.340 16.749 C 7.735 17.097 8.334 17.079 8.707 16.707 L 9.000 16.415 L 9.293 16.707 L 9.387 16.790 C 9.804 17.113 10.400 17.056 10.749 16.660 C 11.097 16.265 11.079 15.666 10.707 15.293 L 10.415 15.000 L 11.484 13.933 C 12.174 14.116 12.909 13.918 13.414 13.413 C 13.918 12.908 14.116 12.173 13.933 11.483 L 15.000 10.415 L 15.293 10.707 L 15.387 10.790 C 15.804 11.113 16.400 11.056 16.749 10.660 C 17.097 10.265 17.079 9.666 16.707 9.293 L 16.415 9.000 L 16.707 8.707 L 16.790 8.613 C 17.113 8.196 17.056 7.600 16.660 7.251 C 16.265 6.903 15.666 6.921 15.293 7.293 L 15.000 7.585 L 14.707 7.293 Z"),
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
        return _blade!!
    }

private var _blade: ImageVector? = null
