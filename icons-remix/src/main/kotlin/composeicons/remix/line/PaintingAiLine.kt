package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaintingAiLine: ImageVector
    get() {
        if (_paintingAiLine != null) return _paintingAiLine!!
        _paintingAiLine = remixIcon(
            name = "PaintingAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.526 3.525c1.367-1.367 3.582-1.367 4.949 0l.172 .171c.195 .195 .512 .195 .707 0l.172-.171c1.283-1.282 3.312-1.361 4.687-.237L12.948 4.836c-.588-.481-1.459-.445-2.008 .104l-.172 .172c-.976 .976-2.559 .976-3.535 0L7.061 4.939c-.586-.586-1.535-.586-2.121 0-.586 .586-.586 1.535 0 2.121l.172 .172c.976 .976 .976 2.559 0 3.535l-.172 .172c-.586 .586-.586 1.535 0 2.121l.172 .172c.976 .976 .976 2.559 0 3.535l-.172 .172c-.586 .586-.586 1.535 0 2.121 .586 .586 1.535 .586 2.121 0l.172-.172c.976-.976 2.559-.976 3.535 0l.172 .172c.586 .586 1.535 .586 2.121 0l.172-.172c.976-.976 2.559-.976 3.535 0l.172 .172c.586 .586 1.535 .586 2.121 0 .586-.586 .586-1.535 0-2.121l-.172-.172c-.976-.976-.976-2.559 0-3.535l.172-.172c.549-.549 .584-1.42 .104-2.008L20.712 9.787c1.124 1.375 1.045 3.405-.237 4.687l-.171 .172c-.195 .195-.195 .512 0 .707l.171 .172c1.367 1.367 1.367 3.582 0 4.949-1.367 1.367-3.582 1.367-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.367-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.367-4.949 0-1.367-1.367-1.367-3.582 0-4.949l.171-.172c.195-.195 .195-.512 0-.707l-.171-.172C2.159 13.108 2.159 10.892 3.526 9.525l.171-.172c.195-.195 .195-.512 0-.707L3.526 8.475C2.159 7.108 2.159 4.892 3.526 3.525ZM14.5 7.5c1.104 0 2 .896 2 2v5c0 1.104-.896 2-2 2h-5c-1.105 0-2-.895-2-2v-5C7.5 8.395 8.396 7.5 9.5 7.5h5ZM9.5 14.5h5v-5h-5v5ZM18.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.246 .565c-.18 .414-.753 .414-.934 0l-.247-.565C17.847 7.119 17.055 6.316 16.068 5.877l-.76-.338c-.41-.183-.411-.78 0-.963l.718-.319c1.013-.451 1.818-1.283 2.25-2.326l.254-.611Z"),
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
        return _paintingAiLine!!
    }

private var _paintingAiLine: ImageVector? = null
