package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Asset: ImageVector
    get() {
        if (_asset != null) return _asset!!
        _asset = tablerFilledIcon(
            name = "Asset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 19.957 2.000 20.858 2.456 21.423 3.229 C 21.988 4.002 22.150 4.998 21.860 5.910 L 21.753 6.201 L 21.707 6.294 Q 21.646 6.422 21.573 6.544 L 15.097 18.453 C 15.077 18.489 15.055 18.524 15.031 18.557 C 13.428 21.277 10.203 22.588 7.157 21.756 C 4.111 20.925 1.998 18.157 2.000 15.000 L 2.004 14.760 C 2.084 12.409 3.340 10.256 5.346 9.028 L 5.602 8.878 L 17.307 2.523 Q 17.487 2.400 17.685 2.303 L 17.900 2.207 L 18.036 2.159 C 18.338 2.056 18.663 2.000 19.000 2.000M 9.000 12.000 C 7.411 12.000 6.098 13.238 6.005 14.824 L 6.000 15.000 C 6.000 16.657 7.343 18.000 9.000 18.000 C 10.657 18.000 12.000 16.657 12.000 15.000 C 12.000 13.343 10.657 12.000 9.000 12.000M 16.040 5.488 L 10.920 8.266 C 13.252 8.933 15.073 10.757 15.736 13.090 L 18.524 7.962 C 17.250 7.758 16.249 6.761 16.039 5.488M 19.000 4.000 C 18.892 4.000 18.785 4.017 18.683 4.051 L 18.373 4.221 C 18.065 4.469 17.933 4.875 18.034 5.256 C 18.135 5.638 18.452 5.924 18.842 5.987 C 19.232 6.050 19.622 5.877 19.838 5.546 L 19.910 5.416 C 20.052 5.106 20.026 4.746 19.842 4.459 C 19.658 4.173 19.341 4.000 19.000 4.000"),
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
        return _asset!!
    }

private var _asset: ImageVector? = null
