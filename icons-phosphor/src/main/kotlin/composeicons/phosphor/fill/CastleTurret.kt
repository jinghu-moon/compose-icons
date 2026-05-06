package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorFillIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 216h-16v-100.69L211.31 104c3.014-2.99 4.704-7.064 4.69-11.31v-44.69c0-8.837-7.163-16-16-16h-20c-4.418 0-8 3.582-8 8v24h-24v-24c0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8v24h-24v-24c0-4.418-3.582-8-8-8h-20C47.163 32 40 39.163 40 48v44.69c-.014 4.246 1.676 8.32 4.69 11.31L56 115.31v100.69h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 168c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v48h-32Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
