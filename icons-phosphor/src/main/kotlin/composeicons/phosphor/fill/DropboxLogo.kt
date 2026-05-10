package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorFillIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 120 128 80 183.56 43c2.688-1.794 6.192-1.794 8.88 0L238 73.34c2.229 1.483 3.568 3.983 3.568 6.66 0 2.677-1.339 5.177-3.568 6.66ZM72.44 43c-2.688-1.794-6.192-1.794-8.88 0L18 73.34C15.771 74.823 14.432 77.323 14.432 80c0 2.677 1.339 5.177 3.568 6.66L68 120 128 80ZM238 153.34 188 120l-60 40 55.56 37c2.688 1.794 6.192 1.794 8.88 0L238 166.66c2.229-1.483 3.568-3.983 3.568-6.66 0-2.677-1.339-5.177-3.568-6.66ZM18 153.34c-2.229 1.483-3.568 3.983-3.568 6.66 0 2.677 1.339 5.177 3.568 6.66L63.56 197c2.688 1.794 6.192 1.794 8.88 0L128 160 68 120ZM168.61 206.29 130.24 180.71c-1.344-.897-3.096-.897-4.44 0L87.41 206.29c-1.11 .742-1.776 1.99-1.776 3.325 0 1.335 .666 2.583 1.776 3.325L123.56 237c2.688 1.794 6.192 1.794 8.88 0l36.15-24.1c1.093-.745 1.747-1.982 1.747-3.305 0-1.323-.654-2.56-1.747-3.305Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
