package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorLightIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v130.64L109.26 45.11C108.205 43.191 106.189 41.999 104 42h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v148h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-130.64l76.74 139.53c1.055 1.919 3.071 3.111 5.26 3.11h40c3.314 0 6-2.686 6-6v-154h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM74.15 54h26.3l81.4 148h-26.3Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
