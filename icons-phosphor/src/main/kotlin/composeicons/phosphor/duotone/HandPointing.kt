package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorDuotoneIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 116v36c0 44.183-35.817 80-80 80C91.82 232 80.19 208 42.68 142c-5.434-9.557-2.135-21.708 7.386-27.205 9.521-5.497 21.694-2.279 27.254 7.205L96 152v-108c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v16c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
                pathData = parseSvgPathData("M196 88c-4.664-.005-9.254 1.16-13.35 3.39C180.172 83.718 174.507 77.486 167.106 74.29 159.704 71.094 151.284 71.243 144 74.7v-30.7C144 28.536 131.464 16 116 16 100.536 16 88 28.536 88 44v80l-3.82-6.13C76.412 104.491 59.269 99.942 45.89 107.71 32.511 115.478 27.962 132.621 35.73 146l4.67 8.23C74.81 214.89 89.05 240 136 240c48.578-.055 87.945-39.422 88-88v-36C224 100.536 211.464 88 196 88ZM208 152c-.044 39.746-32.254 71.956-72 72C98.37 224 88.16 206 54.32 146.32l-4.69-8.27v-.05C46.314 132.267 48.27 124.931 54 121.61c1.823-1.056 3.894-1.608 6-1.6 4.294-.006 8.263 2.282 10.41 6 .041 .08 .088 .157 .14 .23l18.67 30c1.893 3.022 5.558 4.427 8.986 3.443 3.428-.983 5.791-4.117 5.794-7.683v-108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v20c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
