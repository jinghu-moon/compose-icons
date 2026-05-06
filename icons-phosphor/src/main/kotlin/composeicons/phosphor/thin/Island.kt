package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorThinIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.12 226.5c-1.381 1.722-3.897 2-5.62 .62C229.11 226.81 189.72 196 128 196 66.28 196 26.89 226.81 26.5 227.13c-1.726 1.381-4.244 1.101-5.625-.625-1.381-1.726-1.101-4.244 .625-5.625 1.63-1.31 39.56-31.08 101-32.79-3.966-13.419-5.473-27.445-4.45-41.4 1.79-22.37 11.85-52.74 48.61-74.16-6.46-2.24-16.29-4.83-26.49-4.49-20.74 .67-34.28 13.1-40.25 36.94-.547 2.154-2.736 3.457-4.89 2.91-2.154-.547-3.457-2.736-2.91-4.89 8.64-34.54 30.74-42.45 47.75-43 11.46-.36 22.22 2.44 29.34 4.91C165.58 56.52 158.28 43.91 145.81 38.54c-11.15-4.77-24.56-2.87-39.86 5.67-1.933 1.077-4.373 .383-5.45-1.55-1.077-1.933-.383-4.373 1.55-5.45 17.6-9.82 33.4-11.85 47-6 14.6 6.28 23 20.15 27.23 29.74 4.21-8.4 11.87-19.69 23.84-23.59 10.55-3.43 22.1-.49 34.33 8.76 1.191 .842 1.829 2.267 1.665 3.717-.164 1.45-1.105 2.695-2.455 3.249-1.35 .554-2.894 .33-4.03-.586-10-7.57-19.1-10.11-27-7.54-11.14 3.61-18 16.42-21 23.46 8.567 1.119 16.84 3.872 24.37 8.11 24.81 14.18 30 40.17 30 59.47 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C228 92.11 200.5 80.33 185.47 77.17c10.67 15 11.46 29.37 9.92 39.44-1.146 7.734-3.935 15.134-8.18 21.7-.751 1.061-1.97 1.691-3.27 1.69-.824 .005-1.629-.251-2.3-.73-.872-.606-1.467-1.533-1.654-2.578-.188-1.045 .048-2.121 .654-2.992 .85-1.22 19.26-28.4-5.57-56.73-30 15.86-46.55 39.42-49.1 70.06-1.019 13.85 .624 27.768 4.84 41 63 .91 102 31.5 103.65 32.83 .839 .658 1.38 1.624 1.504 2.683 .124 1.059-.18 2.124-.844 2.957ZM28 140c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C38.745 164 28 153.255 28 140ZM36 140c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16Z"),
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
        return _island!!
    }

private var _island: ImageVector? = null
