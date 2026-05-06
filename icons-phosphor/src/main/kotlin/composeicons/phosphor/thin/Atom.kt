package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorThinIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.89 162.47C206.246 150.307 199.367 138.756 191.36 128c8.007-10.756 14.886-22.307 20.53-34.47 10.38-23.06 10.81-41 1.21-50.63-9.6-9.63-27.57-9.17-50.63 1.21C150.307 49.754 138.756 56.633 128 64.64 117.244 56.633 105.693 49.754 93.53 44.11 70.47 33.73 52.49 33.3 42.9 42.9c-9.59 9.6-9.17 27.57 1.21 50.63 5.644 12.163 12.523 23.714 20.53 34.47-8.007 10.756-14.886 22.307-20.53 34.47-10.38 23.06-10.81 41-1.21 50.63h0C47.5 217.7 54 220 62.12 220c8.78 0 19.41-2.71 31.41-8.11 12.163-5.644 23.714-12.523 34.47-20.53 10.756 8.007 22.307 14.886 34.47 20.53 12 5.4 22.63 8.11 31.41 8.11 8.09 0 14.62-2.3 19.22-6.9h0c9.6-9.59 9.17-27.57-1.21-50.63ZM207.45 48.55c10.27 10.28 3.14 39.05-21.1 72.84C178.797 111.774 170.665 102.627 162 94 153.359 85.347 144.199 77.229 134.57 69.69 168.4 45.4 197.17 38.27 207.45 48.55ZM181.45 128c-7.714 9.988-16.064 19.468-25 28.38-8.909 8.938-18.389 17.289-28.38 25-9.991-7.711-19.471-16.062-28.38-25C90.754 147.468 82.404 137.988 74.69 128 90.159 108.037 108.069 90.09 128 74.58c9.98 7.72 19.456 16.07 28.37 25 8.951 8.924 17.315 18.417 25.04 28.42ZM48.55 48.55C51.6 45.55 56.26 44 62.19 44c14.11 0 35.41 8.59 59.19 25.65C102.122 84.758 84.754 102.129 69.65 121.39 45.41 87.6 38.28 58.83 48.55 48.55ZM48.55 207.45c-10.27-10.28-3.14-39 21.1-72.84C77.203 144.226 85.335 153.373 94 162c8.641 8.653 17.801 16.771 27.43 24.31C87.6 210.59 58.83 217.72 48.55 207.45ZM207.45 207.45c-10.28 10.27-39 3.14-72.84-21.1C144.226 178.797 153.373 170.665 162 162c8.653-8.641 16.771-17.801 24.31-27.43 24.28 33.83 31.41 62.6 21.14 72.88ZM136 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
