package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorDuotoneIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 104l-48 48v-96Z"),
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
                pathData = parseSvgPathData("M229.66 98.34l-48-48c-2.288-2.291-5.731-2.976-8.722-1.737C169.947 49.842 167.997 52.762 168 56v40h-3C117.549 95.955 76.092 128.051 64.25 174c-1.105 4.28 1.47 8.645 5.75 9.75 4.28 1.105 8.645-1.47 9.75-5.75C89.786 139.13 124.856 111.98 165 112h3v40c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l48-48c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM184 132.69v-57.38L212.69 104ZM200 216c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v120h152c4.418 0 8 3.582 8 8Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
