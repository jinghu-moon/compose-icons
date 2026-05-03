package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FunctionAiFill: ImageVector
    get() {
        if (_functionAiFill != null) return _functionAiFill!!
        _functionAiFill = remixIcon(
            name = "FunctionAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 L 11.000 10.000 C 11.000 10.552 10.552 11.000 10.000 11.000 L 4.000 11.000 C 3.448 11.000 3.000 10.552 3.000 10.000 L 3.000 4.000 ZM 3.000 14.000 C 3.000 13.448 3.448 13.000 4.000 13.000 L 10.000 13.000 C 10.552 13.000 11.000 13.448 11.000 14.000 L 11.000 20.000 C 11.000 20.552 10.552 21.000 10.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 14.000 ZM 13.000 14.000 C 13.000 13.448 13.448 13.000 14.000 13.000 L 20.000 13.000 C 20.552 13.000 21.000 13.448 21.000 14.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 L 13.000 14.000 ZM 17.713 10.128 L 17.467 10.693 C 17.286 11.107 16.714 11.107 16.533 10.693 L 16.287 10.128 C 15.847 9.119 15.056 8.316 14.068 7.877 L 13.308 7.539 C 12.897 7.356 12.897 6.758 13.308 6.576 L 14.025 6.257 C 15.038 5.806 15.844 4.973 16.276 3.930 L 16.529 3.319 C 16.706 2.893 17.294 2.893 17.471 3.319 L 17.724 3.930 C 18.156 4.973 18.962 5.806 19.975 6.257 L 20.692 6.576 C 21.103 6.758 21.103 7.356 20.692 7.539 L 19.932 7.877 C 18.944 8.316 18.153 9.119 17.713 10.128 Z"),
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
        return _functionAiFill!!
    }

private var _functionAiFill: ImageVector? = null
