package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorLightIcon(
            name = "NumberCircleZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM128 74c-13.52 0-24.69 6.12-32.29 17.71C89.45 101.24 86 114.13 86 128c0 13.87 3.45 26.76 9.7 36.29C103.31 175.88 114.47 182 128 182c13.53 0 24.69-6.12 32.29-17.71C166.55 154.76 170 141.87 170 128c0-13.87-3.45-26.76-9.7-36.29C152.69 80.12 141.52 74 128 74ZM128 170C107.28 170 98 148.91 98 128c0-20.91 9.28-42 30-42 20.72 0 30 21.09 30 42 0 20.91-9.28 42-30 42Z"),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
