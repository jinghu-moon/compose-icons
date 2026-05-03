package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CopyrightLine: ImageVector
    get() {
        if (_copyrightLine != null) return _copyrightLine!!
        _copyrightLine = remixIcon(
            name = "CopyrightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.288 9.428 C 15.413 7.974 13.819 7.000 12.000 7.000 C 9.240 7.000 7.000 9.240 7.000 12.000 C 7.000 14.760 9.240 17.000 12.000 17.000 C 13.819 17.000 15.413 16.027 16.288 14.572 L 14.573 13.544 C 14.048 14.417 13.093 15.000 12.000 15.000 C 10.342 15.000 9.000 13.658 9.000 12.000 C 9.000 10.342 10.342 9.000 12.000 9.000 C 13.093 9.000 14.049 9.584 14.573 10.457 L 16.288 9.428 ZM 22.000 12.000 C 22.000 6.480 17.520 2.000 12.000 2.000 C 6.480 2.000 2.000 6.480 2.000 12.000 C 2.000 17.520 6.480 22.000 12.000 22.000 C 17.520 22.000 22.000 17.520 22.000 12.000 ZM 4.000 12.000 C 4.000 7.580 7.580 4.000 12.000 4.000 C 16.420 4.000 20.000 7.580 20.000 12.000 C 20.000 16.420 16.420 20.000 12.000 20.000 C 7.580 20.000 4.000 16.420 4.000 12.000 Z"),
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
        return _copyrightLine!!
    }

private var _copyrightLine: ImageVector? = null
