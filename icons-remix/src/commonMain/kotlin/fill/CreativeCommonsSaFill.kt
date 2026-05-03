package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsSaFill: ImageVector
    get() {
        if (_creativeCommonsSaFill != null) return _creativeCommonsSaFill!!
        _creativeCommonsSaFill = remixIcon(
            name = "CreativeCommonsSaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 ZM 12.000 6.000 C 9.823 6.000 7.971 7.670 7.284 10.001 L 6.000 10.000 L 8.500 13.000 L 11.000 10.000 L 9.401 10.000 C 9.920 8.805 10.889 8.000 12.000 8.000 C 13.657 8.000 15.000 9.791 15.000 12.000 C 15.000 14.209 13.657 16.000 12.000 16.000 C 10.890 16.000 9.921 15.196 9.402 14.001 L 7.285 14.001 C 7.971 16.331 9.823 18.000 12.000 18.000 C 14.761 18.000 17.000 15.314 17.000 12.000 C 17.000 8.686 14.761 6.000 12.000 6.000 Z"),
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
        return _creativeCommonsSaFill!!
    }

private var _creativeCommonsSaFill: ImageVector? = null
