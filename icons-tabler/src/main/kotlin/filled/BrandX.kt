package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandX: ImageVector
    get() {
        if (_brandX != null) return _brandX!!
        _brandX = tablerFilledIcon(
            name = "BrandX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.267 3.000 C 8.544 3.000 8.808 3.115 8.997 3.317 L 9.073 3.409 L 13.347 9.237 L 19.293 3.293 C 19.666 2.921 20.265 2.903 20.660 3.251 C 21.056 3.600 21.113 4.196 20.790 4.613 L 20.707 4.707 L 14.544 10.869 L 20.806 19.409 C 21.017 19.697 21.058 20.076 20.915 20.403 C 20.771 20.729 20.464 20.955 20.109 20.994 L 20.000 21.000 L 15.733 21.000 C 15.456 21.000 15.192 20.885 15.003 20.683 L 14.927 20.591 L 10.651 14.762 L 4.707 20.707 C 4.334 21.079 3.735 21.097 3.340 20.749 C 2.944 20.400 2.887 19.804 3.210 19.387 L 3.293 19.293 L 9.454 13.130 L 3.194 4.591 C 2.983 4.303 2.942 3.924 3.085 3.597 C 3.229 3.271 3.536 3.045 3.891 3.006 L 4.000 3.000 L 8.267 3.000 Z"),
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
        return _brandX!!
    }

private var _brandX: ImageVector? = null
