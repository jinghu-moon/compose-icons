package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnapseed: ImageVector
    get() {
        if (_brandSnapseed != null) return _brandSnapseed!!
        _brandSnapseed = tablerOutlineIcon(
            name = "BrandSnapseed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.152 3.115 C 7.978 2.961 7.717 2.961 7.543 3.115 C 4.600 5.695 3.014 8.556 3.000 11.493 C 3.000 14.421 4.586 17.296 7.543 19.885 C 7.717 20.039 7.979 20.039 8.153 19.885 C 11.110 17.296 12.700 14.421 12.700 11.493 C 12.700 8.565 11.100 5.694 8.152 3.115"),
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
        pathData = parseSvgPathData("M 8.000 20.000 L 20.090 19.989 C 20.593 19.989 21.000 19.555 21.000 19.020 L 21.000 12.957 C 21.000 12.422 20.593 11.989 20.090 11.989 L 12.708 11.989"),
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
        return _brandSnapseed!!
    }

private var _brandSnapseed: ImageVector? = null
