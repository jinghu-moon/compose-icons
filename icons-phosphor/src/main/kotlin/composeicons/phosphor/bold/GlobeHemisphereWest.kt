package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorBoldIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM212 128c.003 9.184-1.508 18.306-4.47 27L167 130c-2.373-1.47-5.032-2.418-7.8-2.78l-22.82-3.08c-7.181-.924-14.305 2.077-18.66 7.86h-4.07l-2.71-5.6c-2.67-5.558-7.768-9.562-13.8-10.84L94.46 115l4-7h14.39c3.379-.001 6.702-.857 9.66-2.49l12.25-6.76c1.343-.751 2.597-1.65 3.74-2.68L165.42 71.74c4.3-3.889 6.701-9.453 6.58-15.25 24.843 15.277 39.985 42.346 40 71.51ZM140.76 45l6.2 11.1L122.75 78l-10.93 6h-15.68c-7.169 .009-13.788 3.844-17.36 10.06l-4.49 7.85L67.68 84.28 77.59 60.86C95.652 47.284 118.427 41.566 140.76 45ZM44 128c-.002-9.103 1.484-18.146 4.4-26.77l7.74 20.65c2.374 6.388 7.853 11.117 14.52 12.53l19.53 4.2 3 6.1c2.662 5.45 7.64 9.407 13.55 10.77l-5 11.12c-3.252 7.302-1.845 15.839 3.58 21.71l.21 .22 18.16 18.7-.89 4.59C78.54 209.03 44.055 172.348 44 128ZM147.65 209.66c1.153-6.232-.7-12.643-5-17.3l-.21-.22L124.72 173.89l11.37-25.52 19 2.56 41.43 25.48c-11.737 16.625-29.097 28.437-48.87 33.25Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
