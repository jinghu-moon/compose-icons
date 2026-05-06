package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorThinIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 116h-30.34L165.17 71.52C162.928 69.26 159.874 67.992 156.69 68h-112.41c-4.017-.006-7.771 1.998-10 5.34L4.67 117.78c-.438 .658-.671 1.43-.67 2.22v48c0 6.627 5.373 12 12 12h20.29c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h72.58c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h20.29c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM41 77.78c.733-1.098 1.96-1.764 3.28-1.78h112.41c1.058 .002 2.072 .422 2.82 1.17L198.34 116h-182.87ZM64 196C52.954 196 44 187.046 44 176c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM192 196c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM244 168c0 2.209-1.791 4-4 4h-20.29C217.713 158.233 205.911 148.019 192 148.019c-13.911 0-25.713 10.213-27.71 23.981h-72.58C89.713 158.233 77.911 148.019 64 148.019c-13.911 0-25.713 10.213-27.71 23.981h-20.29c-2.209 0-4-1.791-4-4v-44h228c2.209 0 4 1.791 4 4Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
