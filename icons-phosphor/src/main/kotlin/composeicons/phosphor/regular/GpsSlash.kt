package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorRegularIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128c0 4.418-3.582 8-8 8h-24.36c-.863 9.677-3.34 19.141-7.33 28-1.289 2.877-4.147 4.73-7.3 4.73-1.128-0-2.243-.243-3.27-.71-4.02-1.818-5.809-6.546-4-10.57 11.681-26.132 6.788-56.7-12.467-77.88C162.019 58.39 132.054 50.615 104.93 59.76c-2.728 1.001-5.784 .443-7.984-1.456C94.747 56.405 93.751 53.462 94.343 50.617c.593-2.845 2.682-5.144 5.457-6.007 6.542-2.208 13.323-3.631 20.2-4.24v-24.37c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24.37c42.252 3.912 75.718 37.378 79.63 79.63h24.37c4.418 0 8 3.582 8 8ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L181 198.23c-13.078 9.894-28.668 15.922-45 17.4v24.37c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24.37C77.748 211.718 44.282 178.252 40.37 136h-24.37c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24.37C42.146 100.823 50.142 82.751 63.14 68.54L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM170.2 186.32 74 80.45c-24.063 27.535-23.663 68.734 .928 95.798 24.592 27.064 65.565 31.395 95.272 10.072Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
