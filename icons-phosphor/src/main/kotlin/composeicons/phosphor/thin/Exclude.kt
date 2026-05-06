package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorThinIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.17 84.83C165.428 46.169 131.299 18.166 92.261 20.086 53.223 22.006 22.006 53.223 20.086 92.261c-1.92 39.038 26.083 73.167 64.744 78.909 5.742 38.661 39.871 66.664 78.909 64.744 39.038-1.92 70.255-33.137 72.175-72.175C237.834 124.701 209.831 90.572 171.17 84.83ZM228 160c-.005 4.387-.43 8.764-1.27 13.07L169.39 115.73C171.121 109.296 171.999 102.663 172 96c0-1 0-2-.07-2.93C204.345 98.888 227.952 127.067 228 160ZM210.8 205.14 152.46 146.81c5.984-6.65 10.754-14.299 14.09-22.6L224.33 182c-2.933 8.533-7.532 16.399-13.53 23.14ZM182 224.33 124.22 166.55c8.301-3.336 15.95-8.106 22.6-14.09l58.33 58.34c-6.744 5.999-14.613 10.598-23.15 13.53ZM45.2 50.86l58.34 58.33c-5.984 6.65-10.754 14.299-14.09 22.6L31.67 74C34.603 65.467 39.202 57.601 45.2 50.86ZM74 31.67l57.78 57.78c-8.301 3.336-15.95 8.106-22.6 14.09L50.86 45.2C57.601 39.202 65.467 34.603 74 31.67ZM92 160c.039-37.539 30.461-67.961 68-68 1.3 0 2.6 0 3.88 .12C164 93.4 164 94.7 164 96c-.039 37.539-30.461 67.961-68 68-1.3 0-2.6-.05-3.88-.12C92.05 162.6 92 161.3 92 160ZM162.93 84.07c-1 0-2-.07-2.93-.07-6.663 .001-13.296 .879-19.73 2.61L82.93 29.27c17.893-3.5 36.442 .331 51.484 10.635 15.042 10.304 25.316 26.216 28.516 44.165ZM28 96c.005-4.387 .43-8.764 1.27-13.07l57.34 57.34C84.879 146.704 84.001 153.337 84 160c0 1 0 2 .07 2.93C51.655 157.112 28.048 128.933 28 96ZM93.07 171.93c1 0 2 .07 2.93 .07 6.663-.001 13.296-.879 19.73-2.61l57.34 57.34c-17.893 3.5-36.443-.331-51.484-10.635C106.544 205.792 96.27 189.879 93.07 171.93Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
