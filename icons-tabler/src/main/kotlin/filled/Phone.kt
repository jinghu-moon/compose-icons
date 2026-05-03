package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = tablerFilledIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 3.000 C 9.365 3.000 9.701 3.199 9.877 3.519 L 9.928 3.629 L 11.928 8.629 C 12.093 9.042 11.966 9.515 11.615 9.789 L 11.515 9.857 L 9.841 10.861 L 9.904 10.964 C 10.701 12.229 11.771 13.299 13.036 14.096 L 13.138 14.158 L 14.143 12.486 C 14.372 12.104 14.826 11.919 15.256 12.033 L 15.371 12.072 L 20.371 14.072 C 20.710 14.207 20.949 14.517 20.993 14.879 L 21.000 15.000 L 21.000 19.000 C 21.000 20.657 19.657 22.000 17.940 21.998 C 9.361 21.477 2.522 14.638 2.000 6.000 C 2.000 4.411 3.238 3.098 4.824 3.005 L 5.000 3.000 L 9.000 3.000 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
