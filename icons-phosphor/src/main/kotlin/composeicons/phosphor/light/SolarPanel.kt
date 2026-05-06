package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorLightIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 104c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM72.84 57.33c1.511 1.537 3.73 2.146 5.813 1.595 2.084-.551 3.712-2.177 4.265-4.26 .553-2.083-.053-4.303-1.588-5.815L70 37.53c-2.375-2.106-5.979-1.997-8.223 .247-2.244 2.244-2.352 5.848-.247 8.223ZM128 38c3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6ZM178.91 59.09c1.594 .001 3.123-.632 4.25-1.76L194.47 46c2.106-2.375 1.997-5.979-.247-8.223-2.244-2.244-5.848-2.352-8.223-.247L174.67 48.85c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705ZM194 104c0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-16c-3.314 0-6 2.686-6 6ZM88 110c3.314 0 6-2.686 6-6C94 85.222 109.222 70 128 70c18.778 0 34 15.222 34 34 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C174 78.595 153.405 58 128 58 102.595 58 82 78.595 82 104c0 3.314 2.686 6 6 6ZM237.18 219c-1.069 1.851-3.042 2.994-5.18 3h-208c-2.132-.002-4.104-1.135-5.178-2.977-1.074-1.842-1.09-4.116-.042-5.973l40.69-72c1.065-1.886 3.064-3.052 5.23-3.05h126.6c2.166-.002 4.165 1.164 5.23 3.05l40.69 72c1.04 1.851 1.025 4.113-.04 5.95ZM187.8 150h-28l4.35 20h35ZM151.86 170l-4.35-20h-39l-4.35 20ZM101.53 182l-6.09 28h65.12l-6.09-28ZM56.89 170h35l4.35-20h-28ZM34.28 210h48.88l6.09-28h-39.14ZM221.72 210 205.89 182h-39.14l6.09 28Z"),
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
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
