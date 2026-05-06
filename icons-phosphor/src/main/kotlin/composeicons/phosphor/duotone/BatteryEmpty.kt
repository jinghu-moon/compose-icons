package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) return _batteryEmpty!!
        _batteryEmpty = phosphorDuotoneIcon(
            name = "BatteryEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 80v96c0 8.837-7.163 16-16 16h-168c-8.837 0-16-7.163-16-16v-96C16 71.163 23.163 64 32 64h168c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M200 56h-168C18.745 56 8 66.745 8 80v96c0 13.255 10.745 24 24 24h168c13.255 0 24-10.745 24-24v-96C224 66.745 213.255 56 200 56ZM208 176c0 4.418-3.582 8-8 8h-168c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h168c4.418 0 8 3.582 8 8ZM256 96v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
