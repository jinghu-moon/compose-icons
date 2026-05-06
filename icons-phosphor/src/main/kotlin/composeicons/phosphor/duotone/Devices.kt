package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorDuotoneIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 64v16h-24c-8.837 0-16 7.163-16 16v80h-120c-8.837 0-16-7.163-16-16v-96C24 55.163 31.163 48 40 48h144c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 72h-16v-8C208 50.745 197.255 40 184 40h-144C26.745 40 16 50.745 16 64v96c0 13.255 10.745 24 24 24h112v8c0 13.255 10.745 24 24 24h48c13.255 0 24-10.745 24-24v-96C248 82.745 237.255 72 224 72ZM40 168c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8v8h-16c-13.255 0-24 10.745-24 24v72ZM232 192c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM136 208c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM216 112c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
