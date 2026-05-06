package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorLightIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM209.57 90h-40.38C164.377 71.449 155.598 54.162 143.46 39.33c28.976 5.109 53.646 24.017 66.11 50.67ZM218 128c.007 8.808-1.284 17.568-3.83 26h-42.36c2.92-17.21 2.92-34.79 0-52h42.36c2.546 8.432 3.837 17.192 3.83 26ZM128 215.83c-5.777-5.893-10.872-12.417-15.19-19.45C106.983 186.902 102.456 176.684 99.35 166h57.3c-3.106 10.684-7.633 20.902-13.46 30.38-4.318 7.033-9.413 13.557-15.19 19.45ZM96.45 154c-3.267-17.179-3.267-34.821 0-52h63.1c3.267 17.179 3.267 34.821 0 52ZM38 128c-.007-8.808 1.284-17.568 3.83-26h42.36c-2.92 17.21-2.92 34.79 0 52h-42.36C39.284 145.568 37.993 136.808 38 128ZM128 40.17c5.777 5.893 10.872 12.417 15.19 19.45 5.827 9.478 10.354 19.696 13.46 30.38h-57.3c3.106-10.684 7.633-20.902 13.46-30.38C117.128 52.587 122.223 46.063 128 40.17ZM112.54 39.33C100.402 54.162 91.623 71.449 86.81 90h-40.38C58.894 63.347 83.564 44.439 112.54 39.33ZM46.43 166h40.38c4.813 18.551 13.592 35.838 25.73 50.67C83.564 211.561 58.894 192.653 46.43 166ZM143.43 216.67C155.579 201.841 164.368 184.554 169.19 166h40.38c-12.464 26.653-37.134 45.561-66.11 50.67Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
