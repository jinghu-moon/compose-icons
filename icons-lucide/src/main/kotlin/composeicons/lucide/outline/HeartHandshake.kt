package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) return _heartHandshake!!
        _heartHandshake = lucideOutlineIcon(
            name = "HeartHandshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.414 14.414C21 12.828 22 11.5 22 9.5 22 7.222 20.596 5.18 18.468 4.364 16.341 3.549 13.932 4.13 12.409 5.824c-.23 .215-.587 .215-.818 .001C10.069 4.131 7.659 3.55 5.532 4.365 3.405 5.18 2 7.222 2 9.5c0 2.3 1.5 4 3 5.5l5.535 5.362c.37 .398 .885 .628 1.428 .638 .543 .01 1.067-.202 1.451-.586 .398-.398 .621-.938 .62-1.501-.001-.563-.225-1.102-.624-1.499 .526 .582 1.33 .826 2.091 .636 .761-.19 1.355-.784 1.545-1.545 .19-.761-.054-1.565-.636-2.091 .398 .398 .939 .622 1.502 .622 .563 0 1.104-.224 1.502-.622 .781-.781 .781-2.047 0-2.828L17.533 9.704c-.452-.452-1.065-.706-1.705-.706-.639 0-1.253 .254-1.705 .706l-1.71 1.71c-.781 .781-2.047 .781-2.828 0-.781-.781-.781-2.047 0-2.828L12.409 5.824"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
