package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorRegularIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 120h-16.37c-.899-10-3.518-19.77-7.74-28.88l14.18-8.19C225.897 80.721 227.209 75.827 225 72c-2.209-3.827-7.103-5.139-10.93-2.93l-14.2 8.2C194.069 69.079 186.921 61.931 178.73 56.13l8.2-14.2C189.139 38.103 187.827 33.209 184 31c-3.827-2.209-8.721-.897-10.93 2.93l-8.19 14.18C155.77 43.888 146 41.269 136 40.37v-16.37c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16.37c-10 .899-19.77 3.518-28.88 7.74L82.93 33.93C80.721 30.103 75.827 28.791 72 31c-3.827 2.209-5.139 7.103-2.93 10.93l8.2 14.2C69.079 61.931 61.931 69.079 56.13 77.27L41.93 69.07C38.103 66.861 33.209 68.173 31 72c-2.209 3.827-.897 8.721 2.93 10.93l14.18 8.19c-4.222 9.11-6.841 18.88-7.74 28.88h-16.37c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16.37c.899 10 3.518 19.77 7.74 28.88l-14.18 8.19c-3.138 1.81-4.668 5.502-3.731 9 .937 3.499 4.108 5.931 7.731 5.93 1.405 .004 2.785-.365 4-1.07l14.2-8.2c5.801 8.191 12.949 15.339 21.14 21.14l-8.2 14.2c-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93l8.19-14.18c9.11 4.222 18.88 6.841 28.88 7.74v16.37c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16.37c10-.899 19.77-3.518 28.88-7.74l8.19 14.18c2.209 3.827 7.103 5.139 10.93 2.93 3.827-2.209 5.139-7.103 2.93-10.93l-8.2-14.2c8.191-5.801 15.339-12.949 21.14-21.14l14.2 8.2c1.838 1.061 4.022 1.349 6.072 .799 2.05-.55 3.797-1.891 4.858-3.729 2.212-3.825 .904-8.718-2.92-10.93l-14.18-8.19c4.219-9.11 6.834-18.88 7.73-28.88h16.37c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 56c36.649 .044 67.432 27.582 71.54 64h-66.92L99.16 62.05C108.25 58.055 118.071 55.995 128 56ZM56 128C56.012 105.127 66.892 83.621 85.31 70.06L118.76 128 85.31 185.94C66.892 172.379 56.012 150.873 56 128ZM128 200c-9.925 .021-19.747-2.022-28.84-6l33.46-58h66.92c-4.108 36.418-34.891 63.956-71.54 64Z"),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
