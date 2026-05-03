package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicAiLine: ImageVector
    get() {
        if (_micAiLine != null) return _micAiLine!!
        _micAiLine = remixIcon(
            name = "MicAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.467 7.694 L 20.713 7.128 C 21.153 6.119 21.944 5.316 22.932 4.877 L 23.692 4.539 C 24.103 4.357 24.103 3.759 23.692 3.576 L 22.975 3.257 C 21.962 2.807 21.156 1.974 20.724 0.931 L 20.471 0.320 C 20.294 -0.107 19.706 -0.107 19.529 0.320 L 19.276 0.931 C 18.844 1.974 18.038 2.807 17.025 3.257 L 16.308 3.576 C 15.897 3.759 15.897 4.357 16.308 4.539 L 17.068 4.877 C 18.056 5.316 18.847 6.119 19.287 7.128 L 19.533 7.694 C 19.714 8.108 20.286 8.108 20.467 7.694 ZM 3.055 11.000 L 5.071 11.000 C 5.556 14.392 8.473 17.000 12.000 17.000 C 15.526 17.000 18.444 14.392 18.929 11.000 L 20.945 11.000 C 20.484 15.172 17.171 18.484 13.000 18.945 L 13.000 23.000 L 11.000 23.000 L 11.000 18.945 C 6.828 18.484 3.516 15.172 3.055 11.000 ZM 12.000 1.000 C 9.239 1.000 7.000 3.239 7.000 6.000 L 7.000 10.000 C 7.000 12.761 9.239 15.000 12.000 15.000 C 14.761 15.000 17.000 12.761 17.000 10.000 L 17.000 7.000 L 15.000 7.000 L 15.000 10.000 C 15.000 11.657 13.657 13.000 12.000 13.000 C 10.343 13.000 9.000 11.657 9.000 10.000 L 9.000 6.000 C 9.000 4.343 10.343 3.000 12.000 3.000 C 12.597 3.000 13.151 3.173 13.617 3.472 L 14.697 1.789 C 13.918 1.290 12.991 1.000 12.000 1.000 Z"),
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
        return _micAiLine!!
    }

private var _micAiLine: ImageVector? = null
