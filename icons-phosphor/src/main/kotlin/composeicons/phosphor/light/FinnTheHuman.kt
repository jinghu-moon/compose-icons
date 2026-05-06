package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorLightIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 106h-80c-20.987 0-38 17.013-38 38v8c0 20.987 17.013 38 38 38h80c20.987 0 38-17.013 38-38v-8c0-20.987-17.013-38-38-38ZM194 152c0 14.359-11.641 26-26 26h-80C73.641 178 62 166.359 62 152v-8c0-14.359 11.641-26 26-26h80c14.359 0 26 11.641 26 26ZM208 42c-14.251 .016-26.531 10.041-29.4 24h-101.2C74.333 50.896 60.32 40.573 44.985 42.122 29.65 43.671 17.985 56.587 18 72v80c.044 38.642 31.358 69.956 70 70h80c38.642-.044 69.956-31.358 70-70v-80C238 55.431 224.569 42 208 42ZM226 152c-.039 32.017-25.983 57.961-58 58h-80C55.983 209.961 30.039 184.017 30 152v-80C30 62.059 38.059 54 48 54c9.941 0 18 8.059 18 18 0 3.314 2.686 6 6 6h112c3.314 0 6-2.686 6-6 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18ZM102 148c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM174 148c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
