package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BaseballFill: ImageVector
    get() {
        if (_baseballFill != null) return _baseballFill!!
        _baseballFill = remixIcon(
            name = "BaseballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 19.150 4.581 20.663 6.500 21.428 8.671 C 18.656 9.189 16.119 10.867 14.599 13.500 C 13.078 16.133 12.894 19.169 13.832 21.828 C 11.569 22.251 9.150 21.902 7.000 20.660 C 4.851 19.419 3.339 17.499 2.573 15.328 C 5.345 14.810 7.882 13.133 9.402 10.500 C 10.923 7.867 11.107 4.830 10.170 2.171 C 12.432 1.749 14.851 2.099 17.000 3.340 ZM 8.248 2.733 C 9.040 4.884 8.906 7.359 7.670 9.500 C 6.434 11.641 4.358 12.993 2.099 13.383 C 1.799 11.251 2.181 9.008 3.340 7.000 C 4.500 4.991 6.252 3.539 8.248 2.733 ZM 21.902 10.616 C 22.201 12.748 21.820 14.991 20.661 17.000 C 19.501 19.009 17.749 20.459 15.753 21.266 C 14.961 19.115 15.095 16.641 16.330 14.500 C 17.566 12.359 19.642 11.006 21.902 10.616 Z"),
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
        return _baseballFill!!
    }

private var _baseballFill: ImageVector? = null
