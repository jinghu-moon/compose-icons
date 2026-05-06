package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorThinIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 100.13v-45.06l33.94 20.36c1.894 1.138 4.352 .524 5.49-1.37 1.138-1.894 .524-4.352-1.37-5.49L135.77 48 170.06 27.43c1.894-1.138 2.508-3.596 1.37-5.49-1.138-1.894-3.596-2.508-5.49-1.37L128 43.34 90.06 20.57c-1.894-1.138-4.352-.524-5.49 1.37-1.138 1.894-.524 4.352 1.37 5.49L120.23 48 85.94 68.57c-1.894 1.138-2.508 3.596-1.37 5.49 1.138 1.894 3.596 2.508 5.49 1.37L124 55.07v45.06c-36.713 2.163-65.053 33.123-63.971 69.883 1.082 36.76 31.194 65.999 67.971 65.999 36.776 0 66.888-29.239 67.971-65.999C197.053 133.253 168.713 102.293 132 100.13ZM128 228C94.863 228 68 201.137 68 168c0-33.137 26.863-60 60-60 33.137 0 60 26.863 60 60-.039 33.121-26.879 59.961-60 60Z"),
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
