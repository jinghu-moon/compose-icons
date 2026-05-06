package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Radar: ImageVector
    get() {
        if (_radar != null) return _radar!!
        _radar = tablerFilledIcon(
            name = "Radar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10c.678-0 1.309 .343 1.678 .911l.053 .089h7.269l.117 .007c.503 .059 .883 .486 .883 .993 0 5.523-4.477 10-10 10-.552 0-1-.448-1-1v-7.269l-.089-.053c-.524-.34-.859-.906-.906-1.529L10 12c0-1.105 .895-2 2-2M21.428 8.666c.163 .514-.11 1.065-.619 1.246-.508 .18-1.068-.075-1.265-.578C18.298 5.824 14.795 3.638 11.094 4.062 7.394 4.486 4.476 7.407 4.056 11.108c-.42 3.701 1.77 7.202 5.281 8.444 .521 .184 .794 .755 .61 1.276-.184 .521-.755 .794-1.276 .61C4.281 19.886 1.543 15.51 2.067 10.883 2.592 6.257 6.24 2.604 10.866 2.075c4.626-.53 9.005 2.203 10.562 6.591M16.8 8.4c.331 .442 .242 1.069-.2 1.4-.442 .331-1.069 .242-1.4-.2C14.261 8.348 12.678 7.759 11.149 8.092 9.619 8.425 8.425 9.619 8.092 11.149c-.333 1.529 .256 3.112 1.508 4.051 .442 .331 .531 .958 .2 1.4-.331 .442-.958 .531-1.4 .2C6.522 15.391 5.638 13.017 6.138 10.723 6.637 8.429 8.429 6.637 10.723 6.138c2.294-.5 4.669 .384 6.077 2.262"),
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
        return _radar!!
    }

private var _radar: ImageVector? = null
