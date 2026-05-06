package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorRegularIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.16 124.42l-40-80C205.803 41.709 203.031 39.998 200 40h-144c-3.031-.002-5.803 1.709-7.16 4.42l-40 80C8.289 125.533 8.001 126.758 8 128v56c0 8.837 7.163 16 16 16h208c8.837 0 16-7.163 16-16v-56c-.001-1.242-.289-2.467-.84-3.58ZM99.06 56l12 24h-30.12l-12-24ZM147.06 56l12 24h-30.12l-12-24ZM100.94 120l-12-24h30.12l12 24ZM148.94 120l-12-24h30.12l12 24ZM196.94 120l-12-24h30.12l12 24ZM207.06 80h-30.12l-12-24h30.12ZM24 129.89l32-64 32 64v54.11h-64ZM104 184v-48h128v48Z"),
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
