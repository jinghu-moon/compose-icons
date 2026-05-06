package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodAngry: ImageVector
    get() {
        if (_moodAngry != null) return _moodAngry!!
        _moodAngry = tablerFilledIcon(
            name = "MoodAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12 14c-1.209-0-2.368 .486-3.214 1.35-.256 .254-.356 .626-.261 .974 .095 .348 .37 .618 .72 .706 .35 .088 .72-.019 .969-.28 .47-.48 1.114-.751 1.786-.751 .672 0 1.316 .271 1.786 .751 .388 .385 1.014 .387 1.404 .004 .39-.383 .401-1.008 .024-1.404C14.368 14.486 13.209 14 12 14M8.447 8.105C7.957 7.878 7.375 8.082 7.133 8.566c-.242 .483-.056 1.071 .42 1.327l2 1c.49 .227 1.072 .023 1.314-.461 .242-.483 .056-1.071-.42-1.327ZM16.894 8.552c-.247-.494-.847-.694-1.341-.447l-2 1c-.476 .256-.661 .844-.42 1.327 .242 .483 .823 .687 1.314 .461l2-1c.494-.247 .694-.847 .447-1.341"),
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
        return _moodAngry!!
    }

private var _moodAngry: ImageVector? = null
