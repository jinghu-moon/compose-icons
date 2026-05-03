package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopyrightFill: ImageVector
    get() {
        if (_copyrightFill != null) return _copyrightFill!!
        _copyrightFill = remixIcon(
            name = "CopyrightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 ZM 12.000 7.000 C 9.240 7.000 7.000 9.240 7.000 12.000 C 7.000 14.760 9.240 17.000 12.000 17.000 C 13.819 17.000 15.413 16.027 16.288 14.572 L 14.573 13.544 C 14.048 14.417 13.093 15.000 12.000 15.000 C 10.342 15.000 9.000 13.658 9.000 12.000 C 9.000 10.342 10.342 9.000 12.000 9.000 C 13.093 9.000 14.049 9.584 14.573 10.457 L 16.288 9.428 C 15.413 7.973 13.819 7.000 12.000 7.000 Z"),
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
        return _copyrightFill!!
    }

private var _copyrightFill: ImageVector? = null
