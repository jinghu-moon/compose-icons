package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareLine: ImageVector
    get() {
        if (_shareLine != null) return _shareLine!!
        _shareLine = remixIcon(
            name = "ShareLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.120 17.023 L 8.921 14.732 C 8.191 15.512 7.153 16.000 6.000 16.000 C 3.791 16.000 2.000 14.209 2.000 12.000 C 2.000 9.791 3.791 8.000 6.000 8.000 C 7.153 8.000 8.191 8.487 8.921 9.267 L 13.120 6.977 C 13.042 6.664 13.000 6.337 13.000 6.000 C 13.000 3.791 14.791 2.000 17.000 2.000 C 19.209 2.000 21.000 3.791 21.000 6.000 C 21.000 8.209 19.209 10.000 17.000 10.000 C 15.847 10.000 14.809 9.513 14.079 8.732 L 9.880 11.023 C 9.958 11.335 10.000 11.663 10.000 12.000 C 10.000 12.337 9.958 12.664 9.880 12.977 L 14.079 15.267 C 14.809 14.488 15.847 14.000 17.000 14.000 C 19.209 14.000 21.000 15.791 21.000 18.000 C 21.000 20.209 19.209 22.000 17.000 22.000 C 14.791 22.000 13.000 20.209 13.000 18.000 C 13.000 17.663 13.042 17.336 13.120 17.023 ZM 6.000 14.000 C 7.105 14.000 8.000 13.105 8.000 12.000 C 8.000 10.895 7.105 10.000 6.000 10.000 C 4.895 10.000 4.000 10.895 4.000 12.000 C 4.000 13.105 4.895 14.000 6.000 14.000 ZM 17.000 8.000 C 18.105 8.000 19.000 7.105 19.000 6.000 C 19.000 4.895 18.105 4.000 17.000 4.000 C 15.895 4.000 15.000 4.895 15.000 6.000 C 15.000 7.105 15.895 8.000 17.000 8.000 ZM 17.000 20.000 C 18.105 20.000 19.000 19.105 19.000 18.000 C 19.000 16.895 18.105 16.000 17.000 16.000 C 15.895 16.000 15.000 16.895 15.000 18.000 C 15.000 19.105 15.895 20.000 17.000 20.000 Z"),
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
        return _shareLine!!
    }

private var _shareLine: ImageVector? = null
