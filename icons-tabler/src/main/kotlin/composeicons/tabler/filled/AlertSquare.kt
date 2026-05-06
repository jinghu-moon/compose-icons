package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertSquare: ImageVector
    get() {
        if (_alertSquare != null) return _alertSquare!!
        _alertSquare = tablerFilledIcon(
            name = "AlertSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.589-0 2.902 1.238 2.995 2.824L22 5v14c0 1.589-1.238 2.902-2.824 2.995L19 22h-14C3.411 22 2.098 20.762 2.005 19.176L2 19v-14C2 3.411 3.238 2.098 4.824 2.005L5 2h14ZM12.01 15l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 17l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 15ZM12 7c-.507 0-.934 .38-.993 .883L11 8v4l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 12v-4l-.007-.117C12.934 7.38 12.507 7 12 7Z"),
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
        return _alertSquare!!
    }

private var _alertSquare: ImageVector? = null
