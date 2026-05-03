package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MvAiLine: ImageVector
    get() {
        if (_mvAiLine != null) return _mvAiLine!!
        _mvAiLine = remixIcon(
            name = "MvAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 14.000 3.000 L 14.000 5.000 L 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 11.000 L 22.000 11.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 ZM 12.000 12.171 L 12.000 6.000 L 16.000 6.000 L 16.000 8.000 L 14.000 8.000 L 14.000 15.000 C 14.000 16.657 12.657 18.000 11.000 18.000 C 9.343 18.000 8.000 16.657 8.000 15.000 C 8.000 13.343 9.343 12.000 11.000 12.000 C 11.351 12.000 11.687 12.060 12.000 12.171 Z"),
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
        return _mvAiLine!!
    }

private var _mvAiLine: ImageVector? = null
