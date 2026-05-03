package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) return _mail!!
        _mail = tablerFilledIcon(
            name = "Mail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 7.535 L 22.000 17.000 C 22.000 18.589 20.762 19.902 19.176 19.995 L 19.000 20.000 L 5.000 20.000 C 3.411 20.000 2.098 18.762 2.005 17.176 L 2.000 17.000 L 2.000 7.535 L 11.445 13.832 L 11.561 13.898 C 11.838 14.033 12.162 14.033 12.439 13.898 L 12.555 13.832 L 22.000 7.535 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.080 4.000 21.027 4.570 21.555 5.427 L 12.000 11.797 L 2.445 5.427 C 2.954 4.601 3.831 4.072 4.799 4.007 L 5.000 4.000 L 19.000 4.000 Z"),
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
        return _mail!!
    }

private var _mail: ImageVector? = null
