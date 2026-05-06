package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxCenterMiddle: ImageVector
    get() {
        if (_alignBoxCenterMiddle != null) return _alignBoxCenterMiddle!!
        _alignBoxCenterMiddle = tablerFilledIcon(
            name = "AlignBoxCenterMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.589-0 2.902 1.238 2.995 2.824L22 5v14c0 1.589-1.238 2.902-2.824 2.995L19 22h-14C3.42 22 2.111 20.774 2.007 19.198L2 19v-14C2 3.411 3.238 2.098 4.824 2.005L5 2h14ZM13 14h-2l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 16h2l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L13 14ZM15 11h-6l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L9 13h6l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L15 11ZM14 8h-4l-.117 .007C9.38 8.067 9.001 8.493 9.001 9c0 .507 .379 .933 .882 .993L10 10h4l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L14 8Z"),
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
        return _alignBoxCenterMiddle!!
    }

private var _alignBoxCenterMiddle: ImageVector? = null
