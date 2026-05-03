package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandSanitizerLine: ImageVector
    get() {
        if (_handSanitizerLine != null) return _handSanitizerLine!!
        _handSanitizerLine = remixIcon(
            name = "HandSanitizerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 L 17.000 4.000 L 13.000 3.999 L 13.000 6.000 L 16.000 6.000 L 16.000 8.000 C 18.209 8.000 20.000 9.791 20.000 12.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 6.000 22.000 C 4.896 22.000 4.000 21.105 4.000 20.000 L 4.000 12.000 C 4.000 9.791 5.791 8.000 8.000 8.000 L 8.000 6.000 L 11.000 6.000 L 11.000 3.999 L 7.500 4.000 C 6.870 4.000 6.130 4.490 5.300 5.600 L 3.700 4.400 C 4.870 2.840 6.130 2.000 7.500 2.000 L 17.000 2.000 ZM 16.000 10.000 L 8.000 10.000 C 6.896 10.000 6.000 10.895 6.000 12.000 L 6.000 20.000 L 18.000 20.000 L 18.000 12.000 C 18.000 10.895 17.105 10.000 16.000 10.000 ZM 13.000 12.000 L 13.000 14.000 L 15.000 14.000 L 15.000 16.000 L 12.999 16.000 L 13.000 18.000 L 11.000 18.000 L 10.999 16.000 L 9.000 16.000 L 9.000 14.000 L 11.000 14.000 L 11.000 12.000 L 13.000 12.000 Z"),
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
        return _handSanitizerLine!!
    }

private var _handSanitizerLine: ImageVector? = null
