package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorLightIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 130c-2.539-.002-5.072 .253-7.56 .76L173.62 37.89C172.74 35.549 170.501 33.999 168 34h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h27.84l33.37 89c-10.005 5.705-16.891 15.631-18.73 27h-43.32L109.62 93.89C108.74 91.549 106.501 89.999 104 90h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v16.67C14.552 127.38 2.025 146.691 2 168c0 3.314 2.686 6 6 6h10.48c3.01 18.37 18.885 31.856 37.5 31.856 18.615 0 34.49-13.485 37.5-31.856h85c3.191 19.954 21.439 33.92 41.534 31.788 20.094-2.133 35.005-19.619 33.936-39.797C252.881 145.811 236.207 129.998 216 130ZM42 128.39c2.398-.848 4.001-3.116 4-5.66v-20.73h53.84l22.5 60h-107.91C16.671 146.549 27.285 133.609 42 128.39ZM56 194C43.955 193.996 33.49 185.72 30.71 174h50.58C78.51 185.72 68.045 193.996 56 194ZM216 194c-11.433-.007-21.52-7.483-24.854-18.419-3.334-10.936 .868-22.767 10.354-29.151l8.88 23.68c1.165 3.104 4.626 4.675 7.73 3.51 3.104-1.165 4.675-4.626 3.51-7.73l-8.88-23.68c1.081-.136 2.17-.206 3.26-.21 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
