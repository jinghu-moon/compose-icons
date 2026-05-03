package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoreosLine: ImageVector
    get() {
        if (_coreosLine != null) return _coreosLine!!
        _coreosLine = remixIcon(
            name = "CoreosLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.454 4.414 C 8.317 4.795 7.249 5.438 6.343 6.343 C 3.219 9.467 3.219 14.533 6.343 17.657 C 9.467 20.781 14.533 20.781 17.657 17.657 C 18.621 16.693 19.287 15.544 19.656 14.325 C 16.256 15.783 12.408 16.305 8.111 15.889 C 7.400 11.764 7.847 7.938 9.454 4.414 ZM 11.902 4.001 C 11.227 5.216 10.713 6.472 10.361 7.769 C 11.853 7.801 13.336 8.386 14.475 9.525 C 15.549 10.600 16.131 11.980 16.220 13.386 C 17.549 13.045 18.809 12.567 20.000 11.953 C 19.992 10.642 19.664 9.332 19.016 8.152 C 18.657 7.498 18.202 6.888 17.657 6.343 C 17.083 5.769 16.437 5.295 15.744 4.928 C 14.547 4.294 13.223 3.985 11.902 4.001 ZM 4.929 19.071 C 1.024 15.166 1.024 8.834 4.929 4.929 C 8.834 1.024 15.166 1.024 19.071 4.929 C 22.976 8.834 22.976 15.166 19.071 19.071 C 15.166 22.976 8.834 22.976 4.929 19.071 ZM 9.949 9.778 C 9.757 11.141 9.732 12.549 9.873 14.007 C 11.397 14.068 12.849 13.995 14.232 13.788 C 14.237 12.758 13.847 11.726 13.061 10.939 C 12.208 10.086 11.065 9.699 9.949 9.778 Z"),
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
        return _coreosLine!!
    }

private var _coreosLine: ImageVector? = null
