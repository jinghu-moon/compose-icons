package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TargetFill: ImageVector
    get() {
        if (_targetFill != null) return _targetFill!!
        _targetFill = remixIcon(
            name = "TargetFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 C 13.000 3.552 12.552 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 11.448 20.448 11.000 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 6.000 C 12.552 6.000 13.000 6.448 13.000 7.000 C 13.000 7.552 12.552 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 11.448 16.448 11.000 17.000 11.000 C 17.552 11.000 18.000 11.448 18.000 12.000 C 18.000 15.314 15.314 18.000 12.000 18.000 C 8.686 18.000 6.000 15.314 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 ZM 18.571 2.101 C 18.847 2.101 19.071 2.324 19.071 2.601 L 19.071 4.430 C 19.072 4.706 19.295 4.929 19.571 4.929 L 21.399 4.929 C 21.675 4.929 21.899 5.153 21.899 5.429 L 21.899 6.344 L 20.011 8.232 C 19.636 8.607 19.127 8.818 18.597 8.818 L 16.597 8.818 L 12.707 12.707 C 12.316 13.097 11.684 13.097 11.293 12.707 C 10.903 12.316 10.903 11.683 11.293 11.293 L 15.183 7.404 L 15.183 5.404 C 15.183 4.874 15.393 4.365 15.768 3.990 L 17.657 2.101 L 18.571 2.101 Z"),
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
        return _targetFill!!
    }

private var _targetFill: ImageVector? = null
