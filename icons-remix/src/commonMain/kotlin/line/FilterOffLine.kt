package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilterOffLine: ImageVector
    get() {
        if (_filterOffLine != null) return _filterOffLine!!
        _filterOffLine = remixIcon(
            name = "FilterOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.929 0.515 L 21.071 14.657 L 19.657 16.071 L 15.834 12.249 L 15.000 13.500 L 15.000 22.000 L 9.000 22.000 L 9.000 13.500 L 4.000 6.000 L 3.000 6.000 L 3.000 4.000 L 7.585 4.000 L 5.515 1.929 L 6.929 0.515 ZM 9.585 6.000 L 6.404 6.000 L 11.000 12.894 L 11.000 20.000 L 13.000 20.000 L 13.000 12.894 L 14.392 10.807 L 9.585 6.000 ZM 21.000 4.000 L 21.000 6.000 L 20.000 6.000 L 18.085 8.872 L 16.643 7.429 L 17.596 6.000 L 15.213 6.000 L 13.213 4.000 L 21.000 4.000 Z"),
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
        return _filterOffLine!!
    }

private var _filterOffLine: ImageVector? = null
