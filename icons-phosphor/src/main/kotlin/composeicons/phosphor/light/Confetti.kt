package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorLightIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M110.08 54c-3.336-3.336-8.145-4.737-12.751-3.713-4.606 1.023-8.369 4.328-9.979 8.763L34.85 203.47c-1.531 4.222-.914 8.925 1.653 12.61 2.567 3.685 6.766 5.893 11.257 5.92 1.627-.004 3.241-.292 4.77-.85L196.91 168.65c4.427-1.621 7.72-5.39 8.733-9.994 1.013-4.604-.395-9.407-3.733-12.736ZM48.43 209.87c-.656 .243-1.393 .081-1.887-.413-.494-.494-.656-1.231-.413-1.887L61.31 165.8l28.89 28.88ZM102.64 190.16 65.84 153.35 80.51 113 143 175.49ZM194 156.07c-.123 .605-.556 1.099-1.14 1.3L155.44 171 85 100.55 98.63 63.19c.197-.586 .693-1.021 1.3-1.14 .136-.018 .274-.018 .41 0 .472-.002 .924 .189 1.25 .53l91.88 91.88c.445 .407 .646 1.018 .53 1.61ZM162 72c.142-5.097 1.38-10.104 3.63-14.68C170.57 47.44 179.93 42 192 42c7.47 0 12.53-2.74 15.48-8.38C208.977 30.623 209.836 27.347 210 24c0-3.314 2.686-6 6-6h0c3.314 0 6 2.686 6 6 0 10.38-6.27 30-30 30-7.47 0-12.53 2.74-15.48 8.38C175.018 65.376 174.159 68.653 174 72c0 3.314-2.686 6-6 6h0c-3.314 0-6-2.686-6-6ZM138 40v-24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM236.24 123.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723l-16-16c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147ZM241.9 77.69l-24 8c-2.046 .728-4.326 .294-5.961-1.135-1.635-1.429-2.37-3.631-1.922-5.756 .448-2.125 2.01-3.842 4.083-4.489l24-8c3.119-.974 6.444 .727 7.479 3.827 1.035 3.1-.601 6.457-3.679 7.553Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
