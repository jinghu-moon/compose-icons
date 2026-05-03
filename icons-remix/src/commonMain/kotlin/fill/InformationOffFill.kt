package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InformationOffFill: ImageVector
    get() {
        if (_informationOffFill != null) return _informationOffFill!!
        _informationOffFill = remixIcon(
            name = "InformationOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.743 18.329 C 21.154 16.605 22.000 14.401 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 9.599 2.000 7.395 2.846 5.671 4.257 L 11.914 10.500 L 13.000 10.500 L 13.000 11.586 L 19.743 18.329 ZM 10.000 11.414 L 4.257 5.671 C 2.846 7.395 2.000 9.599 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 14.401 22.000 16.605 21.154 18.329 19.743 L 14.000 15.414 L 14.000 17.000 L 10.000 17.000 L 10.000 15.000 L 11.000 15.000 L 11.000 12.500 L 10.000 12.500 L 10.000 11.414 ZM 13.586 15.000 L 13.000 15.000 L 13.000 14.414 L 13.586 15.000 ZM 13.500 8.000 C 13.500 8.828 12.828 9.500 12.000 9.500 C 11.172 9.500 10.500 8.828 10.500 8.000 C 10.500 7.172 11.172 6.500 12.000 6.500 C 12.828 6.500 13.500 7.172 13.500 8.000 Z"),
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
        return _informationOffFill!!
    }

private var _informationOffFill: ImageVector? = null
