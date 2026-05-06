package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorLightIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 114c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46 25.405 0 46-20.595 46-46-.033-25.391-20.609-45.967-46-46ZM128 194C109.222 194 94 178.778 94 160c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM209.1 131.32 179.3 47.11C172.083 25.156 151.696 10.228 128.587 9.977 105.479 9.726 84.772 24.208 77.08 46h0L47.56 129.52c-13.449 35.566-1.945 75.743 28.29 98.801 30.235 23.058 72.024 23.524 102.765 1.145 30.741-22.379 43.138-62.289 30.485-98.146ZM128 234C103.678 233.984 80.915 222.026 67.102 202.008 53.288 181.99 50.185 156.465 58.8 133.72c0-.05 0-.09 .05-.13L88.39 50h0C94.373 33.035 110.497 21.764 128.485 21.972c17.988 .208 33.846 11.849 39.435 28.948 0 0 0 .08 .05 .13l29.82 84.28c7.981 22.652 4.482 47.769-9.387 67.377C174.534 222.315 152.017 233.98 128 234Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
