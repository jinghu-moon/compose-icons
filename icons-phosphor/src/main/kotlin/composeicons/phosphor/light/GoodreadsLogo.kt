package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorLightIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 26c-3.314 0-6 2.686-6 6v19.4C162.154 29.788 134.215 20.803 108.741 29.127 83.268 37.452 66.026 61.201 66 88v24c.026 26.799 17.268 50.548 42.741 58.873 25.474 8.324 53.412-.66 69.259-22.273v19.4c-.033 27.601-22.399 49.967-50 50-17.09 0-34-8.41-43.08-21.43-1.198-1.826-3.294-2.857-5.471-2.692-2.178 .165-4.094 1.501-5.002 3.487-.908 1.986-.666 4.309 .633 6.065C86.34 219.57 107.11 230 128 230c34.226-.039 61.961-27.774 62-62v-136c0-3.314-2.686-6-6-6ZM128 162C100.399 161.967 78.033 139.601 78 112v-24C78 60.386 100.386 38 128 38c27.614 0 50 22.386 50 50v24c-.033 27.601-22.399 49.967-50 50Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
