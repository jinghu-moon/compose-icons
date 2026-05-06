package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorDuotoneIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 88v80h-48c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M155.51 24.81c-2.745-1.337-6.011-.996-8.42 .88L77.25 80h-45.25C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c2.411 1.874 5.679 2.213 8.423 .871 2.744-1.341 4.485-4.127 4.487-7.181v-192c0-3.058-1.742-5.848-4.49-7.19ZM32 96h40v64h-40ZM144 207.64 88 164.09v-72.18L144 48.36ZM198 101.56c13.313 15.113 13.313 37.767 0 52.88-2.941 3.231-7.93 3.506-11.207 .616-3.277-2.889-3.63-7.874-.793-11.196 7.983-9.067 7.983-22.653 0-31.72-2.837-3.322-2.485-8.307 .793-11.196 3.277-2.889 8.267-2.615 11.207 .616ZM248 128c.011 19.682-7.242 38.676-20.37 53.34-2.965 3.208-7.956 3.445-11.211 .531-3.255-2.914-3.571-7.9-.709-11.201 21.728-24.294 21.728-61.036 0-85.33-1.96-2.121-2.625-5.135-1.739-7.884 .886-2.749 3.185-4.807 6.015-5.385 2.83-.577 5.752 .416 7.644 2.598C240.761 89.328 248.016 108.32 248 128Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
