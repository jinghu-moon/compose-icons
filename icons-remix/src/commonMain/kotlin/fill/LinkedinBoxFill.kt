package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LinkedinBoxFill: ImageVector
    get() {
        if (_linkedinBoxFill != null) return _linkedinBoxFill!!
        _linkedinBoxFill = remixIcon(
            name = "LinkedinBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.336 18.339 L 15.671 18.339 L 15.671 14.162 C 15.671 13.166 15.651 11.884 14.282 11.884 C 12.892 11.884 12.680 12.968 12.680 14.089 L 12.680 18.339 L 10.014 18.339 L 10.014 9.750 L 12.575 9.750 L 12.575 10.921 L 12.609 10.921 C 12.967 10.246 13.837 9.533 15.137 9.533 C 17.837 9.533 18.337 11.311 18.337 13.625 L 18.337 18.339 L 18.336 18.339 ZM 7.004 8.575 C 6.146 8.575 5.456 7.880 5.456 7.026 C 5.456 6.173 6.146 5.479 7.004 5.479 C 7.859 5.479 8.552 6.173 8.552 7.026 C 8.552 7.880 7.858 8.575 7.004 8.575 ZM 8.340 18.339 L 5.667 18.339 L 5.667 9.750 L 8.340 9.750 L 8.340 18.339 ZM 19.670 3.000 L 4.329 3.000 C 3.595 3.000 3.001 3.580 3.001 4.297 L 3.001 19.703 C 3.001 20.420 3.595 21.000 4.329 21.000 L 19.667 21.000 C 20.401 21.000 21.001 20.420 21.001 19.703 L 21.001 4.297 C 21.001 3.580 20.401 3.000 19.667 3.000 L 19.670 3.000 Z"),
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
        return _linkedinBoxFill!!
    }

private var _linkedinBoxFill: ImageVector? = null
