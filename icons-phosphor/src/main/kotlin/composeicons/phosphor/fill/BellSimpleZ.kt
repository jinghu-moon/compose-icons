package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorFillIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM221.85 192c-2.826 4.979-8.125 8.04-13.85 8h-160c-5.725-.008-11.009-3.073-13.858-8.039-2.848-4.966-2.826-11.075 .058-16.021C39.75 166.38 48 139.34 48 104 48 59.817 83.817 24 128 24c44.183 0 80 35.817 80 80 0 35.33 8.26 62.38 13.81 71.94 2.914 4.954 2.925 11.095 .03 16.06ZM152 144c0-4.418-3.582-8-8-8h-17l23.7-35.56c1.642-2.461 1.792-5.628 .389-8.234C149.686 89.601 146.959 87.983 144 88h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h17.05l-23.7 35.56c-1.637 2.454-1.791 5.61-.4 8.211 1.391 2.602 4.1 4.227 7.05 4.229h32c4.418 0 8-3.582 8-8Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
