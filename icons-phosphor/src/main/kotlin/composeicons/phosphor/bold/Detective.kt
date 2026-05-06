package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorBoldIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 104h-24.79L175.82 44.24c-3.641-5.001-9.391-8.036-15.575-8.22-6.183-.184-12.104 2.504-16.035 7.28L131.39 58.16c-.1 .11-.2 .23-.29 .35-.76 .932-1.898 1.472-3.1 1.472-1.202 0-2.34-.541-3.1-1.472-.09-.12-.19-.24-.29-.35L111.79 43.3c-3.932-4.776-9.852-7.464-16.035-7.28-6.183 .184-11.934 3.219-15.575 8.22L36.79 104h-24.79C5.373 104 0 109.373 0 116c0 6.627 5.373 12 12 12h232c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96.62 62.45l9.69 11.24c5.318 6.514 13.281 10.293 21.69 10.293 8.409 0 16.372-3.779 21.69-10.293l9.69-11.24L189.55 104h-123.1ZM180 140c-17.462 .021-32.9 11.349-38.16 28h-27.68C108.236 149.162 89.451 137.466 69.932 140.463 50.413 143.46 36.002 160.253 36.002 180c0 19.747 14.411 36.54 33.93 39.537 19.519 2.997 38.304-8.699 44.228-27.537h27.68c6.156 19.576 26.127 31.317 46.226 27.178 20.099-4.139 33.805-22.817 31.725-43.232C217.712 155.531 200.521 140.001 180 140ZM76 196c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM180 196c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
