package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorBoldIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L84.76 98.27 33.86 149.17c-3.764 3.741-5.874 8.833-5.86 14.14v44.69c0 11.046 8.954 20 20 20h44.69c5.307 .015 10.4-2.095 14.14-5.86l47.43-47.42 44.87 49.35c2.868 3.233 7.252 4.674 11.479 3.773 4.226-.901 7.642-4.005 8.942-8.126 1.3-4.121 .284-8.623-2.661-11.786ZM111.43 127.61 72 167 61 156l40-39.95ZM52 181l23 23h-23ZM100 195 89 184l38.62-38.62 10.51 11.56ZM230.15 70.54 185.46 25.86c-7.81-7.808-20.47-7.808-28.28 0l-36 36c-4.228 4.276-4.639 11.02-.961 15.778 3.678 4.757 10.309 6.058 15.511 3.042L147.08 92c-4.109 4.758-3.85 11.88 .594 16.327 4.444 4.447 11.566 4.71 16.326 .603L175 120l-.54 .53c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L230.13 98.86c3.764-3.75 5.882-8.843 5.886-14.156 .004-5.313-2.107-10.409-5.866-14.164ZM192 103 153 64 171.34 45.66l39 39Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
