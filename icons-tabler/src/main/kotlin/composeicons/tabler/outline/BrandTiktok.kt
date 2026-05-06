package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerOutlineIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7.917v4.034C19.186 11.771 17.456 11.096 16 10v4.5c-.001 3.394-2.613 6.216-5.997 6.479C6.619 21.242 3.603 18.857 3.078 15.503 2.554 12.15 4.697 8.957 8 8.174v4.326c-.941 .705-1.262 1.971-.773 3.04 .489 1.069 1.657 1.653 2.806 1.403C11.181 16.692 12 15.676 12 14.5v-11.5h4.083c.427 2.518 2.399 4.49 4.917 4.917"),
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
