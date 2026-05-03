package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPrisma: ImageVector
    get() {
        if (_brandPrisma != null) return _brandPrisma!!
        _brandPrisma = tablerOutlineIcon(
            name = "BrandPrisma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.186 16.202 L 7.801 21.515 C 8.066 21.905 8.555 22.085 9.016 21.962 L 19.182 19.244 C 19.495 19.163 19.755 18.948 19.893 18.656 C 20.031 18.364 20.032 18.026 19.895 17.733 L 12.390 2.250 C 12.318 2.102 12.171 2.006 12.006 1.999 C 11.842 1.992 11.687 2.076 11.603 2.217 L 4.150 15.055 C 3.939 15.412 3.953 15.859 4.187 16.202 L 4.186 16.202"),
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
                pathData = parseSvgPathData("M 8.500 22.000 L 12.000 2.000"),
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
        return _brandPrisma!!
    }

private var _brandPrisma: ImageVector? = null
