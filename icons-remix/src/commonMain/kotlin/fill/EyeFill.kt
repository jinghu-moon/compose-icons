package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeFill: ImageVector
    get() {
        if (_eyeFill != null) return _eyeFill!!
        _eyeFill = remixIcon(
            name = "EyeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.182 12.000 C 2.122 6.880 6.608 3.000 12.000 3.000 C 17.392 3.000 21.878 6.880 22.819 12.000 C 21.878 17.120 17.392 21.000 12.000 21.000 C 6.608 21.000 2.122 17.120 1.182 12.000 ZM 12.000 17.000 C 14.762 17.000 17.000 14.761 17.000 12.000 C 17.000 9.239 14.762 7.000 12.000 7.000 C 9.239 7.000 7.000 9.239 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 ZM 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 Z"),
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
        return _eyeFill!!
    }

private var _eyeFill: ImageVector? = null
