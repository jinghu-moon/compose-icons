package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorLightIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 74.000 L 152.000 74.000 C 148.686 74.000 146.000 76.686 146.000 80.000 L 146.000 176.000 C 146.000 179.314 148.686 182.000 152.000 182.000 L 176.000 182.000 C 205.823 182.000 230.000 157.823 230.000 128.000 C 230.000 98.177 205.823 74.000 176.000 74.000 ZM 176.000 170.000 L 158.000 170.000 L 158.000 86.000 L 176.000 86.000 C 199.196 86.000 218.000 104.804 218.000 128.000 C 218.000 151.196 199.196 170.000 176.000 170.000 ZM 114.000 176.000 L 114.000 134.000 L 54.000 134.000 L 54.000 176.000 C 54.000 179.314 51.314 182.000 48.000 182.000 C 44.686 182.000 42.000 179.314 42.000 176.000 L 42.000 80.000 C 42.000 76.686 44.686 74.000 48.000 74.000 C 51.314 74.000 54.000 76.686 54.000 80.000 L 54.000 122.000 L 114.000 122.000 L 114.000 80.000 C 114.000 76.686 116.686 74.000 120.000 74.000 C 123.314 74.000 126.000 76.686 126.000 80.000 L 126.000 176.000 C 126.000 179.314 123.314 182.000 120.000 182.000 C 116.686 182.000 114.000 179.314 114.000 176.000 ZM 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 C 230.000 51.314 227.314 54.000 224.000 54.000 L 32.000 54.000 C 28.686 54.000 26.000 51.314 26.000 48.000 ZM 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 C 26.000 204.686 28.686 202.000 32.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
