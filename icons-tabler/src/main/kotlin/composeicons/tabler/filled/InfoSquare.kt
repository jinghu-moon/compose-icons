package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoSquare: ImageVector
    get() {
        if (_infoSquare != null) return _infoSquare!!
        _infoSquare = tablerFilledIcon(
            name = "InfoSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.589-0 2.902 1.238 2.995 2.824L22 5v14c0 1.589-1.238 2.902-2.824 2.995L19 22h-14C3.411 22 2.098 20.762 2.005 19.176L2 19v-14C2 3.411 3.238 2.098 4.824 2.005L5 2h14ZM12 11h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 13v3l.007 .117c.054 .459 .417 .822 .876 .876L12 17h1l.117-.007c.459-.054 .822-.417 .876-.876L14 16l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L13 15v-3l-.007-.117c-.054-.459-.417-.822-.876-.876L12 11ZM12.01 8l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 10l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 8Z"),
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
        return _infoSquare!!
    }

private var _infoSquare: ImageVector? = null
