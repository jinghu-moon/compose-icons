package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorRegularIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 58.34l-48-48c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L204.69 40l-71 71L99.31 76.68c-6.248-6.243-16.372-6.243-22.62 0L20.69 132.68C17.676 135.675 15.987 139.751 16 144v80c0 8.837 7.163 16 16 16h80c4.246 .014 8.32-1.676 11.31-4.69l56-56c6.243-6.248 6.243-16.372 0-22.62L145 122.34 216 51.34l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM168 168l-56 56h-80v-80L88 88l34.34 34.34-40 40c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l40-40Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
