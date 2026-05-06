package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorThinIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 80C235.999 55.737 221.385 33.863 198.97 24.574 176.556 15.285 150.753 20.41 133.59 37.56L63.52 106.83c-2.26 2.242-3.528 5.296-3.52 8.48v75L29.17 221.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L65.66 196h75c3.18-0 6.23-1.263 8.48-3.51h0L218 122.83h0l.4-.4C229.697 111.205 236.035 95.926 236 80ZM139.23 43.23c20.218-19.81 52.567-19.811 72.786-.001 20.218 19.81 20.878 52.153 1.484 72.771h-67.84L186.83 74.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L116 134.34v-68.15ZM68 115.31c.002-1.053 .419-2.062 1.16-2.81L108 74.1v68.24l-40 40ZM143.51 186.83c-.748 .748-1.762 1.168-2.82 1.17h-67l64-64h68Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
