package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorBoldIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250 138c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C225.939 86.11 183.89 44.061 132 44 85.629 44.05 48.05 81.629 48 128c.05 40.849 33.151 73.95 74 74 35.33-.039 63.961-28.67 64-64C185.967 108.19 161.81 84.033 132 84c-24.289 .028-43.972 19.711-44 44 0 18.778 15.222 34 34 34 13.255 0 24-10.745 24-24 0-7.732-6.268-14-14-14-1.058 .002-2.072 .422-2.82 1.17 5.062 2.416 7.775 8.015 6.534 13.485-1.241 5.47-6.105 9.35-11.714 9.345-11.046 0-20-8.954-20-20 0-15.464 12.536-28 28-28 20.987 0 38 17.013 38 38-.028 26.498-21.502 47.972-48 48C89.983 185.961 64.039 160.017 64 128 64.039 90.461 94.461 60.039 132 60c43.058 .05 77.95 34.942 78 78-.055 48.578-39.422 87.945-88 88C67.901 225.939 24.061 182.099 24 128 24.066 68.381 72.381 20.066 132 20c65.14 .072 117.928 52.86 118 118Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
