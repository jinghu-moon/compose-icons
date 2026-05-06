package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorRegularIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.33 141.06c-6.032-4.647-13.888-6.211-21.24-4.23l-41.84 9.62c1.972-8.331 .025-17.106-5.287-23.821C156.652 115.915 148.561 111.999 140 112h-50.06c-8.491-.021-16.639 3.352-22.63 9.37L44.69 144h-28.69C7.163 144 0 151.163 0 160v40c0 8.837 7.163 16 16 16h104c.654 0 1.306-.08 1.94-.24l64-16c.408-.097 .806-.231 1.19-.4L226 182.82l.44-.2c7.594-3.795 12.695-11.238 13.495-19.69 .799-8.452-2.816-16.719-9.565-21.87ZM16 160h24v40h-24ZM219.43 168.21l-38 16.18L119 200h-63v-44.69L78.63 132.69c2.99-3.014 7.064-4.704 11.31-4.69h50.06c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c.602-.002 1.202-.069 1.79-.2l67-15.41 .31-.08c4.236-1.176 8.676 1.032 10.296 5.119 1.619 4.087-.104 8.737-3.996 10.781ZM154.34 77.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L184 84.69v-60.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v60.69L218.34 66.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
