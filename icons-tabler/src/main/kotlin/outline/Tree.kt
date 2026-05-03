package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = tablerOutlineIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.000 L 10.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 14.000 10.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 21.000 L 12.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.824 16.000 C 8.938 15.948 8.121 15.507 7.592 14.795 C 7.062 14.083 6.875 13.173 7.081 12.310 C 6.346 11.698 5.947 10.771 6.007 9.816 C 6.067 8.861 6.579 7.992 7.385 7.477 C 6.665 6.198 6.976 4.586 8.121 3.667 C 9.265 2.747 10.906 2.791 12.000 3.770 C 13.094 2.793 14.734 2.750 15.878 3.669 C 17.021 4.587 17.333 6.198 16.614 7.477 C 17.420 7.992 17.933 8.861 17.993 9.816 C 18.053 10.771 17.654 11.698 16.919 12.310 C 17.132 13.203 16.924 14.144 16.355 14.865 C 15.786 15.585 14.918 16.005 14.000 16.005 L 10.000 16.005 L 9.824 16.000"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
