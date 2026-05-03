package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowDownRhombus: ImageVector
    get() {
        if (_arrowDownRhombus != null) return _arrowDownRhombus!!
        _arrowDownRhombus = tablerFilledIcon(
            name = "ArrowDownRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.707 2.293 L 15.207 4.793 C 15.597 5.183 15.597 5.817 15.207 6.207 L 13.000 8.414 L 13.000 18.584 L 14.293 17.293 C 14.649 16.937 15.215 16.901 15.613 17.210 L 15.707 17.293 C 16.097 17.684 16.097 18.316 15.707 18.707 L 12.707 21.707 C 12.672 21.742 12.635 21.774 12.595 21.804 L 12.485 21.875 L 12.371 21.929 L 12.266 21.964 L 12.117 21.994 L 12.000 22.000 L 11.925 21.997 L 11.799 21.980 L 11.688 21.950 L 11.577 21.906 L 11.479 21.854 L 11.383 21.787 L 11.293 21.707 L 8.293 18.707 C 7.914 18.315 7.919 17.691 8.305 17.305 C 8.691 16.919 9.315 16.914 9.707 17.293 L 11.000 18.586 L 11.000 8.415 L 8.793 6.207 C 8.403 5.817 8.403 5.183 8.793 4.793 L 11.293 2.293 C 11.684 1.903 12.316 1.903 12.707 2.293"),
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
        return _arrowDownRhombus!!
    }

private var _arrowDownRhombus: ImageVector? = null
