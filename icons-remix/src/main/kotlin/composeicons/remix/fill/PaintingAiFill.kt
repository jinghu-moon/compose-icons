package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PaintingAiFill: ImageVector
    get() {
        if (_paintingAiFill != null) return _paintingAiFill!!
        _paintingAiFill = remixIcon(
            name = "PaintingAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.525 3.525c1.367-1.367 3.582-1.366 4.949 0l.172 .171c.195 .195 .512 .195 .707 0l.172-.171c1.053-1.053 2.608-1.293 3.893-.725-.269 .681-.417 1.424-.417 2.2 0 .892 .196 1.738 .545 2.499h-4.046c-1.104 0-2 .896-2 2v5c0 1.104 .896 2 2 2h5c1.104-0 2-.896 2-2v-4.046c.761 .35 1.608 .547 2.501 .547 .776-0 1.517-.151 2.198-.419 .569 1.284 .328 2.84-.725 3.893l-.171 .172c-.195 .195-.195 .512 0 .707l.171 .172c1.366 1.367 1.367 3.583 0 4.949-1.367 1.367-3.582 1.367-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.367-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.367-4.949 0-1.366-1.367-1.367-3.583 0-4.949l.171-.172c.195-.195 .195-.512 0-.707l-.171-.172C2.159 13.108 2.158 10.892 3.525 9.525l.171-.172c.195-.195 .195-.512 0-.707L3.525 8.475C2.159 7.108 2.158 4.892 3.525 3.525ZM14.5 14.5h-5v-5h5v5ZM18.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.847 7.119 17.056 6.316 16.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _paintingAiFill!!
    }

private var _paintingAiFill: ImageVector? = null
