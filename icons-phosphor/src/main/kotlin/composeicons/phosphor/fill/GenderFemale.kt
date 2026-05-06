package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorFillIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 144C105.909 144 88 126.091 88 104 88 81.909 105.909 64 128 64c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM136 176v-16.58c29.071-4.196 49.96-30.139 47.856-59.436C181.753 70.688 157.372 47.994 128 47.994c-29.372 0-53.753 22.693-55.856 51.99-2.103 29.296 18.786 55.24 47.856 59.436v16.58h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
