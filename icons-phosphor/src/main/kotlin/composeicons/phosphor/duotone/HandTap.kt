package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorDuotoneIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 148v36c0 24-8 40-8 40h-136L42.68 174c-5.434-9.557-2.135-21.708 7.386-27.205 9.521-5.497 21.694-2.279 27.254 7.205L96 184v-108c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v16c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
                pathData = parseSvgPathData("M56 76C56 42.863 82.863 16 116 16c33.137 0 60 26.863 60 60 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C160 51.699 140.301 32 116 32 91.699 32 72 51.699 72 76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM196 120c-4.667-.005-9.26 1.16-13.36 3.39-2.478-7.669-8.141-13.899-15.541-17.095-7.399-3.196-15.817-3.048-23.099 .405v-30.7C144 60.536 131.464 48 116 48 100.536 48 88 60.536 88 76v80l-3.82-6.13C76.401 136.502 59.258 131.971 45.89 139.75c-13.368 7.779-17.899 24.922-10.12 38.29l29.32 50c1.34 2.654 4.041 4.345 7.013 4.393 2.972 .048 5.726-1.557 7.15-4.166 1.424-2.609 1.285-5.793-.363-8.267L49.6 170c-2.238-3.718-2.295-8.354-.149-12.125 2.146-3.771 6.162-6.09 10.501-6.064 4.339 .026 8.326 2.393 10.428 6.189l.14 .23 18.68 30c1.885 3.041 5.559 4.461 8.998 3.478 3.44-.983 5.809-4.13 5.802-7.708v-108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36c0 21.61-7.1 36.3-7.16 36.42-1.973 3.952-.371 8.755 3.58 10.73 1.11 .561 2.336 .852 3.58 .85 3.031 .002 5.803-1.709 7.16-4.42 .37-.73 8.85-18 8.85-43.58v-36c0-7.428-2.951-14.551-8.205-19.803C210.552 122.946 203.428 119.997 196 120Z"),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
