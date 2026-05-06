package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertCircle: ImageVector
    get() {
        if (_alertCircle != null) return _alertCircle!!
        _alertCircle = tablerFilledIcon(
            name = "AlertCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 .004 5.463-4.376 9.918-9.838 10.007C6.7 22.095 2.178 17.784 2.005 12.324L2 12l.004-.28C2.152 6.327 6.57 2 12 2ZM12.01 15l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 17l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 15ZM12 7c-.507 0-.934 .38-.993 .883L11 8v4l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 12v-4l-.007-.117C12.934 7.38 12.507 7 12 7Z"),
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
        return _alertCircle!!
    }

private var _alertCircle: ImageVector? = null
