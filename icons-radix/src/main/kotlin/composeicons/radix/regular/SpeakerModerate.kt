package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerModerate: ImageVector
    get() {
        if (_speakerModerate != null) return _speakerModerate!!
        _speakerModerate = radixIcon(
            name = "SpeakerModerate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.259 1.062c.143-.078 .317-.083 .465-.009C7.893 1.138 8 1.311 8 1.5v12c0 .189-.107 .363-.276 .447-.169 .085-.372 .066-.523-.047L3.333 11h-1.833C.723 11 .085 10.41 .008 9.654L0 9.5v-4C0 4.672 .672 4 1.5 4h1.833L7.2 1.1l.059-.038ZM3.8 4.901c-.086 .065-.192 .1-.3 .1h-2C1.224 5 1 5.224 1 5.5v4l.01 .101c.047 .228 .249 .399 .49 .399h2c.108 0 .213 .035 .3 .1L7 12.499v-9.999L3.8 4.901ZM10.278 3.848c.161-.107 .371-.082 .503 .049l.052 .062 .13 .203c1.292 2.111 1.248 4.807-.13 6.879-.122 .184-.371 .234-.555 .111-.184-.122-.234-.371-.111-.555 1.205-1.812 1.242-4.173 .112-6.019l-.113-.177-.037-.071c-.07-.172-.011-.376 .149-.483Z"),
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
        return _speakerModerate!!
    }

private var _speakerModerate: ImageVector? = null
