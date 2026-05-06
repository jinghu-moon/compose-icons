package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightMiddle: ImageVector
    get() {
        if (_alignBoxRightMiddle != null) return _alignBoxRightMiddle!!
        _alignBoxRightMiddle = tablerFilledIcon(
            name = "AlignBoxRightMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM18 14h-2l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L16 16h2l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L18 14ZM18 11h-6l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 13h6l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L18 11ZM18 8h-4l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L14 10h4l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L18 8Z"),
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
        return _alignBoxRightMiddle!!
    }

private var _alignBoxRightMiddle: ImageVector? = null
