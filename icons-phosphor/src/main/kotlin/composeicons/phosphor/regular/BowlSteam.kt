package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorRegularIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 112h-192c-4.418 0-8 3.582-8 8 .072 38.775 21.638 74.314 56 92.28v3.72c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-3.72C210.362 194.314 231.928 158.775 232 120c0-4.418-3.582-8-8-8ZM164.66 200c-2.84 1.305-4.66 4.144-4.66 7.27v8.73h-64v-8.71c.008-3.133-1.813-5.982-4.66-7.29C62.707 186.824 43.269 159.383 40.34 128h175.29c-2.924 31.376-22.348 58.816-50.97 72ZM81.77 55c5.35-6.66 6.67-11.16 6.12-13.14-.42-1.49-2.41-2.26-2.43-2.26C81.719 38.371 79.429 34.601 80.062 30.714 80.695 26.827 84.062 23.979 88 24c.807 .001 1.609 .122 2.38 .36 1 .31 9.91 3.33 12.79 12.76 2.46 8.07-.55 17.45-8.94 27.89-5.35 6.66-6.67 11.16-6.12 13.14 .42 1.49 2.37 2.24 2.39 2.25 3.734 1.227 6.023 4.985 5.401 8.866C95.279 93.147 91.93 96.001 88 96c-.807-.001-1.609-.122-2.38-.36-1-.31-9.91-3.33-12.79-12.76C70.37 74.81 73.38 65.43 81.77 55ZM121.77 55c5.35-6.66 6.67-11.16 6.12-13.14-.42-1.49-2.41-2.26-2.43-2.26-3.741-1.229-6.031-4.999-5.398-8.886 .633-3.887 4-6.735 7.938-6.714 .807 .001 1.609 .122 2.38 .36 1 .31 9.91 3.33 12.79 12.76 2.46 8.07-.55 17.45-8.94 27.89-5.35 6.66-6.67 11.16-6.12 13.14 .42 1.49 2.37 2.24 2.39 2.25 3.734 1.227 6.023 4.985 5.401 8.866-.622 3.881-3.971 6.735-7.901 6.734-.807-.001-1.609-.122-2.38-.36-1-.31-9.91-3.33-12.79-12.76-2.46-8.07 .55-17.45 8.94-27.88ZM161.77 55c5.35-6.66 6.67-11.16 6.12-13.14-.42-1.49-2.41-2.26-2.43-2.26-3.741-1.229-6.031-4.999-5.398-8.886 .633-3.887 4-6.735 7.938-6.714 .807 .001 1.609 .122 2.38 .36 1 .31 9.91 3.33 12.79 12.76 2.46 8.07-.55 17.45-8.94 27.89-5.35 6.66-6.67 11.16-6.12 13.14 .42 1.49 2.37 2.24 2.39 2.25 3.734 1.227 6.023 4.985 5.401 8.866-.622 3.881-3.971 6.735-7.901 6.734-.807-.001-1.609-.122-2.38-.36-1-.31-9.91-3.33-12.79-12.76-2.46-8.07 .55-17.45 8.94-27.88Z"),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
