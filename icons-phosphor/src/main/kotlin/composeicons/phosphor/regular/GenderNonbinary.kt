package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorRegularIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 96.46v-34.33l27.88 16.73c3.789 2.275 8.705 1.049 10.98-2.74 2.275-3.789 1.049-8.705-2.74-10.98L143.55 48 172.12 30.86c3.789-2.275 5.015-7.191 2.74-10.98-2.275-3.789-7.191-5.015-10.98-2.74L128 38.67 92.12 17.14C88.331 14.865 83.415 16.091 81.14 19.88c-2.275 3.789-1.049 8.705 2.74 10.98L112.45 48 83.88 65.14c-3.789 2.275-5.015 7.191-2.74 10.98 2.275 3.789 7.191 5.015 10.98 2.74L120 62.13v34.33c-37.971 4.245-66.014 37.412-63.888 75.56 2.126 38.149 33.68 67.994 71.888 67.994 38.208 0 69.762-29.845 71.888-67.994C202.014 133.872 173.971 100.705 136 96.46ZM128 224C97.072 224 72 198.928 72 168c0-30.928 25.072-56 56-56 30.928 0 56 25.072 56 56-.033 30.914-25.086 55.967-56 56Z"),
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
