package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings2Line: ImageVector
    get() {
        if (_settings2Line != null) return _settings2Line!!
        _settings2Line = remixIcon(
            name = "Settings2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.686 4.000 L 11.293 1.393 C 11.684 1.003 12.317 1.003 12.707 1.393 L 15.314 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 8.686 L 22.607 11.293 C 22.997 11.684 22.997 12.317 22.607 12.707 L 20.000 15.314 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 15.314 20.000 L 12.707 22.607 C 12.317 22.997 11.684 22.997 11.293 22.607 L 8.686 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 15.314 L 1.393 12.707 C 1.003 12.317 1.003 11.684 1.393 11.293 L 4.000 8.686 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 8.686 4.000 ZM 6.000 6.000 L 6.000 9.515 L 3.515 12.000 L 6.000 14.485 L 6.000 18.000 L 9.515 18.000 L 12.000 20.485 L 14.485 18.000 L 18.000 18.000 L 18.000 14.485 L 20.485 12.000 L 18.000 9.515 L 18.000 6.000 L 14.485 6.000 L 12.000 3.515 L 9.515 6.000 L 6.000 6.000 ZM 12.000 16.000 C 9.791 16.000 8.000 14.209 8.000 12.000 C 8.000 9.791 9.791 8.000 12.000 8.000 C 14.209 8.000 16.000 9.791 16.000 12.000 C 16.000 14.209 14.209 16.000 12.000 16.000 ZM 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.896 13.105 10.000 12.000 10.000 C 10.896 10.000 10.000 10.896 10.000 12.000 C 10.000 13.105 10.896 14.000 12.000 14.000 Z"),
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
        return _settings2Line!!
    }

private var _settings2Line: ImageVector? = null
