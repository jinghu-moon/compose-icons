package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorDuotoneIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 136c.002 18.821-10.996 35.907-28.128 43.699-17.132 7.792-37.238 4.852-51.422-7.519L160 224h-64l15.55-51.82c-14.184 12.371-34.29 15.311-51.422 7.519C42.996 171.907 31.998 154.821 32 136 32 72 128 24 128 24c0 0 96 48 96 112Z"),
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
                pathData = parseSvgPathData("M131.58 16.85c-2.253-1.128-4.907-1.128-7.16 0C120.32 18.9 24 67.84 24 136c-.007 18.087 8.721 35.064 23.436 45.582 14.715 10.518 33.603 13.281 50.714 7.418l-9.81 32.7c-.727 2.422-.266 5.045 1.243 7.074 1.509 2.029 3.888 3.225 6.417 3.226h64c2.529-.001 4.908-1.197 6.417-3.226 1.509-2.029 1.97-4.652 1.243-7.074L157.85 189c17.111 5.862 35.999 3.099 50.714-7.418C223.279 171.064 232.007 154.087 232 136 232 67.84 135.68 18.9 131.58 16.85ZM176 176c-9.666 .001-19.005-3.498-26.29-9.85-2.686-2.342-6.598-2.625-9.593-.694-2.995 1.931-4.352 5.611-3.327 9.024L149.25 216h-42.5l12.46-41.52c1.025-3.413-.332-7.093-3.327-9.024-2.995-1.931-6.907-1.648-9.593 .694-11.82 10.308-28.574 12.757-42.85 6.264C49.163 165.921 39.999 151.684 40 136 40 106.12 64.41 79.45 84.89 62.34 98.315 51.257 112.748 41.454 128 33.06c15.252 8.394 29.685 18.197 43.11 29.28C208.21 93.34 216 119.51 216 136c0 22.091-17.909 40-40 40Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
