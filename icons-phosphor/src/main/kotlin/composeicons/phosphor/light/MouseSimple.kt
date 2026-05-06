package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorLightIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 18h-32C77.774 18.039 50.039 45.774 50 80v96c.039 34.226 27.774 61.961 62 62h32c34.226-.039 61.961-27.774 62-62v-96C205.961 45.774 178.226 18.039 144 18ZM194 176c-.033 27.601-22.399 49.967-50 50h-32C84.399 225.967 62.033 203.601 62 176v-96C62.033 52.399 84.399 30.033 112 30h32c27.601 .033 49.967 22.399 50 50ZM134 64v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
