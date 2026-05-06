package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorFillIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM96 48h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM180.81 198.4c-1.698 1.276-3.834 1.825-5.937 1.525-2.103-.3-4-1.424-5.273-3.125C159.78 183.706 144.367 176 128 176c-16.367 0-31.78 7.706-41.6 20.8-2.651 3.535-7.665 4.251-11.2 1.6-3.535-2.651-4.251-7.665-1.6-11.2C80.684 177.703 90.13 170.225 101 165.51 88.807 154.378 84.707 136.899 90.677 121.506c5.97-15.393 20.784-25.536 37.293-25.536 16.51 0 31.324 10.144 37.293 25.536 5.97 15.393 1.869 32.872-10.323 44.004 10.892 4.706 20.36 12.184 27.46 21.69 2.653 3.532 1.941 8.546-1.59 11.2ZM152 136c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
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
