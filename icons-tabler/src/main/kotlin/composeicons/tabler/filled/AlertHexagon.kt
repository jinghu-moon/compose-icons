package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertHexagon: ImageVector
    get() {
        if (_alertHexagon != null) return _alertHexagon!!
        _alertHexagon = tablerFilledIcon(
            name = "AlertHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c.935-.515 2.06-.552 3.026-.097l.19 .097 6.775 3.995 .096 .063 .092 .077 .107 .075c.702 .527 1.159 1.317 1.266 2.188l.018 .202L22 8.218v7.284c0 1.106-.57 2.129-1.454 2.693l-.17 .1-6.803 4.302c-.918 .504-2.019 .535-3.004 .068l-.196-.1L3.678 18.328C2.71 17.798 2.079 16.81 2.007 15.709L2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414ZM12.01 15l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 17l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 15ZM12 7c-.507 0-.934 .38-.993 .883L11 8v4l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 12v-4l-.007-.117C12.934 7.38 12.507 7 12 7Z"),
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
        return _alertHexagon!!
    }

private var _alertHexagon: ImageVector? = null
