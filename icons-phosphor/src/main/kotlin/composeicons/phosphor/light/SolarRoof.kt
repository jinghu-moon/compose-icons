package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorLightIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.37 125.32l-40-80C204.354 43.285 202.275 41.999 200 42h-144c-2.275-.001-4.354 1.285-5.37 3.32l-40 80c-.412 .833-.628 1.75-.63 2.68v56c0 7.732 6.268 14 14 14h208c7.732 0 14-6.268 14-14v-56c-.002-.93-.218-1.847-.63-2.68ZM99.71 122l-14-28h34.58l14 28ZM100.29 54l14 28h-34.58l-14-28ZM148.29 54l14 28h-34.58l-14-28ZM147.71 122l-14-28h34.58l14 28ZM195.71 122l-14-28h34.58l14 28ZM210.29 82h-34.58l-14-28h34.58ZM22 184v-54.58l34-68 34 68v56.58h-66c-1.105 0-2-.895-2-2ZM232 186h-130v-52h132v50c0 1.105-.895 2-2 2Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
