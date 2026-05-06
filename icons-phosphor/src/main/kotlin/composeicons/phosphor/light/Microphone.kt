package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorLightIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 174c25.391-.033 45.967-20.609 46-46v-64C174 38.595 153.405 18 128 18 102.595 18 82 38.595 82 64v64c.033 25.391 20.609 45.967 46 46ZM94 64C94 45.222 109.222 30 128 30c18.778 0 34 15.222 34 34v64c0 18.778-15.222 34-34 34C109.222 162 94 146.778 94 128ZM134 205.75v34.25c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-34.25C81.397 202.574 50.053 168.727 50 128c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 36.451 29.549 66 66 66 36.451 0 66-29.549 66-66 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6-.053 40.727-31.397 74.574-72 77.75Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
