package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorBoldIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.06 53.18C230.416 37.705 218.295 25.584 202.82 22.94c-15.24-2.58-38.75-4.78-64.26-.61C107.66 27.39 81.56 40.39 61 61 40.44 81.61 27.41 107.68 22.35 138.58c-4.17 25.51-2 49 .61 64.26 2.644 15.475 14.765 27.596 30.24 30.24 11.466 1.935 23.072 2.912 34.7 2.92 9.893 .018 19.772-.761 29.54-2.33 30.9-5.06 57-18.06 77.58-38.65 20.58-20.59 33.59-46.68 38.65-77.58 4.17-25.51 1.97-49.02-.61-64.26ZM209.4 57.18c1.451 8.558 2.319 17.204 2.6 25.88L172.93 44c8.677 .289 17.324 1.172 25.88 2.64 5.401 .933 9.637 5.153 10.59 10.55ZM46.6 198.81C45.149 190.255 44.28 181.612 44 172.94L83.06 212c-8.673-.29-17.316-1.169-25.87-2.63-5.404-.934-9.641-5.159-10.59-10.56ZM178.05 178.05c-11 11-31.31 26.16-63.2 31.83L46.12 141.15C51.79 109.26 67 88.93 78 78 89 67.07 109.3 51.84 141.2 46.17l68.73 68.73c-5.72 31.84-20.93 52.17-31.88 63.15ZM164.49 108.48 159 114l5.52 5.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L142 131l-11 11 5.52 5.52c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L114 159l-5.52 5.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L97 142l-5.52-5.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L114 125l11-11-5.52-5.52c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L142 97l5.52-5.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
