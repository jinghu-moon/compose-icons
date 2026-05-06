package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorLightIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 66C37.758 66 10 93.758 10 128c0 34.242 27.758 62 62 62 34.242 0 62-27.758 62-62C133.961 93.774 106.226 66.039 72 66ZM72 178C44.386 178 22 155.614 22 128 22 100.386 44.386 78 72 78c27.614 0 50 22.386 50 50-.033 27.601-22.399 49.967-50 50ZM184 66c-17.1 0-30 26.65-30 62 0 35.35 12.9 62 30 62 17.1 0 30-26.65 30-62C214 92.65 201.1 66 184 66ZM184 178c-7.34 0-18-19.48-18-50 0-30.52 10.66-50 18-50 7.34 0 18 19.48 18 50 0 30.52-10.66 50-18 50ZM246 72v112c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-112c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
