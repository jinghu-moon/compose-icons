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
                pathData = parseSvgPathData("M 144.000 18.000 L 112.000 18.000 C 77.774 18.039 50.039 45.774 50.000 80.000 L 50.000 176.000 C 50.039 210.226 77.774 237.961 112.000 238.000 L 144.000 238.000 C 178.226 237.961 205.961 210.226 206.000 176.000 L 206.000 80.000 C 205.961 45.774 178.226 18.039 144.000 18.000 ZM 194.000 176.000 C 193.967 203.601 171.601 225.967 144.000 226.000 L 112.000 226.000 C 84.399 225.967 62.033 203.601 62.000 176.000 L 62.000 80.000 C 62.033 52.399 84.399 30.033 112.000 30.000 L 144.000 30.000 C 171.601 30.033 193.967 52.399 194.000 80.000 ZM 134.000 64.000 L 134.000 112.000 C 134.000 115.314 131.314 118.000 128.000 118.000 C 124.686 118.000 122.000 115.314 122.000 112.000 L 122.000 64.000 C 122.000 60.686 124.686 58.000 128.000 58.000 C 131.314 58.000 134.000 60.686 134.000 64.000 Z"),
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
