package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorBoldIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 188h-37L170.4 171.2C168.889 169.186 166.518 168 164 168h-72c-2.518 0-4.889 1.186-6.4 3.2L73 188h-37v-120h184ZM82 152h92c18.778 0 34-15.222 34-34C208 99.222 192.778 84 174 84h-92C63.222 84 48 99.222 48 118c0 18.778 15.222 34 34 34ZM82 108c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10ZM184 118c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM141.5 128h-27c2-6.517 2-13.483 0-20h27c-2 6.517-2 13.483 0 20Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
