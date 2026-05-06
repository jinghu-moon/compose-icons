package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorLightIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM128 114c-1.876 .004-3.749 .161-5.6 .47L141.15 83.08c1.701-2.844 .774-6.529-2.07-8.23-2.844-1.701-6.529-.774-8.23 2.07l-32.24 54c-7.735 13.314-5.557 30.165 5.309 41.074 10.866 10.91 27.708 13.154 41.053 5.472 13.345-7.683 19.86-23.374 15.882-38.25C156.876 124.341 143.398 113.996 128 114ZM128 170c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
