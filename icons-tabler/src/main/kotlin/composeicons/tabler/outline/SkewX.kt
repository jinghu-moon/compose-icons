package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewX: ImageVector
    get() {
        if (_skewX != null) return _skewX!!
        _skewX = tablerOutlineIcon(
            name = "SkewX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5.205v13.59c-0 .297 .132 .579 .361 .769 .229 .19 .53 .268 .823 .214l14-2.625c.473-.089 .816-.502 .816-.983v-8.34c0-.481-.343-.894-.816-.983L5.184 4.222c-.292-.055-.594 .024-.823 .214C4.132 4.626 4 4.908 4 5.205"),
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
        return _skewX!!
    }

private var _skewX: ImageVector? = null
