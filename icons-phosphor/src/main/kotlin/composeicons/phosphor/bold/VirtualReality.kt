package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorBoldIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M127 104.73l-24 56c-1.891 4.413-6.229 7.274-11.03 7.274-4.801 0-9.139-2.861-11.03-7.274L56.94 104.73c-2.612-6.092 .208-13.148 6.3-15.76 6.092-2.612 13.148 .208 15.76 6.3l13 30.27L105 95.27c2.874-5.629 9.622-8.063 15.428-5.567 5.806 2.497 8.68 9.068 6.572 15.027ZM256 128c-.05 46.371-37.629 83.95-84 84h-88C37.608 212 0 174.392 0 128 0 81.608 37.608 44 84 44h88c46.371 .05 83.95 37.629 84 84ZM232 128C231.961 94.879 205.121 68.039 172 68h-88C50.863 68 24 94.863 24 128c0 33.137 26.863 60 60 60h88c33.121-.039 59.961-26.879 60-60ZM200 120c.005 7.748-2.814 15.231-7.93 21.05l5.69 8c2.623 3.482 3.152 8.112 1.382 12.096-1.771 3.984-5.563 6.693-9.905 7.079-4.342 .385-8.552-1.615-10.996-5.225l-7.91-11.06c-.77 .05-1.55 .09-2.33 .09h-8v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56.03c0-6.627 5.373-12 12-12h20c17.673 0 32 14.327 32 32ZM160 128h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
