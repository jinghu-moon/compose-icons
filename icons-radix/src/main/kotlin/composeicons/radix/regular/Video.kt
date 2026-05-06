package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = radixIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.226 2.009c.722 .018 1.428 .061 2.095 .117 2.03 .172 3.045 .257 3.825 1.056 .039 .04 .088 .094 .124 .136 .73 .845 .731 1.966 .731 4.208l-.001 .78c-.01 1.707-.091 2.648-.73 3.388l-.124 .135-.149 .142c-.761 .668-1.754 .75-3.624 .906l-.683 .051C8.992 12.972 8.256 13 7.5 13l-.748-.009c-.494-.012-.976-.034-1.44-.064l-.683-.051C2.759 12.72 1.766 12.638 1.005 11.97L.855 11.828 .731 11.693C.092 10.954 .011 10.013 .001 8.306L0 7.525C0 5.423-0 4.306 .602 3.479L.73 3.317 .854 3.182c.683-.698 1.545-.852 3.11-.994l.715-.062C5.569 2.051 6.527 2 7.5 2l.726 .009ZM7.5 3C6.561 3 5.632 3.049 4.765 3.122 3.721 3.21 3.045 3.27 2.528 3.392c-.412 .097-.664 .222-.872 .406l-.087 .083c-.025 .025-.06 .063-.083 .09-.199 .231-.33 .518-.404 1.062C1.002 5.616 1 6.377 1 7.525c0 1.135 .002 1.885 .082 2.46 .074 .535 .204 .821 .405 1.054l.083 .09 .088 .083c.209 .186 .459 .309 .86 .404 .507 .12 1.167 .178 2.193 .264l.665 .049c.678 .044 1.391 .071 2.123 .071 .976 0 1.92-.048 2.788-.12 1.026-.085 1.687-.144 2.193-.264 .459-.109 .72-.253 .948-.487l.083-.09 .072-.091c.16-.218 .268-.495 .333-.963C13.998 9.41 14 8.66 14 7.525 14 6.377 13.998 5.616 13.918 5.033c-.065-.476-.174-.756-.333-.973l-.071-.09-.083-.09c-.226-.231-.489-.378-.959-.489-.517-.122-1.193-.181-2.236-.27C9.368 3.049 8.439 3 7.5 3ZM5.25 5.383c0-.18 .185-.302 .351-.229l4.827 2.118c.2 .087 .2 .37 0 .457L5.601 9.847c-.165 .072-.351-.049-.351-.229v-4.234Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
