package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilePdf2Line: ImageVector
    get() {
        if (_filePdf2Line != null) return _filePdf2Line!!
        _filePdf2Line = remixIcon(
            name = "FilePdf2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 4h10v4h4v12h-14v-16ZM3.999 2C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h16.013c.549 0 .993-.451 .993-1.007L21 7 16 2h-12.001ZM10.5 7.5c0 1.577-.456 3.437-1.225 5.153-.772 1.722-1.813 3.197-2.9 4.066l1.179 1.613c2.927-1.952 6.169-3.29 9.304-2.842l.458-1.939C14.644 12.66 12.5 9.99 12.5 7.5h-2ZM11.1 13.472c.267-.596 .504-1.215 .704-1.843 .472 .725 1.052 1.39 1.706 1.967-.982 .176-1.944 .464-2.875 .832 .165-.313 .32-.633 .465-.956Z"),
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
        return _filePdf2Line!!
    }

private var _filePdf2Line: ImageVector? = null
