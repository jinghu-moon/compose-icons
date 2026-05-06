package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorThinIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 204c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L64.72 64.34C49.086 70.697 34.502 79.378 21.46 90.09c-1.709 1.403-1.958 3.926-.555 5.635 1.403 1.709 3.926 1.958 5.635 .555C39.718 85.444 54.55 76.794 70.47 70.66l29.64 32.61c-16.995 4.067-32.898 11.793-46.6 22.64-1.731 1.381-2.016 3.904-.635 5.635 1.381 1.731 3.904 2.016 5.635 .635 13.968-11.057 30.372-18.624 47.85-22.07L142 149.37c-4.611-.909-9.3-1.368-14-1.37-15.226-.038-30.067 4.786-42.36 13.77-1.398 1.021-1.98 2.826-1.443 4.471 .537 1.646 2.072 2.759 3.803 2.759 .847-.002 1.672-.267 2.36-.76 18.009-13.098 41.533-15.893 62.11-7.38L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM234.54 90.09C204.485 65.481 166.844 52.024 128 52c-7.188 .001-14.369 .455-21.5 1.36-2.193 .276-3.746 2.277-3.47 4.47 .276 2.193 2.277 3.746 4.47 3.47C114.299 60.435 121.146 60.001 128 60c36.994 .017 72.843 12.836 101.46 36.28 1.709 1.403 4.232 1.154 5.635-.555 1.403-1.709 1.154-4.232-.555-5.635ZM197.54 132.18c1.731 1.381 4.254 1.096 5.635-.635 1.381-1.731 1.096-4.254-.635-5.635C187.9 114.32 170.76 106.301 152.48 102.49c-1.419-.342-2.912 .117-3.895 1.196-.983 1.08-1.299 2.609-.825 3.99 .474 1.381 1.662 2.394 3.1 2.644 17.039 3.568 33.013 11.052 46.66 21.86Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
