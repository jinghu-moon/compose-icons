package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorRegularIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-80v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM72 48v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h80v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v32h-160v-32ZM208 208h-160v-112h160v112ZM112 120v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-51.06l-4.42 2.22c-3.954 1.977-8.763 .374-10.74-3.58-1.977-3.954-.374-8.763 3.58-10.74l16-8c2.481-1.241 5.428-1.109 7.787 .35 2.359 1.459 3.795 4.036 3.793 6.81ZM171.16 150.45 152 176h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378l28.78-38.37c1.784-2.375 2.105-5.542 .835-8.226-1.27-2.685-3.923-4.444-6.89-4.571-2.967-.127-5.76 1.401-7.255 3.967-1.388 2.556-4.053 4.157-6.962 4.182-2.908 .025-5.601-1.53-7.032-4.062-1.432-2.532-1.376-5.641 .144-8.12 5.433-9.402 16.503-13.985 26.992-11.174 10.489 2.811 17.784 12.315 17.788 23.174 .017 5.217-1.684 10.295-4.84 14.45Z"),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
