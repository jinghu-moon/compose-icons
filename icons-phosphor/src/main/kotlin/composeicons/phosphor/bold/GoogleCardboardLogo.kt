package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorBoldIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h64c3.184 .003 6.238-1.26 8.49-3.51L128 185l23.51 23.52c2.257 2.239 5.311 3.49 8.49 3.48h64c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 188h-55L142.17 165.17c-7.81-7.808-20.47-7.808-28.28 0L91 188h-55v-120h184ZM82 160c18.778 0 34-15.222 34-34C116 107.222 100.778 92 82 92 63.222 92 48 107.222 48 126c0 18.778 15.222 34 34 34ZM82 116c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM174 160c18.778 0 34-15.222 34-34C208 107.222 192.778 92 174 92c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34ZM174 116c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
