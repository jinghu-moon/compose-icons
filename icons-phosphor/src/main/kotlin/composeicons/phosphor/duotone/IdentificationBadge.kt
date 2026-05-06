package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorDuotoneIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 32h-144c-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM128 168C110.327 168 96 153.673 96 136c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M75.19 198.4c1.698 1.276 3.834 1.825 5.937 1.525 2.103-.3 4-1.424 5.273-3.125C96.22 183.706 111.633 176 128 176c16.367 0 31.78 7.706 41.6 20.8 2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2C175.316 177.703 165.87 170.225 155 165.51c12.193-11.132 16.293-28.611 10.323-44.004C159.354 106.113 144.54 95.97 128.03 95.97c-16.51 0-31.324 10.144-37.293 25.536-5.97 15.393-1.869 32.872 10.323 44.004-10.892 4.706-20.36 12.184-27.46 21.69-2.653 3.532-1.941 8.546 1.59 11.2ZM128 112c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24ZM200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM200 216h-144v-176h144ZM88 64c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8Z"),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
