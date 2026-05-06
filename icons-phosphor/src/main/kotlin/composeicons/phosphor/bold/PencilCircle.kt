package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorBoldIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.37 51.6C167.92 15.125 110.78 9.48 67.897 38.117 25.015 66.755 8.335 121.697 28.06 169.341c19.725 47.644 70.36 74.718 120.935 64.663C199.571 223.949 235.999 179.565 236 128 235.999 99.348 224.623 71.868 204.37 51.6ZM92 200c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v11.11c-8.317-1.19-16.407-3.624-24-7.22ZM140 200c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v3.89c-7.593 3.596-15.683 6.03-24 7.22ZM106.14 148h43.72l7.57 16.42c-10.632-1.616-21.43 1.612-29.43 8.8-8.002-7.184-18.799-10.409-29.43-8.79ZM117.22 124 128 100.62 138.78 124ZM188 186.79v-10.79c-.007-1.726-.382-3.43-1.1-5l-48-104C136.941 62.745 132.684 60.019 128 60.019c-4.684 0-8.941 2.726-10.9 6.981l-48 104c-.718 1.57-1.093 3.274-1.1 5v10.77C35.688 153.792 36.048 100.919 68.805 68.384c32.757-32.535 85.632-32.535 118.389 0 32.757 32.535 33.117 85.409 .805 118.386Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
