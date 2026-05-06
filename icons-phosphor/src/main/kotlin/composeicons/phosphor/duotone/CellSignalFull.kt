package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorDuotoneIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40v160c0 4.418-3.582 8-8 8h-160c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L186.34 34.34c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M198.12 25.23c-5.978-2.48-12.862-1.114-17.44 3.46L20.68 188.69c-4.574 4.577-5.941 11.459-3.463 17.437 2.478 5.978 8.312 9.874 14.783 9.873h160c8.837 0 16-7.163 16-16v-160c.011-6.473-3.893-12.309-9.88-14.77ZM192 200h-160L192 40Z"),
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
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
