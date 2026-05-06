package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerLoud: ImageVector
    get() {
        if (_speakerLoud != null) return _speakerLoud!!
        _speakerLoud = radixIcon(
            name = "SpeakerLoud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.002 1.066c.142-.081 .318-.088 .468-.015 .172 .084 .28 .258 .28 .449v12c0 .191-.109 .365-.28 .449-.171 .084-.376 .062-.526-.055L3.222 11h-1.722C.723 11 .085 10.41 .008 9.653L0 9.5v-4C0 4.672 .672 4 1.5 4h1.722L6.943 1.106l.059-.04ZM12.115 1.384c.169-.143 .421-.122 .564 .047l.269 .332c2.604 3.371 2.603 8.104 0 11.475l-.269 .332-.059 .057c-.146 .115-.357 .115-.505-.01-.147-.125-.183-.334-.094-.497l.047-.066 .245-.304C14.695 9.666 14.696 5.336 12.314 2.252l-.246-.305-.046-.066c-.09-.163-.055-.372 .093-.497ZM3.7 4.895c-.088 .068-.196 .105-.308 .105h-1.893C1.224 5 1 5.224 1 5.5v4l.01 .101c.047 .228 .249 .399 .49 .399h1.893l.083 .007c.081 .014 .159 .047 .225 .099l3.05 2.372v-9.956L3.7 4.895ZM10.278 3.848c.161-.107 .371-.082 .503 .049l.052 .062 .13 .203c1.292 2.111 1.248 4.807-.13 6.879-.122 .184-.371 .234-.555 .111-.184-.122-.234-.371-.111-.555 1.205-1.812 1.242-4.173 .112-6.019l-.113-.177-.037-.071c-.07-.172-.011-.376 .149-.483Z"),
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
        return _speakerLoud!!
    }

private var _speakerLoud: ImageVector? = null
