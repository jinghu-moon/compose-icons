package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MastercardLine: ImageVector
    get() {
        if (_mastercardLine != null) return _mastercardLine!!
        _mastercardLine = remixIcon(
            name = "MastercardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 18.294c-1.085 .639-2.35 1.006-3.7 1.006C4.269 19.3 1.001 16.032 1.001 12 1.001 7.968 4.269 4.7 8.301 4.7c1.35 0 2.615 .367 3.7 1.006 1.085-.639 2.35-1.006 3.7-1.006 4.032 0 7.3 3.268 7.3 7.3 0 4.032-3.268 7.3-7.3 7.3-1.35 0-2.615-.367-3.7-1.006ZM13.703 16.91c.617 .251 1.291 .39 1.998 .39 2.927 0 5.3-2.373 5.3-5.3 0-2.927-2.373-5.3-5.3-5.3-.707 0-1.382 .138-1.998 .39 1.179 1.297 1.898 3.02 1.898 4.91 0 1.891-.719 3.614-1.898 4.91ZM10.299 7.09C9.683 6.838 9.008 6.7 8.301 6.7 5.374 6.7 3.001 9.073 3.001 12c0 2.927 2.373 5.3 5.3 5.3 .707 0 1.382-.138 1.998-.39C9.12 15.614 8.401 13.891 8.401 12c0-1.891 .719-3.614 1.898-4.91ZM12.001 8.205c-.987 .963-1.6 2.307-1.6 3.795 0 1.488 .613 2.832 1.6 3.795 .987-.963 1.6-2.307 1.6-3.795 0-1.488-.613-2.832-1.6-3.795Z"),
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
        return _mastercardLine!!
    }

private var _mastercardLine: ImageVector? = null
