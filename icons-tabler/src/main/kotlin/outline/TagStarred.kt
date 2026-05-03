package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagStarred: ImageVector
    get() {
        if (_tagStarred != null) return _tagStarred!!
        _tagStarred = tablerOutlineIcon(
            name = "TagStarred",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.500 7.500 C 6.500 8.052 6.948 8.500 7.500 8.500 C 8.052 8.500 8.500 8.052 8.500 7.500 C 8.500 6.948 8.052 6.500 7.500 6.500 C 6.948 6.500 6.500 6.948 6.500 7.500"),
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
        pathData = parseSvgPathData("M 3.000 6.000 L 3.000 11.172 C 3.000 11.702 3.211 12.211 3.586 12.586 L 11.296 20.296 C 12.237 21.237 13.763 21.237 14.704 20.296 L 20.296 14.704 C 21.237 13.763 21.237 12.237 20.296 11.296 L 12.586 3.586 C 12.211 3.211 11.702 3.000 11.172 3.000 L 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000"),
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
        pathData = parseSvgPathData("M 12.500 13.847 L 11.000 15.000 L 11.532 13.143 L 10.000 12.000 L 11.902 12.000 L 12.500 10.200 L 13.098 12.000 L 15.000 12.000 L 13.468 13.143 L 14.000 15.000 L 12.500 13.847"),
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
        return _tagStarred!!
    }

private var _tagStarred: ImageVector? = null
