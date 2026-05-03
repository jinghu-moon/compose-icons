package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PianoGrandLine: ImageVector
    get() {
        if (_pianoGrandLine != null) return _pianoGrandLine!!
        _pianoGrandLine = remixIcon(
            name = "PianoGrandLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 2.000 C 11.429 2.000 13.569 3.239 14.823 5.114 C 15.170 5.632 15.739 6.013 16.355 6.139 C 19.517 6.783 22.000 9.614 22.000 13.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 9.000 C 2.000 5.134 5.134 2.000 9.000 2.000 ZM 4.000 19.000 L 20.000 19.000 L 20.000 14.000 L 19.000 14.000 L 19.000 17.000 L 17.000 17.000 L 17.000 14.000 L 15.000 14.000 L 15.000 17.000 L 13.000 17.000 L 13.000 14.000 L 11.000 14.000 L 11.000 17.000 L 9.000 17.000 L 9.000 14.000 L 7.000 14.000 L 7.000 17.000 L 5.000 17.000 L 5.000 14.000 L 4.000 14.000 L 4.000 19.000 ZM 9.000 4.000 C 6.239 4.000 4.000 6.239 4.000 9.000 L 4.000 12.000 L 19.895 12.000 C 19.483 10.056 17.904 8.496 15.956 8.099 C 14.829 7.869 13.803 7.187 13.160 6.226 C 12.262 4.882 10.734 4.000 9.000 4.000 Z"),
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
        return _pianoGrandLine!!
    }

private var _pianoGrandLine: ImageVector? = null
