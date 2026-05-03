package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WordpressLine: ImageVector
    get() {
        if (_wordpressLine != null) return _wordpressLine!!
        _wordpressLine = remixIcon(
            name = "WordpressLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 ZM 14.606 19.566 L 12.451 13.581 L 10.270 19.812 C 10.827 19.935 11.406 20.000 12.000 20.000 C 12.912 20.000 13.789 19.847 14.606 19.566 ZM 17.074 18.185 C 18.861 16.718 20.000 14.492 20.000 12.000 C 20.000 10.974 19.807 9.994 19.455 9.092 C 19.205 10.546 18.763 12.441 18.479 13.407 L 17.074 18.185 ZM 16.873 5.655 C 15.523 4.617 13.834 4.000 12.000 4.000 C 9.474 4.000 7.221 5.171 5.755 7.000 L 7.145 7.000 L 7.145 9.000 L 6.395 9.000 L 9.150 16.958 L 11.377 10.596 L 10.802 9.000 L 8.645 9.000 L 8.645 7.000 L 13.645 7.000 L 13.645 9.000 L 12.928 9.000 L 15.549 16.282 L 16.561 12.843 C 17.084 11.010 16.653 10.211 16.222 9.413 C 15.933 8.879 15.645 8.345 15.645 7.500 C 15.645 6.669 16.152 5.957 16.873 5.655 ZM 4.425 9.421 C 4.149 10.230 4.000 11.098 4.000 12.000 C 4.000 14.810 5.449 17.281 7.640 18.708 L 4.425 9.421 Z"),
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
        return _wordpressLine!!
    }

private var _wordpressLine: ImageVector? = null
