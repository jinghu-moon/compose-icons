package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber7: ImageVector
    get() {
        if (_circleNumber7 != null) return _circleNumber7!!
        _circleNumber7 = tablerFilledIcon(
            name = "CircleNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM14 7h-4l-.117 .007c-.459 .054-.822 .417-.876 .876L9 8l.007 .117c.054 .459 .417 .822 .876 .876L10 9h2.718l-1.688 6.757-.022 .115c-.065 .503 .257 .975 .749 1.098 .492 .123 .998-.142 1.178-.616l.035-.111 2-8 .021-.112c.035-.266-.038-.535-.203-.747-.165-.212-.408-.348-.675-.378L14 7Z"),
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
        return _circleNumber7!!
    }

private var _circleNumber7: ImageVector? = null
