package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilePdf2Fill: ImageVector
    get() {
        if (_filePdf2Fill != null) return _filePdf2Fill!!
        _filePdf2Fill = remixIcon(
            name = "FilePdf2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.999 2C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h16.013c.549 0 .993-.451 .993-1.007L21 7 16 2h-12.001ZM10.5 7.5h2c0 2.49 2.144 5.16 4.816 6.051l-.458 1.939c-3.135-.448-6.377 .89-9.304 2.842L6.375 16.719c1.086-.869 2.128-2.343 2.9-4.066 .769-1.716 1.225-3.576 1.225-5.153ZM11.1 13.472c.267-.596 .504-1.215 .704-1.843 .472 .725 1.052 1.39 1.706 1.967-.982 .176-1.944 .464-2.875 .832 .165-.313 .32-.633 .465-.956Z"),
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
        return _filePdf2Fill!!
    }

private var _filePdf2Fill: ImageVector? = null
