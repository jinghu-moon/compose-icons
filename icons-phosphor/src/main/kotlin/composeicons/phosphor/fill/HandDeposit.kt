package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorFillIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 198.65v41.35c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-41.35C215.925 177.893 207.232 158.1 192 144v58.35c-.003 3.535-2.326 6.65-5.714 7.66-3.388 1.01-7.037-.323-8.976-3.28L166.63 190.42c-.08-.12-.16-.25-.23-.38-3.267-5.769-10.591-7.797-16.36-4.53-5.769 3.267-7.797 10.591-4.53 16.36l22.13 33.79c2.419 3.698 1.383 8.656-2.315 11.075-3.698 2.419-8.656 1.383-11.075-2.315l-22.26-34-.24-.38c-.38-.66-.73-1.33-1.05-2h-74.7c-4.418 0-8-3.582-8-8v-104.04C48 87.163 55.163 80 64 80h48v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h48c8.837 0 16 7.163 16 16v27.62c24.931 16.847 39.908 44.941 40 75.03ZM128 35.31l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-32-32C124.159 8.838 122.123 7.994 120 7.994c-2.123 0-4.159 .844-5.66 2.346l-32 32c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L112 35.31v44.69h16Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
