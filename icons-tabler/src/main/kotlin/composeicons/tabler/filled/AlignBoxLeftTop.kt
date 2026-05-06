package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxLeftTop: ImageVector
    get() {
        if (_alignBoxLeftTop != null) return _alignBoxLeftTop!!
        _alignBoxLeftTop = tablerFilledIcon(
            name = "AlignBoxLeftTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM8 11h-2l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h2l.117-.007c.525-.062 .911-.523 .88-1.052C8.966 11.413 8.529 11.001 8 11ZM12 8h-6l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h6l.117-.007c.525-.062 .911-.523 .88-1.052C12.966 8.413 12.529 8.001 12 8ZM10 5h-4l-.117 .007c-.525 .062-.911 .523-.88 1.052C5.034 6.587 5.471 6.999 6 7h4l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 5.413 10.529 5.001 10 5Z"),
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
        return _alignBoxLeftTop!!
    }

private var _alignBoxLeftTop: ImageVector? = null
