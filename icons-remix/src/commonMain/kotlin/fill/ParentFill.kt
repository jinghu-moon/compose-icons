package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ParentFill: ImageVector
    get() {
        if (_parentFill != null) return _parentFill!!
        _parentFill = remixIcon(
            name = "ParentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 11.000 C 4.515 11.000 2.500 8.985 2.500 6.500 C 2.500 4.015 4.515 2.000 7.000 2.000 C 9.485 2.000 11.500 4.015 11.500 6.500 C 11.500 8.985 9.485 11.000 7.000 11.000 ZM 17.500 15.000 C 15.291 15.000 13.500 13.209 13.500 11.000 C 13.500 8.791 15.291 7.000 17.500 7.000 C 19.709 7.000 21.500 8.791 21.500 11.000 C 21.500 13.209 19.709 15.000 17.500 15.000 ZM 17.500 16.000 C 19.985 16.000 22.000 18.015 22.000 20.500 L 22.000 21.000 L 13.000 21.000 L 13.000 20.500 C 13.000 18.015 15.015 16.000 17.500 16.000 ZM 7.000 12.000 C 9.761 12.000 12.000 14.239 12.000 17.000 L 12.000 21.000 L 2.000 21.000 L 2.000 17.000 C 2.000 14.239 4.239 12.000 7.000 12.000 Z"),
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
        return _parentFill!!
    }

private var _parentFill: ImageVector? = null
