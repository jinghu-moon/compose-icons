package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorLightIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 154c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34C110 169.222 94.778 154 76 154ZM76 210C63.85 210 54 200.15 54 188c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM43.76 107.76 59.52 92 43.76 76.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L68 83.52 83.76 67.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L76.48 92l15.76 15.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L68 100.48 52.24 116.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333ZM228.24 203.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L204 196.48l-15.76 15.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L195.52 188 179.76 172.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L204 179.52l15.76-15.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L212.48 188ZM182.55 112.3c-6 21.66-24.55 40.38-45.09 45.52-.478 .118-.968 .179-1.46 .18-3.03 .001-5.585-2.258-5.956-5.264-.371-3.007 1.557-5.819 4.496-6.556 16.29-4.07 31.62-19.67 36.44-37.09 3.33-12 3.39-30.24-15.22-48.85L150 54.48v25.52c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-40c0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-25.52l5.76 5.76C182 69.47 188.45 91 182.55 112.3Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
