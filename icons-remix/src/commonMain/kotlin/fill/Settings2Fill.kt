package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings2Fill: ImageVector
    get() {
        if (_settings2Fill != null) return _settings2Fill!!
        _settings2Fill = remixIcon(
            name = "Settings2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.686 4.000 L 11.293 1.393 C 11.684 1.003 12.317 1.003 12.707 1.393 L 15.314 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 8.686 L 22.607 11.293 C 22.997 11.684 22.997 12.317 22.607 12.707 L 20.000 15.314 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 15.314 20.000 L 12.707 22.607 C 12.317 22.997 11.684 22.997 11.293 22.607 L 8.686 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 15.314 L 1.393 12.707 C 1.003 12.317 1.003 11.684 1.393 11.293 L 4.000 8.686 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 8.686 4.000 ZM 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 Z"),
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
        return _settings2Fill!!
    }

private var _settings2Fill: ImageVector? = null
