package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) return _treeDeciduous!!
        _treeDeciduous = lucideOutlineIcon(
            name = "TreeDeciduous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 19.000 C 6.238 19.004 4.682 17.855 4.166 16.170 C 3.651 14.486 4.298 12.663 5.760 11.680 C 4.861 10.557 4.741 8.999 5.456 7.752 C 6.172 6.505 7.577 5.822 9.000 6.030 L 9.000 6.000 C 9.000 4.343 10.343 3.000 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 L 15.000 6.040 C 16.423 5.832 17.828 6.515 18.544 7.762 C 19.259 9.009 19.139 10.567 18.240 11.690 C 19.693 12.676 20.333 14.493 19.819 16.172 C 19.304 17.850 17.756 18.997 16.000 19.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 19.000 L 12.000 22.000"),
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
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
