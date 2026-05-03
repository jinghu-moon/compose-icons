package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Movie2AiFill: ImageVector
    get() {
        if (_movie2AiFill != null) return _movie2AiFill!!
        _movie2AiFill = remixIcon(
            name = "Movie2AiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 20.000 11.000 C 20.670 11.000 21.313 10.890 21.915 10.688 C 21.971 11.117 22.000 11.555 22.000 12.000 C 22.000 15.271 20.429 18.176 18.001 20.000 L 20.000 20.000 L 20.000 22.000 L 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 12.906 2.000 13.783 2.120 14.617 2.346 C 14.222 3.146 14.000 4.047 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 ZM 12.000 10.000 C 13.105 10.000 14.000 9.105 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 C 10.000 9.105 10.895 10.000 12.000 10.000 ZM 8.000 14.000 C 9.105 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 9.105 10.000 8.000 10.000 C 6.895 10.000 6.000 10.895 6.000 12.000 C 6.000 13.105 6.895 14.000 8.000 14.000 ZM 16.000 14.000 C 17.105 14.000 18.000 13.105 18.000 12.000 C 18.000 10.895 17.105 10.000 16.000 10.000 C 14.895 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 14.895 14.000 16.000 14.000 ZM 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 Z"),
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
        return _movie2AiFill!!
    }

private var _movie2AiFill: ImageVector? = null
