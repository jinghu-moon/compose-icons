package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Wechat2Fill: ImageVector
    get() {
        if (_wechat2Fill != null) return _wechat2Fill!!
        _wechat2Fill = remixIcon(
            name = "Wechat2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.458 18.185C3.359 16.677 2.001 14.4 2.001 11.908 2.001 7.323 6.476 3.6 12.001 3.6c5.525 0 10 3.723 10 8.308 0 4.585-4.475 8.308-10 8.308-1.142 0-2.253-.154-3.272-.462-.093-.031-.216-.031-.309-.031-.185 0-.37 .062-.525 .154L5.705 21.139c-.062 .031-.123 .062-.185 .062-.185 0-.34-.154-.34-.338 0-.092 .031-.154 .062-.246 .031-.031 .309-1.046 .463-1.662 0-.061 .031-.154 .031-.215 0-.246-.093-.431-.278-.554ZM8.668 10.512c.717 0 1.285-.568 1.285-1.286C9.953 8.508 9.385 7.94 8.668 7.94c-.717 0-1.285 .568-1.285 1.286 0 .718 .568 1.286 1.285 1.286ZM15.334 10.512c.717 0 1.285-.568 1.285-1.286 0-.718-.568-1.286-1.285-1.286-.717 0-1.285 .568-1.285 1.286 0 .718 .568 1.286 1.285 1.286Z"),
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
        return _wechat2Fill!!
    }

private var _wechat2Fill: ImageVector? = null
