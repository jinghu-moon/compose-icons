package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorFillIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 136c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM152 104h0C135.498 91.623 112.29 93.825 98.41 109.085c-13.88 15.259-13.88 38.571 0 53.831 13.88 15.259 37.088 17.461 53.59 5.085h0c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64C168.005 86.171 156.209 70.492 139.077 65.554 121.946 60.617 103.615 67.613 94.13 82.71c-2.259 3.733-1.11 8.589 2.584 10.913 3.693 2.324 8.568 1.259 10.956-2.393 5.688-9.065 16.69-13.27 26.973-10.307C144.927 83.885 152.007 93.298 152 104ZM196.81 169.61c-3.529-2.655-8.543-1.948-11.2 1.58C172.013 189.328 150.668 200.003 128 200.003c-22.668 0-44.013-10.675-57.61-28.813-1.692-2.356-4.527-3.611-7.409-3.28-2.882 .331-5.359 2.195-6.474 4.873-1.115 2.678-.693 5.749 1.103 8.027 16.62 22.151 42.697 35.187 70.39 35.187 27.693 0 53.77-13.036 70.39-35.187 2.655-3.529 1.948-8.543-1.58-11.2Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
