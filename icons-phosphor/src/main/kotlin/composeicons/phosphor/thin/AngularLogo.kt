package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorThinIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.54 68.31l-96-40c-.986-.411-2.094-.411-3.08 0l-96 40c-1.683 .685-2.694 2.418-2.46 4.22l16 120c.174 1.313 .986 2.455 2.17 3.05l80 40c1.127 .564 2.453 .564 3.58 0l80-40c1.184-.595 1.996-1.737 2.17-3.05l16-120c.246-1.782-.728-3.508-2.38-4.22ZM204.32 189.37 128 227.53 51.68 189.37 36.37 74.51 128 36.33l91.63 38.18ZM124.5 86.06l-40 72c-1.071 1.933-.373 4.369 1.56 5.44 1.933 1.071 4.369 .373 5.44-1.56L103.69 140h48.62l12.19 21.94c1.071 1.933 3.507 2.631 5.44 1.56 1.933-1.071 2.631-3.507 1.56-5.44l-40-72c-.704-1.273-2.045-2.064-3.5-2.064-1.455 0-2.796 .79-3.5 2.064ZM147.87 132h-39.74L128 96.24Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
