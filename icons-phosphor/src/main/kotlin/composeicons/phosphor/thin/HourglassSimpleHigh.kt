package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) return _hourglassSimpleHigh!!
        _hourglassSimpleHigh = phosphorThinIcon(
            name = "HourglassSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.78 128 208.46 56.49c3.432-3.428 4.463-8.586 2.611-13.07C209.22 38.937 204.851 36.008 200 36h-144c-4.856-.004-9.236 2.92-11.095 7.407-1.859 4.487-.83 9.651 2.605 13.083l.07 .06L122.22 128 47.61 199.45l-.07 .06c-3.432 3.428-4.463 8.586-2.611 13.07 1.851 4.484 6.22 7.412 11.071 7.42h144c4.87-0 9.257-2.944 11.104-7.45 1.847-4.507 .786-9.682-2.684-13.1ZM79.49 76h97L128 122.46ZM52.33 46.47C52.93 44.971 54.385 43.991 56 44h144c1.604-.002 3.054 .955 3.683 2.43 .63 1.475 .317 3.183-.793 4.34L184.87 68h-113.74L53.13 50.8c-1.129-1.143-1.446-2.859-.8-4.33ZM203.67 209.53c-.6 1.499-2.055 2.479-3.67 2.47h-144c-1.611 .001-3.066-.964-3.691-2.449-.625-1.485-.297-3.2 .831-4.351L128 133.54l74.8 71.63c1.163 1.134 1.509 2.867 .87 4.36Z"),
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
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null
