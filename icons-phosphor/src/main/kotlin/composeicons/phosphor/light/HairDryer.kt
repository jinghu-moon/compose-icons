package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorLightIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 88C198 71.431 184.569 58 168 58c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30ZM168 106c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM162.85 214c5.489-.003 10.47-3.213 12.74-8.21l31.8-69.94c20.19-16.635 27.766-44.152 18.936-68.777C217.496 42.448 194.16 26.015 168 26c-.335 .001-.669 .028-1 .08L29.7 49C22.96 50.123 18.015 55.947 18 62.78v50.44c.015 6.833 4.96 12.657 11.7 13.78L130 143.75v56.25c0 7.732 6.268 14 14 14h2v2c0 20.987 17.013 38 38 38h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-16c-14.359 0-26-11.641-26-26v-2ZM30 113.22v-50.44c-.014-.988 .696-1.837 1.67-2L168.48 38c27.614 0 50 22.386 50 50 0 27.614-22.386 50-50 50L31.67 115.2c-.967-.162-1.674-1-1.67-1.98ZM142 200v-54.25l25 4.17c.331 .052 .665 .079 1 .08 7.349 .005 14.64-1.302 21.53-3.86l-24.86 54.69c-.325 .713-1.037 1.17-1.82 1.17h-18.85c-1.105 0-2-.895-2-2Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
