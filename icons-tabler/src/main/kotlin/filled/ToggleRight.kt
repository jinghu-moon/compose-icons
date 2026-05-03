package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = tablerFilledIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 9.000 C 17.657 9.000 19.000 10.343 19.000 12.000 C 19.000 13.657 17.657 15.000 16.000 15.000 C 14.343 15.000 13.000 13.657 13.000 12.000 L 13.005 11.824 C 13.098 10.238 14.411 9.000 16.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 5.000 C 19.866 5.000 23.000 8.134 23.000 12.000 C 23.000 15.866 19.866 19.000 16.000 19.000 L 8.000 19.000 C 4.134 19.000 1.000 15.866 1.000 12.000 C 1.000 8.134 4.134 5.000 8.000 5.000 ZM 16.000 7.000 L 8.000 7.000 C 5.239 7.000 3.000 9.239 3.000 12.000 C 3.000 14.761 5.239 17.000 8.000 17.000 L 16.000 17.000 C 18.761 17.000 21.000 14.761 21.000 12.000 C 21.000 9.239 18.761 7.000 16.000 7.000"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
