package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FireLine: ImageVector
    get() {
        if (_fireLine != null) return _fireLine!!
        _fireLine = remixIcon(
            name = "FireLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 23c4.142 0 7.5-3.358 7.5-7.5 0-.866-.23-1.697-.5-2.47-1.667 1.647-2.933 2.47-3.8 2.47C19.195 8.5 17 5.5 11 1.5c.5 5-2.796 7.274-4.138 8.537C5.408 11.405 4.5 13.346 4.5 15.5 4.5 19.642 7.858 23 12 23ZM12.709 5.235c3.242 2.75 3.257 4.887 .754 9.274-.761 1.333 .202 2.991 1.737 2.991 .688 0 1.384-.201 2.119-.595C16.698 19.262 14.552 21 12 21 8.962 21 6.5 18.538 6.5 15.5c0-1.539 .633-2.972 1.732-4.007 .126-.119 .765-.685 .793-.71 .424-.382 .773-.717 1.118-1.087C11.373 8.379 12.257 6.916 12.709 5.235Z"),
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
        return _fireLine!!
    }

private var _fireLine: ImageVector? = null
