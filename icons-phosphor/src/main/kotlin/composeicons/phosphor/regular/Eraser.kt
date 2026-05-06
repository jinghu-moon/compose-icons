package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorRegularIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225 80.4 183.6 39c-9.372-9.372-24.568-9.372-33.94 0L31 157.66c-9.372 9.372-9.372 24.568 0 33.94l30.06 30.06c1.506 1.505 3.551 2.347 5.68 2.34h149.26c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-84.7L225 114.34c9.372-9.372 9.372-24.568 0-33.94ZM108.68 208h-38.63L42.33 180.28c-3.122-3.124-3.122-8.186 0-11.31L96 115.31 148.69 168ZM213.68 103 160 156.69 107.31 104 161 50.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l41.38 41.38c3.122 3.124 3.122 8.186 0 11.31Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
