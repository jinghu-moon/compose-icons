package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorRegularIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 80h-112v-24C96 38.327 110.327 24 128 24c15.37 0 29.2 11 32.16 25.59 .915 4.291 5.115 7.045 9.414 6.173 4.3-.872 7.095-5.044 6.266-9.353C171.32 24.15 151.2 8 128 8 101.502 8.028 80.028 29.502 80 56v24h-32C39.163 80 32 87.163 32 96v112c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM208 208h-160v-112h160v112ZM128 112c-13.899 .005-25.691 10.204-27.697 23.957-2.007 13.753 6.379 26.897 19.697 30.873v17.17c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-17.17c13.318-3.976 21.704-17.119 19.697-30.873C153.691 122.204 141.899 112.005 128 112ZM128 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
