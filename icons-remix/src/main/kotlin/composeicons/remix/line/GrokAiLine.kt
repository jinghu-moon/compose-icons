package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GrokAiLine: ImageVector
    get() {
        if (_grokAiLine != null) return _grokAiLine!!
        _grokAiLine = remixIcon(
            name = "GrokAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.775 2.778C12.176 1.295 7.866 2.033 4.939 4.961 3.058 6.845 2.039 9.405 2.024 12c-.008 1.288 .232 2.583 .736 3.81C3.895 18.573 1.999 21.027 .124 23L6.228 17.54C4.848 16.102 4 14.15 4 12 4 7.582 7.582 4 12 4c1.317 0 2.56 .318 3.656 .882l2.152-.995C17.266 3.496 16.572 3.074 15.775 2.778ZM21.696 9.733C20.709 5.482 21.636 3.274 23.9 .1L8.59 15.472 18.199 8.806c.435-.321 1.056-.195 1.263 .304 .347 .896 .538 1.871 .538 2.89 0 4.418-3.582 8-8 8-1.303 0-2.534-.312-3.621-.864L5.196 20.145C6.833 21.313 9.836 22 12 22c5.523 0 10-4.477 10-10-.004-.764-.129-1.524-.304-2.267Z"),
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
        return _grokAiLine!!
    }

private var _grokAiLine: ImageVector? = null
