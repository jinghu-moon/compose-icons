package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BellFill: ImageVector
    get() {
        if (_bellFill != null) return _bellFill!!
        _bellFill = remixIcon(
            name = "BellFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.414 10.586 L 13.894 11.072 L 14.358 11.557 L 14.818 12.049 C 18.276 15.813 20.290 19.267 19.425 20.132 C 19.024 20.532 18.069 20.316 16.785 19.625 C 13.584 21.638 9.390 21.441 6.382 19.033 L 9.362 16.054 C 10.029 16.232 10.770 16.059 11.293 15.536 C 12.074 14.755 12.074 13.488 11.293 12.707 C 10.512 11.926 9.246 11.926 8.464 12.707 C 7.981 13.190 7.797 13.859 7.912 14.484 L 7.947 14.639 L 4.968 17.618 C 2.559 14.611 2.362 10.416 4.376 7.214 C 3.684 5.931 3.468 4.976 3.868 4.575 C 4.845 3.599 9.118 6.290 13.414 10.586 ZM 19.778 4.222 C 20.559 5.003 20.559 6.269 19.778 7.050 C 19.725 7.103 19.670 7.152 19.614 7.198 C 21.230 9.754 21.433 12.950 20.221 15.668 C 19.032 13.714 17.151 11.495 14.828 9.172 L 14.290 8.640 C 12.163 6.562 10.135 4.876 8.333 3.779 C 11.050 2.567 14.246 2.770 16.804 4.387 C 16.848 4.330 16.897 4.275 16.950 4.222 C 17.731 3.441 18.997 3.441 19.778 4.222 Z"),
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
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
