package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorRegularIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C79.422 16.055 40.055 55.422 40 104c0 31.4 14.51 64.68 42 96.25 12.352 14.266 26.255 27.111 41.45 38.3 2.756 1.93 6.424 1.93 9.18 0C147.797 227.357 161.673 214.511 174 200.25 201.45 168.68 216 135.4 216 104 215.945 55.422 176.578 16.055 128 16ZM128 222C111.47 209 56 161.25 56 104 56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 57.23-55.47 105-72 118ZM168 104c0 4.418-3.582 8-8 8h-24v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24h24c4.418 0 8 3.582 8 8Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
