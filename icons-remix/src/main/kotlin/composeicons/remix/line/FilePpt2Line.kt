package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilePpt2Line: ImageVector
    get() {
        if (_filePpt2Line != null) return _filePpt2Line!!
        _filePpt2Line = remixIcon(
            name = "FilePpt2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.859 2.877 15.429 1.082c.273-.039 .527 .151 .566 .424 .003 .023 .005 .047 .005 .071v20.847c0 .276-.224 .5-.5 .5-.024 0-.047-.002-.071-.005L2.859 21.123C2.366 21.052 2 20.63 2 20.133v-16.265c0-.498 .366-.92 .859-.99ZM4 4.735v14.531l10 1.429v-17.388L4 4.735ZM17 19h3v-14h-3v-2h4c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-4v-2ZM5 8h8v6h-6v2h-2v-8ZM7 10v2h4v-2h-4Z"),
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
        return _filePpt2Line!!
    }

private var _filePpt2Line: ImageVector? = null
