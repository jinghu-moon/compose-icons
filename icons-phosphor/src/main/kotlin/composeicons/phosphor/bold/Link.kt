package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorBoldIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M117.18 188.74c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-5.12 5.12C101.082 221.879 86.154 228.05 70.6 228h0C46.885 228.008 25.501 213.725 16.424 191.815 7.348 169.906 12.367 144.686 29.14 127.92L63.89 93.17C78.942 78.121 100.966 72.409 121.435 78.246c20.469 5.838 36.167 22.308 41.015 43.034 1.073 4.212-.215 8.675-3.368 11.668-3.153 2.992-7.677 4.045-11.828 2.753-4.15-1.292-7.277-4.728-8.174-8.981-2.877-12.234-12.153-21.951-24.239-25.393-12.087-3.442-25.09-.07-33.981 8.813L46.11 144.89c-9.906 9.898-12.874 24.788-7.519 37.727 5.354 12.939 17.976 21.379 31.979 21.383h0c9.19 .026 18.008-3.625 24.49-10.14l5.11-5.12c2.252-2.263 5.313-3.534 8.505-3.534 3.192 0 6.253 1.272 8.505 3.534ZM226.83 45.17c-22.903-22.895-60.027-22.895-82.93 0l-5.11 5.11c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l5.12-5.12c13.531-13.531 35.469-13.531 49 0 13.531 13.531 13.531 35.469 0 49l-34.81 34.7c-6.48 6.517-15.3 10.168-24.49 10.14h0c-16.069-.011-30.02-11.076-33.69-26.72-1.502-6.456-7.954-10.472-14.41-8.97-6.456 1.502-10.472 7.954-8.97 14.41 6.199 26.495 29.81 45.244 57.02 45.28h.05c15.561 .043 30.493-6.14 41.47-17.17l34.75-34.75c10.996-10.994 17.174-25.906 17.174-41.455 0-15.549-6.178-30.461-17.174-41.455Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
