package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HourglassLine: ImageVector
    get() {
        if (_hourglassLine != null) return _hourglassLine!!
        _hourglassLine = remixIcon(
            name = "HourglassLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 4h-2v-2h16v2h-2v2c0 1.615-.816 2.915-1.844 3.977-.703 .726-1.558 1.395-2.425 2.023 .867 .628 1.722 1.297 2.425 2.023C17.184 15.085 18 16.385 18 18v2h2v2h-16v-2h2v-2c0-1.615 .816-2.915 1.844-3.977C8.547 13.297 9.402 12.628 10.269 12 9.402 11.372 8.547 10.703 7.844 9.977 6.816 8.915 6 7.615 6 6v-2ZM8 4v2c0 .885 .434 1.71 1.281 2.586 .727 .751 1.674 1.454 2.719 2.192 1.045-.738 1.992-1.441 2.719-2.192C15.566 7.71 16 6.885 16 6v-2h-8ZM12 13.222c-1.045 .738-1.992 1.441-2.719 2.192C8.434 16.29 8 17.115 8 18v2h8v-2c0-.885-.434-1.71-1.281-2.586C13.992 14.663 13.045 13.96 12 13.222Z"),
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
        return _hourglassLine!!
    }

private var _hourglassLine: ImageVector? = null
