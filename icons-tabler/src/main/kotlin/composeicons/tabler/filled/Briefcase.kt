package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = tablerFilledIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.478v4.522c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-4.522l.553 .277c5.943 2.994 12.954 2.993 18.897-.002L22 13.478ZM14 2c1.657 0 3 1.343 3 3v1h2c1.657 0 3 1.343 3 3v2.242l-1.447 .724C15.306 14.611 9.131 14.679 3.827 12.152l-.647-.32L2 11.242v-2.242C2 7.343 3.343 6 5 6h2v-1C7 3.343 8.343 2 10 2h4ZM12 10c-.552 0-1 .448-1 1-.003 .552 .443 1.002 .995 1.005 .552 .003 1.002-.443 1.005-.995C13 10.448 12.552 10 12 10ZM14 4h-4C9.448 4 9 4.448 9 5v1h6v-1C15 4.448 14.552 4 14 4Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
