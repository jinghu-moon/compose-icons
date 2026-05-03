package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpRhombus: ImageVector
    get() {
        if (_arrowUpRhombus != null) return _arrowUpRhombus!!
        _arrowUpRhombus = tablerFilledIcon(
            name = "ArrowUpRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.081 2.003 L 12.201 2.020 L 12.312 2.050 L 12.423 2.094 L 12.521 2.146 L 12.625 2.220 L 12.707 2.293 L 15.707 5.293 C 15.967 5.544 16.071 5.916 15.980 6.266 C 15.888 6.615 15.615 6.888 15.266 6.980 C 14.916 7.071 14.544 6.967 14.293 6.707 L 13.000 5.415 L 13.000 15.585 L 15.207 17.793 C 15.597 18.184 15.597 18.816 15.207 19.207 L 12.707 21.707 C 12.316 22.097 11.684 22.097 11.293 21.707 L 8.793 19.207 C 8.403 18.816 8.403 18.184 8.793 17.793 L 11.000 15.584 L 11.000 5.415 L 9.707 6.707 C 9.351 7.063 8.785 7.099 8.387 6.790 L 8.293 6.707 C 7.903 6.317 7.903 5.683 8.293 5.293 L 11.293 2.293 L 11.405 2.196 L 11.515 2.125 L 11.577 2.094 L 11.658 2.060 L 11.734 2.036 L 11.852 2.011 L 11.910 2.004 Z"),
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
        return _arrowUpRhombus!!
    }

private var _arrowUpRhombus: ImageVector? = null
