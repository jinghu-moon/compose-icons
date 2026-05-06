package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorLightIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170 76C170 52.804 151.196 34 128 34 104.804 34 86 52.804 86 76c0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42ZM128 106C111.431 106 98 92.569 98 76 98 59.431 111.431 46 128 46c16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30ZM188 130c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42 0-23.196-18.804-42-42-42ZM188 202c-16.569 0-30-13.431-30-30 0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30ZM68 130c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42C110 148.804 91.196 130 68 130ZM68 202C51.431 202 38 188.569 38 172c0-16.569 13.431-30 30-30 16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30Z"),
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
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
