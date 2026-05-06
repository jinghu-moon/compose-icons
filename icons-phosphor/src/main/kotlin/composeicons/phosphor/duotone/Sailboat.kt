package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorDuotoneIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 176l-29.6 37c-1.517 1.895-3.813 2.998-6.24 3h-152.32c-2.427-.002-4.723-1.105-6.24-3L16 176ZM136 8 32 136h104Z"),
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
                pathData = parseSvgPathData("M247.21 172.53C245.877 169.76 243.074 167.999 240 168h-96v-24h72c3.166-0 6.034-1.868 7.315-4.763 1.281-2.895 .734-6.274-1.395-8.617L144 44.91v-36.91C143.982 4.621 141.843 1.618 138.655 .497 135.468-.625 131.92 .377 129.79 3L25.79 131c-1.918 2.396-2.297 5.679-.974 8.448 1.323 2.77 4.114 4.538 7.184 4.552h96v24h-112c-3.077-.002-5.882 1.761-7.215 4.534-1.333 2.773-.958 6.065 .965 8.466l29.6 37c3.03 3.801 7.629 6.01 12.49 6h152.32c4.861 .01 9.46-2.199 12.49-6l29.6-37c1.923-2.404 2.296-5.697 .96-8.47ZM197.92 128h-53.92v-59.31ZM48.81 128 128 30.53v97.47ZM204.16 208h-152.32L32.64 184h190.72Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
