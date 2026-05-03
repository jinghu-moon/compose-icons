package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerFilledIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.107 2.893 C 22.296 4.079 22.301 6.003 21.119 7.195 L 18.640 9.759 L 20.949 16.684 C 21.067 17.040 20.977 17.432 20.714 17.700 L 18.214 20.250 C 17.991 20.477 17.673 20.585 17.358 20.540 C 17.043 20.494 16.768 20.302 16.618 20.021 L 13.754 14.661 L 12.000 16.414 L 12.000 19.000 C 12.000 19.265 11.895 19.520 11.707 19.707 L 9.707 21.707 C 9.462 21.952 9.108 22.053 8.770 21.974 C 8.433 21.894 8.161 21.646 8.051 21.317 L 6.710 17.290 L 2.685 15.948 C 2.356 15.838 2.107 15.566 2.028 15.229 C 1.948 14.892 2.049 14.537 2.294 14.292 L 4.294 12.292 C 4.481 12.105 4.735 12.000 5.000 12.000 L 7.586 12.000 L 9.343 10.243 L 4.026 7.380 C 3.748 7.230 3.557 6.958 3.511 6.645 C 3.465 6.332 3.570 6.017 3.793 5.793 L 6.293 3.293 C 6.561 3.025 6.957 2.931 7.316 3.051 L 14.241 5.360 L 16.793 2.893 C 17.365 2.321 18.141 1.999 18.950 1.999 C 19.759 1.999 20.535 2.321 21.107 2.893"),
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
