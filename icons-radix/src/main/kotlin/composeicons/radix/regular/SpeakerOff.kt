package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerOff: ImageVector
    get() {
        if (_speakerOff != null) return _speakerOff!!
        _speakerOff = radixIcon(
            name = "SpeakerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.259 1.062c.143-.078 .317-.083 .465-.009 .169 .085 .276 .258 .276 .447v12c0 .189-.107 .363-.276 .447-.169 .085-.372 .067-.523-.047L3.333 11h-1.833C.723 11 .085 10.41 .008 9.653L0 9.5v-4C0 4.672 .672 4 1.5 4h1.833L7.2 1.1l.059-.038ZM3.8 4.901c-.086 .065-.192 .1-.3 .1h-2c-.276 0-.5 .224-.5 .5v4l.01 .101c.047 .228 .249 .399 .49 .399h2c.108 0 .213 .035 .3 .1l3.2 2.399v-9.999L3.8 4.901ZM14.146 5.147c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L13.207 7.5l1.646 1.646 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L12.5 8.207 10.853 9.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L11.793 7.5 10.146 5.854l-.064-.078c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064 1.646 1.646L14.146 5.147Z"),
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
        return _speakerOff!!
    }

private var _speakerOff: ImageVector? = null
