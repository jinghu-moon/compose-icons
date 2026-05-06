package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorThinIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM220 128c.013 13.392-2.916 26.624-8.58 38.76L162.8 136.85c-1.427-.875-3.021-1.444-4.68-1.67l-22.82-3.07c-5.276-.711-10.39 2.139-12.56 7l-.4 .88h-11.2c-1.534-.001-2.933-.879-3.6-2.26l-3.8-7.86c-1.603-3.333-4.662-5.734-8.28-6.5L82.07 120.5 92.67 102c.716-1.239 2.039-2.002 3.47-2h16.71c2.029-.002 4.025-.518 5.8-1.5l12.24-6.76c.81-.443 1.565-.98 2.25-1.6L160.05 65.8c4.148-3.75 5.155-9.868 2.43-14.75L156.62 40.56C194.398 52.982 219.949 88.232 220 128ZM145.89 37.75l9.6 17.2c.91 1.628 .574 3.67-.81 4.92L127.77 84.21c-.231 .202-.482 .38-.75 .53l-12.24 6.76c-.591 .327-1.255 .499-1.93 .5h-16.71c-4.294-.006-8.263 2.282-10.41 6L73.87 118.7c-1.265-.325-2.292-1.247-2.75-2.47L59.63 85.6c-.37-.97-.349-2.046 .06-3L71 55.81C87.214 42.952 107.307 35.969 128 36c6.006 .001 11.998 .587 17.89 1.75ZM36 128C35.971 107.205 43.025 87.021 56 70.77l-3.71 8.75c-1.194 2.828-1.258 6.006-.18 8.88l11.49 30.67c1.425 3.836 4.716 6.675 8.72 7.52l21.43 4.61c1.205 .259 2.224 1.06 2.76 2.17l3.8 7.86c2.018 4.129 6.205 6.753 10.8 6.77h7.64L109 169.85c-1.978 4.437-1.085 9.628 2.26 13.15l19.68 20.26c.866 .932 1.237 2.22 1 3.47L129.36 220h-1.36C77.213 219.945 36.055 178.787 36 128ZM137.6 219.5l2.18-11.29c.726-3.775-.388-7.67-3-10.49L117.1 177.46c-1.086-1.177-1.366-2.889-.71-4.35l13.7-30.74c.724-1.616 2.424-2.564 4.18-2.33l22.82 3.07c.553 .079 1.083 .27 1.56 .56l49.11 30.2c-14.729 25.569-40.815 42.535-70.16 45.63Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
