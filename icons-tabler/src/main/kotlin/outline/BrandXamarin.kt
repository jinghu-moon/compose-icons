package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXamarin: ImageVector
    get() {
        if (_brandXamarin != null) return _brandXamarin!!
        _brandXamarin = tablerOutlineIcon(
            name = "BrandXamarin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.958 21.000 L 8.041 21.000 C 7.326 21.000 6.666 20.619 6.309 20.000 L 2.268 13.000 C 1.911 12.381 1.911 11.619 2.268 11.000 L 6.309 4.000 C 6.666 3.381 7.326 3.000 8.041 3.000 L 15.958 3.000 C 16.673 3.000 17.333 3.381 17.690 4.000 L 21.732 11.000 C 22.089 11.619 22.089 12.381 21.732 13.000 L 17.691 20.000 C 17.334 20.619 16.673 21.000 15.958 21.000"),
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
                pathData = parseSvgPathData("M 15.000 16.000 L 9.000 8.000"),
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
                pathData = parseSvgPathData("M 9.000 16.000 L 15.000 8.000"),
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
        return _brandXamarin!!
    }

private var _brandXamarin: ImageVector? = null
