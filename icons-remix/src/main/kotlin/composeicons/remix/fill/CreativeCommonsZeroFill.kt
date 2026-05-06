package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsZeroFill: ImageVector
    get() {
        if (_creativeCommonsZeroFill != null) return _creativeCommonsZeroFill!!
        _creativeCommonsZeroFill = remixIcon(
            name = "CreativeCommonsZeroFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM12 6C9.239 6 7 8.686 7 12c0 3.314 2.239 6 5 6 2.761 0 5-2.686 5-6C17 8.686 14.761 6 12 6ZM14.325 9.472c.422 .689 .675 1.569 .675 2.528 0 2.209-1.343 4-3 4-.441 0-.86-.127-1.237-.355L14.325 9.472ZM12 8c.441 0 .86 .127 1.237 .355L9.675 14.528C9.253 13.839 9 12.959 9 12 9 9.791 10.343 8 12 8Z"),
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
        return _creativeCommonsZeroFill!!
    }

private var _creativeCommonsZeroFill: ImageVector? = null
