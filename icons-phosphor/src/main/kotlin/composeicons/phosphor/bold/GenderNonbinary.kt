package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorBoldIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 93v-23.8l21.83 13.09c3.68 2.298 8.314 2.431 12.12 .346 3.806-2.084 6.19-6.06 6.235-10.399 .046-4.339-2.254-8.364-6.015-10.528L151.32 48 174.17 34.29c5.55-3.466 7.3-10.738 3.936-16.35-3.365-5.611-10.604-7.493-16.276-4.23L128 34 94.17 13.71C88.499 10.447 81.259 12.329 77.894 17.94c-3.365 5.611-1.614 12.884 3.936 16.35L104.68 48 81.83 61.71c-3.761 2.164-6.061 6.189-6.015 10.528 .046 4.339 2.43 8.315 6.235 10.399 3.806 2.084 8.44 1.952 12.12-.346L116 69.2v23.8C76.858 99.259 49.099 134.551 52.239 174.066c3.139 39.515 36.122 69.981 75.761 69.981 39.64 0 72.622-30.466 75.761-69.981C206.901 134.551 179.142 99.259 140 93ZM128 220C99.281 220 76 196.719 76 168c0-28.719 23.281-52 52-52 28.719 0 52 23.281 52 52-.033 28.705-23.295 51.967-52 52Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
