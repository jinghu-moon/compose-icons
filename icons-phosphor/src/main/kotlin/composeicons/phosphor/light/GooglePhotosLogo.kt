package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorLightIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 122h-42.82c12.047-21.68 11.722-48.116-.854-69.493C175.751 31.13 152.802 18.003 128 18c-3.314 0-6 2.686-6 6v42.82C100.32 54.773 73.884 55.098 52.507 67.674 31.13 80.249 18.003 103.198 18 128c0 3.314 2.686 6 6 6h42.82c-12.047 21.68-11.722 48.116 .854 69.493C80.249 224.87 103.198 237.997 128 238c3.314 0 6-2.686 6-6v-42.82c21.68 12.047 48.116 11.722 69.493-.854C224.87 175.751 237.997 152.802 238 128c0-3.314-2.686-6-6-6ZM186 88c.051 12.216-3.803 24.129-11 34h-41v-91.69c29.533 3.109 51.964 27.994 52 57.69ZM88 70c12.216-.051 24.129 3.803 34 11v41h-91.69C33.419 92.467 58.304 70.036 88 70ZM70 168c-.051-12.216 3.803-24.129 11-34h41v91.69C92.467 222.581 70.036 197.696 70 168ZM168 186c-12.216 .051-24.129-3.803-34-11v-41h91.69c-3.109 29.533-27.994 51.964-57.69 52Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
