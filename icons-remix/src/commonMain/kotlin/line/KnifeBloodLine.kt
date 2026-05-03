package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KnifeBloodLine: ImageVector
    get() {
        if (_knifeBloodLine != null) return _knifeBloodLine!!
        _knifeBloodLine = remixIcon(
            name = "KnifeBloodLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.343 1.408 L 22.374 19.439 C 22.960 20.025 22.960 20.975 22.374 21.561 C 21.789 22.146 20.839 22.146 20.253 21.561 L 15.657 16.965 L 12.121 20.500 L 8.001 16.379 L 8.001 19.000 C 8.001 19.552 7.554 20.000 7.001 20.000 C 6.449 20.000 6.001 19.552 6.001 19.000 L 6.001 15.000 C 6.001 14.448 5.554 14.000 5.001 14.000 C 4.488 14.000 4.066 14.386 4.008 14.884 L 4.001 15.000 L 4.001 16.000 C 4.001 16.552 3.554 17.000 3.001 17.000 C 2.449 17.000 2.001 16.552 2.001 16.000 L 2.001 7.214 C 1.964 5.194 2.687 3.164 4.170 1.587 L 4.343 1.408 ZM 4.584 4.478 L 4.533 4.588 C 4.230 5.258 4.056 5.971 4.011 6.691 L 4.001 7.000 L 4.000 7.120 C 4.014 8.559 4.541 9.993 5.581 11.123 L 5.757 11.308 L 12.121 17.672 L 14.949 14.843 L 4.584 4.478 Z"),
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
        return _knifeBloodLine!!
    }

private var _knifeBloodLine: ImageVector? = null
