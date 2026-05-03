package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LightbulbFlashLine: ImageVector
    get() {
        if (_lightbulbFlashLine != null) return _lightbulbFlashLine!!
        _lightbulbFlashLine = remixIcon(
            name = "LightbulbFlashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.973 18.000 L 14.027 18.000 C 14.159 16.798 14.772 15.807 15.768 14.723 C 15.880 14.601 16.599 13.856 16.684 13.750 C 17.532 12.693 18.000 11.385 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 C 6.000 11.384 6.468 12.692 7.315 13.748 C 7.400 13.855 8.121 14.601 8.232 14.722 C 9.228 15.806 9.841 16.798 9.973 18.000 ZM 14.000 20.000 L 10.000 20.000 L 10.000 21.000 L 14.000 21.000 L 14.000 20.000 ZM 5.754 14.999 C 4.656 13.630 4.000 11.892 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 11.892 19.343 13.632 18.244 15.001 C 17.624 15.775 16.000 17.000 16.000 18.500 L 16.000 21.000 C 16.000 22.105 15.105 23.000 14.000 23.000 L 10.000 23.000 C 8.895 23.000 8.000 22.105 8.000 21.000 L 8.000 18.500 C 8.000 17.000 6.375 15.774 5.754 14.999 ZM 13.000 10.005 L 15.500 10.005 L 11.000 16.005 L 11.000 12.005 L 8.500 12.005 L 13.000 6.000 L 13.000 10.005 Z"),
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
        return _lightbulbFlashLine!!
    }

private var _lightbulbFlashLine: ImageVector? = null
