package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorThinIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.3 74.5 129.1 44.15c-.543-.151-1.112-.189-1.67-.11L22.3 59.06C16.402 59.93 12.025 64.979 12 70.94v114.12c.025 5.961 4.402 11.01 10.3 11.88l105.13 15c.19 .015 .38 .015 .57 0 .372-0 .742-.05 1.1-.15L235.3 181.5c5.137-1.469 8.683-6.157 8.7-11.5v-84c-.017-5.343-3.563-10.031-8.7-11.5ZM96 124h-20v-64.53l48-6.86v150.78L76 196.53v-64.53h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM20 185.06v-114.12c-.02-2.004 1.446-3.714 3.43-4L68 60.61v63.39h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v63.39L23.43 189c-1.961-.282-3.42-1.958-3.43-3.94ZM236 170c-.003 1.783-1.185 3.35-2.9 3.84L132 202.7v-149.4L233.1 82.19c1.704 .487 2.884 2.038 2.9 3.81Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
