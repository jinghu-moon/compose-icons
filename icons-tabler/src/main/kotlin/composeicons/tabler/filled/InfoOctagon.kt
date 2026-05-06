package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoOctagon: ImageVector
    get() {
        if (_infoOctagon != null) return _infoOctagon!!
        _infoOctagon = tablerFilledIcon(
            name = "InfoOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.897 1c.983-0 1.931 .362 2.664 1.016l.165 .156 4.1 4.1c.697 .695 1.112 1.623 1.168 2.605L23 9.104v5.794c0 .983-.362 1.931-1.016 2.664l-.156 .165-4.1 4.1c-.695 .696-1.621 1.112-2.603 1.168l-.227 .006h-5.795C8.12 23.001 7.172 22.639 6.439 21.984l-.165-.156L2.174 17.728C1.478 17.033 1.062 16.106 1.006 15.124L1 14.897v-5.794C1 8.12 1.362 7.172 2.016 6.439l.156-.165L6.272 2.174C6.967 1.477 7.895 1.062 8.877 1.006L9.104 1h5.793ZM12 11h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 13v3l.007 .117c.054 .459 .417 .822 .876 .876L12 17h1l.117-.007c.459-.054 .822-.417 .876-.876L14 16l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L13 15v-3l-.007-.117c-.054-.459-.417-.822-.876-.876L12 11ZM12.01 8l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 10l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 8Z"),
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
        return _infoOctagon!!
    }

private var _infoOctagon: ImageVector? = null
