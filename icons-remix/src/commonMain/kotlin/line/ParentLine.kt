package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ParentLine: ImageVector
    get() {
        if (_parentLine != null) return _parentLine!!
        _parentLine = remixIcon(
            name = "ParentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 9.000 C 8.381 9.000 9.500 7.881 9.500 6.500 C 9.500 5.119 8.381 4.000 7.000 4.000 C 5.619 4.000 4.500 5.119 4.500 6.500 C 4.500 7.881 5.619 9.000 7.000 9.000 ZM 7.000 11.000 C 4.515 11.000 2.500 8.985 2.500 6.500 C 2.500 4.015 4.515 2.000 7.000 2.000 C 9.485 2.000 11.500 4.015 11.500 6.500 C 11.500 8.985 9.485 11.000 7.000 11.000 ZM 17.500 13.000 C 18.605 13.000 19.500 12.105 19.500 11.000 C 19.500 9.895 18.605 9.000 17.500 9.000 C 16.395 9.000 15.500 9.895 15.500 11.000 C 15.500 12.105 16.395 13.000 17.500 13.000 ZM 17.500 15.000 C 15.291 15.000 13.500 13.209 13.500 11.000 C 13.500 8.791 15.291 7.000 17.500 7.000 C 19.709 7.000 21.500 8.791 21.500 11.000 C 21.500 13.209 19.709 15.000 17.500 15.000 ZM 20.000 21.000 L 20.000 20.500 C 20.000 19.119 18.881 18.000 17.500 18.000 C 16.119 18.000 15.000 19.119 15.000 20.500 L 15.000 21.000 L 13.000 21.000 L 13.000 20.500 C 13.000 18.015 15.015 16.000 17.500 16.000 C 19.985 16.000 22.000 18.015 22.000 20.500 L 22.000 21.000 L 20.000 21.000 ZM 10.000 21.000 L 10.000 17.000 C 10.000 15.343 8.657 14.000 7.000 14.000 C 5.343 14.000 4.000 15.343 4.000 17.000 L 4.000 21.000 L 2.000 21.000 L 2.000 17.000 C 2.000 14.239 4.239 12.000 7.000 12.000 C 9.761 12.000 12.000 14.239 12.000 17.000 L 12.000 21.000 L 10.000 21.000 Z"),
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
        return _parentLine!!
    }

private var _parentLine: ImageVector? = null
