package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerFilledIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.999 2c.265-0 .52 .105 .708 .293C16.895 2.48 17 2.735 17 3v3.255l.026 .018c.93 .654 1.686 1.525 2.204 2.537L19.322 9h.676c1.047-0 1.917 .806 1.995 1.85l.005 .15v2c0 1.105-.895 2-2 2h-.676l-.104 .213c-.293 .567-.662 1.091-1.097 1.558l-.123 .125v1.604c0 1.317-1.022 2.409-2.336 2.495L15.5 21c-1.16 0-2.135-.79-2.418-1.86l-.032-.141L9 19l-.05-.002-.032 .141c-.274 1.039-1.182 1.786-2.254 1.856L6.5 21C5.119 21 4 19.881 4 18.5v-1.602l-.056-.055C2.14 14.959 1.532 12.229 2.368 9.758l.092-.256C3.496 6.791 6.097 5 8.999 5h2.196L15.445 2.168c.131-.087 .28-.142 .436-.161ZM15 10c-.507 0-.934 .38-.993 .883L14 11.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L16 11c0-.552-.448-1-1-1"),
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
        return _pig!!
    }

private var _pig: ImageVector? = null
