package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorRegularIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 216h-16v-100.69L211.31 104c3.014-2.99 4.704-7.064 4.69-11.31v-44.69c0-8.837-7.163-16-16-16h-24c-4.418 0-8 3.582-8 8v24h-16v-24c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8v24h-16v-24c0-4.418-3.582-8-8-8h-24C47.163 32 40 39.163 40 48v44.69c-.014 4.246 1.676 8.32 4.69 11.31L56 115.31v100.69h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM69.66 106.34 56 92.69v-44.69h16v24c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-24h16v24c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-24h16v44.69l-13.66 13.65c-1.5 1.502-2.342 3.538-2.34 5.66v104h-24v-48c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32v48h-24v-104c.002-2.122-.84-4.158-2.34-5.66ZM144 216h-32v-48c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
