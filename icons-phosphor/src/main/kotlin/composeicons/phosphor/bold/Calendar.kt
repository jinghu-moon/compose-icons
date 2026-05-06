package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorBoldIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-20v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-72v-4C92 17.373 86.627 12 80 12 73.373 12 68 17.373 68 24v4h-20C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM68 52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h16v24h-152v-24ZM52 204v-104h152v104ZM112 124v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-36.68c-5.919 1.943-12.341-.968-14.782-6.699-2.441-5.732-.09-12.379 5.412-15.301l16-8c3.712-1.857 8.12-1.665 11.655 .509 3.536 2.174 5.697 6.021 5.715 10.171ZM173.49 157.88 163.9 168h4.1c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-4.793-.002-9.125-2.855-11.019-7.259-1.894-4.403-.986-9.511 2.309-12.991L155.45 142c.356-.607 .546-1.297 .55-2 .005-1.815-1.213-3.405-2.965-3.874-1.753-.469-3.602 .3-4.505 1.874-3.374 5.605-10.616 7.474-16.282 4.202-5.665-3.272-7.666-10.478-4.498-16.202 6.336-10.976 19.255-16.328 31.497-13.048 12.242 3.28 20.754 14.374 20.753 27.048 .018 6.086-1.963 12.01-5.64 16.86-.268 .358-.559 .699-.87 1.02Z"),
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
