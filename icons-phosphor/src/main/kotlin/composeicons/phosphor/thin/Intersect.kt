package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorThinIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.17 84.83C165.428 46.169 131.299 18.166 92.261 20.086 53.223 22.006 22.006 53.223 20.086 92.261c-1.92 39.038 26.083 73.167 64.744 78.909 5.742 38.661 39.871 66.664 78.909 64.744 39.038-1.92 70.255-33.137 72.175-72.175C237.834 124.701 209.831 90.572 171.17 84.83ZM28 96C28.044 60.798 54.946 31.45 90.011 28.35c35.065-3.1 66.699 21.073 72.919 55.72-1 0-2-.07-2.93-.07-41.955 .044-75.956 34.045-76 76 0 1 0 2 .07 2.93C51.655 157.112 28.048 128.933 28 96ZM164 96c.007 10.742-2.547 21.332-7.45 30.89L129.11 99.45C138.668 94.547 149.258 91.993 160 92c1.3 0 2.6 0 3.88 .12C164 93.4 164 94.7 164 96ZM92 160c-.007-10.742 2.547-21.332 7.45-30.89l27.44 27.44C117.332 161.453 106.742 164.007 96 164c-1.3 0-2.6-.05-3.88-.12C92.05 162.6 92 161.3 92 160ZM134 152.36 103.64 122c4.898-7.231 11.129-13.462 18.36-18.36L152.36 134c-4.898 7.231-11.129 13.462-18.36 18.36ZM160 228C127.067 227.952 98.888 204.345 93.07 171.93c1 0 2 .07 2.93 .07 41.955-.044 75.956-34.045 76-76 0-1 0-2-.07-2.93 34.648 6.22 58.821 37.854 55.72 72.919C224.55 201.054 195.202 227.956 160 228Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
