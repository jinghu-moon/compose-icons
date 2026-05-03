package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) return _folderHeart!!
        _folderHeart = tablerOutlineIcon(
            name = "FolderHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 19.000 L 5.000 19.000 C 3.895 19.000 3.000 18.105 3.000 17.000 L 3.000 6.000 C 3.000 4.895 3.895 4.000 5.000 4.000 L 9.000 4.000 L 12.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 22.000 L 21.350 18.716 C 21.765 18.313 22.000 17.760 22.001 17.182 C 22.002 16.603 21.769 16.049 21.355 15.645 C 20.486 14.795 19.098 14.793 18.226 15.639 L 18.002 15.859 L 17.779 15.639 C 16.910 14.790 15.523 14.787 14.651 15.633 C 14.236 16.036 14.001 16.589 14.000 17.167 C 13.999 17.746 14.231 18.300 14.645 18.704 L 18.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
