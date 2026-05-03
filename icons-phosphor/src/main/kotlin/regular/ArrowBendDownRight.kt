package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorRegularIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 157.660 L 181.660 205.660 C 178.534 208.786 173.466 208.786 170.340 205.660 C 167.214 202.534 167.214 197.466 170.340 194.340 L 204.690 160.000 L 128.000 160.000 C 70.588 159.939 24.061 113.412 24.000 56.000 C 24.000 51.582 27.582 48.000 32.000 48.000 C 36.418 48.000 40.000 51.582 40.000 56.000 C 40.055 104.578 79.422 143.945 128.000 144.000 L 204.690 144.000 L 170.340 109.660 C 167.214 106.534 167.214 101.466 170.340 98.340 C 173.466 95.214 178.534 95.214 181.660 98.340 L 229.660 146.340 C 231.162 147.841 232.006 149.877 232.006 152.000 C 232.006 154.123 231.162 156.159 229.660 157.660 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
