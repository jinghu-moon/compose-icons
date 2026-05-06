package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorBoldIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 84c-6.627 0-12 5.373-12 12v8h-15.13L187.94 54.8C187.654 51.797 186.247 49.012 184 47L141.1 8.89l-.3-.25c-7.416-6.177-18.184-6.177-25.6 0l-.3 .25L72 47c-2.26 1.993-3.688 4.763-4 7.76L63.13 104h-15.13v-8C48 89.373 42.627 84 36 84 29.373 84 24 89.373 24 96v20c0 6.627 5.373 12 12 12h24.72l-8.63 86.1c-.535 5.609 1.321 11.184 5.111 15.354 3.791 4.169 9.164 6.546 14.799 6.546h112c5.643-.001 11.022-2.386 14.812-6.567 3.79-4.18 5.638-9.767 5.088-15.383L195.28 128h24.72c6.627 0 12-5.373 12-12v-20c0-6.627-5.373-12-12-12ZM128 29.36 144.46 44h-32.92ZM90.86 68h74.28l3.61 36h-28.75v-8c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8h-28.75ZM76.42 212l3.21-32h96.74l3.21 32ZM174 156h-92l2.8-28h86.32Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
