package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bolt: ImageVector
    get() {
        if (_bolt != null) return _bolt!!
        _bolt = tablerFilledIcon(
            name = "Bolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 2.000 L 13.018 2.001 L 13.034 2.002 L 13.117 2.007 L 13.128 2.009 L 13.139 2.009 L 13.177 2.018 L 13.229 2.026 L 13.245 2.032 L 13.256 2.033 L 13.285 2.044 L 13.337 2.058 L 13.356 2.067 L 13.371 2.071 L 13.399 2.085 L 13.439 2.102 L 13.460 2.114 L 13.482 2.124 L 13.505 2.139 L 13.536 2.156 L 13.570 2.180 L 13.588 2.191 L 13.601 2.203 L 13.625 2.220 L 13.663 2.254 L 13.685 2.271 L 13.693 2.281 L 13.707 2.293 L 13.743 2.334 L 13.769 2.361 L 13.775 2.370 C 13.895 2.517 13.971 2.692 13.993 2.883 L 13.994 2.895 L 13.996 2.936 L 14.000 3.000 L 14.000 9.000 L 19.000 9.000 C 19.357 9.000 19.686 9.190 19.865 9.498 C 20.044 9.807 20.045 10.187 19.868 10.497 L 19.808 10.588 L 11.808 21.588 C 11.240 22.371 10.000 21.968 10.000 21.000 L 10.000 15.000 L 5.000 15.000 C 4.643 15.000 4.314 14.810 4.135 14.502 C 3.956 14.193 3.955 13.813 4.132 13.503 L 4.192 13.412 L 12.192 2.412 L 12.202 2.399 L 12.220 2.375 L 12.253 2.337 L 12.271 2.315 L 12.280 2.307 L 12.293 2.293 L 12.333 2.257 L 12.361 2.231 L 12.369 2.225 C 12.486 2.129 12.624 2.061 12.771 2.026 L 12.782 2.025 L 12.809 2.020 L 12.883 2.007 L 12.894 2.006 L 12.935 2.004 Z"),
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
        return _bolt!!
    }

private var _bolt: ImageVector? = null
