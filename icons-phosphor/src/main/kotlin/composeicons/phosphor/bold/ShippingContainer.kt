package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorBoldIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.5 66.8 131.3 36.46c-1.625-.462-3.328-.578-5-.34l-105.13 15C11.332 52.57 4.032 60.996 4 70.94v114.12c.042 9.937 7.339 18.352 17.17 19.8l105.13 15c.563 .08 1.131 .12 1.7 .12 1.116 .001 2.227-.154 3.3-.46L237.5 189.2C246.055 186.722 251.957 178.907 252 170v-84c-.04-8.908-5.943-16.725-14.5-19.2ZM92 116h-8v-49.59l32-4.57v132.32L84 189.59v-49.59h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM28 74.41 60 69.84v46.16h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v46.16L28 181.59ZM228 167l-88 25.14v-128.23l88 25.14Z"),
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
