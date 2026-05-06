package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorBoldIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.63 62.65 216.88 48.07c4.361-4.916 3.957-12.425-.906-16.844-4.863-4.42-12.376-4.106-16.854 .704L185.88 46.49C144.642 17.403 88.194 23.6 54.248 60.94 20.302 98.281 19.497 155.062 52.37 193.35L39.12 207.93c-2.945 3.163-3.961 7.665-2.661 11.786 1.3 4.121 4.716 7.225 8.942 8.126 4.226 .901 8.611-.54 11.479-3.773L70.12 209.51c41.238 29.087 97.686 22.89 131.632-14.45 33.946-37.34 34.751-94.122 1.878-132.41ZM52 128C51.976 100.086 67.269 74.41 91.823 61.134c24.555-13.276 54.413-12.01 77.757 3.296L68.67 175.43C57.865 161.985 51.983 145.249 52 128ZM128 204c-14.778 .014-29.235-4.308-41.58-12.43L187.33 80.57c18.271 22.799 21.842 54.057 9.185 80.389C183.858 187.292 157.216 204.027 128 204Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
