package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorDuotoneIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.91 202.91c-20.591 20.593-51.56 26.754-78.465 15.61C49.539 207.376 31.997 181.122 31.997 152c0-29.122 17.543-55.376 44.448-66.52 26.905-11.144 57.874-4.983 78.465 15.61 28.115 28.117 28.115 73.703 0 101.82Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 32h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28.69L154.62 90.07C121.616 63.093 73.256 66.731 44.661 98.344c-28.595 31.612-27.381 80.094 2.76 110.235 30.142 30.142 78.623 31.355 110.235 2.76 31.612-28.595 35.251-76.955 8.274-109.959L208 59.32v28.68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM149.24 197.29c-24.997 24.985-65.514 24.979-90.503-.014-24.989-24.993-24.989-65.51 0-90.503 24.989-24.993 65.506-24.999 90.503-.014 24.952 25.019 24.952 65.511 0 90.53Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
