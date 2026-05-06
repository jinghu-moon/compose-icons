package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = tablerOutlineIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.141 4.163 18.141 5.877c.493 .07 .859 .492 .859 .99v10.266c-0 .498-.366 .92-.859 .99L6.141 19.837c-.287 .041-.577-.045-.796-.235C5.126 19.412 5 19.137 5 18.847v-13.694c0-.29 .126-.565 .345-.755 .219-.19 .509-.276 .796-.235"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
