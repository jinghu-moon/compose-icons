package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TapeLine: ImageVector
    get() {
        if (_tapeLine != null) return _tapeLine!!
        _tapeLine = remixIcon(
            name = "TapeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.829 13.000 L 13.171 13.000 C 13.060 12.687 13.000 12.351 13.000 12.000 C 13.000 10.343 14.343 9.000 16.000 9.000 C 17.657 9.000 19.000 10.343 19.000 12.000 C 19.000 13.657 17.657 15.000 16.000 15.000 L 8.000 15.000 C 6.343 15.000 5.000 13.657 5.000 12.000 C 5.000 10.343 6.343 9.000 8.000 9.000 C 9.657 9.000 11.000 10.343 11.000 12.000 C 11.000 12.351 10.940 12.687 10.829 13.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 8.000 13.000 C 8.552 13.000 9.000 12.552 9.000 12.000 C 9.000 11.448 8.552 11.000 8.000 11.000 C 7.448 11.000 7.000 11.448 7.000 12.000 C 7.000 12.552 7.448 13.000 8.000 13.000 ZM 16.000 13.000 C 16.552 13.000 17.000 12.552 17.000 12.000 C 17.000 11.448 16.552 11.000 16.000 11.000 C 15.448 11.000 15.000 11.448 15.000 12.000 C 15.000 12.552 15.448 13.000 16.000 13.000 Z"),
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
        return _tapeLine!!
    }

private var _tapeLine: ImageVector? = null
