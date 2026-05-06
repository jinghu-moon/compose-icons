package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorRegularIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.51 24.81c-2.745-1.337-6.011-.996-8.42 .88L85.25 80h-45.25C31.163 80 24 87.163 24 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c2.411 1.874 5.679 2.213 8.423 .871 2.744-1.341 4.485-4.127 4.487-7.181v-192c0-3.058-1.742-5.848-4.49-7.19ZM152 207.64 92.91 161.69C91.509 160.592 89.78 159.997 88 160h-48v-64h48c1.78 .003 3.509-.592 4.91-1.69L152 48.36ZM253.66 146.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L224 139.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L212.69 128 194.34 109.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L224 116.69 242.34 98.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L235.31 128Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
