package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FileText: ImageVector
    get() {
        if (_fileText != null) return _fileText!!
        _fileText = radixIcon(
            name = "FileText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.086 1c.398 0 .779 .158 1.061 .439l2.414 2.414 .1 .11c.219 .267 .34 .602 .34 .95v7.586C13 13.328 12.328 14 11.5 14h-8C2.672 14 2 13.328 2 12.5v-10C2 1.672 2.672 1 3.5 1h5.586ZM3.5 2C3.224 2 3 2.224 3 2.5v10c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-7.586c0-.099-.03-.196-.084-.277l-.062-.076L9.439 2.146C9.346 2.053 9.218 2 9.086 2h-5.586ZM10.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-6C4.224 11 4 10.776 4 10.5 4 10.224 4.224 10 4.5 10h6ZM10.5 7c.276 0 .5 .224 .5 .5C11 7.776 10.776 8 10.5 8h-6C4.224 8 4 7.776 4 7.5 4 7.224 4.224 7 4.5 7h6ZM7.5 4C7.776 4 8 4.224 8 4.5 8 4.776 7.776 5 7.5 5h-3C4.224 5 4 4.776 4 4.5 4 4.224 4.224 4 4.5 4h3Z"),
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
        return _fileText!!
    }

private var _fileText: ImageVector? = null
