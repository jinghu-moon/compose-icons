package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = tablerFilledIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.979 3.074 C 8.772 2.769 10.606 3.293 11.967 4.499 L 12.004 4.532 L 12.038 4.502 C 13.335 3.364 15.060 2.839 16.771 3.062 L 17.017 3.098 C 19.189 3.473 20.981 5.009 21.683 7.099 C 22.386 9.188 21.886 11.495 20.381 13.106 L 20.201 13.291 L 20.153 13.332 L 12.703 20.711 C 12.347 21.063 11.787 21.098 11.390 20.793 L 11.296 20.711 L 3.803 13.289 C 2.184 11.714 1.587 9.364 2.258 7.207 C 2.928 5.051 4.753 3.453 6.979 3.074 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
