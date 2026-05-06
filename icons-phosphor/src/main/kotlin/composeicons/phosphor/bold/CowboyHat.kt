package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorBoldIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 116c-4.139-.001-7.986 2.13-10.18 5.64q-2.48 4-5 7.57L182.25 52.33C180.955 45.428 176.135 39.711 169.551 37.267c-6.584-2.443-13.967-1.254-19.451 3.133l-.18 .15L128 58.8 106.08 40.55l-.18-.15C100.42 36.014 93.042 34.821 86.46 37.258 79.877 39.694 75.053 45.403 73.75 52.3L59.14 129.22q-2.49-3.61-5-7.57C51.956 118.148 48.127 116.015 44 116 19.699 116 0 135.699 0 160 0 184.301 19.699 204 44 204h168c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44ZM96.07 63.44l19.25 16 .19 .15c7.292 5.892 17.708 5.892 25 0l.19-.15L159.95 63.44 171.44 124h-86.88ZM44 180c-9.889 .004-18.296-7.22-19.781-16.996-1.485-9.777 4.397-19.171 13.841-22.104 11.7 17.38 23.7 30 35 39.1ZM79 153.25 80 148h96l1 5.25c-25.33 25-46.71 26.65-49 26.75-2.29-.1-23.67-1.71-49-26.75ZM212 180h-29c11.28-9.12 23.28-21.72 35-39.1 9.455 2.936 15.339 12.348 13.837 22.134C230.335 172.819 221.9 180.034 212 180Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
