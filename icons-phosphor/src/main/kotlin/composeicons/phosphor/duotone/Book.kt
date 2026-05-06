package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorDuotoneIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32v160h-136c-13.255 0-24 10.745-24 24v-160C48 42.745 58.745 32 72 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 24h-136C54.327 24 40 38.327 40 56v168c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-136c0-8.837 7.163-16 16-16h136c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM200 184h-128c-5.619-.008-11.139 1.472-16 4.29v-132.29C56 47.163 63.163 40 72 40h128Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
