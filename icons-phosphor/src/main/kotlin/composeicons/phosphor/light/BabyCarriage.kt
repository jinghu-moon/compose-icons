package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorLightIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 34h-8c-7.732 0-14 6.268-14 14v58h-84.48C50.553 87.576 34.662 74.023 16 74c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 14.359 0 26 11.641 26 26 .05 43.058 34.942 77.95 78 78h40c43.078 0 78-34.922 78-78C238 68.922 203.078 34 160 34ZM225.71 106h-64.61L208.92 67.75c9.611 10.582 15.506 24.012 16.79 38.25ZM152 46h8c14.459-.017 28.52 4.739 40 13.53l-50 40v-51.53c0-1.105 .895-2 2-2ZM160 178h-40C85.889 177.959 57.413 151.966 54.27 118h171.46c-3.143 33.966-31.619 59.959-65.73 60ZM102 224c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM206 224c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
