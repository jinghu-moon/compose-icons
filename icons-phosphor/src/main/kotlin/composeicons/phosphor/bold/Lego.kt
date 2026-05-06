package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorBoldIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.36 77.28h0L203.74 56.45C201.38 40.24 183 28 160 28c-24.67 0-44 14.06-44 32 .006 3.905 .928 7.755 2.69 11.24l-9.4 4.7C101.56 71 91.35 68 80 68 55.33 68 36 82.06 36 100c.006 3.905 .928 7.755 2.69 11.24l-28.06 14C6.557 127.278 3.989 131.446 4 136h0v56c.001 4.543 2.567 8.697 6.63 10.73l64 32c3.38 1.691 7.36 1.691 10.74 0l160-80c4.063-2.033 6.629-6.187 6.63-10.73v-56c-.006-4.542-2.576-8.691-6.64-10.72ZM80 154.58 42.83 136l15.81-7.9c6.812 2.628 14.058 3.951 21.36 3.9 24.67 0 44-14.06 44-32-.006-1.469-.14-2.934-.4-4.38l15-7.52c6.825 2.633 14.085 3.956 21.4 3.9 14.72 0 27.53-5 35.47-12.85L213.17 88ZM160 52c12.91 0 20 6 20 8 0 2-7.09 8-20 8-12.91 0-20-6-20-8 0-2 7.09-8 20-8ZM80 92c12.91 0 20 6 20 8 0 2-7.09 8-20 8-12.91 0-20-6-20-8 0-2 7.09-8 20-8ZM28 155.42l40 20v29.16l-40-20ZM92 204.58v-29.16l136-68v29.16Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
