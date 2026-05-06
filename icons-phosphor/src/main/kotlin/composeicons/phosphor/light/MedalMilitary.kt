package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorLightIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207 42h-158C40.716 42 34 48.716 34 57v49.21c.002 5.879 3.438 11.216 8.79 13.65L109.19 150c-19.802 8.873-30.71 30.377-26.173 51.596 4.537 21.219 23.285 36.382 44.983 36.382 21.699 0 40.447-15.163 44.983-36.382C177.52 180.377 166.612 158.873 146.81 150l66.4-30.18c5.339-2.428 8.773-7.745 8.79-13.61v-49.21c0-8.284-6.716-15-15-15ZM162 54v76l-34 15.45L94 130v-76ZM46 106.21v-49.21c0-1.657 1.343-3 3-3h33v70.5L47.76 108.94c-1.071-.486-1.759-1.554-1.76-2.73ZM162 192c0 18.778-15.222 34-34 34C109.222 226 94 210.778 94 192c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34ZM210 106.21c-.001 1.176-.689 2.244-1.76 2.73L174 124.5v-70.5h33c1.657 0 3 1.343 3 3Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
