package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorThinIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211 211.27l-.06-.12L164.53 112.29l21.68-34v-.1c2.29-3.795 2.29-8.545 0-12.34l-.15-.24L164 34v-26c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v25.82l-6.13 7.67C144.557 48.136 136.509 52.006 128 52.006c-8.509 0-16.557-3.869-21.87-10.516L100 33.82v-25.82C100 5.791 98.209 4 96 4 93.791 4 92 5.791 92 8v26L69.86 65.59l-.15 .24c-2.29 3.795-2.29 8.545 0 12.34 .019 .032 .035 .066 .05 .1l21.68 34L45 211.15l-.06 .12c-1.592 3.713-1.21 7.978 1.018 11.348 2.228 3.37 6.002 5.393 10.042 5.382h144c4.029-.01 7.785-2.041 9.998-5.407 2.214-3.367 2.59-7.62 1.002-11.323ZM76.54 74c-.715-1.238-.715-2.762 0-4L96.21 41.9l3.68 4.59c6.832 8.539 17.175 13.509 28.11 13.509 10.936 0 21.278-4.971 28.11-13.509l3.68-4.59L179.49 70c.715 1.238 .715 2.762 0 4l-21.65 34h-59.65ZM203.33 218.2c-.73 1.129-1.986 1.807-3.33 1.8h-144c-1.344 .007-2.6-.671-3.33-1.8-.747-1.097-.883-2.5-.36-3.72L98.54 116h58.92l46.23 98.48c.523 1.22 .387 2.623-.36 3.72Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
