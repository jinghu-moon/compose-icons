package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorLightIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 2.542-.003 4.807-1.608 5.652-4.006 .845-2.398 .087-5.068-1.892-6.664h0c-.1-.07-9.6-7.84-18.95-22.95C106.981 186.903 102.453 176.685 99.35 166h28.65c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-31.55c-3.267-17.179-3.267-34.821 0-52h63.1c1.64 8.569 2.46 17.275 2.45 26 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .012-8.713-.721-17.412-2.19-26h42.36c2.546 8.432 3.837 17.192 3.83 26 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C229.934 71.694 184.306 26.066 128 26ZM112.54 39.33C100.402 54.162 91.623 71.449 86.81 90h-40.38C58.894 63.347 83.564 44.439 112.54 39.33ZM112.54 216.67C83.564 211.561 58.894 192.653 46.43 166h40.38c4.813 18.551 13.592 35.838 25.73 50.67ZM84.19 154h-42.36c-5.106-16.957-5.106-35.043 0-52h42.36c-2.92 17.21-2.92 34.79 0 52ZM99.35 90c3.104-10.681 7.632-20.896 13.46-30.37C117.122 52.593 122.218 46.068 128 40.18c5.782 5.888 10.878 12.413 15.19 19.45 5.828 9.474 10.356 19.689 13.46 30.37ZM169.19 90C164.377 71.449 155.598 54.162 143.46 39.33c28.976 5.109 53.646 24.017 66.11 50.67ZM220.24 172.24 200.49 192l19.75 19.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L192 200.49l-19.76 19.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L183.51 192 163.76 172.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L192 183.51l19.76-19.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
