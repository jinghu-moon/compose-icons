package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = phosphorDuotoneIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 152h32v56h-32c-4.418 0-8-3.582-8-8v-40c0-4.418 3.582-8 8-8ZM204 56c-4.151 .003-8.25 .928-12 2.71h0C191.441 46.38 182.874 35.87 170.909 32.837c-11.965-3.033-24.504 2.126-30.87 12.701-6.366 10.575-5.056 24.071 3.225 33.224 8.28 9.153 21.578 11.805 32.736 6.528h0c.705 15.276 13.535 27.161 28.821 26.697 15.285-.464 27.371-13.107 27.147-28.397C231.743 68.299 219.292 56.016 204 56Z"),
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
                pathData = parseSvgPathData("M230.33 141.06c-6.034-4.643-13.888-6.207-21.24-4.23l-41.84 9.62c1.972-8.331 .025-17.106-5.287-23.821C156.652 115.915 148.561 111.999 140 112h-50.06c-8.491-.021-16.639 3.352-22.63 9.37L44.69 144h-28.69C7.163 144 0 151.163 0 160v40c0 8.837 7.163 16 16 16h104c.654 0 1.306-.08 1.94-.24l64-16c.408-.097 .806-.231 1.19-.4L226 182.82l.44-.2c7.594-3.795 12.695-11.238 13.495-19.69 .799-8.452-2.816-16.719-9.565-21.87ZM16 160h24v40h-24ZM219.43 168.21l-38 16.18L119 200h-63v-44.69L78.63 132.69c2.99-3.014 7.064-4.704 11.31-4.69h50.06c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c.602-.002 1.202-.069 1.79-.2l67-15.41 .31-.08c4.236-1.176 8.676 1.032 10.296 5.119 1.619 4.087-.104 8.737-3.996 10.781ZM164 96c1.977 .002 3.95-.158 5.9-.48 6.106 18.136 25.332 28.325 43.768 23.196 18.436-5.129 29.637-23.785 25.499-42.468C235.028 57.566 216.997 45.385 198.12 48.52 192.26 31.102 174.22 20.894 156.271 24.839c-17.949 3.946-30.045 20.778-28.061 39.048C130.195 82.158 145.622 96 164 96ZM224 84c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM164 40c8.966 .004 16.834 5.976 19.25 14.61-8.285 5.829-13.73 14.88-15 24.93-1.397 .302-2.821 .456-4.25 .46C152.954 80 144 71.046 144 60c0-11.046 8.954-20 20-20Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
