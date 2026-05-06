package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = tablerFilledIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.498 0 10 4.002 10 9 0 1.351-.6 2.64-1.654 3.576C19.316 15.49 17.934 16 16.5 16h-2.516c-.459-.007-.864 .299-.982 .742-.118 .444 .081 .911 .482 1.133 .07 .039 .135 .086 .194 .14 .701 .647 .93 1.659 .576 2.545-.354 .886-1.219 1.46-2.173 1.445l-.156-.009 .068 .004-.273-.004C6.42 21.85 2.15 17.58 2.004 12.28L2 12C2 6.477 6.477 2 12 2M8.5 8.5C7.453 8.5 6.583 9.306 6.505 10.35l-.005 .15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2M16.5 8.5c-1.047-0-1.917 .806-1.995 1.85l-.005 .15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2M12.5 5.5c-1.047-0-1.917 .806-1.995 1.85l-.005 .15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
