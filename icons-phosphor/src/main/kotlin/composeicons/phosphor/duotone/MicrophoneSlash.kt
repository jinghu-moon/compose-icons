package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorDuotoneIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 64v64c0 22.091-17.909 40-40 40h0C105.909 168 88 150.091 88 128v-64C88 41.909 105.909 24 128 24h0c22.091 0 40 17.909 40 40Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M213.92 218.62 53.92 42.62C50.935 39.413 45.926 39.204 42.684 42.151c-3.242 2.946-3.511 7.952-.604 11.229L80 95.09v32.91c-.004 16.567 8.536 31.965 22.591 40.735 14.056 8.77 31.64 9.671 46.519 2.385l11.1 12.2c-9.77 5.716-20.891 8.713-32.21 8.68C92.67 191.961 64.039 163.33 64 128c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .05 41.066 31.145 75.443 72 79.6v32.4c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32.41c12.527-1.208 24.584-5.398 35.16-12.22l30.92 34c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM128 160C110.327 160 96 145.673 96 128v-15.31l41.66 45.82c-3.125 .988-6.383 1.491-9.66 1.49ZM185.52 156.09c4.291-8.741 6.508-18.353 6.48-28.09 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 .033 12.175-2.742 24.193-8.11 35.12-1.342 2.748-4.132 4.49-7.19 4.49-1.218 .002-2.419-.279-3.51-.82-3.968-1.942-5.611-6.732-3.67-10.7ZM84 44.87C93.081 24.04 115.524 12.432 137.772 17.058 160.019 21.684 175.975 41.277 176 64v64c-.002 1.67-.089 3.339-.26 5-.427 4.091-3.887 7.192-8 7.17-.28 .014-.56 .014-.84 0-4.393-.462-7.58-4.397-7.12-8.79 .11-1.1 .17-2.24 .17-3.36v-64.02C159.907 48.873 149.276 35.842 134.465 32.762 119.655 29.682 104.711 37.394 98.64 51.25c-1.019 2.796-3.505 4.795-6.455 5.19-2.949 .395-5.874-.88-7.593-3.309C82.874 50.702 82.646 47.52 84 44.87Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
