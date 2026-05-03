package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TShirtAirFill: ImageVector
    get() {
        if (_tShirtAirFill != null) return _tShirtAirFill!!
        _tShirtAirFill = remixIcon(
            name = "TShirtAirFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.705 17.793 C 13.532 18.620 14.293 19.000 14.998 19.000 C 15.376 19.000 15.678 18.933 16.235 18.724 L 16.627 18.572 C 17.678 18.151 18.206 18.000 18.998 18.000 C 20.212 18.000 21.377 18.545 22.484 19.579 L 22.705 19.793 L 21.291 21.207 C 20.464 20.380 19.704 20.000 18.998 20.000 C 18.620 20.000 18.318 20.067 17.761 20.276 L 17.369 20.428 C 16.318 20.849 15.790 21.000 14.998 21.000 C 13.784 21.000 12.619 20.455 11.512 19.421 L 11.291 19.207 L 12.705 17.793 ZM 8.998 3.000 C 8.998 4.657 10.341 6.000 11.998 6.000 C 13.655 6.000 14.998 4.657 14.998 3.000 L 20.998 3.000 C 21.550 3.000 21.998 3.448 21.998 4.000 L 21.998 11.000 C 21.998 11.552 21.550 12.000 20.998 12.000 L 11.998 12.000 C 10.944 12.000 10.080 12.816 10.003 13.851 L 9.998 14.000 L 9.998 21.000 L 5.998 21.000 C 5.446 21.000 4.998 20.552 4.998 20.000 L 4.997 11.999 L 2.998 12.000 C 2.446 12.000 1.998 11.552 1.998 11.000 L 1.998 4.000 C 1.998 3.448 2.446 3.000 2.998 3.000 L 8.998 3.000 ZM 12.705 13.793 C 13.532 14.620 14.293 15.000 14.998 15.000 C 15.376 15.000 15.678 14.933 16.235 14.724 L 16.627 14.571 C 17.678 14.151 18.206 14.000 18.998 14.000 C 20.212 14.000 21.377 14.545 22.484 15.579 L 22.705 15.793 L 21.291 17.207 C 20.464 16.380 19.704 16.000 18.998 16.000 C 18.620 16.000 18.318 16.067 17.761 16.276 L 17.369 16.428 C 16.318 16.849 15.790 17.000 14.998 17.000 C 13.784 17.000 12.619 16.455 11.512 15.421 L 11.291 15.207 L 12.705 13.793 Z"),
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
        return _tShirtAirFill!!
    }

private var _tShirtAirFill: ImageVector? = null
