package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorRegularIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 112c0-4.418 3.582-8 8-8h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8ZM96 152h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 64v120c0 13.255-10.745 24-24 24h-176C18.788 208 8.061 197.322 8 184.11v-96.11c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-120C40 55.163 47.163 48 56 48h160c8.837 0 16 7.163 16 16ZM216 64h-160v120c.004 2.725-.459 5.431-1.37 8h153.37c4.418 0 8-3.582 8-8Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
