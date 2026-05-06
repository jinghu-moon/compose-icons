package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorBoldIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 108c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM68 108C68 94.745 57.255 84 44 84 30.745 84 20 94.745 20 108c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24ZM92 84c13.255 0 24-10.745 24-24C116 46.745 105.255 36 92 36 78.745 36 68 46.745 68 60c0 13.255 10.745 24 24 24ZM164 84c13.255 0 24-10.745 24-24C188 46.745 177.255 36 164 36c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM212 184c.003 14.747-7.382 28.515-19.669 36.67-12.287 8.155-27.843 9.612-41.431 3.88-14.669-6.04-31.131-6.04-45.8 0-21.62 9.138-46.607-.304-56.781-21.456C38.145 181.941 46.365 156.527 67 145.34c7.255-4.026 12.618-10.765 14.91-18.74C87.872 106.103 106.653 92.006 128 92.006c21.347 0 40.128 14.097 46.09 34.594 2.293 7.974 7.655 14.713 14.91 18.74 14.173 7.697 22.998 22.532 23 38.66ZM188 184c.002-7.348-4.026-14.106-10.49-17.6l-.1-.06c-12.816-7.07-22.301-18.94-26.37-33C148.053 123.1 138.667 116.06 128 116.06c-10.667 0-20.053 7.04-23.04 17.28-4.056 14.079-13.543 25.969-26.37 33.05l-.1 .06c-8.007 4.376-12.037 13.615-9.797 22.46C70.933 197.755 78.876 203.963 88 204c2.68 .008 5.334-.53 7.8-1.58h.13c20.538-8.484 43.602-8.484 64.14 0h.13c2.466 1.05 5.12 1.588 7.8 1.58 11.046 0 20-8.954 20-20Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
