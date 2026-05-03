package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CodeAiFill: ImageVector
    get() {
        if (_codeAiFill != null) return _codeAiFill!!
        _codeAiFill = remixIcon(
            name = "CodeAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.713 10.128 L 17.467 10.694 C 17.286 11.108 16.714 11.108 16.533 10.694 L 16.287 10.128 C 15.847 9.119 15.056 8.316 14.068 7.877 L 13.308 7.539 C 12.897 7.357 12.897 6.759 13.308 6.576 L 14.025 6.257 C 15.038 5.807 15.844 4.974 16.276 3.931 L 16.529 3.320 C 16.706 2.893 17.294 2.893 17.471 3.320 L 17.724 3.931 C 18.156 4.974 18.962 5.807 19.975 6.257 L 20.692 6.576 C 21.103 6.759 21.103 7.357 20.692 7.539 L 19.932 7.877 C 18.944 8.316 18.153 9.119 17.713 10.128 ZM 2.828 12.000 L 7.071 16.243 L 5.657 17.657 L 0.000 12.000 L 5.657 6.343 L 7.071 7.757 L 2.828 12.000 ZM 18.343 17.657 L 24.000 12.000 L 21.171 9.172 L 19.757 10.586 L 21.171 12.000 L 16.929 16.243 L 18.343 17.657 Z"),
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
        return _codeAiFill!!
    }

private var _codeAiFill: ImageVector? = null
