package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorLightIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 122h-26.23C210.72 79.271 176.729 45.28 134 42.23v-26.23c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26.23C79.271 45.28 45.28 79.271 42.23 122h-26.23c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h26.23c3.05 42.729 37.041 76.72 79.77 79.77v26.23c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26.23c42.729-3.05 76.72-37.041 79.77-79.77h26.23c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM128 202C87.131 202 54 168.869 54 128 54 87.131 87.131 54 128 54c40.869 0 74 33.131 74 74-.05 40.849-33.151 73.95-74 74ZM128 90c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C166 107.013 148.987 90 128 90ZM128 154c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
