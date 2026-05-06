package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerFilledIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c1.836-0 3.436 1.249 3.881 3.03l.016 .072 .08 .019c1.337 .337 2.406 1.338 2.83 2.65l.057 .193c.418 1.559-.142 3.218-1.42 4.204-1.279 .986-3.025 1.107-4.427 .306l-.047-.029-3.525 3.525 .042 .07c.64 1.139 .684 2.519 .117 3.696l-.102 .197c-.86 1.56-2.649 2.363-4.386 1.969C6.656 21.57 5.504 20.449 5.134 18.998l-.023-.095-.138-.033C3.607 18.506 2.535 17.448 2.153 16.087l-.05-.199c-.349-1.543 .243-3.146 1.512-4.091 1.269-.945 2.975-1.053 4.353-.277l.068 .04L11.56 8.036l-.036-.061C10.955 6.97 10.849 5.769 11.231 4.68l.079-.205c.619-1.495 2.077-2.47 3.695-2.47l-.139 .004 .02-.003Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
