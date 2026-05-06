package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorBoldIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 112c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM96 128c0-6.627-5.373-12-12-12h-39.53C47.516 94.619 58.692 75.238 75.67 61.89L95.38 96c2.101 3.797 6.088 6.163 10.428 6.189 4.339 .026 8.355-2.293 10.501-6.064 2.146-3.771 2.09-8.408-.149-12.125l-22-38C91.35 41.128 86.618 37.664 81.125 36.457 75.631 35.251 69.883 36.413 65.29 39.66 39.435 57.89 22.888 86.553 20.03 118.06c-.503 5.646 1.387 11.244 5.21 15.43 3.788 4.146 9.144 6.508 14.76 6.51h44c6.627 0 12-5.373 12-12ZM235.92 118.06C233.065 86.555 216.517 57.894 190.66 39.67c-4.592-3.248-10.339-4.412-15.832-3.207-5.494 1.205-10.226 4.666-13.038 9.537L139.84 84c-3.168 5.724-1.167 12.931 4.498 16.202 5.665 3.272 12.907 1.402 16.282-4.202L180.33 61.87c16.982 13.352 28.159 32.742 31.2 54.13h-39.53c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44c5.598-.016 10.934-2.377 14.71-6.51 3.823-4.186 5.713-9.784 5.21-15.43ZM160.4 160.11c-3.314-5.741-10.654-7.709-16.395-4.395-5.741 3.314-7.709 10.654-4.395 16.395L159.19 206c-20.029 7.973-42.351 7.973-62.38 0l19.58-33.91c3.314-5.741 1.346-13.081-4.395-16.395-5.741-3.314-13.081-1.346-16.395 4.395L73.78 197.89c-2.809 4.863-3.444 10.684-1.749 16.039 1.695 5.355 5.563 9.75 10.659 12.111 28.753 13.253 61.867 13.253 90.62 0 5.096-2.361 8.964-6.757 10.659-12.111 1.695-5.355 1.06-11.175-1.749-16.039Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
