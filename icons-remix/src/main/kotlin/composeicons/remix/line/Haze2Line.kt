package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Haze2Line: ImageVector
    get() {
        if (_haze2Line != null) return _haze2Line!!
        _haze2Line = remixIcon(
            name = "Haze2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 19c.828 0 1.5 .672 1.5 1.5C13.5 21.328 12.828 22 12 22c-.828 0-1.5-.672-1.5-1.5C10.5 19.672 11.172 19 12 19ZM19.5 19c.828 0 1.5 .672 1.5 1.5C21 21.328 20.328 22 19.5 22 18.672 22 18 21.328 18 20.5 18 19.672 18.672 19 19.5 19ZM4.5 19C5.328 19 6 19.672 6 20.5 6 21.328 5.328 22 4.5 22 3.672 22 3 21.328 3 20.5 3 19.672 3.672 19 4.5 19ZM17 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5-1.844 0-3.51-1.04-5-3.122C10.51 15.96 8.844 17 7 17 4.239 17 2 14.761 2 12 2 9.239 4.239 7 7 7c1.844 0 3.51 1.041 5 3.122C13.49 8.041 15.156 7 17 7ZM7 9C5.343 9 4 10.343 4 12c0 1.657 1.343 3 3 3 1.254 0 2.509-.875 3.759-2.854l.089-.147-.089-.145C9.561 9.958 8.358 9.075 7.157 9.005L7 9ZM17 9c-1.254 0-2.509 .875-3.759 2.854L13.151 12l.09 .146c1.197 1.897 2.4 2.779 3.602 2.85L17 15c1.657 0 3-1.343 3-3C20 10.343 18.657 9 17 9ZM12 2c.828 0 1.5 .672 1.5 1.5C13.5 4.328 12.828 5 12 5 11.172 5 10.5 4.328 10.5 3.5 10.5 2.672 11.172 2 12 2ZM4.5 2C5.328 2 6 2.672 6 3.5 6 4.328 5.328 5 4.5 5 3.672 5 3 4.328 3 3.5 3 2.672 3.672 2 4.5 2ZM19.5 2C20.328 2 21 2.672 21 3.5 21 4.328 20.328 5 19.5 5 18.672 5 18 4.328 18 3.5 18 2.672 18.672 2 19.5 2Z"),
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
        return _haze2Line!!
    }

private var _haze2Line: ImageVector? = null
