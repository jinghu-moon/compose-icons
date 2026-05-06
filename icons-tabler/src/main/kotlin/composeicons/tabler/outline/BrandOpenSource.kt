package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) return _brandOpenSource!!
        _brandOpenSource = tablerOutlineIcon(
            name = "BrandOpenSource",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c4.26-.002 7.938 2.982 8.813 7.152 .875 4.169-1.293 8.381-5.195 10.091L13.425 14.641c1.209-.652 1.821-2.043 1.484-3.375C14.573 9.934 13.374 9.001 12 9.001c-1.374 0-2.572 .933-2.909 2.265-.336 1.332 .275 2.722 1.484 3.375L8.383 20.244C4.48 18.535 2.311 14.323 3.185 10.152 4.06 5.982 7.739 2.997 12 3"),
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
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
