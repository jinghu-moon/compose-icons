package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WrenchLine: ImageVector
    get() {
        if (_wrenchLine != null) return _wrenchLine!!
        _wrenchLine = remixIcon(
            name = "WrenchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.038 6.378 C 19.267 6.149 19.594 6.045 19.914 6.100 C 20.234 6.155 20.507 6.362 20.646 6.654 C 21.889 9.255 21.435 12.466 19.279 14.622 C 17.446 16.455 14.851 17.057 12.517 16.434 L 8.673 20.279 C 7.306 21.646 5.090 21.646 3.723 20.279 C 2.356 18.912 2.356 16.696 3.723 15.329 L 7.568 11.484 C 6.945 9.151 7.547 6.555 9.380 4.722 C 11.536 2.566 14.747 2.113 17.347 3.355 C 17.640 3.495 17.847 3.768 17.902 4.088 C 17.956 4.408 17.853 4.734 17.623 4.964 L 15.037 7.551 C 14.646 7.941 14.646 8.574 15.037 8.965 C 15.427 9.355 16.060 9.355 16.451 8.965 L 19.038 6.378 ZM 17.865 10.379 C 16.693 11.551 14.794 11.551 13.622 10.379 C 12.451 9.208 12.451 7.308 13.622 6.137 L 15.037 4.722 C 13.533 4.508 11.950 4.981 10.794 6.137 C 9.368 7.562 8.981 9.637 9.641 11.415 C 9.777 11.781 9.687 12.193 9.411 12.469 L 5.137 16.743 C 4.551 17.329 4.551 18.279 5.137 18.865 C 5.723 19.450 6.673 19.450 7.258 18.865 L 11.532 14.591 C 11.809 14.315 12.220 14.225 12.587 14.361 C 14.365 15.020 16.439 14.633 17.865 13.208 C 19.021 12.052 19.494 10.469 19.280 8.964 L 17.865 10.379 Z"),
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
        return _wrenchLine!!
    }

private var _wrenchLine: ImageVector? = null
