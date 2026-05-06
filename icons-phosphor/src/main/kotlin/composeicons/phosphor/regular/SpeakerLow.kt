package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorRegularIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.51 24.81c-2.745-1.337-6.011-.996-8.42 .88L77.25 80h-45.25C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c2.411 1.874 5.679 2.213 8.423 .871 2.744-1.341 4.485-4.127 4.487-7.181v-192c0-3.058-1.742-5.848-4.49-7.19ZM32 96h40v64h-40ZM144 207.64 88 164.09v-72.18L144 48.36ZM208 128c.007 9.745-3.55 19.156-10 26.46-2.941 3.231-7.93 3.506-11.207 .616-3.277-2.889-3.63-7.874-.793-11.196 7.983-9.067 7.983-22.653 0-31.72-1.944-2.136-2.586-5.154-1.679-7.896 .907-2.742 3.221-4.783 6.055-5.339 2.834-.556 5.748 .459 7.624 2.655 6.436 7.297 9.991 16.69 10 26.42Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
