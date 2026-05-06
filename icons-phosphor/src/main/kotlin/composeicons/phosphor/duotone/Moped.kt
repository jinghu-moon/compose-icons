package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorDuotoneIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M131 168h-123C7.994 147.653 20.817 129.512 40 122.73v-26.73h64Z"),
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
                pathData = parseSvgPathData("M216 128c-2.1-.001-4.197 .166-6.27 .5L175.49 37.19C174.319 34.068 171.334 32 168 32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h26.46l32.3 86.13c-9.277 5.808-15.779 15.153-18 25.87h-40.22L111.54 93.19C110.362 90.051 107.353 87.979 104 88h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v13.39C12.473 126.685 .024 146.373 0 168c0 4.418 3.582 8 8 8h8.8c3.786 18.643 20.177 32.04 39.2 32.04 19.023 0 35.414-13.398 39.2-32.04h81.6c4.21 20.624 23.683 34.456 44.543 31.641 20.86-2.816 35.968-21.316 34.56-42.318C254.493 144.321 237.049 128.004 216 128ZM56 192C45.832 191.997 36.769 185.587 33.38 176h45.24C75.231 185.587 66.168 191.997 56 192ZM16.81 160c2.815-13.757 12.626-25.036 25.86-29.73 3.194-1.131 5.329-4.152 5.33-7.54v-18.73h50.46l21 56ZM216 192c-10.078-.011-19.075-6.317-22.524-15.786-3.449-9.469-.615-20.084 7.094-26.574l7.94 21.17c1.552 4.142 6.168 6.242 10.31 4.69 4.142-1.552 6.242-6.168 4.69-10.31L215.55 144h.45c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
