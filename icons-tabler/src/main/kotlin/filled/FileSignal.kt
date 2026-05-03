package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileSignal: ImageVector
    get() {
        if (_fileSignal != null) return _fileSignal!!
        _fileSignal = tablerFilledIcon(
            name = "FileSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 10.232 11.818 C 9.842 11.428 9.208 11.428 8.818 11.818 C 7.974 12.662 7.500 13.807 7.500 15.000 C 7.500 16.193 7.974 17.338 8.818 18.182 C 9.210 18.561 9.834 18.556 10.220 18.170 C 10.606 17.784 10.611 17.160 10.232 16.768 C 9.763 16.299 9.500 15.663 9.500 15.000 C 9.500 14.337 9.763 13.701 10.232 13.232 C 10.622 12.842 10.622 12.208 10.232 11.818M 15.182 11.818 C 14.790 11.439 14.166 11.444 13.780 11.830 C 13.394 12.216 13.389 12.840 13.768 13.232 C 14.237 13.701 14.500 14.337 14.500 15.000 C 14.500 15.663 14.237 16.299 13.768 16.768 C 13.389 17.160 13.394 17.784 13.780 18.170 C 14.166 18.556 14.790 18.561 15.182 18.182 C 16.026 17.338 16.500 16.193 16.500 15.000 C 16.500 13.807 16.026 12.662 15.182 11.818M 12.000 14.000 C 11.448 14.000 11.000 14.448 11.000 15.000 L 11.007 15.127 C 11.069 15.652 11.530 16.038 12.059 16.007 C 12.587 15.976 12.999 15.539 13.000 15.010 L 12.993 14.883 C 12.934 14.380 12.507 14.000 12.000 14.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileSignal!!
    }

private var _fileSignal: ImageVector? = null
