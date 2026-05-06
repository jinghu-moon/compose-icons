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
                pathData = parseSvgPathData("M15 16.25l-.816-.36-.462-.196c-1.444-.592-2-.593-3.447 0l-.462 .195-.817 .359c-1.864 .656-3.938 .019-5.113-1.571C2.709 13.088 2.709 10.918 3.883 9.329 5.058 7.739 7.132 7.102 8.996 7.758l1.054 .462 .434 .178c1.292 .507 1.863 .48 3.237-.082l.462-.195L15 7.762c1.864-.656 3.938-.019 5.113 1.571 1.174 1.589 1.174 3.759 0 5.348C18.938 16.271 16.864 16.908 15 16.252"),
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
