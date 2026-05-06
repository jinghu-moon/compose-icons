package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorRegularIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104C207.999 60.857 173.789 25.485 130.67 24.046 87.551 22.606 51.057 55.616 48.178 98.663c-2.879 43.047 28.895 80.623 71.822 84.937v48.4c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48.4c40.855-4.157 71.95-38.534 72-79.6ZM128 168C92.654 168 64 139.346 64 104 64 68.654 92.654 40 128 40c35.346 0 64 28.654 64 64-.039 35.33-28.67 63.961-64 64Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
