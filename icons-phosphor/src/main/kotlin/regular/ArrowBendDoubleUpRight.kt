package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorRegularIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 178.534 160.786 173.466 160.786 170.340 157.660 C 167.214 154.534 167.214 149.466 170.340 146.340 L 212.690 104.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 ZM 181.660 98.340 L 133.660 50.340 C 130.534 47.214 125.466 47.214 122.340 50.340 C 119.214 53.466 119.214 58.534 122.340 61.660 L 156.690 96.000 L 128.000 96.000 C 70.588 96.061 24.061 142.588 24.000 200.000 C 24.000 204.418 27.582 208.000 32.000 208.000 C 36.418 208.000 40.000 204.418 40.000 200.000 C 40.055 151.422 79.422 112.055 128.000 112.000 L 156.690 112.000 L 122.340 146.340 C 119.214 149.466 119.214 154.534 122.340 157.660 C 125.466 160.786 130.534 160.786 133.660 157.660 L 181.660 109.660 C 183.162 108.159 184.006 106.123 184.006 104.000 C 184.006 101.877 183.162 99.841 181.660 98.340 Z"),
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
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
