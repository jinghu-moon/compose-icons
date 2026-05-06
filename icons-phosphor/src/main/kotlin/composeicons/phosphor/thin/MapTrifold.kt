package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorThinIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.46 52.85c-.97-.758-2.235-1.028-3.43-.73L160.47 67.76 97.79 36.42c-.855-.426-1.834-.533-2.76-.3l-64 16C29.249 52.565 28 54.165 28 56v144c-.002 1.238 .569 2.408 1.548 3.167 .978 .759 2.253 1.022 3.452 .713L95.56 188.24l62.68 31.34c.855 .426 1.834 .533 2.76 .3l64-16c1.769-.457 3.003-2.053 3-3.88v-144c-.001-1.231-.569-2.393-1.54-3.15ZM100 46.47l56 28v135.06l-56-28ZM36 59.12l56-14v135.76l-56 14ZM220 196.88l-56 14v-135.76L220 61.12Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
