package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorLightIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 67.76l-40-40C171.116 26.634 169.591 26.001 168 26h-80C80.268 26 74 32.268 74 40v18h-18C48.268 58 42 64.268 42 72v144c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-18h18c7.732 0 14-6.268 14-14v-112c-.001-1.591-.634-3.116-1.76-4.24ZM170 216c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h77.51L170 106.49ZM202 184c0 1.105-.895 2-2 2h-18v-82c-.001-1.591-.634-3.116-1.76-4.24l-40-40C139.116 58.634 137.591 58.001 136 58h-50v-18c0-1.105 .895-2 2-2h77.51L202 74.49ZM142 152c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM142 184c0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
