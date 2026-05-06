package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorBoldIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 64.47l-144 144c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l144-144c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM47.72 104.27C34.233 90.77 32.161 69.622 42.771 53.761 53.38 37.899 73.717 31.741 91.344 39.052c17.627 7.311 27.634 26.056 23.902 44.77C111.515 102.537 95.083 116.009 76 116c-10.615 .026-20.8-4.198-28.28-11.73ZM60 76c-.004 7.633 5.386 14.206 12.872 15.699 7.486 1.492 14.984-2.511 17.908-9.562 2.924-7.051 .46-15.186-5.886-19.429C78.549 58.464 70.089 59.294 64.69 64.69 61.677 67.681 59.988 71.754 60 76ZM220 180c-.001 19.082-13.48 35.507-32.196 39.23-18.716 3.723-37.455-6.293-44.758-23.922-7.303-17.629-1.137-37.963 14.728-48.566 15.865-10.603 37.011-8.523 50.506 4.968 7.532 7.484 11.753 17.672 11.72 28.29ZM196 180c.015-4.249-1.674-8.327-4.69-11.32h0c-5.399-5.395-13.857-6.226-20.202-1.984-6.345 4.242-8.811 12.375-5.89 19.426 2.921 7.051 10.417 11.057 17.902 9.569C190.607 194.201 195.999 187.632 196 180Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
