package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorDuotoneIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C88.235 32 56 64.235 56 104c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72C200 64.235 167.764 32 128 32ZM128 136C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M213.92 210.62 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L58.82 63.8C45.153 87.315 44.369 116.162 56.739 140.384c12.37 24.222 36.199 40.5 63.261 43.216v16.4h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h165.19l4.89 5.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM64 104c-.014-9.56 2.126-19 6.26-27.62L88.68 96.64c-2.189 11.695 .941 23.757 8.541 32.911 7.6 9.154 18.881 14.45 30.779 14.449 1.2 0 2.39-.06 3.58-.17L150 164.11c-19.63 7.186-41.531 4.332-58.665-7.643C74.202 144.491 63.997 124.904 64 104ZM136 200v-16.41c8.804-.879 17.401-3.214 25.44-6.91L182.64 200ZM85.52 45.31c-1.049-1.845-1.323-4.03-.76-6.076 .563-2.046 1.915-3.785 3.76-4.834 32.535-18.473 73.528-11.929 98.695 15.755 25.167 27.684 27.786 69.113 6.305 99.745-2.538 3.617-7.528 4.493-11.145 1.955-3.617-2.538-4.493-7.528-1.955-11.145 17.185-24.506 15.089-57.649-5.044-79.796C155.242 38.767 122.448 33.532 96.42 48.31c-3.839 2.178-8.716 .836-10.9-3ZM150.83 111.43c2.38-7.309 1.114-15.316-3.403-21.535C142.91 83.676 135.687 79.997 128 80c-1.762-.002-3.519 .19-5.24 .57-2.877 .883-6.006 .077-8.099-2.086-2.092-2.163-2.793-5.318-1.814-8.164 .979-2.846 3.473-4.902 6.453-5.32 14.005-3.101 28.599 1.535 38.247 12.15 9.648 10.615 12.874 25.583 8.453 39.23-1.444 4.095-5.891 6.29-10.02 4.946-4.129-1.344-6.432-5.736-5.19-9.896Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
