package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoubanFill: ImageVector
    get() {
        if (_doubanFill != null) return _doubanFill!!
        _doubanFill = remixIcon(
            name = "DoubanFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.314 19.138h4.065c.343 0 .621 .278 .621 .621v.621c0 .343-.278 .621-.621 .621h-16.759C3.278 21 3 20.722 3 20.379v-.621c0-.343 .278-.621 .621-.621h3.754L6.414 16.035h2.191c.267 0 .504 .171 .589 .424l.893 2.679h3.513l1.225-4.034h-9.651c-.343 0-.621-.278-.621-.621v-7.138c0-.343 .278-.621 .621-.621h13.655c.343 0 .621 .278 .621 .621v7.138c0 .343-.278 .621-.621 .621h-1.288l-1.225 4.034ZM3.931 3h16.138c.343 0 .621 .278 .621 .621v.621c0 .343-.278 .621-.621 .621h-16.138c-.343 0-.621-.278-.621-.621v-.621C3.31 3.278 3.588 3 3.931 3ZM7.19 8.586c-.086 0-.155 .069-.155 .155v4.035c0 .086 .069 .155 .155 .155h9.621c.086 0 .155-.069 .155-.155v-4.035c0-.086-.069-.155-.155-.155h-9.621Z"),
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
        return _doubanFill!!
    }

private var _doubanFill: ImageVector? = null
