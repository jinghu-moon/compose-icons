package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorFillIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM165.66 74.34C164.159 72.838 162.123 71.994 160 71.994c-2.123 0-4.159 .844-5.66 2.346L87.09 143c-9.389 9.364-9.409 24.566-.045 33.955 9.364 9.389 24.566 9.409 33.955 .045l49.32-50.32c1.983-2.12 4.96-3 7.777-2.298 2.817 .702 5.033 2.875 5.79 5.678 .757 2.803-.065 5.796-2.146 7.82l-49.37 50.38c-10.056 10.303-24.873 14.407-38.797 10.746C79.65 195.345 68.768 184.484 65.08 170.567c-3.688-13.917 .387-28.741 10.67-38.817L143 63.09c9.364-9.389 24.566-9.409 33.955-.045 9.389 9.364 9.409 24.566 .045 33.955l-67.29 68.6c-1.983 2.12-4.96 3-7.777 2.298-2.817-.702-5.033-2.875-5.79-5.678-.757-2.803 .065-5.796 2.146-7.82L165.6 85.71c1.526-1.494 2.39-3.537 2.401-5.672 .011-2.136-.832-4.187-2.341-5.698Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
