package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorRegularIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128h-47.06l-28-56h19.06c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h19.06L55.06 128h-47.06c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h39.06L24.84 188.42c-1.973 3.952-.371 8.755 3.58 10.73 1.11 .561 2.336 .852 3.58 .85 3.035 .006 5.812-1.706 7.17-4.42L64.94 144h126.12l25.78 51.58c1.357 2.711 4.129 4.422 7.16 4.42 1.24 .001 2.463-.29 3.57-.85 3.951-1.975 5.553-6.778 3.58-10.73L208.94 144h39.06c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72.94 128l28-56h54.12l28 56Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
