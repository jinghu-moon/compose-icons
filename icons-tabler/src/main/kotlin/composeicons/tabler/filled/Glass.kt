package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Glass: ImageVector
    get() {
        if (_glass != null) return _glass!!
        _glass = tablerFilledIcon(
            name = "Glass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.205 0 5.894 1.05 5.997 2.89l.99 5.946L19 11c0 3.226-2.56 5.564-6 5.945v3.055h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-8C7.448 22 7 21.552 7 21c0-.552 .448-1 1-1h3v-3.055C7.56 16.565 5 14.226 5 11l.014-.164L6.005 4.881l.001-.038C6.152 3.033 8.823 2 12 2M12 4C10.776 4 9.641 4.192 8.836 4.514 8.242 4.752 8 4.981 8 5c0 .02 .242 .248 .836 .486C9.64 5.808 10.776 6 12 6c1.224 0 2.359-.192 3.164-.514C15.758 5.248 16 5.019 16 5l-.02-.026c-.07-.07-.321-.262-.816-.46C14.36 4.192 13.224 4 12 4"),
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
        return _glass!!
    }

private var _glass: ImageVector? = null
