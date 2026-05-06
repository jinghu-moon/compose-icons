package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorLightIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 82c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46 25.405 0 46-20.595 46-46C173.967 102.609 153.391 82.033 128 82ZM128 162C109.222 162 94 146.778 94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34ZM222.72 67.91l-88-48.18c-4.182-2.31-9.258-2.31-13.44 0l-88 48.18C28.795 70.364 26.004 75.068 26 80.18v95.64c.004 5.112 2.795 9.816 7.28 12.27l88 48.18c4.183 2.306 9.257 2.306 13.44 0l88-48.18c4.485-2.454 7.276-7.158 7.28-12.27v-95.64c-.004-5.112-2.795-9.816-7.28-12.27ZM218 175.82c.006 .721-.376 1.39-1 1.75l-88 48.18c-.598 .327-1.322 .327-1.92 0L39 177.57c-.624-.36-1.006-1.029-1-1.75v-95.64c-.006-.721 .376-1.39 1-1.75L127 30.25c.598-.327 1.322-.327 1.92 0l88 48.18c.624 .36 1.006 1.029 1 1.75Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
