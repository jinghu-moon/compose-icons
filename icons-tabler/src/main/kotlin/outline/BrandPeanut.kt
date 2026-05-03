package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPeanut: ImageVector
    get() {
        if (_brandPeanut != null) return _brandPeanut!!
        _brandPeanut = tablerOutlineIcon(
            name = "BrandPeanut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 16.250 L 14.184 15.890 L 13.722 15.694 C 12.278 15.102 11.722 15.101 10.275 15.694 L 9.813 15.889 L 8.996 16.248 C 7.132 16.904 5.058 16.267 3.883 14.677 C 2.709 13.088 2.709 10.918 3.883 9.329 C 5.058 7.739 7.132 7.102 8.996 7.758 L 10.050 8.220 L 10.484 8.398 C 11.776 8.905 12.347 8.878 13.721 8.316 L 14.183 8.121 L 15.000 7.762 C 16.864 7.106 18.938 7.743 20.113 9.333 C 21.287 10.922 21.287 13.092 20.113 14.681 C 18.938 16.271 16.864 16.908 15.000 16.252"),
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
        return _brandPeanut!!
    }

private var _brandPeanut: ImageVector? = null
