package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BaseballLine: ImageVector
    get() {
        if (_baseballLine != null) return _baseballLine!!
        _baseballLine = remixIcon(
            name = "BaseballLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.204 2.399c2.525-.735 5.337-.479 7.796 .94 2.458 1.419 4.087 3.727 4.713 6.281 .592 2.414 .289 5.055-1.053 7.379-1.342 2.324-3.477 3.907-5.864 4.602-2.525 .735-5.337 .478-7.796-.941C4.541 19.24 2.913 16.933 2.287 14.379 1.695 11.965 1.998 9.323 3.339 6.999 4.681 4.676 6.817 3.094 9.204 2.399ZM16 5.072C14.314 4.099 12.423 3.809 10.644 4.116c.299 2.131-.083 4.376-1.242 6.384C8.243 12.507 6.489 13.96 4.495 14.766c.624 1.695 1.819 3.189 3.505 4.162 1.685 .973 3.576 1.261 5.355 .954-.299-2.131 .084-4.375 1.243-6.383 1.159-2.008 2.912-3.461 4.906-4.268C18.881 7.537 17.685 6.045 16 5.072ZM19.961 11.21c-1.475 .665-2.761 1.782-3.632 3.29-.87 1.508-1.194 3.18-1.033 4.789 1.474-.665 2.761-1.781 3.632-3.289 .871-1.508 1.194-3.18 1.033-4.79ZM8.703 4.709C7.228 5.375 5.942 6.492 5.072 7.999 4.201 9.507 3.878 11.179 4.039 12.789 5.513 12.123 6.799 11.007 7.669 9.5 8.54 7.991 8.864 6.319 8.703 4.709Z"),
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
        return _baseballLine!!
    }

private var _baseballLine: ImageVector? = null
