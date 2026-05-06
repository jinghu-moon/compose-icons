package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorFillIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 197.66l-32 32c-2.288 2.291-5.731 2.976-8.722 1.737C185.947 230.158 183.997 227.238 184 224v-24h-104c-4.418 0-8-3.582-8-8v-112h-24c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L74.34 34.34C75.841 32.838 77.877 31.994 80 31.994c2.123 0 4.159 .844 5.66 2.346l32 32c2.291 2.288 2.976 5.731 1.737 8.722C118.158 78.053 115.238 80.003 112 80h-24v104h96v-24c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
