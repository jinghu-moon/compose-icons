package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilePpt2Fill: ImageVector
    get() {
        if (_filePpt2Fill != null) return _filePpt2Fill!!
        _filePpt2Fill = remixIcon(
            name = "FilePpt2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3h4c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-4v-18ZM2.859 2.877 15.429 1.082c.273-.039 .527 .151 .566 .424 .003 .023 .005 .047 .005 .071v20.847c0 .276-.224 .5-.5 .5-.024 0-.047-.002-.071-.005L2.859 21.123C2.366 21.052 2 20.63 2 20.133v-16.265c0-.498 .366-.92 .859-.99ZM5 8v8h2v-2h6v-6h-8ZM7 10h4v2h-4v-2Z"),
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
        return _filePpt2Fill!!
    }

private var _filePpt2Fill: ImageVector? = null
