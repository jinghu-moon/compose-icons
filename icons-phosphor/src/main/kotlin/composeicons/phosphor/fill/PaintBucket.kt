package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorFillIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 208c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-17.91 15.57-41.77 17.34-44.44 1.483-2.229 3.983-3.568 6.66-3.568 2.677 0 5.177 1.339 6.66 3.568C240.43 166.23 256 190.09 256 208ZM132.49 124.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0h0c0 0 0 0 0 0-4.614 4.705-4.571 12.251 .097 16.903 4.668 4.652 12.214 4.668 16.903 .037ZM37.65 18.34c-3.126-3.123-8.192-3.121-11.315 .005-3.123 3.126-3.121 8.192 .005 11.315L58.94 62.26 70.25 51ZM234.53 139.07c2.628-.877 4.616-3.052 5.253-5.748 .637-2.696-.166-5.531-2.123-7.492L122.17 10.34c-3.124-3.122-8.186-3.122-11.31 0L70.25 51l40.43 40.42c12.227-6.617 27.457-3.261 35.77 7.882 8.313 11.143 7.191 26.698-2.635 36.533-9.826 9.835-25.38 10.971-36.531 2.667C96.133 130.2 92.764 114.973 99.37 102.74L58.94 62.26 15 106.17c-9.372 9.372-9.372 24.568 0 33.94L99.89 225c9.372 9.372 24.568 9.372 33.94 0l78.49-78.49Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
