package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorRegularIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 C 208.000 36.418 204.418 40.000 200.000 40.000 C 151.422 40.055 112.055 79.422 112.000 128.000 L 112.000 204.690 L 146.340 170.340 C 149.466 167.214 154.534 167.214 157.660 170.340 C 160.786 173.466 160.786 178.534 157.660 181.660 L 109.660 229.660 C 108.159 231.162 106.123 232.006 104.000 232.006 C 101.877 232.006 99.841 231.162 98.340 229.660 L 50.340 181.660 C 47.214 178.534 47.214 173.466 50.340 170.340 C 53.466 167.214 58.534 167.214 61.660 170.340 L 96.000 204.690 L 96.000 128.000 C 96.061 70.588 142.588 24.061 200.000 24.000 C 204.418 24.000 208.000 27.582 208.000 32.000 Z"),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
