package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = tablerFilledIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c4.29 0 7.863 2.429 10.665 7.154l.22 .379 .045 .1 .03 .083 .014 .055 .014 .082 .011 .1v.11l-.014 .111c-.007 .037-.015 .074-.026 .11l-.039 .108-.036 .075-.016 .03c-2.764 4.836-6.3 7.38-10.555 7.499L12 20C7.604 20 3.963 17.451 1.132 12.496c-.176-.307-.176-.685 0-.992C3.963 6.549 7.604 4 12 4ZM12 9C10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
