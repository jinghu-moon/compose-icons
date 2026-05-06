package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BodyScanLine: ImageVector
    get() {
        if (_bodyScanLine != null) return _bodyScanLine!!
        _bodyScanLine = remixIcon(
            name = "BodyScanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 16v4h4v2h-6v-6h2ZM22 16v6h-6v-2h4v-4h2ZM7.5 7c0 2.142 1.496 3.934 3.5 4.389v5.611h2l.001-5.612C15.005 10.933 16.5 9.141 16.5 7h2c0 2.507-1.42 4.683-3.499 5.767L15 19h-6L9 12.768C6.92 11.684 5.5 9.508 5.5 7h2ZM12 5c1.381 0 2.5 1.119 2.5 2.5C14.5 8.881 13.381 10 12 10 10.619 10 9.5 8.881 9.5 7.5 9.5 6.119 10.619 5 12 5ZM8 2v2L4 3.999v4.001h-2v-6h6ZM22 2v6h-2v-4h-4v-2h6Z"),
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
        return _bodyScanLine!!
    }

private var _bodyScanLine: ImageVector? = null
