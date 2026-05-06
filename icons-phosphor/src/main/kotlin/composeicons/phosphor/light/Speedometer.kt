package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorLightIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M115.76 155.76 211.76 59.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-96 96c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333ZM128 86c7.167-.007 14.287 1.155 21.08 3.44 3.143 1.058 6.547-.632 7.605-3.775 1.058-3.143-.632-6.547-3.775-7.605C127.647 69.544 99.785 74.521 79.032 91.256 58.279 107.991 47.511 134.166 50.48 160.66c.338 3.054 2.928 5.359 6 5.34 .223 .015 .447 .015 .67 0 3.291-.366 5.662-3.329 5.3-6.62C62.168 156.93 62.018 154.466 62 152c.044-36.433 29.567-65.956 66-66ZM226 101.9c-1.513-2.949-5.131-4.113-8.08-2.6-2.949 1.513-4.113 5.131-2.6 8.08 12.209 23.962 14.074 51.878 5.16 77.25-.273 .822-1.044 1.375-1.91 1.37h-181.11c-.87-.022-1.633-.585-1.91-1.41C25.086 154.598 29.77 121.398 48.124 95.472 66.478 69.546 96.235 54.096 128 54h.9c15.209 .097 30.182 3.769 43.71 10.72 2.96 1.516 6.589 .345 8.105-2.615 1.516-2.96 .345-6.589-2.615-8.105C162.901 46.205 146.081 42.095 129 42h-1C92.311 42.018 58.847 59.339 38.226 88.467 17.605 117.595 12.388 154.913 24.23 188.58c1.972 5.623 7.271 9.396 13.23 9.42h181.07c5.944-.015 11.237-3.766 13.22-9.37 10.031-28.479 7.952-59.824-5.75-86.73Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
