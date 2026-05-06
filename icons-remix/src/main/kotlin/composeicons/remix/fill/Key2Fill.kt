package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Key2Fill: ImageVector
    get() {
        if (_key2Fill != null) return _key2Fill!!
        _key2Fill = remixIcon(
            name = "Key2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.313 11.566 18.253 3.626l2.121 2.121L18.96 7.161l2.121 2.121-3.536 3.536L15.425 10.697l-2.99 2.99c.984 1.885 .684 4.265-.899 5.848-1.953 1.953-5.118 1.953-7.071 0-1.953-1.953-1.953-5.118 0-7.071 1.583-1.583 3.964-1.883 5.849-.899ZM9.414 17.414c.781-.781 .781-2.047 0-2.828-.781-.781-2.047-.781-2.828 0-.781 .781-.781 2.047 0 2.828 .781 .781 2.047 .781 2.828 0Z"),
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
        return _key2Fill!!
    }

private var _key2Fill: ImageVector? = null
