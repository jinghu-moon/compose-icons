package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookCircleFill: ImageVector
    get() {
        if (_facebookCircleFill != null) return _facebookCircleFill!!
        _facebookCircleFill = remixIcon(
            name = "FacebookCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 2.000 C 6.478 2.000 2.001 6.477 2.001 12.000 C 2.001 16.991 5.658 21.128 10.439 21.878 L 10.439 14.891 L 7.899 14.891 L 7.899 12.000 L 10.439 12.000 L 10.439 9.797 C 10.439 7.291 11.931 5.906 14.216 5.906 C 15.310 5.906 16.454 6.102 16.454 6.102 L 16.454 8.562 L 15.193 8.562 C 13.951 8.562 13.564 9.333 13.564 10.124 L 13.564 12.000 L 16.337 12.000 L 15.894 14.891 L 13.564 14.891 L 13.564 21.878 C 18.344 21.128 22.001 16.991 22.001 12.000 C 22.001 6.477 17.524 2.000 12.001 2.000 Z"),
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
        return _facebookCircleFill!!
    }

private var _facebookCircleFill: ImageVector? = null
