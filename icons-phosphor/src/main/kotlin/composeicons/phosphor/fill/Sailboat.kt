package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorFillIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 140v-67.15c-.019-1.672 1.004-3.179 2.565-3.778 1.561-.6 3.329-.166 4.435 1.088l55 60.46c2.609 2.865 2.79 7.187 .43 10.26-1.59 2.005-4.021 3.158-6.58 3.12h-51.85c-2.209 0-4-1.791-4-4ZM247.21 172.53C245.877 169.76 243.074 167.999 240 168h-96v-160C143.982 4.621 141.843 1.618 138.655 .497 135.468-.625 131.92 .377 129.79 3L25.79 131c-1.918 2.396-2.297 5.679-.974 8.448 1.323 2.77 4.114 4.538 7.184 4.552h96v24h-112c-3.077-.002-5.882 1.761-7.215 4.534-1.333 2.773-.958 6.065 .965 8.466l29.6 37c3.03 3.801 7.629 6.01 12.49 6h152.32c4.861 .01 9.46-2.199 12.49-6l29.6-37c1.923-2.404 2.296-5.697 .96-8.47Z"),
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
