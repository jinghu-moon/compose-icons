package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorThinIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211 213.31 51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L63.8 63.32C49.352 86.124 48.085 114.882 60.472 138.868c12.387 23.986 36.569 39.601 63.528 41.022v24.11h-92c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h167l6.08 6.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM100 103.18l26.14 28.75C111.434 130.951 100.004 118.739 100 104c0-.27 0-.55 0-.82ZM60 104C59.977 91.858 63.224 79.934 69.4 69.48L93 95.48c-2.826 11.618 .299 23.881 8.343 32.727 8.043 8.847 19.954 13.123 31.787 11.413l23.63 26c-21.061 9.83-45.683 8.223-65.287-4.262C71.869 148.874 60 127.242 60 104ZM132 204v-24.11c10.584-.557 20.935-3.32 30.39-8.11L191.69 204ZM89 43.33c-1.089-1.919-.418-4.358 1.5-5.45 30.908-17.555 69.855-11.343 93.767 14.957 23.912 26.3 26.401 65.661 5.993 94.763-.806 1.205-2.201 1.879-3.646 1.762-1.445-.117-2.714-1.006-3.316-2.324-.603-1.318-.445-2.859 .412-4.028 18.264-26.037 16.041-61.257-5.352-84.791C156.964 34.685 122.116 29.124 94.46 44.83c-.923 .526-2.017 .664-3.041 .382C90.395 44.931 89.524 44.254 89 43.33ZM154.63 112.67c3.116-9.565 .862-20.067-5.905-27.51C141.958 77.717 131.718 74.476 121.9 76.67c-2.157 .48-4.295-.878-4.775-3.035-.48-2.157 .878-4.295 3.035-4.775 12.621-2.82 25.785 1.347 34.485 10.915 8.7 9.568 11.599 23.068 7.595 35.365-.533 1.649-2.067 2.767-3.8 2.77-.421-.003-.839-.07-1.24-.2-1.009-.327-1.847-1.042-2.329-1.988-.482-.945-.569-2.043-.241-3.052Z"),
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
