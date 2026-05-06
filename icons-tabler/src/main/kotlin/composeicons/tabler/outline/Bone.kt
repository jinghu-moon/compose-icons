package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 3c1.657 0 3 1.343 3 3 1.358-0 2.546 .911 2.898 2.223 .352 1.311-.221 2.696-1.397 3.375-1.176 .679-2.661 .484-3.621-.476l-4.758 4.758c.944 .945 1.15 2.4 .504 3.57-.645 1.17-1.986 1.771-3.289 1.476C7.034 20.631 6.084 19.51 6.005 18.177v-.177h-.176C4.495 17.922 3.374 16.971 3.079 15.667c-.295-1.303 .308-2.645 1.478-3.29 1.17-.645 2.626-.438 3.571 .507L12.885 8.127C12.027 7.269 11.77 5.979 12.234 4.858c.464-1.121 1.558-1.852 2.771-1.853L15 3"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
