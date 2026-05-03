package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixRunLine: ImageVector
    get() {
        if (_remixRunLine != null) return _remixRunLine!!
        _remixRunLine = remixIcon(
            name = "RemixRunLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 2.000 L 14.500 2.000 C 17.814 2.000 20.500 4.686 20.500 8.000 C 20.500 10.198 19.318 12.121 17.554 13.165 C 19.038 14.258 20.000 16.017 20.000 18.000 L 20.000 21.000 L 18.000 21.000 L 18.000 18.000 C 18.000 15.791 16.209 14.000 14.000 14.000 L 4.000 14.000 L 4.000 12.000 L 14.500 12.000 C 16.709 12.000 18.500 10.209 18.500 8.000 C 18.500 5.791 16.709 4.000 14.500 4.000 L 4.000 4.000 L 4.000 2.000 ZM 11.000 21.000 L 4.000 21.000 L 4.000 19.000 L 11.000 19.000 L 11.000 21.000 Z"),
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
        return _remixRunLine!!
    }

private var _remixRunLine: ImageVector? = null
