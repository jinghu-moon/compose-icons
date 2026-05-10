package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Scan2Fill: ImageVector
    get() {
        if (_scan2Fill != null) return _scan2Fill!!
        _scan2Fill = remixIcon(
            name = "Scan2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.257 5.671 6.394 7.808C5.518 8.976 5 10.428 5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 10.428 5 8.976 5.518 7.808 6.394L5.671 4.257C7.395 2.846 9.599 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 9.599 2.846 7.395 4.257 5.671ZM7.828 9.243 12 13.414 13.414 12 9.243 7.828C10.033 7.305 10.981 7 12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12c0-1.019 .305-1.967 .828-2.757Z"),
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
        return _scan2Fill!!
    }

private var _scan2Fill: ImageVector? = null
