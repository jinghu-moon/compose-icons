package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CapsuleHorizontal: ImageVector
    get() {
        if (_capsuleHorizontal != null) return _capsuleHorizontal!!
        _capsuleHorizontal = tablerFilledIcon(
            name = "CapsuleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 5.000 L 9.000 5.000 C 5.134 5.000 2.000 8.134 2.000 12.000 C 2.000 15.866 5.134 19.000 9.000 19.000 L 15.000 19.000 C 18.866 19.000 22.000 15.866 22.000 12.000 L 21.993 11.697 C 21.831 7.953 18.748 5.000 15.000 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _capsuleHorizontal!!
    }

private var _capsuleHorizontal: ImageVector? = null
