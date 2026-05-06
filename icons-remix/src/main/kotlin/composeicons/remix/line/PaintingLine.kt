package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaintingLine: ImageVector
    get() {
        if (_paintingLine != null) return _paintingLine!!
        _paintingLine = remixIcon(
            name = "PaintingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.526 3.526c1.367-1.367 3.582-1.367 4.949 0 1.366 1.367 1.367 3.582 0 4.949l-.171 .172c-.195 .195-.195 .512 0 .707l.171 .172c1.366 1.367 1.367 3.583 0 4.949l-.171 .172c-.195 .195-.195 .512 0 .707l.171 .172c1.366 1.367 1.367 3.583 0 4.949-1.367 1.367-3.582 1.366-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.366-4.949 0l-.172-.171c-.195-.195-.512-.195-.707 0l-.172 .171c-1.367 1.367-3.582 1.366-4.949 0-1.367-1.367-1.367-3.583 0-4.949l.171-.172c.195-.195 .195-.512 0-.707l-.171-.172C2.159 13.108 2.159 10.892 3.526 9.526l.171-.172c.195-.195 .195-.512 0-.707L3.526 8.475C2.159 7.108 2.159 4.892 3.526 3.526c1.367-1.367 3.582-1.367 4.949 0l.172 .171c.195 .195 .512 .195 .707 0l.172-.171c1.367-1.367 3.582-1.367 4.949 0l.172 .171c.195 .195 .512 .195 .707 0l.172-.171ZM19.061 4.94c-.586-.586-1.535-.586-2.121 0l-.172 .172c-.976 .976-2.559 .976-3.535 0l-.172-.172c-.586-.586-1.535-.586-2.121 0l-.172 .172c-.976 .976-2.559 .976-3.535 0L7.061 4.94c-.586-.586-1.535-.586-2.121 0-.586 .586-.586 1.535 0 2.121l.172 .172c.976 .976 .976 2.559 0 3.535l-.172 .172c-.586 .586-.586 1.535 0 2.121l.172 .172c.976 .976 .976 2.559 0 3.535l-.172 .172c-.586 .586-.586 1.535 0 2.121 .586 .586 1.535 .586 2.121 0l.172-.172c.976-.976 2.559-.976 3.535 0l.172 .172c.586 .586 1.535 .586 2.121 0l.172-.172c.976-.976 2.559-.976 3.535 0l.172 .172c.586 .586 1.535 .586 2.121 0 .586-.586 .586-1.535 0-2.121l-.172-.172c-.976-.976-.976-2.559 0-3.535l.172-.172c.586-.586 .586-1.535 0-2.121l-.172-.172c-.976-.976-.976-2.559 0-3.535l.172-.172c.586-.586 .586-1.535 0-2.121ZM14.5 7.5c1.104 0 2 .896 2 2v5c-0 1.104-.896 2-2 2h-5c-1.104 0-2-.895-2-2v-5c0-1.105 .895-2 2-2h5ZM9.5 14.5h5v-5h-5v5Z"),
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
        return _paintingLine!!
    }

private var _paintingLine: ImageVector? = null
