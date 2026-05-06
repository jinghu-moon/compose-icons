package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoHexagon: ImageVector
    get() {
        if (_infoHexagon != null) return _infoHexagon!!
        _infoHexagon = tablerFilledIcon(
            name = "InfoHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c.935-.515 2.06-.552 3.026-.097l.19 .097 6.775 3.995 .096 .063 .092 .077 .107 .075c.702 .527 1.159 1.317 1.266 2.188l.018 .202L22 8.218v7.284c0 1.106-.57 2.129-1.454 2.693l-.17 .1-6.803 4.302c-.918 .504-2.019 .535-3.004 .068l-.196-.1L3.678 18.328C2.71 17.798 2.079 16.81 2.007 15.709L2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414ZM12 11h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 13v3l.007 .117c.054 .459 .417 .822 .876 .876L12 17h1l.117-.007c.459-.054 .822-.417 .876-.876L14 16l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L13 15v-3l-.007-.117c-.054-.459-.417-.822-.876-.876L12 11ZM12.01 8l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 10l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 8Z"),
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
        return _infoHexagon!!
    }

private var _infoHexagon: ImageVector? = null
