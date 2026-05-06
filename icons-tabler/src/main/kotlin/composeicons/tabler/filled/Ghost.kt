package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = tablerFilledIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.321 0 7.861 3.431 7.996 7.75L20 11l-.001 6.954 .01 .103c.064 1.085-.509 2.107-1.468 2.618l-.163 .08c-1.053 .475-2.283 .248-3.129-.593l-.137-.146c-.123-.158-.312-.25-.512-.25-.2 0-.389 .092-.512 .25-.502 .643-1.272 1.018-2.088 1.018-.816 0-1.586-.376-2.088-1.018-.123-.158-.312-.25-.512-.25-.2 0-.389 .092-.55 .296-.785 .889-2.048 1.182-3.144 .73C4.609 20.339 3.921 19.241 3.991 18.057l.008-.091L4 11l.004-.25C4.139 6.431 7.679 3 12 3ZM14.82 13.429c-.315-.453-.938-.565-1.391-.25-.859 .598-1.999 .598-2.858 0-.453-.315-1.077-.203-1.392 .25-.315 .453-.203 1.077 .25 1.392 1.545 1.076 3.597 1.076 5.142 0 .218-.151 .366-.383 .413-.644 .047-.261-.012-.53-.163-.748ZM10.01 9l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C10.976 9.413 10.539 9.001 10.01 9ZM14.01 9l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C14.976 9.413 14.539 9.001 14.01 9Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
