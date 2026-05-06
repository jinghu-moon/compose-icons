package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorThinIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM97.08 147.73C78.05 127.35 68 103.93 68 80 68 46.863 94.863 20 128 20c33.137 0 60 26.863 60 60 0 23.93-10.05 47.35-29.08 67.73-8.505 9.203-18.236 17.191-28.92 23.74-1.238 .715-2.762 .715-4 0C115.316 164.921 105.585 156.933 97.08 147.73ZM76 80c0 47.09 42.25 77 52 83.3 9.75-6.28 52-36.21 52-83.3C180 51.281 156.719 28 128 28 99.281 28 76 51.281 76 80ZM201.38 151.38c-2.074-.762-4.373 .301-5.135 2.375-.762 2.074 .301 4.373 2.375 5.135 18.67 6.89 29.38 16 29.38 25.11 0 17.39-40.18 36-100 36C68.18 220 28 201.39 28 184c0-9.07 10.71-18.22 29.38-25.11 2.074-.762 3.137-3.061 2.375-5.135-.762-2.074-3.061-3.137-5.135-2.375C32.29 159.62 20 171.21 20 184c0 12.46 11.73 23.83 33 32 20.09 7.73 46.72 12 75 12 28.28 0 54.89-4.25 75-12 21.29-8.19 33-19.56 33-32 0-12.79-12.29-24.38-34.62-32.62Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
