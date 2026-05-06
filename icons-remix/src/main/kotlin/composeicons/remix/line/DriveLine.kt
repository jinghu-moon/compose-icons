package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DriveLine: ImageVector
    get() {
        if (_driveLine != null) return _driveLine!!
        _driveLine = remixIcon(
            name = "DriveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.097 6.15 4.31 14.443l1.755 3.031L10.85 9.186 9.097 6.15ZM7.797 18.474h9.568l1.751-3.034h-9.567L7.797 18.474ZM19.111 13.44 14.325 5.15h-3.496l4.786 8.29h3.495ZM8.52 3.15h6.96L22 14.444l-3.48 6.03h-13.03L2 14.444 8.52 3.15ZM12.005 11.186l-1.301 2.254h2.603L12.005 11.186Z"),
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
        return _driveLine!!
    }

private var _driveLine: ImageVector? = null
