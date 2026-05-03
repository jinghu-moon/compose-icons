package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowLeftRhombus: ImageVector
    get() {
        if (_arrowLeftRhombus != null) return _arrowLeftRhombus!!
        _arrowLeftRhombus = tablerFilledIcon(
            name = "ArrowLeftRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.707 8.293 C 7.097 8.684 7.097 9.316 6.707 9.707 L 5.415 11.000 L 15.584 11.000 L 17.793 8.793 C 18.184 8.403 18.816 8.403 19.207 8.793 L 21.707 11.293 C 22.097 11.684 22.097 12.316 21.707 12.707 L 19.207 15.207 C 18.816 15.597 18.184 15.597 17.793 15.207 L 15.585 13.000 L 5.415 13.000 L 6.707 14.293 C 7.063 14.649 7.099 15.215 6.790 15.613 L 6.707 15.707 C 6.317 16.097 5.683 16.097 5.293 15.707 L 2.293 12.707 C 2.258 12.672 2.226 12.635 2.196 12.595 L 2.125 12.485 L 2.071 12.371 L 2.036 12.266 L 2.011 12.148 L 2.004 12.090 L 2.000 12.000 L 2.003 11.925 L 2.020 11.799 L 2.050 11.688 L 2.094 11.577 L 2.146 11.479 L 2.213 11.383 L 2.293 11.293 L 5.293 8.293 C 5.683 7.903 6.317 7.903 6.707 8.293"),
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
        return _arrowLeftRhombus!!
    }

private var _arrowLeftRhombus: ImageVector? = null
