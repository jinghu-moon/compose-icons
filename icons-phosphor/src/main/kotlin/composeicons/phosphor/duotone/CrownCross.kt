package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorDuotoneIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116c0 52-48 68-48 68v24c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-24c0 0-48-16-48-68C24 87.281 47.281 64 76 64c28.72 0 52 19.28 52 48 0-28.72 23.28-48 52-48 28.719 0 52 23.281 52 52Z"),
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
                pathData = parseSvgPathData("M180 56c-17.74 0-33.21 6.48-44 17.16v-33.16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v33.16C109.21 62.48 93.74 56 76 56 42.879 56.039 16.039 82.879 16 116c0 29.86 14.54 48.85 26.73 59.52 6.406 5.583 13.566 10.235 21.27 13.82v18.66c0 8.837 7.163 16 16 16h96c8.837 0 16-7.163 16-16v-18.66c7.704-3.585 14.864-8.237 21.27-13.82C225.46 164.85 240 145.86 240 116 239.961 82.879 213.121 56.039 180 56ZM181.47 176.41c-3.267 1.089-5.47 4.146-5.47 7.59v24h-96v-24c0-3.444-2.203-6.501-5.47-7.59C74.1 176.27 32 161.7 32 116 32.028 91.711 51.711 72.028 76 72c25.5 0 44 16.82 44 40v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c0-23.18 18.5-40 44-40 24.289 .028 43.972 19.711 44 44 0 45.4-40.82 59.83-42.53 60.41Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
