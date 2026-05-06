package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorLightIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 154h-94L36.57 44.12C35.2 42.426 33.019 41.607 30.873 41.982c-2.146 .375-3.921 1.883-4.636 3.941-.715 2.058-.258 4.342 1.193 5.967L161 209.07c2.668 3.137 6.582 4.94 10.7 4.93h52.3c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14ZM170.18 201.3 140.18 166h53.82v36h-22.3c-.585 0-1.14-.256-1.52-.7ZM226 200c0 1.105-.895 2-2 2h-18v-36h18c1.105 0 2 .895 2 2ZM110.89 181.08c-1.212-1.032-2.784-1.54-4.371-1.413-1.587 .128-3.058 .88-4.089 2.093L85.82 201.3c-.38 .444-.935 .7-1.52 .7h-22.3v-36h23.2c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-53.2c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h52.3c4.118 .01 8.032-1.793 10.7-4.93l16.6-19.54c2.135-2.53 1.817-6.312-.71-8.45ZM30 200v-32c0-1.105 .895-2 2-2h18v36h-18c-1.105 0-2-.895-2-2ZM151.43 124.12l68-80c1.37-1.694 3.551-2.513 5.697-2.138 2.146 .375 3.921 1.883 4.636 3.941 .715 2.058 .258 4.342-1.193 5.967l-68 80c-2.169 2.428-5.88 2.683-8.36 .574-2.481-2.109-2.827-5.812-.78-8.344Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
