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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 5h-6C5.134 5 2 8.134 2 12c0 3.866 3.134 7 7 7h6c3.866 0 7-3.134 7-7l-.007-.303C21.831 7.953 18.748 5 15 5Z"),
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
        return _capsuleHorizontal!!
    }

private var _capsuleHorizontal: ImageVector? = null
