package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Group3Fill: ImageVector
    get() {
        if (_group3Fill != null) return _group3Fill!!
        _group3Fill = remixIcon(
            name = "Group3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 7.000 C 2.500 9.209 4.291 11.000 6.500 11.000 C 8.709 11.000 10.500 9.209 10.500 7.000 C 10.500 4.791 8.709 3.000 6.500 3.000 C 4.291 3.000 2.500 4.791 2.500 7.000 ZM 2.000 21.000 L 2.000 16.500 C 2.000 14.015 4.015 12.000 6.500 12.000 C 8.985 12.000 11.000 14.015 11.000 16.500 L 11.000 21.000 L 2.000 21.000 ZM 17.500 11.000 C 15.291 11.000 13.500 9.209 13.500 7.000 C 13.500 4.791 15.291 3.000 17.500 3.000 C 19.709 3.000 21.500 4.791 21.500 7.000 C 21.500 9.209 19.709 11.000 17.500 11.000 ZM 13.000 21.000 L 13.000 16.500 C 13.000 14.015 15.015 12.000 17.500 12.000 C 19.985 12.000 22.000 14.015 22.000 16.500 L 22.000 21.000 L 13.000 21.000 Z"),
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
        return _group3Fill!!
    }

private var _group3Fill: ImageVector? = null
