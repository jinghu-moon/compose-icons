package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SeedlingFill: ImageVector
    get() {
        if (_seedlingFill != null) return _seedlingFill!!
        _seedlingFill = remixIcon(
            name = "SeedlingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.998 7.000 L 21.998 9.500 C 21.998 13.090 19.088 16.000 15.498 16.000 L 12.998 16.000 L 12.998 21.000 L 10.998 21.000 L 10.998 14.000 L 11.017 13.001 C 11.272 9.644 14.076 7.000 17.498 7.000 L 21.998 7.000 ZM 5.998 3.000 C 9.090 3.000 11.714 5.005 12.641 7.786 C 11.142 9.061 10.152 10.914 10.014 13.000 L 8.998 13.000 C 5.132 13.000 1.998 9.866 1.998 6.000 L 1.998 3.000 L 5.998 3.000 Z"),
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
        return _seedlingFill!!
    }

private var _seedlingFill: ImageVector? = null
